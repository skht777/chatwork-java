/**
 *
 */
package com.skht777.chatwork.impl;

import com.skht777.chatwork.parameter.ActionType;
import com.skht777.chatwork.parameter.IconPreset;
import com.skht777.chatwork.parameter.Status;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author skht777
 *
 */
class ParameterImpl {

    private enum ParameterOperator {

        OBJECT(Object::toString),
        NUMBERS((int[] v) -> Arrays.stream(v).mapToObj(String::valueOf).collect(Collectors.joining(","))),
        BIT((Boolean v) -> v ? "1" : "0"),
        DATE((LocalDate v) -> Timestamp.valueOf(v.atStartOfDay()).toString());

		private Function<Object, String> func;

        ParameterOperator(Function<?, String> func) {
            this.func = (Function<Object, String>) func;
        }

        private String apply(Object o) {
            return func.apply(o);
        }

    }

    private enum ParameterList {

        ACCOUNT_ID(),
        ASSIGNED_BY_ACCOUNT_ID(),
        STATUS(),
        DESCRIPTION(),
        ICON_PRESET(),
        NAME(),
        MEMBERS_ADMIN_IDS(ParameterOperator.NUMBERS),
        MEMBERS_MEMBER_IDS(ParameterOperator.NUMBERS),
        MEMBERS_READONLY_IDS(ParameterOperator.NUMBERS),
        ACTION_TYPE(),
        FORCE(ParameterOperator.BIT),
        BODY(),
        LIMIT(ParameterOperator.DATE),
        TO_IDS(ParameterOperator.NUMBERS),
        CREATE_DOWNLOAD_URL(ParameterOperator.BIT);

        private ParameterOperator po;

        ParameterList() {
            po = ParameterOperator.OBJECT;
        }

        ParameterList(ParameterOperator po) {
            this.po = po;
        }

		private NameValuePair create(Object value) {
            return new BasicNameValuePair(toString().toLowerCase(), value == null || (int) value == 0 ? null : po.apply(value));
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
