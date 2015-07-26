/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.RequestMessages;
import com.skht777.chatwork.api.Message;

/**
 * @author skht777
 *
 */
public class RequestMessagesImpl extends ChatworkRequest implements RequestMessages {

	/**
	 * 
	 */
	public RequestMessagesImpl() {
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#createMessage(java.lang.String)
	 */
	@Override
	public Message createMessage(String body) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#getMessages(boolean)
	 */
	@Override
	public List<Message> getMessages(boolean isForce) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#getMessage(int)
	 */
	@Override
	public Message getMessage(int messageId) {
		return null;
	}

}
