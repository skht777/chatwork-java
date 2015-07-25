/**
 * 
 */
package com.skht777.chatwork.api;

import java.time.LocalDateTime;

/**
 * @author skht777
 *
 */
public interface Message extends MessageId, Account, Body {

	LocalDateTime getSendTime();

	LocalDateTime getUpdateTime();

}
