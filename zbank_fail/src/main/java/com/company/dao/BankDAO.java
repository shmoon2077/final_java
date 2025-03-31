package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.dbm.DBManager;
import com.company.dto.CustomerInfo;
import com.company.dto.CustomerLoan;
import com.company.dto.DepoLog;
import com.company.dto.LoanLog;
import com.company.dto.LoginInformation;
import com.company.dto.CustomerDepo;

public class BankDAO {
	// 회원 가입
	public int join( CustomerInfo ci ) {
		String sql = "insert into customer_info (cname, cid, cpswd, cphone) values (?,?,?,?)";
		int result=-1;
		DBManager db = new DBManager();
		Connection conn =null;  PreparedStatement pstmt = null;
		conn = db.getConnetion();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ci.getCname());
			pstmt.setString(2, ci.getCid());
			pstmt.setInt(3, ci.getCpswd());
			pstmt.setInt(4, ci.getCphone());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {e.printStackTrace(); }
		finally {
			if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) {e.printStackTrace();}}
			if (conn != null) { try { conn.close(); } catch (SQLException e) {e.printStackTrace();}}
		}
		return result;
	}
		
	// id pswd 입력
		public boolean login( CustomerInfo ci ) {
			String sql = "select count(*) from customer_info where cid=? and cpswd=?";
			DBManager db = new DBManager();
			Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;
			boolean isValid = false;
			
			try {
				conn = db.getConnetion();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ci.getCid() );
				pstmt.setInt(2, ci.getCpswd() );
				
				rset = pstmt.executeQuery();
				if (rset.next()) {
					int count = rset.getInt(1);
					isValid = (count>0);
				}
			} catch (Exception e) {e.printStackTrace();} finally {
				if (rset != null ) try { rset.close(); } catch (SQLException e) {e.printStackTrace();}
				if (pstmt != null ) try { pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
				if (conn != null ) try { conn.close(); } catch (SQLException e) {e.printStackTrace();}
				
			}
			return isValid;
		}
	
	// 로그인 후 회원 화면
		public void LogInfo (CustomerInfo ci) {
			String sql = "select distinct a.cid, a.cname, a.cphone, a.cjoin, b.deponum, b.dbalance, c.loanum,c.lbalance from customer_info a left join customer_depo b on a.cid = b.did left join customer_loan c on a.cid = c.lid where a.cid=?"; 
			Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;
			DBManager db = new DBManager();
			conn = db.getConnetion();
			
			
			List<LoginInformation> info = new ArrayList<>();
			
			
			
			
			try {
				while (rset.next()) {
				LoginInformation infoli = new LoginInformation();
				infoli.setCid(rset.getString("cid"));
				infoli.setCname(rset.getString("cname"));
				infoli.setCphone(rset.getInt("cphone"));
				infoli.setCjoin(rset.getString("cjoin"));
				infoli.setDeponum(rset.getString("deponum"));
				infoli.setDbalance(rset.getLong("dbalance"));
				infoli.setLoannum(rset.getString("loannum"));
				infoli.setLbalance(rset.getLong("lbalance"));
				info.add(infoli);

				}
				
				
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ci.getCid());
			
			rset = pstmt.executeQuery();
			
			
			} catch (Exception e) {e.printStackTrace(); }
			finally {
				if (rset != null) try { rset.close(); } catch (Exception e) {e.printStackTrace();}
				if (pstmt != null) try { pstmt.close(); } catch (Exception e) {e.printStackTrace();}
				if (conn != null) try { conn.close(); } catch (Exception e) {e.printStackTrace();}
			}
		}
	
		
	// 계좌 선택시 계좌 기록 ( 예금 )
		public void DepoTran (DepoLog dl) {
			String sql = "select dtrantype dtranamount drandate from depo_log where ldeponum=?";
			Connection conn = null ; PreparedStatement pstmt = null; ResultSet rset = null;
			DBManager db = new DBManager();
			conn = db.getConnetion();
			List<DepoLog> dlog = new ArrayList<>();
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dl.getLdeponum());
				rset = pstmt.executeQuery();
				while (rset.next()) {
					DepoLog dlogli = new DepoLog();
					dlogli.setDtrantype(rset.getString("dtrantype"));
					dlogli.setDtranamount(rset.getLong("dtranamount"));
					dlogli.setDtrandate(rset.getString("dtrandate"));
					dlog.add(dlogli);
				}
				
				
			} catch (Exception e) {e.printStackTrace();}
			finally {
				if (rset != null) try { rset.close(); } catch (Exception e) {e.printStackTrace();}
				if (pstmt != null) try { pstmt.close(); } catch (Exception e) {e.printStackTrace();}
				if (conn != null) try { conn.close(); } catch (Exception e) {e.printStackTrace();}
			}
			
			
		}
		
		
	// 계좌 선택시 계좌 기록 ( 대출 )
		public void LoanTran (LoanLog ll) {
			String sql = "select ltrantype ltranamount lrandate from loan_log where lloannum=?";
			Connection conn = null ; PreparedStatement pstmt = null; ResultSet rset = null;
			DBManager db = new DBManager();
			conn = db.getConnetion();
			List<LoanLog> llog = new ArrayList<>();
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ll.getLloannum());
				rset = pstmt.executeQuery();
				while (rset.next()) {
					LoanLog llogli = new LoanLog();
					llogli.setLtrantype(rset.getString("ltrantype"));
					llogli.setLtranamount(rset.getLong("ltranamount"));
					llogli.setLtrandate(rset.getString("ltrandate"));
					llog.add(llogli);
				}
				
				
			} catch (Exception e) {e.printStackTrace();}
			finally {
				if (rset != null) try { rset.close(); } catch (Exception e) {e.printStackTrace();}
				if (pstmt != null) try { pstmt.close(); } catch (Exception e) {e.printStackTrace();}
				if (conn != null) try { conn.close(); } catch (Exception e) {e.printStackTrace();}
			}
			
			
		}
		
	// 입금 (예금)
		public void DepoIn (CustomerDepo cd) {
			String sql1 = "UPDATE customer_depo SET dblance + ? where did=?";
			String sql2 = "INSERT depo_log (ldeponum,dtrantype,dtranamount,dtrandate) VALUES (?,?,?,CURRENT_TIMESTAMP)";
			Connection conn = null; PreparedStatement pstmt1 = null; PreparedStatement pstmt2 = null;
			DBManager db = new DBManager();
			conn = db.getConnetion();
			try {
				pstmt1 = conn.prepareStatement(sql1);
				pstmt1.setLong(1, cd.getDepoin());
				pstmt1.setString(2, cd.getDid());
				pstmt1.executeUpdate();
				
				pstmt2 = conn.prepareStatement(sql2);
				pstmt2.setString(1, cd.getDeponum());
				pstmt2.setString(2, "입금");
				pstmt2.setLong(3, cd.getDepoin());
								
			} catch (Exception e) {e.printStackTrace();}
			finally {
				if (pstmt1 != null) try { pstmt1.close(); } catch (Exception e) {e.printStackTrace();}
				if (pstmt2 != null) try { pstmt2.close(); } catch (Exception e) {e.printStackTrace();}
				if (conn != null) try { conn.close(); } catch (Exception e) {e.printStackTrace();}
			}
		}
			
	//출금 (예금)
		public void DepoOut (CustomerDepo cd) {
			String sql1 = "UPDATE customer_depo SET dblance - ? where did=?";
			String sql2 = "INSERT depo_log (ldeponum,dtrantype,dtranamount,dtrandate) VALUES (?,?,?,CURRENT_TIMESTAMP)";
			Connection conn = null; PreparedStatement pstmt1 = null; PreparedStatement pstmt2 = null;
			DBManager db = new DBManager();
			conn = db.getConnetion();
			try {
				pstmt1 = conn.prepareStatement(sql1);
				pstmt1.setLong(1, cd.getDepoout());
				pstmt1.setString(2, cd.getDid());
				pstmt1.executeUpdate();
				
				pstmt2 = conn.prepareStatement(sql2);
				pstmt2.setString(1, cd.getDeponum());
				pstmt2.setString(2, "출금");
				pstmt2.setLong(3, cd.getDepoout());
				pstmt2.executeUpdate();
								
			} catch (Exception e) {e.printStackTrace();}
			finally {
				if (pstmt1 != null) try { pstmt1.close(); } catch (Exception e) {e.printStackTrace();}
				if (pstmt2 != null) try { pstmt2.close(); } catch (Exception e) {e.printStackTrace();}
				if (conn != null) try { conn.close(); } catch (Exception e) {e.printStackTrace();}
			}
		}
	
		
		
	// 입금 (대출)
		public void LoanIn (CustomerLoan cl) {
			String sql1 = "UPDATE customer_loan SET lblance + ? where did=?";  
			String sql2 = "INSERT loan_log (lloannum,ltrantype,ltranamount,ltrandate) VALUES (?,?,?,CURRENT_TIMESTAMP)";
			Connection conn = null; PreparedStatement pstmt1 = null; PreparedStatement pstmt2 = null;
			DBManager db = new DBManager();
			conn = db.getConnetion();
			try {
				pstmt1 = conn.prepareStatement(sql1);
				pstmt1.setLong(1, cl.getLoanin());
				pstmt1.setString(2, cl.getLid());
				pstmt1.executeUpdate();
				
				pstmt2 = conn.prepareStatement(sql2);
				pstmt2.setString(1, cl.getLoannum());
				pstmt2.setString(2, "입금");
				pstmt2.setLong(3, cl.getLoanin());
				pstmt2.executeUpdate();
				
				
				
			} catch (Exception e) {e.printStackTrace();}
			finally {
				if (pstmt1 != null) try { pstmt1.close(); } catch (Exception e) {e.printStackTrace();}
				if (pstmt2 != null) try { pstmt2.close(); } catch (Exception e) {e.printStackTrace();}
				if (conn != null) try { conn.close(); } catch (Exception e) {e.printStackTrace();}
			}
		}
		
		
		
	// 출금 (대출)
		public void LoanOut (CustomerLoan cl) {
			String sql1 = "UPDATE customer_loan SET lblance - ? where did=?";  
			String sql2 = "INSERT loan_log (lloannum,ltrantype,ltranamount,ltrandate) VALUES (?,?,?,CURRENT_TIMESTAMP)";
			Connection conn = null; PreparedStatement pstmt1 = null; PreparedStatement pstmt2 = null;
			DBManager db = new DBManager();
			conn = db.getConnetion();
			try {
				pstmt1 = conn.prepareStatement(sql1);
				pstmt1.setLong(1, cl.getLoanout());
				pstmt1.setString(2, cl.getLid());
				pstmt1.executeUpdate();
				
				pstmt2 = conn.prepareStatement(sql2);
				pstmt2.setString(1, cl.getLoannum());
				pstmt2.setString(2, "출금");
				pstmt2.setLong(3, cl.getLoanout());
				pstmt2.executeUpdate();
				
				
				
			} catch (Exception e) {e.printStackTrace();}
			finally {
				if (pstmt1 != null) try { pstmt1.close(); } catch (Exception e) {e.printStackTrace();}
				if (pstmt2 != null) try { pstmt2.close(); } catch (Exception e) {e.printStackTrace();}
				if (conn != null) try { conn.close(); } catch (Exception e) {e.printStackTrace();}
			}
		}
	
	
	
	
	
	
	

}
