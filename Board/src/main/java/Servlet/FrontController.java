package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FrontController() { super();  }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;  charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String path = request.getServletPath();		
		
		if ( path.equals("/list.do") ) { System.out.println("list.do : 전체 리스트"); }
		else if ( path.equals("/write.do") ) { System.out.println("write.do : 글 쓰기"); }
		else if ( path.equals("/detail.do") ) { System.out.println("detail.do : 글 보기"); }
		else if ( path.equals("/edit.do") ) { System.out.println("edit.do : 글 수정"); }
		else if ( path.equals("/delete.do") ) { System.out.println("delete.do : 글 삭제"); }
		}
	
		
		
	
	
	
	
	
}
