/**
 * 
 */
package com.skht777.chatwork.impl;

import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

import com.skht777.chatwork.Chatwork;
import com.skht777.chatwork.Client;
import com.skht777.chatwork.NumberedRoomClient;

/**
 * @author skht777
 *
 */
class ChatworkImpl implements Chatwork, APIToken {

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
		return new ClientImpl(this);
	}

	/*
	 * (非 Javadoc)
	 * @see com.skht777.chatwork.Chatwork#getRoomClient(int)
	 */
	@Override
	public NumberedRoomClient getRoomClient(int roomId) {
		return new NumberedRoomClientImpl(this, roomId);
	}

	@Override
	public Header getToken() {
		return new BasicHeader("X-ChatWorkToken", token);
	}

}
