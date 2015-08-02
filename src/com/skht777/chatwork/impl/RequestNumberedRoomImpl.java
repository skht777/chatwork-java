/**
 * 
 */
package com.skht777.chatwork.impl;

import com.skht777.chatwork.RequestNumberedRoom;
import com.skht777.chatwork.api.NumberedRoom;
import com.skht777.chatwork.parameter.ActionType;
import com.skht777.chatwork.parameter.IconPreset;

/**
 * @author skht777
 *
 */
class RequestNumberedRoomImpl extends ChatworkRequest implements RequestNumberedRoom {

	/**
	 * 
	 * @param token
	 * @param roomId
	 */
	protected RequestNumberedRoomImpl(APIToken token, int roomId) {
		super(token, Endpoint.ROOMS, roomId);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestNumberedRoom#getRoom()
	 */
	@Override
	public NumberedRoom getRoom() {
		return ResponseImpl.getNumberdRoom(get());
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestNumberedRoom#editRoom(java.lang.String, java.lang.String, com.skht777.chatwork.parameter.IconPreset)
	 */
	@Override
	public void editRoom(String name, String description, IconPreset icon) {
		put(ParameterImpl.editRoom(name, description, icon));
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestNumberedRoom#deleteRoom(com.skht777.chatwork.parameter.ActionType)
	 */
	@Override
	public void deleteRoom(ActionType action) {
		delete(ParameterImpl.deleteRoom(action));
	}

}
