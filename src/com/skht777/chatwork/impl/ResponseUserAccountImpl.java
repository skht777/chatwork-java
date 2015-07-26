/**
 * 
 */
package com.skht777.chatwork.impl;

import java.net.URL;

import com.skht777.chatwork.api.Me;
import com.skht777.chatwork.api.Member;
import com.skht777.chatwork.parameter.Role;

/**
 * @author skht777
 *
 */
public class ResponseUserAccountImpl implements Member, Me {

	/**
	 * 
	 */
	public ResponseUserAccountImpl() {
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.User#getChatworkId()
	 */
	@Override
	public int getChatworkId() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.User#getOrganizationId()
	 */
	@Override
	public int getOrganizationId() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.User#getOrganizationName()
	 */
	@Override
	public int getOrganizationName() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.User#getDepartment()
	 */
	@Override
	public String getDepartment() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.UserAccount#getAccountId()
	 */
	@Override
	public int getAccountId() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.UserAccount#AvatarImageUrl()
	 */
	@Override
	public URL AvatarImageUrl() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Name#getName()
	 */
	@Override
	public String getName() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Role#getRole()
	 */
	@Override
	public Role getRole() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.RoomId#getRoomId()
	 */
	@Override
	public int getRoomId() {
		return 0;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getTitle()
	 */
	@Override
	public String getTitle() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getUrl()
	 */
	@Override
	public URL getUrl() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getIntroduction()
	 */
	@Override
	public String getIntroduction() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getMail()
	 */
	@Override
	public String getMail() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getTelOrganization()
	 */
	@Override
	public String getTelOrganization() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getTelExtension()
	 */
	@Override
	public String getTelExtension() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getTelMobile()
	 */
	@Override
	public String getTelMobile() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getSkype()
	 */
	@Override
	public String getSkype() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getFacebook()
	 */
	@Override
	public String getFacebook() {
		return null;
	}

	/* (非 Javadoc)
	 * @see com.skht777.chatwork.api.Me#getTwitter()
	 */
	@Override
	public String getTwitter() {
		return null;
	}

}
