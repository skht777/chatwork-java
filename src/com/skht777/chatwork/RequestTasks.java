/**
 * 
 */
package com.skht777.chatwork;

import java.time.LocalDate;
import java.util.List;

import com.skht777.chatwork.api.Task;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
public interface RequestTasks {

	List<Task> getTasks(int accountId, int assignedByAccountId, Status status);

	List<Integer> createTask(String body, int[] toIds, LocalDate limit);

	Task getTask(int taskId);

}
