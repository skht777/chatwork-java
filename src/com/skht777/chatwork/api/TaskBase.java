/**
 * 
 */
package com.skht777.chatwork.api;

import java.time.LocalDate;

import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
interface TaskBase extends AssignedByAccount, MessageId, Body {

	int getTaskId();

	LocalDate getLimitDate();

	Status getStatus();

}
