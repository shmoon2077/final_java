package com.company.dto;

public class DepoLog {
	private String ldeponum;
	private String dtrantype;
	private long dtranamount;
	private String dtrandate;

	public DepoLog() { super();  }

	public DepoLog(String ldeponum, String dtrantype, long dtranamount, String dtrandate) {
		super();
		this.ldeponum = ldeponum;
		this.dtrantype = dtrantype;
		this.dtranamount = dtranamount;
		this.dtrandate = dtrandate;
	}

	@Override
	public String toString() {
		return "DepoLog [ldeponum=" + ldeponum + ", dtrantype=" + dtrantype + ", dtranamount=" + dtranamount
				+ ", dtrandate=" + dtrandate + "]";
	}

	public String getLdeponum() {
		return ldeponum;
	}

	public void setLdeponum(String ldeponum) {
		this.ldeponum = ldeponum;
	}

	public String getDtrantype() {
		return dtrantype;
	}

	public void setDtrantype(String dtrantype) {
		this.dtrantype = dtrantype;
	}

	public long getDtranamount() {
		return dtranamount;
	}

	public void setDtranamount(long dtranamount) {
		this.dtranamount = dtranamount;
	}

	public String getDtrandate() {
		return dtrandate;
	}

	public void setDtrandate(String dtrandate) {
		this.dtrandate = dtrandate;
	}






	

}
