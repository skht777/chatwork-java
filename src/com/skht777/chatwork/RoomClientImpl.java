/**
 * 
 */
package com.skht777.chatwork;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import com.skht777.chatwork.api.File;
import com.skht777.chatwork.api.Member;
import com.skht777.chatwork.api.Message;
import com.skht777.chatwork.api.Room;
import com.skht777.chatwork.api.Task;
import com.skht777.chatwork.parameter.IconPreset;
import com.skht777.chatwork.parameter.Role;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
class RoomClientImpl implements RoomClient {

	private int roomId;

	/**
	 * 
	 */
	public RoomClientImpl(int roomId) {
		this.roomId = roomId;
	}

	@Override
	public Room getRoom() {
		return null;
	}

	@Override
	public Room editRoom(String name, String description, IconPreset icon) {
		return null;
	}

	@Override
	public Map<Role, List<Integer>> editMembers(IntStream admins,
			IntStream members, IntStream readOnlyMembers) {
		return null;
	}

	@Override
	public List<Member> getMembers() {
		return null;
	}

	@Override
	public Message createMessage(String body) {
		return null;
	}

	@Override
	public List<Message> getMessages(boolean isForce) {
		return null;
	}

	@Override
	public Message getMessage(int messageId) {
		return null;
	}

	@Override
	public List<Task> getTasks(int accountId, int assignedByAccountId,
			Status status) {
		return null;
	}

	@Override
	public Task createTask(String body, IntStream toIds, Date limit) {
		return null;
	}

	@Override
	public Task getTask(int taskId) {
		return null;
	}

	@Override
	public List<File> getFiles(int accountId) {
		return null;
	}

	@Override
	public File getFile(int fileId, boolean isDownload) {
		return null;
	}

}
