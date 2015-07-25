/**
 * 
 */
package com.skht777.chatwork.impl;

import com.skht777.chatwork.Chatwork;
import com.skht777.chatwork.Client;
import com.skht777.chatwork.RoomClient;

/**
 * @author skht777
 *
 */
class ChatworkImpl implements Chatwork {

	private String token;
	
	/**
	 * 
	 */
	ChatworkImpl(String token) {
		this.token = token;
	}

	@Override
	public Client getClient() {
		return null;
	}

	@Override
	public RoomClient getRoomClient(int roomId) {
		return null;
	}

}
