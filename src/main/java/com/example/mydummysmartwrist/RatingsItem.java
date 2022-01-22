package com.example.mydummysmartwrist;

import com.google.gson.annotations.SerializedName;

public class RatingsItem{

	@SerializedName("Value")
	private String value;

	@SerializedName("Source")
	private String source;

	public String getValue(){
		return value;
	}

	public String getSource(){
		return source;
	}
}