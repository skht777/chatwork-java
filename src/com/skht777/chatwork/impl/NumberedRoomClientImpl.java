/**
 * 
 */
package com.skht777.chatwork.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.skht777.chatwork.NumberedRoomClient;
import com.skht777.chatwork.RequestFiles;
import com.skht777.chatwork.RequestMembers;
import com.skht777.chatwork.RequestMessages;
import com.skht777.chatwork.RequestNumberedRoom;
import com.skht777.chatwork.RequestTasks;
import com.skht777.chatwork.api.File;
import com.skht777.chatwork.api.Member;
import com.skht777.chatwork.api.Message;
import com.skht777.chatwork.api.NumberedRoom;
import com.skht777.chatwork.api.Task;
import com.skht777.chatwork.parameter.ActionType;
import com.skht777.chatwork.parameter.IconPreset;
import com.skht777.chatwork.parameter.Role;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
class NumberedRoomClientImpl implements NumberedRoomClient {

	RequestNumberedRoom requestNumberedRoom;
	RequestMembers requestMembers; 
	RequestMessages requestMessages;
	RequestTasks requestTasks;
	RequestFiles requestFiles;

	/**
	 * 
	 * @param token
	 * @param roomId
	 */
	NumberedRoomClientImpl(APIToken token, int roomId) {
		requestNumberedRoom = new RequestNumberedRoomImpl(token, roomId);
		requestMembers = new RequestMembersImpl(token, roomId);
		requestMessages = new RequestMessagesImpl(token, roomId);
		requestTasks = new RequestTasksImpl(token, roomId);
		requestFiles = new RequestFilesImpl(token, roomId);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestNumberedRoom#getRoom()
	 */
	@Override
	public NumberedRoom getRoom() {
		return requestNumberedRoom.getRoom();
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestNumberedRoom#editRoom(java.lang.String, java.lang.String, com.skht777.chatwork.parameter.IconPreset)
	 */
	@Override
	public void editRoom(String name, String description, IconPreset icon) {
		requestNumberedRoom.editRoom(name, description, icon);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestNumberedRoom#deleteRoom(com.skht777.chatwork.parameter.ActionType)
	 */
	@Override
	public void deleteRoom(ActionType action) {
		requestNumberedRoom.deleteRoom(action);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMembers#editMembers(int[], int[], int[])
	 */
	@Override
	public Map<Role, List<Integer>> editMembers(int[] admins, int[] members,
			int[] readOnlyMembers) {
		return requestMembers.editMembers(admins, members, readOnlyMembers);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMembers#getMembers()
	 */
	@Override
	public List<Member> getMembers() {
		return requestMembers.getMembers();
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#createMessage(java.lang.String)
	 */
	@Override
	public Message createMessage(String body) {
		return requestMessages.createMessage(body);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#getMessages(boolean)
	 */
	@Override
	public List<Message> getMessages(boolean isForce) {
		return requestMessages.getMessages(isForce);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#getMessage(int)
	 */
	@Override
	public Message getMessage(int messageId) {
		return requestMessages.getMessage(messageId);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestTasks#getTasks(int, int, com.skht777.chatwork.parameter.Status)
	 */
	@Override
	public List<Task> getTasks(int accountId, int assignedByAccountId,
			Status status) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestTasks#createTask(java.lang.String, int[], java.time.LocalDate)
	 */
	@Override
	public Task createTask(String body, int[] toIds, LocalDate limit) {
		return requestTasks.createTask(body, toIds, limit);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestTasks#getTask(int)
	 */
	@Override
	public Task getTask(int taskId) {
		return requestTasks.getTask(taskId);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestFiles#getFile(int, boolean)
	 */
	@Override
	public File getFile(int fileId, boolean isDownload) {
		return requestFiles.getFile(fileId, isDownload);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestFiles#getFiles(int)
	 */
	@Override
	public List<File> getFiles(int accountId) {
		return requestFiles.getFiles(accountId);
	}

}
