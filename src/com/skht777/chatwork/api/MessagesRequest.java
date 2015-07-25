/**
 * 
 */
package com.skht777.chatwork.api;

import java.util.List;

/**
 * @author skht777
 *
 */
public interface MessagesRequest {

	Message createMessage(String body);

	List<Message> getMessages(boolean isForce);

	Message getMessage(int messageId);

}
