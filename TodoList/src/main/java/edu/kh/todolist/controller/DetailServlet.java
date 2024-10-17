package edu.kh.todolist.controller;

import java.io.IOException;

import edu.kh.todolist.model.dto.Todo;
import edu.kh.todolist.model.service.TodoListService;
import edu.kh.todolist.model.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// Controller(요청을 받아 알맞은 서비스 호출, 응답을 어떻게 처리할지 결정-> View)

@WebServlet("/todo/detail")
public class DetailServlet extends HttpServlet{
	
	// a 태그 요청은 GET 방식
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			// 요청 받았을 때 파라미터 전달받음
			
			// 1. 전달 받은 파라미터 꺼내오기
			int index = Integer.parseInt(req.getParameter("index") );
			// 0~3
			
			// 2. 상세 조회 서비스 호출 후 결과 반환 받기
			TodoListService service = new TodoListServiceImpl();
			
			Todo todo = service.todoDetailView(index);
			// index 번째 todo가 없으면 null
			//					 있으면 Todo 객체가 있음
			
			// index 번째 todo가 존재하지 않을 경우 (todo = null)
			// -> 메인페이지(/) redirect 후
			//    "해당 index에 todo 가 존재하지 않습니다"
			//    alert 출력
			if(todo == null) {
				
				// message -> session에 세팅
				HttpSession session = req.getSession();
				session.setAttribute("message", "해당 index에 todo 가 존재하지 않습니다");
				
				resp.sendRedirect("/");
				return;
			}
			
			// index 번째 todo가 존재하는 경우
			// detail.jsp로 forward 해서 응답
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
