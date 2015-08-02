/**
 * 
 */
package com.skht777.chatwork.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import org.json.JSONArray;
import org.json.JSONObject;

import com.skht777.chatwork.NumberedRoomClient;
import com.skht777.chatwork.api.Contact;
import com.skht777.chatwork.api.File;
import com.skht777.chatwork.api.Files;
import com.skht777.chatwork.api.Me;
import com.skht777.chatwork.api.Member;
import com.skht777.chatwork.api.Message;
import com.skht777.chatwork.api.MessageId;
import com.skht777.chatwork.api.MyStatus;
import com.skht777.chatwork.api.MyTask;
import com.skht777.chatwork.api.NumberedRoom;
import com.skht777.chatwork.api.NumberedRooms;
import com.skht777.chatwork.api.RoomAccount;
import com.skht777.chatwork.api.Task;
import com.skht777.chatwork.api.UserAccount;
import com.skht777.chatwork.parameter.Role;
import com.skht777.chatwork.parameter.Status;
import com.skht777.chatwork.parameter.Type;

/**
 * @author skht777
 *
 */
class ResponseImpl implements Message, Task, MyTask, File, NumberedRoom, MyStatus, Member, Me {

	private enum ResponseList {

		ACCOUNT,
		ACCOUNT_ID,
		ADMIN,
		ASSIGNED_BY_ACCOUNT,
		AVATAR_IMAGE_URL,
		BODY,
		CHATWORK_ID,
		DEPARTMENT,
		DESCRIPTION,
		DOWNLOAD_URL,
		FACEBOOK,
		FILE_ID,
		FILE_NUM,
		FILENAME,
		FILESIZE,
		ICON_PATH,
		INTRODUCTION,
		LAST_UPDATE_TIME,
		LIMIT_TIME,
		MAIL,
		MEMBER,
		MENTION_NUM,
		MENTION_ROOM_NUM,
		MESSAGE_ID,
		MESSAGE_NUM,
		MYTASK_NUM,
		MYTASK_ROOM_NUM,
		NAME,
		ORGANIZATION_ID,
		ORGANIZATION_NAME,
		READONLY,
		ROLE,
		ROOM,
		ROOM_ID,
		SEND_TIME,
		SKYPE,
		STATUS,
		STICKY,
		TASK_ID,
		TASK_IDS,
		TASK_NUM,
		TEL_EXTENSION,
		TEL_MOBILE,
		TEL_ORGANIZATION,
		TITLE,
		TWITTER,
		TYPE,
		UNREAD_NUM,
		UNREAD_ROOM_NUM,
		UPDATE_TIME,
		UPLOAD_TIME,
		URL;

		public String toString() {
			return super.toString().toLowerCase();
		}
	}

	private int messageId;

	private UserAccount account;

	private String body;

	private int taskId;

	private LocalDate limitDate;

	private Status status;

	private UserAccount assignedByAccount;

	private RoomAccount room;

	private int fileId;

	private String fileName;

	private int fileSize;

	private LocalDateTime uploadTime;

	private Type type;

	private boolean sticky;

	private int messageNum;

	private int fileNum;

	private int taskNum;

	private LocalDateTime lastUpdateTime;

	private URL iconPath;

	private int roomId;

	private String name;

	private int unreadNum;

	private int mentionNum;

	private int mytaskNum;

	private Role role;

	private int chatworkId;

	private int organizationId;

	private String organizationName;

	private String department;

	private int accountId;

	private URL avatarImageUrl;

	private String title;

	private URL url;

	private String introduction;

	private String mail;

	private String telOrganization;

	private String telExtension;

	private String telMobile;

	private String skype;

	private String facebook;

	private String twitter;

	private int unreadRoomNum;

	private int mentionRoomNum;

	private int mytaskRoomNum;

	private String description;

	private URL downloadUrl;

	private LocalDateTime sendTime;

	private LocalDateTime updateTime;

	private JSONObject element;

	private ResponseImpl(String response) {
		element = new JSONObject(response);
	}

