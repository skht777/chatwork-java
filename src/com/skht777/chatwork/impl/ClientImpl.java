/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.Client;
import com.skht777.chatwork.NumberedRoomClient;
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

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMe#getAccount()
	 */
	@Override
	public Me getAccount() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMyTasks#getMyTasks(int, com.skht777.chatwork.parameter.Status)
	 */
	@Override
	public List<MyTask> getMyTasks(int assignedByAccountId, Status status) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMyStatus#getMyStatus()
	 */
	@Override
	public MyStatus getMyStatus() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestContacts#getContacts()
	 */
	@Override
	public List<Contact> getContacts() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestRooms#getRooms()
	 */
	@Override
	public List<NumberedRoom> getRooms() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestRooms#createRoom(java.lang.String, int[], int[], int[], java.lang.String, com.skht777.chatwork.parameter.IconPreset)
	 */
	@Override
	public NumberedRoomClient createRoom(String name, int[] admins, int[] members,
			int[] readOnlyMembers, String description, IconPreset icon) {
		return null;
	}

}
