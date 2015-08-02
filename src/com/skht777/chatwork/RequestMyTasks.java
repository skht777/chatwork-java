/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;

import com.skht777.chatwork.api.MyTask;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
public interface RequestMyTasks {

	List<MyTask> getMyTasks(int assignedByAccountId, Status status);

}
