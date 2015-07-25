/**
 * 
 */
package com.skht777.chatwork.api;

import java.util.List;

import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
public interface MyTasksRequest {

	List<MyTask> getMyTasks(int assignedByAccountId, Status status);
	
}
