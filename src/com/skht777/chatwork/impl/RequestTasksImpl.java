/**
 * 
 */
package com.skht777.chatwork.impl;

import java.time.LocalDate;
import java.util.List;

import com.skht777.chatwork.RequestTasks;
import com.skht777.chatwork.api.Task;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
class RequestTasksImpl extends ChatworkRequest implements RequestTasks {

	/**
	 * 
	 * @param token
	 * @param roomId
	 */
	protected RequestTasksImpl(APIToken token, int roomId) {
		super(token, roomId);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestTasks#getTasks(int, int, com.skht777.chatwork.parameter.Status)
	 */
	@Override
	public List<Task> getTasks(int accountId, int assignedByAccountId,
			Status status) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestTasks#createTask(java.lang.String, int[], java.time.LocalDate)
	 */
	@Override
	public Task createTask(String body, int[] toIds, LocalDate limit) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestTasks#getTask(int)
	 */
	@Override
	public Task getTask(int taskId) {
		return null;
	}

}