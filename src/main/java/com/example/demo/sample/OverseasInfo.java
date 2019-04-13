package com.example.demo.sample;

import java.sql.Date;
import java.sql.Time;

public class OverseasInfo {

		private String oInvoiceNo;
		private String oTimeStamp;
	    private String oLocation;
	    private String oItemStatus;
	    private Time oItemTime; 
		
	    public String getoInvoiceNo() {
			return oInvoiceNo;
		}
		
		public void setoInvoiceNo(String oInvoiceNo) {
			this.oInvoiceNo = oInvoiceNo;
		}
		
		public String getoLocation() {
			return oLocation;
		}
		
		public void setoLocation(String oLocation) {
			this.oLocation = oLocation;
		}
		
		public String getoItemStatus() {
			return oItemStatus;
		}
		
		public void setoItemStatus(String oItemStatus) {
			this.oItemStatus = oItemStatus;
		}
		
		public String getoTimeStamp() {
			return oTimeStamp;
		}

		public void setoTimeStamp(String oTimeStamp) {
			this.oTimeStamp = oTimeStamp;
		}

		public Time getoItemTime() {
			return oItemTime;
		}

		public void setoItemTime(Time oItemTime) {
			this.oItemTime = oItemTime;
		}

		@Override
		public String toString() {
			return "OverseasInfo [oInvoiceNo=" + oInvoiceNo + ", oTimeStamp=" + oTimeStamp + ", oLocation=" + oLocation
					+ ", oItemStatus=" + oItemStatus + ", oItemTime=" + oItemTime + "]";
		}
		
	    
}
