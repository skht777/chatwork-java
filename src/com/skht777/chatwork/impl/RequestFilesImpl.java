/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.RequestFiles;
import com.skht777.chatwork.api.File;

/**
 * @author skht777
 *
 */
class RequestFilesImpl extends ChatworkRequest implements RequestFiles {

	/**
	 * 
	 */
	public RequestFilesImpl() {
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestFiles#getFile(int, boolean)
	 */
	@Override
	public File getFile(int fileId, boolean isDownload) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestFiles#getFiles(int)
	 */
	@Override
	public List<File> getFiles(int accountId) {
		return null;
	}

}
