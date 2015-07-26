/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.RequestMyTasks;
import com.skht777.chatwork.api.MyTask;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
class RequestMyTasksImpl extends ChatworkRequest implements RequestMyTasks {

	/**
	 * 
	 */
	public RequestMyTasksImpl() {
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMyTasks#getMyTasks(int, com.skht777.chatwork.parameter.Status)
	 */
	@Override
	public List<MyTask> getMyTasks(int assignedByAccountId, Status status) {
		return null;
	}

}
