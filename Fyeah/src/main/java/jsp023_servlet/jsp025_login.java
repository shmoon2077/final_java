package jsp023_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/user_login")
public class jsp025_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public jsp025_login() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();


		//1. 데이터 받아오기 (name,pass)
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		System.out.println(1);
		//2. db 연동
		ResultSet rset=null;
		DBManager db = new DBManager();
		Connection conn = db.getConnection();
		//3. sql구문 처리

		System.out.println(2);
		
		PreparedStatement pstmt = null;  
		String sql = "select count(*) `cnt` from member where name=? and pass=?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			
			rset = pstmt.executeQuery(); // select - executeQuery / insert , delete , update - executeUpdate
			
		
			int result = -1;
			if ( rset.next() ) { result=rset.getInt("cnt"); }
			System.out.println(3);
			if ( result ==1) { 
				HttpSession session= request.getSession();
				session.setAttribute("username", name);
				response.sendRedirect("jsp025_my.jsp");
			} else { out.println("<script>alert('정보를 확인해주세요'); history.go(-1);</script>"); }
			
			
		} catch (SQLException e) { e.printStackTrace();
		}finally {
			if(rset != null) {  try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if(pstmt != null) {  try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if(conn != null) {  try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		
		
		
		
		//4. 결과 처리
		
	}

}