	private ResponseImpl(JSONObject element) {
		this.element = element;
	}

	private int getInt(ResponseList response) {
		return element.getInt(response.toString());
	}

	private String getString(ResponseList response) {
		return element.getString(response.toString());
	}

	private URL getURL(ResponseList response) {
		try {
			return new URL(getString(response));
		}catch(MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}

	private LocalDateTime getDateTime(ResponseList response) {
		return new Timestamp(getInt(response)).toLocalDateTime();
	}

	private boolean getBoolean(ResponseList response) {
		return element.getBoolean(response.toString());
	}
	
	private JSONObject getJSONObject(ResponseList response) {
		return element.getJSONObject(response.toString());
	}

	private <T extends Enum<T>> T getEnum(ResponseList response, Class<T> e) {
		return Enum.valueOf(e, getString(response).toUpperCase());
	}

	private static ResponseImpl createResponse(String response, Consumer<ResponseImpl> initializer) {
		return createResponse(new JSONObject(response), initializer);
	}

	private static ResponseImpl createResponse(JSONObject response, Consumer<ResponseImpl> initializer) {
		ResponseImpl res = new ResponseImpl(response);
		initializer.accept(res);
		return res;
	}

	private static <T> List<T> parseJSONArray(String response, Function<JSONObject, T> func) {
		JSONArray array = new JSONArray(response);
		List<T> list = new ArrayList<>();
		array.forEach((o) -> list.add(func.apply((JSONObject) o)));
		return list;
	}
	
	private static List<Integer> parseJSONArray(JSONArray response) {
		List<Integer> list = new ArrayList<>();
		response.forEach(o -> list.add((Integer) o));
		return list;
	}

	private static ResponseImpl getUserAccount(JSONObject response) {
		return createResponse(response, (res) -> res
				.setAccountId()
				.setName()
				.setAvatarImageUrl());
	}

	private static ResponseImpl getRoomAccount(JSONObject response) {
		return createResponse(response, (res) -> res
				.setRoomId()
				.setName()
				.setIconPath());
	}
	
	private static ResponseImpl getTaskBase(JSONObject response) {
		return createResponse(response, (res) -> res
				.setTaskId()
				.setAssignedByAccount()
				.setMessageId()
				.setBody()
				.setLimitDate()
				.setStatus());
	}
	
	private static ResponseImpl getUser(JSONObject response) {
		return getUserAccount(response)
				.setChatworkId()
				.setOrganizationId()
				.setOrganizationName()
				.setDepartment();
	}

	static Me getMyAccount(String response) {
		return ((ResponseImpl) getContact(new JSONObject(response)))
				.setTitle()
				.setUrl()
				.setIntroduction()
				.setMail()
				.setTelOrganization()
				.setTelExtension()
				.setTelMobile()
				.setSkype()
				.setFacebook()
				.setTwitter();
	}

	private static MyTask getMyTask(JSONObject response) {
		return getTaskBase(response).setRoom();
	}

	static List<MyTask> getMyTasks(String response) {
		return parseJSONArray(response, o -> getMyTask(o));
	}

	static MyStatus getMyStatus(String response) {
		return createResponse(response, (res) -> res
				.setUnreadNum()
				.setMentionNum()
				.setMytaskNum()
				.setUnreadRoomNum()
				.setMentionRoomNum()
				.setMytaskRoomNum());
	}

	private static Contact getContact(JSONObject response) {
		return getUser(response).setRoomId();
	}

	static List<Contact> getContacts(String response) {
		return parseJSONArray(response, o -> getContact(o));
	}

	private static NumberedRooms getRoom(JSONObject response) {
		return getRoomAccount(response)
				.setRole()
				.setUnreadNum()
				.setMentionNum()
				.setMytaskNum()
				.setType()
				.setSticky()
				.setMessageNum()
				.setFileNum()
				.setTaskNum()
				.setLastUpdateTime();
	}

	static List<NumberedRooms> getRooms(String response) {
		return parseJSONArray(response, o -> getRoom(o));
	}

	static NumberedRoomClient createRoom(String response, APIToken token) {
		return new NumberedRoomClientImpl(token, new ResponseImpl(response).setRoomId().getRoomId());
	}

	static NumberedRoom getNumberdRoom(String response) {
		return ((ResponseImpl) getRoom(new JSONObject(response))).setDescription();
	}

	static Map<Role, List<Integer>> editMembers(String response) {
		JSONObject obj = new JSONObject(response);
		Map<Role, List<Integer>> map = new HashMap<>();
		map.put(Role.ADMIN, parseJSONArray(obj.getJSONArray(ResponseList.ADMIN.toString())));
		map.put(Role.MEMBER, parseJSONArray(obj.getJSONArray(ResponseList.MEMBER.toString())));
		map.put(Role.READONLY, parseJSONArray(obj.getJSONArray(ResponseList.READONLY.toString())));
		return map;
	}

	static Member getMember(JSONObject response) {
		return getUser(response).setRole();
	}

	static List<Member> getMembers(String response) {
		return parseJSONArray(response, o -> getMember(o));
	}

	private static Message getMessage(JSONObject response) {
		return createResponse(response, (res) -> res
				.setMessageId()
				.setAccount()
				.setBody()
				.setSendTime()
				.setUpdateTime());
	}

	static MessageId createMessage(String response) {
		return createResponse(response, (res) -> res.setMessageId());
	}

	static List<Message> getMessages(String response) {
		return parseJSONArray(response, o -> getMessage(response));
	}

	static Message getMessage(String response) {
		return getMessage(new JSONObject(response));
	}

	static List<Task> getTasks(String response) {
		return parseJSONArray(response, o -> getTask(response));
	}

	static List<Integer> createTask(String response) {
		return parseJSONArray(new JSONObject(response).getJSONArray(ResponseList.TASK_IDS.toString()));
	}

	static Task getTask(String response) {
		return getTaskBase(new JSONObject(response)).setAccount();
	}

	static File getFile(String response) {
		return ((ResponseImpl) getFile(new JSONObject(response))).setDownloadUrl();
	}

	private static Files getFile(JSONObject response) {
		return createResponse(response, (res) -> res
				.setFileId()
				.setAccount()
				.setMessageId()
				.setFileName()
				.setFileSize()
				.setUploadTime());
	}

	static List<Files> getFiles(String response) {
		return parseJSONArray(response, o -> getFile(response));
	}

	private ResponseImpl setMessageId() {
		this.messageId = getInt(ResponseList.MESSAGE_ID);
		return this;
	}

	private ResponseImpl setAccount() {
		this.account = ResponseImpl.getUserAccount(getJSONObject(ResponseList.ACCOUNT));
		return this;
	}

	private ResponseImpl setBody() {
		this.body = getString(ResponseList.BODY);
		return this;
	}

	private ResponseImpl setTaskId() {
		this.taskId = getInt(ResponseList.TASK_ID);
		return this;
	}

	private ResponseImpl setLimitDate() {
		this.limitDate = getDateTime(ResponseList.LIMIT_TIME).toLocalDate();
		return this;
	}

	private ResponseImpl setStatus() {
		this.status = getEnum(ResponseList.STATUS, Status.class);
		return this;
	}

	private ResponseImpl setAssignedByAccount() {
		this.assignedByAccount = ResponseImpl.getUserAccount(getJSONObject(ResponseList.ASSIGNED_BY_ACCOUNT));
		return this;
	}

	private ResponseImpl setRoom() {
		this.room = ResponseImpl.getRoomAccount(getJSONObject(ResponseList.ROOM));
		return this;
	}

	private ResponseImpl setFileId() {
		this.fileId = getInt(ResponseList.FILE_ID);
		return this;
	}

	private ResponseImpl setFileName() {
		this.fileName = getString(ResponseList.FILENAME);
		return this;
	}

	private ResponseImpl setFileSize() {
		this.fileSize = getInt(ResponseList.FILESIZE);
		return this;
	}

	private ResponseImpl setUploadTime() {
		this.uploadTime = getDateTime(ResponseList.UPLOAD_TIME);
		return this;
	}

	private ResponseImpl setType() {
		this.type = getEnum(ResponseList.TYPE, Type.class);
		return this;
	}

	private ResponseImpl setSticky() {
		this.sticky = getBoolean(ResponseList.STICKY);
		return this;
	}

	private ResponseImpl setMessageNum() {
		this.messageNum = getInt(ResponseList.MESSAGE_NUM);
		return this;
	}

	private ResponseImpl setFileNum() {
		this.fileNum = getInt(ResponseList.FILE_NUM);
		return this;
	}

	private ResponseImpl setTaskNum() {
		this.taskNum = getInt(ResponseList.TASK_NUM);
		return this;
	}

	private ResponseImpl setLastUpdateTime() {
		this.lastUpdateTime = getDateTime(ResponseList.LAST_UPDATE_TIME);
		return this;
	}

	private ResponseImpl setIconPath() {
		this.iconPath = getURL(ResponseList.ICON_PATH);
		return this;
	}

	private ResponseImpl setRoomId() {
		this.roomId = getInt(ResponseList.ROOM_ID);
		return this;
	}

	private ResponseImpl setName() {
		this.name = getString(ResponseList.NAME);
		return this;
	}

	private ResponseImpl setUnreadNum() {
		this.unreadNum = getInt(ResponseList.UNREAD_NUM);
		return this;
	}

	private ResponseImpl setMentionNum() {
		this.mentionNum = getInt(ResponseList.MENTION_NUM);
		return this;
	}

	private ResponseImpl setMytaskNum() {
		this.mytaskNum = getInt(ResponseList.MYTASK_NUM);
		return this;
	}

	private ResponseImpl setRole() {
		this.role = getEnum(ResponseList.ROLE, Role.class);
		return this;
	}

	private ResponseImpl setChatworkId() {
		this.chatworkId = getInt(ResponseList.CHATWORK_ID);
		return this;
	}

	private ResponseImpl setOrganizationId() {
		this.organizationId = getInt(ResponseList.ORGANIZATION_ID);
		return this;
	}

	private ResponseImpl setOrganizationName() {
		this.organizationName = getString(ResponseList.ORGANIZATION_NAME);
		return this;
	}

	private ResponseImpl setDepartment() {
		this.department = getString(ResponseList.DEPARTMENT);
		return this;
	}

	private ResponseImpl setAccountId() {
		this.accountId = getInt(ResponseList.ACCOUNT_ID);
		return this;
	}

	private ResponseImpl setAvatarImageUrl() {
		this.avatarImageUrl = getURL(ResponseList.AVATAR_IMAGE_URL);
		return this;
	}

	private ResponseImpl setTitle() {
		this.title = getString(ResponseList.TITLE);
		return this;
	}

	private ResponseImpl setUrl() {
		this.url = getURL(ResponseList.URL);
		return this;
	}

	private ResponseImpl setIntroduction() {
		this.introduction = getString(ResponseList.INTRODUCTION);
		return this;
	}

	private ResponseImpl setMail() {
		this.mail = getString(ResponseList.MAIL);
		return this;
	}

	private ResponseImpl setTelOrganization() {
		this.telOrganization = getString(ResponseList.TEL_ORGANIZATION);
		return this;
	}

	private ResponseImpl setTelExtension() {
		this.telExtension = getString(ResponseList.TEL_EXTENSION);
		return this;
	}

	private ResponseImpl setTelMobile() {
		this.telMobile = getString(ResponseList.TEL_MOBILE);
		return this;
	}

	private ResponseImpl setSkype() {
		this.skype = getString(ResponseList.SKYPE);
		return this;
	}

	private ResponseImpl setFacebook() {
		this.facebook = getString(ResponseList.FACEBOOK);
		return this;
	}

	private ResponseImpl setTwitter() {
		this.twitter = getString(ResponseList.TWITTER);
		return this;
	}

	private ResponseImpl setUnreadRoomNum() {
		this.unreadRoomNum = getInt(ResponseList.UNREAD_ROOM_NUM);
		return this;
	}

	private ResponseImpl setMentionRoomNum() {
		this.mentionRoomNum = getInt(ResponseList.MENTION_ROOM_NUM);
		return this;
	}

	private ResponseImpl setMytaskRoomNum() {
		this.mytaskRoomNum = getInt(ResponseList.MYTASK_ROOM_NUM);
		return this;
	}

	private ResponseImpl setDescription() {
		this.description = getString(ResponseList.DESCRIPTION);
		return this;
	}

	private ResponseImpl setDownloadUrl() {
		this.downloadUrl = getURL(ResponseList.DOWNLOAD_URL);
		return this;
	}

	private ResponseImpl setSendTime() {
		this.sendTime = getDateTime(ResponseList.SEND_TIME);
		return this;
	}

	private ResponseImpl setUpdateTime() {
		this.updateTime = getDateTime(ResponseList.UPDATE_TIME);
		return this;
	}

	@Override
	public int getMessageId() {
		return messageId;
	}

	@Override
	public UserAccount getAccount() {
		return account;
	}

	@Override
	public String getBody() {
		return body;
	}

	@Override
	public int getTaskId() {
		return taskId;
	}

	@Override
	public LocalDate getLimitDate() {
		return limitDate;
	}

	@Override
	public Status getStatus() {
		return status;
	}

	@Override
	public UserAccount getAssignedByAccount() {
		return assignedByAccount;
	}

	@Override
	public RoomAccount getRoom() {
		return room;
	}

	@Override
	public int getFileId() {
		return fileId;
	}

	@Override
	public String getFileName() {
		return fileName;
	}

	@Override
	public int getFileSize() {
		return fileSize;
	}

	@Override
	public LocalDateTime getUploadTime() {
		return uploadTime;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public boolean isSticky() {
		return sticky;
	}

	@Override
	public int getMessageNum() {
		return messageNum;
	}

	@Override
	public int getFileNum() {
		return fileNum;
	}

	@Override
	public int getTaskNum() {
		return taskNum;
	}

	@Override
	public LocalDateTime getLastUpdateTime() {
		return lastUpdateTime;
	}

	@Override
	public URL getIconPath() {
		return iconPath;
	}

	@Override
	public int getRoomId() {
		return roomId;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getUnreadNum() {
		return unreadNum;
	}

	@Override
	public int getMentionNum() {
		return mentionNum;
	}

	@Override
	public int getMytaskNum() {
		return mytaskNum;
	}

	@Override
	public Role getRole() {
		return role;
	}

	@Override
	public int getChatworkId() {
		return chatworkId;
	}

	@Override
	public int getOrganizationId() {
		return organizationId;
	}

	@Override
	public String getOrganizationName() {
		return organizationName;
	}

	@Override
	public String getDepartment() {
		return department;
	}

	@Override
	public int getAccountId() {
		return accountId;
	}

	@Override
	public URL getAvatarImageUrl() {
		return avatarImageUrl;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public URL getUrl() {
		return url;
	}

	@Override
	public String getIntroduction() {
		return introduction;
	}

	@Override
	public String getMail() {
		return mail;
	}

	@Override
	public String getTelOrganization() {
		return telOrganization;
	}

	@Override
	public String getTelExtension() {
		return telExtension;
	}

	@Override
	public String getTelMobile() {
		return telMobile;
	}

	@Override
	public String getSkype() {
		return skype;
	}

	@Override
	public String getFacebook() {
		return facebook;
	}

	@Override
	public String getTwitter() {
		return twitter;
	}

	@Override
	public int getUnreadRoomNum() {
		return unreadRoomNum;
	}

	@Override
	public int getMentionRoomNum() {
		return mentionRoomNum;
	}

	@Override
	public int getMytaskRoomNum() {
		return mytaskRoomNum;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public URL getDownloadUrl() {
		return downloadUrl;
	}

	@Override
	public LocalDateTime getSendTime() {
		return sendTime;
	}

	@Override
	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

}
