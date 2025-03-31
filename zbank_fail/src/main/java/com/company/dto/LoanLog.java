package com.company.dto;

public class LoanLog {
	private String lloannum;
	private String ltrantype;
	private long ltranamount;
	private String ltrandate;
	
	
	public LoanLog() { super();  }


	public LoanLog(String loannum, String ltrantype, long ltranamount, String ltrandate) {
		super();
		this.lloannum = loannum;
		this.ltrantype = ltrantype;
		this.ltranamount = ltranamount;
		this.ltrandate = ltrandate;
	}


	@Override
	public String toString() {
		return "LoanLog [loannum=" + lloannum + ", ltrantype=" + ltrantype + ", ltranamount=" + ltranamount
				+ ", ltrandate=" + ltrandate + "]";
	}


	public String getLloannum() {
		return lloannum;
	}


	public void setLloannum(String loannum) {
		this.lloannum = loannum;
	}


	public String getLtrantype() {
		return ltrantype;
	}


	public void setLtrantype(String ltrantype) {
		this.ltrantype = ltrantype;
	}


	public long getLtranamount() {
		return ltranamount;
	}


	public void setLtranamount(long ltranamount) {
		this.ltranamount = ltranamount;
	}


	public String getLtrandate() {
		return ltrandate;
	}


	public void setLtrandate(String ltrandate) {
		this.ltrandate = ltrandate;
	}
	
	


}
