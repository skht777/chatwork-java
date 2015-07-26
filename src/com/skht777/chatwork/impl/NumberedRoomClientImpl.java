/**
 * 
 */
package com.skht777.chatwork.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.skht777.chatwork.NumberedRoomClient;
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
class NumberedRoomClientImpl extends ClientBase implements NumberedRoomClient {

	private int roomId;

	/**
	 * 
	 */
	NumberedRoomClientImpl(int roomId) {
		super();
		this.roomId = roomId;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestNumberedRoom#getRoom()
	 */
	@Override
	public NumberedRoom getRoom() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestNumberedRoom#editRoom(java.lang.String, java.lang.String, com.skht777.chatwork.parameter.IconPreset)
	 */
	@Override
	public void editRoom(String name, String description, IconPreset icon) {
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestNumberedRoom#deleteRoom(com.skht777.chatwork.parameter.ActionType)
	 */
	@Override
	public void deleteRoom(ActionType action) {
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMembers#editMembers(int[], int[], int[])
	 */
	@Override
	public Map<Role, List<Integer>> editMembers(int[] admins, int[] members,
			int[] readOnlyMembers) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMembers#getMembers()
	 */
	@Override
	public List<Member> getMembers() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#createMessage(java.lang.String)
	 */
	@Override
	public Message createMessage(String body) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#getMessages(boolean)
	 */
	@Override
	public List<Message> getMessages(boolean isForce) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#getMessage(int)
	 */
	@Override
	public Message getMessage(int messageId) {
		return null;
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
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestTasks#getTask(int)
	 */
	@Override
	public Task getTask(int taskId) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestFiles#getFile(int, boolean)
	 */
	@Override
	public File getFile(int fileId, boolean isDownload) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestFiles#getFiles(int)
	 */
	@Override
	public List<File> getFiles(int accountId) {
		return null;
	}

}
