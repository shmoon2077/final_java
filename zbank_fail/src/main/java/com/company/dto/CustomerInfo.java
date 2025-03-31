package com.company.dto;

public class CustomerInfo {
	private int cno;
	private String cname;
	private String cid;
	private int cpswd;
	private int cphone;
	private String cjoin;
	
	
	
	
	public CustomerInfo() { super();  }


	@Override
	public String toString() {
		return "CustomerInfo [cno=" + cno + ", cname=" + cname + ", cid=" + cid + ", cpswd=" + cpswd + ", cphone="
				+ cphone + ", cjoin=" + cjoin + "]";
	}
	
	
	 public int getCno() { return cno; }
	 public void setCno(int cno) { this.cno = cno; }
	 public String getCname() { return cname; }
	 public void setCname(String cname) { this.cname = cname; }
	 public String getCid() { return cid; }
	 public void setCid(String cid) { this.cid = cid; }
	 public int getCpswd() { return cpswd; }
	 public void setCpswd(int cpswd) { this.cpswd = cpswd; }
	 public int getCphone() { return cphone; }
	 public void setCphone(int cphone) { this.cphone = cphone; }
	 public String getCjoin() { return cjoin; }
	 public void setCjoin(String cjoin) { this.cjoin = cjoin; }


	public CustomerInfo(int cno, String cname, String cid, int cpswd, int cphone, String cjoin) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.cid = cid;
		this.cpswd = cpswd;
		this.cphone = cphone;
		this.cjoin = cjoin;
	}

	
	
	
	
	
	
	
	

}
