/**
 * 
 */
package com.skht777.chatwork.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClients;

/**
 * @author skht777
 *
 */
public class ChatworkRequest {

	private APIToken token;
	private Endpoint base;
	private int roomId;

	private HttpClient client;

	private class EnclosingHttpDelete extends HttpPost {

		public EnclosingHttpDelete(String arg0) {
			super(arg0);
		}

		@Override
		public String getMethod() {
			return "DELETE";
		}

	}

	/**
	 * 
	 * @param token
	 * @param base
	 * @param roomId
	 */
	protected ChatworkRequest(APIToken token, Endpoint base, int roomId) {
		this.token = token;
		this.base = base;
		client = HttpClients.createDefault();
	}

	/**
	 * 
	 * @param token
	 * @param base
	 */
	protected ChatworkRequest(APIToken token, Endpoint base) {
		this(token, base, 0);
	}

	String get(int id, List<NameValuePair> param) {
		return getJSONString(new HttpGet(getURL(id, param)));
	}

	String get(List<NameValuePair> param) {
		return get(0, param);
	}

	String get(int id) {
		return get(id, null);
	}
	
	String get() {
		return get(0, null);
	}
	
	String post(List<NameValuePair> param) {
		return getJSONString(getEnclosingRequest(new HttpPost(getURL()), param));
	}

	String put(List<NameValuePair> param) {
		return getJSONString(getEnclosingRequest(new HttpPut(getURL()), param));
	}

	String delete(List<NameValuePair> param) {
		return getJSONString(getEnclosingRequest(new EnclosingHttpDelete(getURL()), param));
	}

	private String getURL() {
		return roomId == 0 ? base.getURL() : base.getURL(roomId);
	}

	private String getURL(int id, List<NameValuePair> param) {
		String url = id == 0 ? getURL() : base.getURL(roomId, id);
		try {
			URIBuilder builder = new URIBuilder(url);
			if(param != null) builder.addParameters(param);
			return builder.build().toString();
		}catch(URISyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}

	private HttpUriRequest getEnclosingRequest(HttpEntityEnclosingRequest request, List<NameValuePair> param) {
		try {
			request.setEntity(new UrlEncodedFormEntity(param));
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return (HttpUriRequest) request;
	}

	private String getJSONString(HttpUriRequest request) {
		request.addHeader(token.getToken());
		try {
			return client.execute(request, new BasicResponseHandler());
		}catch(ClientProtocolException e) {
			e.printStackTrace();
			return null;
		}catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
