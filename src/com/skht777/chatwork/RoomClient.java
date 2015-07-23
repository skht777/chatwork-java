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
public interface RoomClient {

	Room getRoom();

	default void editRoomName(String name) {
		editRoom(name, null, null);
	}

	default void editRoomName(String name, IconPreset icon) {
		editRoom(name, null, icon);
	}

	default void editRoomDescription(String description) {
		editRoom(null, description, null);
	}

	default void editRoomDescription(String description, IconPreset icon) {
		editRoom(null, description, icon);
	}

	default Room editRoom(IconPreset icon) {
		return editRoom(null, null, icon);
	}

	Room editRoom(String name, String description, IconPreset icon);

	default Map<Role, List<Integer>> editMember(IntStream admins, IntStream members) {
		return editMembers(admins, members, null);
	}

	default Map<Role, List<Integer>> editReadOnlyMember(IntStream admins, IntStream readOnlyMembers) {
		return editMembers(admins, null, readOnlyMembers);
	}

	Map<Role, List<Integer>> editMembers(IntStream admins, IntStream members, IntStream readOnlyMembers);

	List<Member> getMembers();

	Message createMessage(String body);

	default List<Message> getMessages() {
		return getMessages(false);
	}

	List<Message> getMessages(boolean isForce);

	Message getMessage(int messageId);

	default List<Task> getTasksFromByAccount(int accountId) {
		return getTasks(accountId, 0, null);
	}

	default List<Task> getTasksFromByAccount(int accountId, Status status) {
		return getTasks(accountId, 0, status);
	}

	default List<Task> getTasksFromAssignedBy(int assignedByAccountId) {
		return getTasks(0, assignedByAccountId, null);
	}

	default List<Task> getTasksFromAssignedBy(int assignedByAccountId, Status status) {
		return getTasks(0, assignedByAccountId, status);
	}

	List<Task> getTasks(int accountId, int assignedByAccountId, Status status);

	default Task createTask(String body, IntStream toIds) {
		return createTask(body, toIds, null);	
	}

	Task createTask(String body, IntStream toIds, Date limit);

	Task getTask(int taskId);

	default List<File> getFiles() {
		return getFiles(0);
	}

	List<File> getFiles(int accountId);

	default File getFile(int fileId) {
		return getFile(fileId, false);
	}

	File getFile(int fileId, boolean isDownload);

}
