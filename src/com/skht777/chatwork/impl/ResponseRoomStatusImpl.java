/**
 * 
 */
package com.skht777.chatwork.impl;

import java.net.URL;
import java.time.LocalDateTime;

import com.skht777.chatwork.api.MyStatus;
import com.skht777.chatwork.api.NumberedRoom;
import com.skht777.chatwork.parameter.Role;
import com.skht777.chatwork.parameter.Type;

/**
 * @author skht777
 *
 */
class ResponseRoomStatusImpl implements NumberedRoom, MyStatus {

	/**
	 * 
	 */
	public ResponseRoomStatusImpl() {
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.NumberedRooms#getType()
	 */
	@Override
	public Type getType() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.NumberedRooms#getSticky()
	 */
	@Override
	public boolean getSticky() {
		return false;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.NumberedRooms#getMessageNum()
	 */
	@Override
	public int getMessageNum() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.NumberedRooms#getFileNum()
	 */
	@Override
	public int getFileNum() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.NumberedRooms#TaskNum()
	 */
	@Override
	public int TaskNum() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.NumberedRooms#getLastUpdateTime()
	 */
	@Override
	public LocalDateTime getLastUpdateTime() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.RoomAccount#getIconPath()
	 */
	@Override
	public URL getIconPath() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.RoomId#getRoomId()
	 */
	@Override
	public int getRoomId() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Name#getName()
	 */
	@Override
	public String getName() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Activity#getUnreadNum()
	 */
	@Override
	public int getUnreadNum() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Activity#getMentionNum()
	 */
	@Override
	public int getMentionNum() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Activity#getMytaskNum()
	 */
	@Override
	public int getMytaskNum() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Role#getRole()
	 */
	@Override
	public Role getRole() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.MyStatus#getUnreadRoomNum()
	 */
	@Override
	public int getUnreadRoomNum() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.MyStatus#getMentionRoomNum()
	 */
	@Override
	public int getMentionRoomNum() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.MyStatus#getMytaskRoomNum()
	 */
	@Override
	public int getMytaskRoomNum() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.NumberedRoom#getDescription()
	 */
	@Override
	public String getDescription() {
		return null;
	}

}
