/**
 * 
 */
package com.skht777.chatwork.impl;

import com.skht777.chatwork.Chatwork;

/**
 * @author skht777
 *
 */
public class ChatworkFactory {

	private static ChatworkImpl chatwork;
	
	static {
		chatwork = null;
	}
	
	public static Chatwork createInstance(String token){
		if(chatwork == null) chatwork = new ChatworkImpl(token);
		return chatwork;
	}

}
