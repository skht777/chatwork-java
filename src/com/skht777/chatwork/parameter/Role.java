/**
 * 
 */
package com.skht777.chatwork.parameter;

/**
 * @author skht777
 *
 */
public enum Role {

	ADMIN, MEMBER, READONLY;

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
