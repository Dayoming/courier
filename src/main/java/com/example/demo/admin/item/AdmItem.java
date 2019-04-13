package com.example.demo.admin.item;

public class AdmItem {
	
	private String itemId;
	private String invoiceNo;
	private String shopName;
	private String itemName;
	private String receiverAddr;
	private String postNum;
	private String location;
	private String receiverName;
	private String contactUs;
	private String koreaInvoiceNo;
	private String itemStatus;
	private String courierOffice;
	private String timeStamp;
	private String itemTime;

	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getReceiverAddr() {
		return receiverAddr;
	}
	public void setReceiverAddr(String reveiverAddr) {
		this.receiverAddr = reveiverAddr;
	}
	public String getPostNum() {
		return postNum;
	}
	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	
	public String getContactUs() {
		return contactUs;
	}
	
	public void setContactUs(String contactUs) {
		this.contactUs = contactUs;
	}
	
	public String getKoreaInvoiceNo() {
		return koreaInvoiceNo;
	}
	
	public void setKoreaInvoiceNo(String koreaInvoiceNo) {
		this.koreaInvoiceNo = koreaInvoiceNo;
	}
	
	public String getItemStatus() {
		return itemStatus;
	}
	
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	public String getCourierOffice() {
		return courierOffice;
	}
	public void setCourierOffice(String courierOffice) {
		this.courierOffice = courierOffice;
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public String getItemTime() {
		return itemTime;
	}
	public void setItemTime(String itemTime) {
		this.itemTime = itemTime;
	}
	
	@Override
	public String toString() {
		return "AdmItem [itemId=" + itemId + ", invoiceNo=" + invoiceNo + ", shopName=" + shopName + ", itemName="
				+ itemName + ", receiverAddr=" + receiverAddr + ", postNum=" + postNum + ", location=" + location
				+ ", receiverName=" + receiverName + ", contactUs=" + contactUs + ", koreaInvoiceNo=" + koreaInvoiceNo
				+ ", itemStatus=" + itemStatus + ", courierOffice=" + courierOffice + ", timeStamp=" + timeStamp + "]";
	}
	

}
