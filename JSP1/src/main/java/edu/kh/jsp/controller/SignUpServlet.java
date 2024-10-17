package edu.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pass = "/WEB-INF/views/signup_result.jsp";
		
		// 2) 요청 발송자 얻어오기
		RequestDispatcher dispatcher = req.getRequestDispatcher(pass);
		
		// 3) 요청 위임(forward)
		dispatcher.forward(req, resp);
		
		String id = req.getParameter("inputId");
		String pw = req.getParameter("inputPw");
		String check = req.getParameter("inputCheckedPw");
		String name = req.getParameter("inputName");
		String age = req.getParameter("inputAge");
		
	}
	
	
}
