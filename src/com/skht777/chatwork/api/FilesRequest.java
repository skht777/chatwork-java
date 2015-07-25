/**
 * 
 */
package com.skht777.chatwork.api;

import java.util.List;

/**
 * @author skht777
 *
 */
public interface FilesRequest {

	File getFile(int fileId, boolean isDownload);

	List<File> getFiles(int accountId);

}
