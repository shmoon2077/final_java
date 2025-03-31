package com.company.dto;

public class CustomerLoan {
	private String lid;
	private String loannum;
	private long lbalance;
	private long loanin;
	private long loanout;
	
	
	public CustomerLoan() { super();  }


	public CustomerLoan(String lid, String loannum, long lbalance, long loanin, long loanout) {
		super();
		this.lid = lid;
		this.loannum = loannum;
		this.lbalance = lbalance;
		this.loanin = loanin;
		this.loanout = loanout;
	}


	@Override
	public String toString() {
		return "CustomerLoan [lid=" + lid + ", loannum=" + loannum + ", lbalance=" + lbalance + ", loanin=" + loanin
				+ ", loanout=" + loanout + "]";
	}


	public String getLid() {
		return lid;
	}


	public void setLid(String lid) {
		this.lid = lid;
	}


	public String getLoannum() {
		return loannum;
	}


	public void setLoannum(String loannum) {
		this.loannum = loannum;
	}


	public long getLbalance() {
		return lbalance;
	}


	public void setLbalance(long lbalance) {
		this.lbalance = lbalance;
	}


	public long getLoanin() {
		return loanin;
	}


	public void setLoanin(long loanin) {
		this.loanin = loanin;
	}


	public long getLoanout() {
		return loanout;
	}


	public void setLoanout(long loanout) {
		this.loanout = loanout;
	}
	


}
