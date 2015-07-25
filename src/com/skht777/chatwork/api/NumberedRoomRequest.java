/**
 * 
 */
package com.skht777.chatwork.api;

import com.skht777.chatwork.parameter.ActionType;
import com.skht777.chatwork.parameter.IconPreset;

/**
 * @author skht777
 *
 */
public interface NumberedRoomRequest {

	NumberedRoom getRoom();

	void editRoom(String name, String description, IconPreset icon);

	void deleteRoom(ActionType action);

}
