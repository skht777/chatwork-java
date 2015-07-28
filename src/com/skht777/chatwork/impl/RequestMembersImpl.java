/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.List;
import java.util.Map;

import com.skht777.chatwork.RequestMembers;
import com.skht777.chatwork.api.Member;
import com.skht777.chatwork.parameter.Role;

/**
 * @author skht777
 *
 */
public class RequestMembersImpl extends ChatworkRequest implements RequestMembers {

	/**
	 * 
	 * @param token
	 * @param roomId
	 */
	protected RequestMembersImpl(APIToken token, int roomId) {
		super(token, roomId);
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMembers#editMembers(int[], int[], int[])
	 */
	@Override
	public Map<Role, List<Integer>> editMembers(int[] admins, int[] members,
			int[] readOnlyMembers) {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.RequestMembers#getMembers()
	 */
	@Override
	public List<Member> getMembers() {
		return null;
	}

}
