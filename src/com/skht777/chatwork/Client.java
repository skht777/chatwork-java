/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;

import com.skht777.chatwork.api.MyTask;
import com.skht777.chatwork.parameter.IconPreset;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
public interface Client extends RequestMe, RequestMyTasks, RequestMyStatus, RequestContacts, RequestRooms {

	default List<MyTask> getMyTasks() {
		return getMyTasks(0, null);
	}

	default List<MyTask> getMyTasks(int assignedByAccountId) {
		return getMyTasks(assignedByAccountId, null);
	}

	default List<MyTask> getMyTasks(Status status) {
		return getMyTasks(0, status);
	}

	default NumberedRoomClient createRoom(String name, int[] admins) {
		return createRoom(name, admins, null, null, null, null);
	}

	default NumberedRoomClient createRoom(String name, int[] admins, String description) {
		return createRoom(name, admins, null, null, description, null);
	}

	default NumberedRoomClient createRoom(String name, int[] admins, IconPreset icon) {
		return createRoom(name, admins, null, null, null, icon);
	}

	default NumberedRoomClient createRoom(String name, int[] admins, String description, IconPreset icon) {
		return createRoom(name, admins, null, null, description, icon);
	}

	default NumberedRoomClient createRoom(String name, int[] admins, int[] members, int[] readOnlyMembers) {
		return createRoom(name, admins, members, readOnlyMembers, null, null);
	}

	default NumberedRoomClient createRoom(String name, int[] admins, int[] members, int[] readOnlyMembers, String description) {
		return createRoom(name, admins, members, readOnlyMembers, description, null);
	}

	default NumberedRoomClient createRoom(String name, int[] admins, int[] members, int[] readOnlyMembers, IconPreset icon) {
		return createRoom(name, admins, members, readOnlyMembers, null, icon);
	}

	default NumberedRoomClient createRoomWithMember(String name, int[] admins, int[] members) {
		return createRoom(name, admins, members, null, null, null);
	}

	default NumberedRoomClient createRoomWithMember(String name, int[] admins, int[] members, String description) {
		return createRoom(name, admins, members, null, description, null);
	}

	default NumberedRoomClient createRoomWithMember(String name, int[] admins, int[] members, IconPreset icon) {
		return createRoom(name, admins, members, null, null, icon);
	}

	default NumberedRoomClient createRoomWithMember(String name, int[] admins, int[] members, String description, IconPreset icon) {
		return createRoom(name, admins, members, null, description, icon);
	}

	default NumberedRoomClient createRoomWithReadOnlyMember(String name, int[] admins, int[] readOnlyMembers) {
		return createRoom(name, admins, null, readOnlyMembers, null, null);
	}

	default NumberedRoomClient createRoomWithReadOnlyMember(String name, int[] admins, int[] readOnlyMembers, String description) {
		return createRoom(name, admins, null, readOnlyMembers, description, null);
	}

	default NumberedRoomClient createRoomWithReadOnlyMember(String name, int[] admins, int[] readOnlyMembers, IconPreset icon) {
		return createRoom(name, admins, null, readOnlyMembers, null, icon);
	}

	default NumberedRoomClient createRoomWithReadOnlyMember(String name, int[] admins, int[] readOnlyMembers, String description, IconPreset icon) {
		return createRoom(name, admins, null, readOnlyMembers, description, icon);
	}

}
