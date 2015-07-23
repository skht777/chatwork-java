/**
 * 
 */
package com.skht777.chatwork;

/**
 * @author skht777
 *
 */
public class ChatworkFactory {

	private static ClientImpl client;
	
	static {
		client = null;
	}
	
	public static Client createInstance(String token){
		if(client == null) client = new ClientImpl(token);
		return client;
	}

}
