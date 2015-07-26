/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;

import com.skht777.chatwork.api.Message;

/**
 * @author skht777
 *
 */
public interface MessagesRequest {

	Message createMessage(String body);

	List<Message> getMessages(boolean isForce);

	Message getMessage(int messageId);

}
