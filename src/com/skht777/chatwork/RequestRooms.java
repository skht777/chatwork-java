/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;

import com.skht777.chatwork.api.NumberedRooms;
import com.skht777.chatwork.parameter.IconPreset;

/**
 * @author skht777
 *
 */
public interface RequestRooms {

	List<NumberedRooms> getRooms();

	NumberedRoomClient createRoom(String name, int[] admins, int[] members, int[] readOnlyMembers, String description, IconPreset icon);
}
