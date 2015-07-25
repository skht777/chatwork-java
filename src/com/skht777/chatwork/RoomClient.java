/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;
import java.util.Map;

import com.skht777.chatwork.api.File;
import com.skht777.chatwork.api.FilesRequest;
import com.skht777.chatwork.api.MembersRequest;
import com.skht777.chatwork.api.Message;
import com.skht777.chatwork.api.MessagesRequest;
import com.skht777.chatwork.api.NumberedRoomRequest;
import com.skht777.chatwork.api.Task;
import com.skht777.chatwork.api.TasksRequest;
import com.skht777.chatwork.parameter.IconPreset;
import com.skht777.chatwork.parameter.Role;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
public interface RoomClient extends NumberedRoomRequest, MembersRequest, MessagesRequest, TasksRequest, FilesRequest {

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

	default void editRoom(IconPreset icon) {
		editRoom(null, null, icon);
	}

	default Map<Role, List<Integer>> editMember(int[] admins, int[] members) {
		return editMembers(admins, members, null);
	}

	default Map<Role, List<Integer>> editReadOnlyMember(int[] admins, int[] readOnlyMembers) {
		return editMembers(admins, null, readOnlyMembers);
	}

	default List<Message> getMessages() {
		return getMessages(false);
	}

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

	default Task createTask(String body, int[] toIds) {
		return createTask(body, toIds, null);	
	}

	default List<File> getFiles() {
		return getFiles(0);
	}

	default File getFile(int fileId) {
		return getFile(fileId, false);
	}

}
