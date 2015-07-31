/**
 * 
 */
package com.skht777.chatwork.impl;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.skht777.chatwork.parameter.ActionType;
import com.skht777.chatwork.parameter.IconPreset;
import com.skht777.chatwork.parameter.Status;

/**
 * @author skht777
 *
 */
class ParameterImpl {

	private enum ParameterList {

		ACCOUNT_ID(ParameterList.num),
		ASSIGNED_BY_ACCOUNT_ID(ParameterList.num),
		STATUS(ParameterList.obj),
		DESCRIPTION(ParameterList.obj),
		ICON_PRESET(ParameterList.obj),
		NAME(ParameterList.obj),
		MEMBERS_ADMIN_IDS(ParameterList.nums),
		MEMBERS_MEMBER_IDS(ParameterList.nums),
		MEMBERS_READONLY_IDS(ParameterList.nums),
		ACTION_TYPE(ParameterList.obj),
		FORCE(ParameterList.bit),
		BODY(ParameterList.obj),
		LIMIT(ParameterList.date),
		TO_IDS(ParameterList.nums),
		CREATE_DOWNLOAD_URL(ParameterList.bit);
		
		private Function<Object, String> func;
		
		private static final Function<Object, String> obj = (value) -> String.valueOf(value);
		private static final Function<Object, String> num = (value) -> String.valueOf((int) value);
		private static final Function<Object, String> bit = (value) -> (boolean) value ? "1" : "0";
		private static final Function<Object, String> nums = (value) -> IntStream.of((int[]) value).mapToObj(String::valueOf).collect(Collectors.joining(","));
		private static final Function<Object, String> date = (value) -> Timestamp.valueOf(((LocalDate) value).atStartOfDay()).toString();
		
		private ParameterList(Function<Object, String> func) {
			this.func = func;
		}
		
		private NameValuePair create(Object value) {
			return new BasicNameValuePair(toString().toLowerCase(), value == null || (int) value == 0 ? null : func.apply(value));
		}
		
		private static List<NameValuePair> of(NameValuePair... args) {
			return Arrays.asList(args).stream().filter(p -> p.getValue() != null).collect(Collectors.toList());
		}

	}

	static List<NameValuePair> getMyTasks(int assignedByAccountId, Status status) {
		return ParameterList.of(
				ParameterList.ASSIGNED_BY_ACCOUNT_ID.create(assignedByAccountId),
				ParameterList.STATUS.create(status));
	}

	static List<NameValuePair> createRoom(String name, int[] admins, int[] members, int[] readOnlyMembers, String description, IconPreset icon) {
		return ParameterList.of(
				ParameterList.NAME.create(name),
				ParameterList.MEMBERS_ADMIN_IDS.create(admins),
				ParameterList.MEMBERS_MEMBER_IDS.create(members),
				ParameterList.MEMBERS_READONLY_IDS.create(readOnlyMembers),
				ParameterList.DESCRIPTION.create(description),
				ParameterList.ICON_PRESET.create(icon));
	}
	
	static List<NameValuePair> editRoom(String name, String description, IconPreset icon) {
		return ParameterList.of(
				ParameterList.NAME.create(name),
				ParameterList.DESCRIPTION.create(description),
				ParameterList.ICON_PRESET.create(icon));
	}

	static List<NameValuePair> deleteRoom(ActionType action) {
		return ParameterList.of(ParameterList.ACTION_TYPE.create(action));
	}

	static List<NameValuePair> editMembers(int[] admins, int[] members, int[] readOnlyMembers) {
		return ParameterList.of(
				ParameterList.MEMBERS_ADMIN_IDS.create(admins),
				ParameterList.MEMBERS_MEMBER_IDS.create(members),
				ParameterList.MEMBERS_READONLY_IDS.create(readOnlyMembers));
	}

	static List<NameValuePair> createMessage(String body) {
		return ParameterList.of(ParameterList.BODY.create(body));
	}

	static List<NameValuePair> getMessages(boolean isForce) {
		return ParameterList.of(ParameterList.FORCE.create(isForce));
	}

	static List<NameValuePair> getTasks(int accountId, int assignedByAccountId, Status status) {
		return ParameterList.of(
				ParameterList.ACCOUNT_ID.create(accountId),
				ParameterList.ASSIGNED_BY_ACCOUNT_ID.create(assignedByAccountId),
				ParameterList.STATUS.create(status));
	}

	static List<NameValuePair> createTask(String body, int[] toIds, LocalDate limit) {
		return ParameterList.of(
				ParameterList.BODY.create(body),
				ParameterList.TO_IDS.create(toIds),
				ParameterList.LIMIT.create(limit));
	}

	static List<NameValuePair> getFile(boolean isDownload) {
		return ParameterList.of(ParameterList.CREATE_DOWNLOAD_URL.create(isDownload));
	}

	static List<NameValuePair> getFiles(int accountId) {
		return ParameterList.of(ParameterList.ACCOUNT_ID.create(accountId));
	}

}
