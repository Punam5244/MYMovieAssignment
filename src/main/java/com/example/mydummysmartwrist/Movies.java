package com.example.mydummysmartwrist;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Movies{

	@SerializedName("Response")
	private String response;

	@SerializedName("totalResults")
	private String totalResults;

	@SerializedName("Search")
	private List<SearchItem> search;

	public String getResponse(){
		return response;
	}

	public String getTotalResults(){
		return totalResults;
	}

	public List<SearchItem> getSearch(){
		return search;
	}
}