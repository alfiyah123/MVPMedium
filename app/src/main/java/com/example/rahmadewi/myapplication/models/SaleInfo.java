package com.example.rahmadewi.myapplication.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SaleInfo{

	@SerializedName("country")
	private String country;

	@SerializedName("isEbook")
	private boolean isEbook;

	@SerializedName("saleability")
	private String saleability;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setIsEbook(boolean isEbook){
		this.isEbook = isEbook;
	}

	public boolean isIsEbook(){
		return isEbook;
	}

	public void setSaleability(String saleability){
		this.saleability = saleability;
	}

	public String getSaleability(){
		return saleability;
	}

	@Override
 	public String toString(){
		return 
			"SaleInfo{" + 
			"country = '" + country + '\'' + 
			",isEbook = '" + isEbook + '\'' + 
			",saleability = '" + saleability + '\'' + 
			"}";
		}
}