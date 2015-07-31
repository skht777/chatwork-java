/**
 * 
 */
package com.skht777.chatwork.impl;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.skht777.chatwork.NumberedRoomClient;
import com.skht777.chatwork.api.Contact;
import com.skht777.chatwork.api.File;
import com.skht777.chatwork.api.Me;
import com.skht777.chatwork.api.Member;
import com.skht777.chatwork.api.Message;
import com.skht777.chatwork.api.MyStatus;
import com.skht777.chatwork.api.MyTask;
import com.skht777.chatwork.api.NumberedRoom;
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

	private int organizationName;

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

	private ResponseImpl(JSONObject element) {
		this.element = element;
	}

	private static UserAccount getUserAccount(JSONObject element) {
		ResponseImpl account = new ResponseImpl(element.getJSONObject(ResponseList.ACCOUNT.toString()));
		account.setAccountId();
		account.setName();
		account.setAvatarImageUrl();
		return account;
	}

	private static RoomAccount getRoomAccount(JSONObject element) {
		ResponseImpl account = new ResponseImpl(element.getJSONObject(ResponseList.ACCOUNT.toString()));
		account.setRoomId();
		account.setName();
		account.setIconPath();
		return account;
	}

	static  Me getMyAccount(String response) {
		return null;
	}

	static List<MyTask> getMyTasks(String response) {
		return null;
	}

	static MyStatus getMyStatus(String response) {
		return null;
	}

	static List<Contact> getContacts(String response) {
		return null;
	}

	static List<NumberedRoom> getRooms(String response) {
		return null;
	}

	static NumberedRoomClient createRoom(String response) {
		return null;
	}

	static NumberedRoom getNumberdRoom(String response) {
		return null;
	}

	static void editRoom(String response) {
	}

	static void deleteRoom(String response) {
	}

	static Map<Role, List<Integer>> editMembers(String response) {
		return null;
	}

	static List<Member> getMembers(String response) {
		return null;
	}

	static Message createMessage(String response) {
		return null;
	}

	static List<Message> getMessages(String response) {
		return null;
	}

	static Message getMessage(String response) {
		return null;
	}

	static List<Task> getTasks(String response) {
		return null;
	}

	static Task createTask(String response) {
		return null;
	}

	static Task getTask(String response) {
		return null;
	}

	static File getFile(String response) {
		return null;
	}

	static List<File> getFiles(String response) {
		return null;
	}

	private void setMessageId() {
		this.messageId = messageId;
	}

	private void setAccount() {
		this.account = ResponseImpl.getUserAccount(element);
	}

	private void setBody() {
		this.body = body;
	}

	private void setTaskId() {
		this.taskId = taskId;
	}

	private void setLimitDate() {
		this.limitDate = limitDate;
	}

	private void setStatus() {
		this.status = status;
	}

	private void setAssignedByAccount() {
		this.assignedByAccount = assignedByAccount;
	}

	private void setRoom() {
		this.room = ResponseImpl.getRoomAccount(element);
	}

	private void setFileId() {
		this.fileId = fileId;
	}

	private void setFileName() {
		this.fileName = fileName;
	}

	private void setFileSize() {
		this.fileSize = fileSize;
	}

	private void setUploadTime() {
		this.uploadTime = uploadTime;
	}

	private void setType() {
		this.type = type;
	}

	private void setSticky() {
		this.sticky = sticky;
	}

	private void setMessageNum() {
		this.messageNum = messageNum;
	}

	private void setFileNum() {
		this.fileNum = fileNum;
	}

	private void setTaskNum() {
		this.taskNum = taskNum;
	}

	private void setLastUpdateTime() {
		this.lastUpdateTime = lastUpdateTime;
	}

	private void setIconPath() {
		this.iconPath = iconPath;
	}

	private void setRoomId() {
		this.roomId = roomId;
	}

	private void setName() {
		this.name = name;
	}

	private void setUnreadNum() {
		this.unreadNum = unreadNum;
	}

	private void setMentionNum() {
		this.mentionNum = mentionNum;
	}

	private void setMytaskNum() {
		this.mytaskNum = mytaskNum;
	}

	private void setRole() {
		this.role = role;
	}

	private void setChatworkId() {
		this.chatworkId = chatworkId;
	}

	private void setOrganizationId() {
		this.organizationId = organizationId;
	}

	private void setOrganizationName() {
		this.organizationName = organizationName;
	}

	private void setDepartment() {
		this.department = department;
	}

	private void setAccountId() {
		this.accountId = accountId;
	}

	private void setAvatarImageUrl() {
		this.avatarImageUrl = avatarImageUrl;
	}

	private void setTitle() {
		this.title = title;
	}

	private void setUrl() {
		this.url = url;
	}

	private void setIntroduction() {
		this.introduction = introduction;
	}

	private void setMail() {
		this.mail = mail;
	}

	private void setTelOrganization() {
		this.telOrganization = telOrganization;
	}

	private void setTelExtension() {
		this.telExtension = telExtension;
	}

	private void setTelMobile() {
		this.telMobile = telMobile;
	}

	private void setSkype() {
		this.skype = skype;
	}

	private void setFacebook() {
		this.facebook = facebook;
	}

	private void setTwitter() {
		this.twitter = twitter;
	}

	private void setUnreadRoomNum() {
		this.unreadRoomNum = unreadRoomNum;
	}

	private void setMentionRoomNum() {
		this.mentionRoomNum = mentionRoomNum;
	}

	private void setMytaskRoomNum() {
		this.mytaskRoomNum = mytaskRoomNum;
	}

	private void setDescription() {
		this.description = description;
	}

	private void setDownloadUrl() {
		this.downloadUrl = downloadUrl;
	}

	private void setSendTime() {
		this.sendTime = sendTime;
	}

	private void setUpdateTime() {
		this.updateTime = updateTime;
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
	public boolean getSticky() {
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
	public int getOrganizationName() {
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
