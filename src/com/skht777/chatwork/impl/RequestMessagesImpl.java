/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.RequestMessages;
import com.skht777.chatwork.api.Message;
import com.skht777.chatwork.api.MessageId;

/**
 * @author skht777
 *
 */
public class RequestMessagesImpl extends ChatworkRequest implements RequestMessages {

	/**
	 * 
	 * @param token
	 * @param roomId
	 */
	protected RequestMessagesImpl(APIToken token, int roomId) {
		super(token, Endpoint.MESSAGES, roomId);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#createMessage(java.lang.String)
	 */
	@Override
	public MessageId createMessage(String body) {
		return ResponseImpl.createMessage(post(ParameterImpl.createMessage(body)));
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#getMessages(boolean)
	 */
	@Override
	public List<Message> getMessages(boolean isForce) {
		return ResponseImpl.getMessages(get(ParameterImpl.getMessages(isForce)));
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMessages#getMessage(int)
	 */
	@Override
	public Message getMessage(int messageId) {
		return ResponseImpl.getMessage(get(messageId));
	}

}
