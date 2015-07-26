/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;

import com.skht777.chatwork.api.File;

/**
 * @author skht777
 *
 */
public interface RequestFiles {

	File getFile(int fileId, boolean isDownload);

	List<File> getFiles(int accountId);

}
