/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.Client;
import com.skht777.chatwork.NumberedRoomClient;
import com.skht777.chatwork.RequestContacts;
import com.skht777.chatwork.RequestMe;
import com.skht777.chatwork.RequestMyStatus;
import com.skht777.chatwork.RequestMyTasks;
import com.skht777.chatwork.RequestRooms;
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
class ClientImpl implements Client {

	RequestMe me;
	RequestMyTasks myTasks;
	RequestMyStatus myStatus;
	RequestContacts contacts;
	RequestRooms rooms;

	/**
	 * 
	 * @param token
	 */
	ClientImpl(APIToken token) {
		super();
		me = new RequestMeImpl(token);
		myTasks = new RequestMyTasksImpl(token);
		myStatus = new RequestMyStatusImpl(token);
		contacts = new RequestContactsImpl(token);
		rooms = new RequestRoomsImpl(token);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMe#getAccount()
	 */
	@Override
	public Me getAccount() {
		return me.getAccount();
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMyTasks#getMyTasks(int, com.skht777.chatwork.parameter.Status)
	 */
	@Override
	public List<MyTask> getMyTasks(int assignedByAccountId, Status status) {
		return myTasks.getMyTasks(assignedByAccountId, status);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMyStatus#getMyStatus()
	 */
	@Override
	public MyStatus getMyStatus() {
		return myStatus.getMyStatus();
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestContacts#getContacts()
	 */
	@Override
	public List<Contact> getContacts() {
		return contacts.getContacts();
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestRooms#getRooms()
	 */
	@Override
	public List<NumberedRoom> getRooms() {
		return rooms.getRooms();
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestRooms#createRoom(java.lang.String, int[], int[], int[], java.lang.String, com.skht777.chatwork.parameter.IconPreset)
	 */
	@Override
	public NumberedRoomClient createRoom(String name, int[] admins, int[] members,
			int[] readOnlyMembers, String description, IconPreset icon) {
		return rooms.createRoom(name, admins, members, readOnlyMembers, description, icon);
	}

}
