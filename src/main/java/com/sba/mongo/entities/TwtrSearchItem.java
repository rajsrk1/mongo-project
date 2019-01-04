package com.sba.mongo.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;


public class TwtrSearchItem {
	
	@Id
	private String id;
	
	private Date reqTS;
	private String searchKey;
	private String reqUsr;
	private String searchType;
	private boolean isAvailable;
	private String lastStatus1;
	private String lastStatus2;
	private Date lastActyTS;
	private String lastDesc;
	private String lastPrcsName;
	//private List<ActivityItem> activity;
	
	public TwtrSearchItem(Date reqTS, String searchKey, String reqUsr, String searchType, boolean isAvailable,
			String lastStatus1, String lastStatus2, Date lastActyTS, String lastDesc, String lastPrcsName) {
		super();
		this.reqTS = reqTS;
		this.searchKey = searchKey;
		this.reqUsr = reqUsr;
		this.searchType = searchType;
		this.isAvailable = isAvailable;
		this.lastStatus1 = lastStatus1;
		this.lastStatus2 = lastStatus2;
		this.lastActyTS = lastActyTS;
		this.lastDesc = lastDesc;
		this.lastPrcsName = lastPrcsName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getReqTS() {
		return reqTS;
	}
	public void setReqTS(Date reqTS) {
		this.reqTS = reqTS;
	}
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public String getReqUsr() {
		return reqUsr;
	}
	public void setReqUsr(String reqUsr) {
		this.reqUsr = reqUsr;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getLastStatus1() {
		return lastStatus1;
	}
	public void setLastStatus1(String lastStatus1) {
		this.lastStatus1 = lastStatus1;
	}
	public String getLastStatus2() {
		return lastStatus2;
	}
	public void setLastStatus2(String lastStatus2) {
		this.lastStatus2 = lastStatus2;
	}
	public Date getLastActyTS() {
		return lastActyTS;
	}
	public void setLastActyTS(Date lastActyTS) {
		this.lastActyTS = lastActyTS;
	}
	public String getLastDesc() {
		return lastDesc;
	}
	public void setLastDesc(String lastDesc) {
		this.lastDesc = lastDesc;
	}
	public String getLastPrcsName() {
		return lastPrcsName;
	}
	public void setLastPrcsName(String lastPrcsName) {
		this.lastPrcsName = lastPrcsName;
	}
	
	@Override
	public String toString() {
		return "TwtrSearchItem [id=" + id + ", reqTS=" + reqTS + ", searchKey=" + searchKey + ", reqUsr=" + reqUsr
				+ ", searchType=" + searchType + ", isAvailable=" + isAvailable + ", lastStatus1=" + lastStatus1
				+ ", lastStatus2=" + lastStatus2 + ", lastActyTS=" + lastActyTS + ", lastDesc=" + lastDesc
				+ ", lastPrcsName=" + lastPrcsName + "]";
	}
	
	
	
		
}
