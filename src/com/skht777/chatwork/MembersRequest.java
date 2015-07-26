/**
 * 
 */
package com.skht777.chatwork;

import java.util.List;
import java.util.Map;

import com.skht777.chatwork.api.Member;
import com.skht777.chatwork.parameter.Role;

/**
 * @author skht777
 *
 */
public interface MembersRequest {

	Map<Role, List<Integer>> editMembers(int[] admins, int[] members, int[] readOnlyMembers);

	List<Member> getMembers();

}
