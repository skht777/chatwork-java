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
class ClientImpl implements Client {

	private String token;

	/**
	 * 
	 */
	ClientImpl(String token) {
		this.token = token;
	}

	String getToken() {
		return token;
	}

	@Override
	public Me getAccount() {
		return null;
	}

	@Override
	public List<MyTask> getMyTasks(int assignedByAccountId, Status status) {
		return null;
	}

	@Override
	public MyStatus getMyStatus() {
		return null;
	}

	@Override
	public List<Contact> getContacts() {
		return null;
	}

	@Override
	public Room createRoom(String name, IntStream admins, IntStream members,
			IntStream readOnlyMembers, String description, IconPreset icon) {
		return null;
	}

	@Override
	public List<Room> getRooms() {
		return null;
	}

	@Override
	public RoomClient getRoomClient(int roomId) {
		return null;
	}

	@Override
	public void deleteRoom(int roomId, ActionType action) {
	}

}
