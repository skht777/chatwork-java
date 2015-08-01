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

	public static Chatwork createInstance(String token){
		return new ChatworkImpl(token);
	}

}
