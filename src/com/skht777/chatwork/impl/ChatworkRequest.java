/**
 * 
 */
package com.skht777.chatwork.impl;

/**
 * @author skht777
 *
 */
public class ChatworkRequest {

	private APIToken token;
	private int roomId;

	/**
	 * 
	 * @param token
	 * @param roomId
	 */
	protected ChatworkRequest(APIToken token, int roomId) {
		this.token = token;
	}
	
	/**
	 * 
	 * @param token
	 */
	protected ChatworkRequest(APIToken token) {
		this(token, 0);
	}
	
	void getRequest() {
		
	}

}
