package com.zhuoyue.model;
import java.util.Date;
/*   
 * @author 兰心序
 * 仓库中的订单
 * */
public class Repertory {
	private int id;
	private int sortstationId;
	private long orderId;
	private int status;
	private Date date;
	private int nextStationCode;
	private int userId;
	private int modify;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSortstationId() {
		return sortstationId;
	}
	public void setSortstationId(int sortstationId) {
		this.sortstationId = sortstationId;
	}
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getNextStationCode() {
		return nextStationCode;
	}
	public void setNextStationCode(int nextStationCode) {
		this.nextStationCode = nextStationCode;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getModify() {
		return modify;
	}
	public void setModify(int modify) {
		this.modify = modify;
	}
	
}
