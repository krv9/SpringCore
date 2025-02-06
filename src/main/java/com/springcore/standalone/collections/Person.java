package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> Friends;
	private Map<String, Integer>Feestructure;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeestructure() {
		return Feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		Feestructure = feestructure;
	}

	public List<String> getFriends() {
		return Friends;
	}

	public void setFriends(List<String> friends) {
		Friends = friends;
	}

	@Override
	public String toString() {
		return "Person [Friends=" + Friends + ", Feestructure=" + Feestructure + "]";
	}


}
