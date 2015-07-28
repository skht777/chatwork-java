/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.NumberedRoomClient;
import com.skht777.chatwork.RequestRooms;
import com.skht777.chatwork.api.NumberedRoom;
import com.skht777.chatwork.parameter.IconPreset;

/**
 * @author skht777
 *
 */
class RequestRoomsImpl extends ChatworkRequest implements RequestRooms {

	/**
	 * 
	 * @param token
	 */
	protected RequestRoomsImpl(APIToken token) {
		super(token);
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
	public NumberedRoomClient createRoom(String name, int[] admins,
			int[] members, int[] readOnlyMembers, String description,
			IconPreset icon) {
		return null;
	}

}
