/**
 * 
 */
package com.skht777.chatwork.api;

import java.time.LocalDateTime;

import com.skht777.chatwork.parameter.Type;

/**
 * @author skht777
 *
 */
interface NumberedRooms extends RoomAccount, Activity, Role {

	Type getType();

	boolean getSticky();

	int getMessageNum();

	int getFileNum();

	int TaskNum();

	LocalDateTime getLastUpdateTime();

}
