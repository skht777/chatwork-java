/**
 * 
 */
package com.skht777.chatwork.impl;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author skht777
 *
 */
enum Endpoint {

	ME(), MY_STATUS(), MY_TASKS(), CONTACTS(), ROOMS(), MEMBERS(ROOMS), TASKS(ROOMS), FILES(ROOMS);
	
	private static final String BASE = "https://api.chatwork.com/v1";
	
	private Endpoint base;
	
	private Endpoint() {
		base = null;
	}
	
	private Endpoint(Endpoint base) {
		this.base = base;
	}
	
	public String getURL() {
		return Endpoint.slashJoin(BASE, base != null ? base.get() : get());
	}
	
	public String getURL(int id) {
		return Endpoint.slashJoin(getURL(), String.valueOf(id));
	}
	
	public String getURL(int roomId, int id) {
		return Endpoint.slashJoin(getURL(roomId), get(), String.valueOf(id));
	}
	
	private String get() {
		if(toString().contains("_")) return Endpoint.slashJoin(toString().split("/"));
		return toString().toLowerCase();
	}
	
	private static String slashJoin(String... args) {
		return Arrays.stream(args).collect(Collectors.joining("/"));
	}
	
}
