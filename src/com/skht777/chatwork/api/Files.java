/**
 * 
 */
package com.skht777.chatwork.api;

import java.time.LocalDateTime;

/**
 * @author skht777
 *
 */
interface Files extends Account, MessageId {

	int fileId();

	String getFileName();

	int getFileSize();

	LocalDateTime getUploadTime();

}
