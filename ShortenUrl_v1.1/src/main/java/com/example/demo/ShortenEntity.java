package com.example.demo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class ShortenEntity 
{
	
	/*public   String name;   //For sample Project
	public   int id ;  */     
	@Id 
	public  int url_id ;
	public  String Url_Long;
	public  String Url_Short;
    public  Date  Url_CreateDt;
    public  Date  Url_ModifiedDt;
	
	public Date getUrl_ModifiedDt() {
		return Url_ModifiedDt;
	}

	public void setUrl_ModifiedDt(Date url_ModifiedDt) {
		Url_ModifiedDt = url_ModifiedDt;
	}

	public int getUrl_id() {
		return url_id;
	}

	public void setUrl_id(int url_id) {
		this.url_id = url_id;
	}

	public String getUrl_Long() {
		return Url_Long;
	}

	public void setUrl_Long(String url_Long) {
		Url_Long = url_Long;
	}

	public String getUrl_Short() {
		return Url_Short;
	}

	public void setUrl_Short(String url_Short) {
		Url_Short = url_Short;
	}

	public Date getUrl_CreateDt() {
		return Url_CreateDt;
	}

	public void setUrl_CreateDt(Date url_CreateDt) {
		Url_CreateDt = url_CreateDt;
	}

	/**public  int Getno(int s){
		return id = s;	
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		 this.name = name;
	}

	public  int getId() {
		return id;
	}

	public  void setId(int id) {
		this .id = id;
	}
**/
}



