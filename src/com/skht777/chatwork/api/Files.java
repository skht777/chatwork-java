/**
 * 
 */
package com.skht777.chatwork.api;

import java.time.LocalDateTime;

/**
 * @author skht777
 *
 */
public interface Files extends Account, MessageId {

	int getFileId();

	String getFileName();

	int getFileSize();

	LocalDateTime getUploadTime();

}
