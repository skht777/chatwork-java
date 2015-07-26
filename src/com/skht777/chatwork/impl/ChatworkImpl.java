/**
 * 
 */
package com.skht777.chatwork.impl;

import com.skht777.chatwork.Chatwork;
import com.skht777.chatwork.Client;
import com.skht777.chatwork.NumberedRoomClient;

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

	/*
	 * (非 Javadoc)
	 * @see com.skht777.chatwork.Chatwork#getClient()
	 */
	@Override
	public Client getClient() {
		return null;
	}

	/*
	 * (非 Javadoc)
	 * @see com.skht777.chatwork.Chatwork#getRoomClient(int)
	 */
	@Override
	public NumberedRoomClient getRoomClient(int roomId) {
		return null;
	}

}
