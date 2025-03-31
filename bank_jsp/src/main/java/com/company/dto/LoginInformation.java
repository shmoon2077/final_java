package com.company.dto;

public class LoginInformation {
    private String cid;
    private String cname;
    private int cphone;
    private String cjoin;
    private String deponum;
    private long dbalance;
    private String loannum;
    private long lbalance;
	public LoginInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoginInformation [cid=" + cid + ", cname=" + cname + ", cphone=" + cphone + ", cjoin=" + cjoin
				+ ", deponum=" + deponum + ", dbalance=" + dbalance + ", loannum=" + loannum + ", lbalance=" + lbalance
				+ "]";
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCphone() {
		return cphone;
	}
	public void setCphone(int cphone) {
		this.cphone = cphone;
	}
	public String getCjoin() {
		return cjoin;
	}
	public void setCjoin(String cjoin) {
		this.cjoin = cjoin;
	}
	public String getDeponum() {
		return deponum;
	}
	public void setDeponum(String deponum) {
		this.deponum = deponum;
	}
	public long getDbalance() {
		return dbalance;
	}
	public void setDbalance(long dbalance) {
		this.dbalance = dbalance;
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
	public LoginInformation(String cid, String cname, int cphone, String cjoin, String deponum, long dbalance,
			String loannum, long lbalance) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cphone = cphone;
		this.cjoin = cjoin;
		this.deponum = deponum;
		this.dbalance = dbalance;
		this.loannum = loannum;
		this.lbalance = lbalance;
	}

    
	

}
