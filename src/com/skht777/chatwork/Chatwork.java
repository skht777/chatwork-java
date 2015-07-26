/**
 * 
 */
package com.skht777.chatwork;

/**
 * @author skht777
 *
 */
public interface Chatwork {
	
	Client getClient();
	
	NumberedRoomClient getRoomClient(int roomId);

}
