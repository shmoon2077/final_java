package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDAO;

import domain.BoardVO;

public class BDetail implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;  charset=UTF-8");
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
		
		
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		
		
		
		dao.updateHit(bno);
		
		request.setAttribute("dto", dao.select(bno) );
	
	}

}
