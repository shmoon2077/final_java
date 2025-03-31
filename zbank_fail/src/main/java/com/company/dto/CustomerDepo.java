package com.company.dto;

public class CustomerDepo {
	private String did;
	private String deponum;
	private long dbalance;
	private long depoin;
	private long depoout;
	public CustomerDepo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDepo(String did, String deponum, long dbalance, long depoin, long depoout) {
		super();
		this.did = did;
		this.deponum = deponum;
		this.dbalance = dbalance;
		this.depoin = depoin;
		this.depoout = depoout;
	}
	@Override
	public String toString() {
		return "CustomerDepo [did=" + did + ", deponum=" + deponum + ", dbalance=" + dbalance + ", depoin=" + depoin
				+ ", depoout=" + depoout + "]";
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
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
	public long getDepoin() {
		return depoin;
	}
	public void setDepoin(long depoin) {
		this.depoin = depoin;
	}
	public long getDepoout() {
		return depoout;
	}
	public void setDepoout(long depoout) {
		this.depoout = depoout;
	}

	

}
