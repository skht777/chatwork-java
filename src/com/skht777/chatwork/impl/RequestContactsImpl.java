/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;

import com.skht777.chatwork.RequestContacts;
import com.skht777.chatwork.api.Contact;

/**
 * @author skht777
 *
 */
class RequestContactsImpl extends ChatworkRequest implements RequestContacts {

	/**
	 * 
	 * @param token
	 */
	RequestContactsImpl(APIToken token) {
		super(token);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestContacts#getContacts()
	 */
	@Override
	public List<Contact> getContacts() {
		return null;
	}

}
