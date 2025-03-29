package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDAO;

import domain.BoardVO;

public class BDelete implements BoardService {

	
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;  charset=UTF-8");

		int bno = Integer.parseInt(request.getParameter("bno"));
		
		
		BoardDAO dao = new BoardDAO();


		request.setAttribute("result", String.valueOf(dao.delete(bno)));

	}

}
