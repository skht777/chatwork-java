/**
 * 
 */
package com.skht777.chatwork.impl;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 * @author skht777
 *
 */
enum Parameter {

	ACCOUNT_ID,
	ASSIGNED_BY_ACCOUNT_ID,
	STATUS,
	DESCRIPTION,
	ICON_PRESET,
	NAME,
	MEMBERS_ADMIN_IDS,
	MEMBERS_MEMBER_IDS,
	MEMBERS_READONLY_IDS,
	ACTION_TYPE,
	FORCE,
	BODY,
	LIMIT,
	TO_IDS,
	CREATE_DOWNLOAD_URL;

	NameValuePair valueOf(Object value) {
		return new BasicNameValuePair(toString().toLowerCase(), convertObject(value));
	}

	private String convertObject(Object o) {
		if(o.getClass().isArray()) return IntStream.of((int[]) o).mapToObj(String::valueOf).collect(Collectors.joining(","));
		if(o.toString().equals("true") || o.toString().equals("false")) return ((boolean) o) ? "1" : "0";
		if(o instanceof LocalDate) return Timestamp.valueOf(((LocalDate) o).atStartOfDay()).toString();
		return o.toString();
	}

}
