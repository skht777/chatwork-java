/**
 * 
 */
package com.skht777.chatwork.api;

/**
 * @author skht777
 *
 */
interface User extends UserAccount {

	String getChatworkId();

	int getOrganizationId();

	String getOrganizationName();

	String getDepartment();

}
