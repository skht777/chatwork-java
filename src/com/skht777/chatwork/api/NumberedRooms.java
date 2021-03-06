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
public interface NumberedRooms extends RoomAccount, Activity, Role {

	Type getType();

	boolean isSticky();

	int getMessageNum();

	int getFileNum();

	int getTaskNum();

	LocalDateTime getLastUpdateTime();

}
