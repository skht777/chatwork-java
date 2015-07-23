/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;
import java.util.stream.IntStream;

import com.skht777.chatwork.api.Contact;
import com.skht777.chatwork.api.Me;
import com.skht777.chatwork.api.MyStatus;
import com.skht777.chatwork.api.MyTask;
import com.skht777.chatwork.api.Room;
import com.skht777.chatwork.parameter.ActionType;
import com.skht777.chatwork.parameter.IconPreset;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
interface Client {

	Me getAccount();

	default List<MyTask> getMyTasks() {
		return getMyTasks(0, null);
	}

	default List<MyTask> getMyTasks(int assignedByAccountId) {
		return getMyTasks(assignedByAccountId, null);
	}

	default List<MyTask> getMyTasks(Status status) {
		return getMyTasks(0, status);
	}

	List<MyTask> getMyTasks(int assignedByAccountId, Status status);

	MyStatus getMyStatus();

	List<Contact> getContacts();

	default Room createRoom(String name, IntStream admins) {
		return createRoom(name, admins, null, null, null, null);
	}

	default Room createRoom(String name, IntStream admins, String description) {
		return createRoom(name, admins, null, null, description, null);
	}

	default Room createRoom(String name, IntStream admins, IconPreset icon) {
		return createRoom(name, admins, null, null, null, icon);
	}

	default Room createRoom(String name, IntStream admins, String description, IconPreset icon) {
		return createRoom(name, admins, null, null, description, icon);
	}

	default Room createRoom(String name, IntStream admins, IntStream members, IntStream readOnlyMembers) {
		return createRoom(name, admins, members, readOnlyMembers, null, null);
	}

	default Room createRoom(String name, IntStream admins, IntStream members, IntStream readOnlyMembers, String description) {
		return createRoom(name, admins, members, readOnlyMembers, description, null);
	}

	default Room createRoom(String name, IntStream admins, IntStream members, IntStream readOnlyMembers, IconPreset icon) {
		return createRoom(name, admins, members, readOnlyMembers, null, icon);
	}

	default Room createRoomWithMember(String name, IntStream admins, IntStream members) {
		return createRoom(name, admins, members, null, null, null);
	}

	default Room createRoomWithMember(String name, IntStream admins, IntStream members, String description) {
		return createRoom(name, admins, members, null, description, null);
	}

	default Room createRoomWithMember(String name, IntStream admins, IntStream members, IconPreset icon) {
		return createRoom(name, admins, members, null, null, icon);
	}

	default Room createRoomWithMember(String name, IntStream admins, IntStream members, String description, IconPreset icon) {
		return createRoom(name, admins, members, null, description, icon);
	}

	default Room createRoomWithReadOnlyMember(String name, IntStream admins, IntStream readOnlyMembers) {
		return createRoom(name, admins, null, readOnlyMembers, null, null);
	}

	default Room createRoomWithReadOnlyMember(String name, IntStream admins, IntStream readOnlyMembers, String description) {
		return createRoom(name, admins, null, readOnlyMembers, description, null);
	}

	default Room createRoomWithReadOnlyMember(String name, IntStream admins, IntStream readOnlyMembers, IconPreset icon) {
		return createRoom(name, admins, null, readOnlyMembers, null, icon);
	}

	default Room createRoomWithReadOnlyMember(String name, IntStream admins, IntStream readOnlyMembers, String description, IconPreset icon) {
		return createRoom(name, admins, null, readOnlyMembers, description, icon);
	}

	Room createRoom(String name, IntStream admins, IntStream members, IntStream readOnlyMembers, String description, IconPreset icon);

	List<Room> getRooms();

	RoomClient getRoomClient(int roomId);

	void deleteRoom(int roomId, ActionType action);

}
