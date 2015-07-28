/**
 * 
 */
package com.skht777.chatwork.impl;

import com.skht777.chatwork.RequestMe;
import com.skht777.chatwork.api.Me;

/**
 * @author skht777
 *
 */
class RequestMeImpl extends ChatworkRequest implements RequestMe {

	/**
	 * 
	 * @param token
	 */
	protected RequestMeImpl(APIToken token) {
		super(token);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMe#getAccount()
	 */
	@Override
	public Me getAccount() {
		return null;
	}

}
