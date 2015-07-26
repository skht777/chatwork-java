/**
 * 
 */
package com.skht777.chatwork.impl;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.skht777.chatwork.api.File;
import com.skht777.chatwork.api.Message;
import com.skht777.chatwork.api.MyTask;
import com.skht777.chatwork.api.RoomAccount;
import com.skht777.chatwork.api.Task;
import com.skht777.chatwork.api.UserAccount;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
class ResponseRoomObjectImpl implements Message, Task, MyTask, File {

	/**
	 * 
	 */
	public ResponseRoomObjectImpl() {
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.MessageId#getMessageId()
	 */
	@Override
	public int getMessageId() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Account#getAccount()
	 */
	@Override
	public UserAccount getAccount() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Body#getBody()
	 */
	@Override
	public String getBody() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.TaskBase#getTaskId()
	 */
	@Override
	public int getTaskId() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.TaskBase#getLimitDate()
	 */
	@Override
	public LocalDate getLimitDate() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.TaskBase#getStatus()
	 */
	@Override
	public Status getStatus() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.AssignedByAccount#getAssignedByAccount()
	 */
	@Override
	public UserAccount getAssignedByAccount() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Room#getRoom()
	 */
	@Override
	public RoomAccount getRoom() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Files#fileId()
	 */
	@Override
	public int fileId() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Files#getFileName()
	 */
	@Override
	public String getFileName() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Files#getFileSize()
	 */
	@Override
	public int getFileSize() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Files#getUploadTime()
	 */
	@Override
	public LocalDateTime getUploadTime() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.File#getDownloadUrl()
	 */
	@Override
	public URL getDownloadUrl() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Message#getSendTime()
	 */
	@Override
	public LocalDateTime getSendTime() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Message#getUpdateTime()
	 */
	@Override
	public LocalDateTime getUpdateTime() {
		return null;
	}

}
