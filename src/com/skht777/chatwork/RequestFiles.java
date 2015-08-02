/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;

import com.skht777.chatwork.api.File;
import com.skht777.chatwork.api.Files;

/**
 * @author skht777
 *
 */
public interface RequestFiles {

	File getFile(int fileId, boolean isDownload);

	List<Files> getFiles(int accountId);

}
