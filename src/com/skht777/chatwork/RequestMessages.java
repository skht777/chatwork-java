/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;

import com.skht777.chatwork.api.Message;
import com.skht777.chatwork.api.MessageId;

/**
 * @author skht777
 *
 */
public interface RequestMessages {

	MessageId createMessage(String body);

	List<Message> getMessages(boolean isForce);

	Message getMessage(int messageId);

}
