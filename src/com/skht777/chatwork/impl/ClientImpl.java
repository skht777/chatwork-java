/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.Client;
import com.skht777.chatwork.RoomClient;
import com.skht777.chatwork.api.Contact;
import com.skht777.chatwork.api.Me;
import com.skht777.chatwork.api.MyStatus;
import com.skht777.chatwork.api.MyTask;
import com.skht777.chatwork.api.NumberedRoom;
import com.skht777.chatwork.parameter.IconPreset;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
class ClientImpl extends ClientBase implements Client {

	/**
	 * 
	 */
	ClientImpl() {
		super();
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
	public RoomClient createRoom(String name, int[] admins, int[] members,
			int[] readOnlyMembers, String description, IconPreset icon) {
		return null;
	}

	@Override
	public List<NumberedRoom> getRooms() {
		return null;
	}

}
