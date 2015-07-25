/**
 * 
 */
package com.skht777.chatwork.api;

import java.util.List;

import com.skht777.chatwork.RoomClient;
import com.skht777.chatwork.parameter.IconPreset;

/**
 * @author skht777
 *
 */
public interface RoomsRequest {

	List<NumberedRoom> getRooms();

	RoomClient createRoom(String name, int[] admins, int[] members, int[] readOnlyMembers, String description, IconPreset icon);
}
