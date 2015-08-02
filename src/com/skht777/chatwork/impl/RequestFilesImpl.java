/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.RequestFiles;
import com.skht777.chatwork.api.File;
import com.skht777.chatwork.api.Files;

/**
 * @author skht777
 *
 */
class RequestFilesImpl extends ChatworkRequest implements RequestFiles {	

	/**
	 * 
	 * @param token
	 * @param roomId
	 */
	protected RequestFilesImpl(APIToken token, int roomId) {
		super(token, Endpoint.FILES, roomId);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestFiles#getFile(int, boolean)
	 */
	@Override
	public File getFile(int fileId, boolean isDownload) {
		return ResponseImpl.getFile(get(fileId, ParameterImpl.getFile(isDownload)));
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestFiles#getFiles(int)
	 */
	@Override
	public List<Files> getFiles(int accountId) {
		return ResponseImpl.getFiles(get(ParameterImpl.getFiles(accountId)));
	}

}
