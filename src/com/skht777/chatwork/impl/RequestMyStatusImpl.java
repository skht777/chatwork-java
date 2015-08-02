/**
 * 
 */
package com.skht777.chatwork.impl;

import com.skht777.chatwork.RequestMyStatus;
import com.skht777.chatwork.api.MyStatus;

/**
 * @author skht777
 *
 */
class RequestMyStatusImpl extends ChatworkRequest implements RequestMyStatus {

	/**
	 * 
	 * @param token
	 */
	protected RequestMyStatusImpl(APIToken token) {
		super(token, Endpoint.MY_STATUS);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMyStatus#getMyStatus()
	 */
	@Override
	public MyStatus getMyStatus() {
		return ResponseImpl.getMyStatus(get());
	}

}
