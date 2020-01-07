package bgu.spl.net.impl.data;

import java.util.HashMap;

public class User {
	public final String name;
	public final String password;
	private int connectionId;
	private boolean isLoggedIn = false;
	private HashMap<Integer, String> subscriptionMap;

	public User(int connectionId, String name, String password) {
		this.connectionId = connectionId;
		this.name = name;
		this.password = password;
		subscriptionMap = new HashMap<>();
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void login() {
		isLoggedIn = true;
	}

	public void logout() {
		isLoggedIn = false;
	}

	public int getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(int connectionId) {
		this.connectionId = connectionId;
	}

	public void subscribe(int subId, String topic) {
		subscriptionMap.put(subId, topic);
	}

	public HashMap<Integer, String> getSubscriptionMap() {
		return subscriptionMap;
	}

	public String getUserName() {
		return name;
	}


	public void unsubscribe(int subId) {
		subscriptionMap.remove(subId);
	}

	public String getTopic(int subId) {
		return subscriptionMap.get(subId);
	}

}