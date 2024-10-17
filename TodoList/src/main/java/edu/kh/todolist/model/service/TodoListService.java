package edu.kh.todolist.model.service;

import java.util.List;

import edu.kh.todolist.model.dto.Todo;

public interface TodoListService {
	// public abstract를 명시하지 않아도 public abstract으로 해석됨
	
	/** 할 일 목록 반환 서비스
	 * @return tosoList
	 */
	/*public abstract*/List<Todo> todoListFullView(); // 추상메서드(interface)

	/** 전달 받은 title, detail 이용하여 할 일 추가 서비스
	 * @param title
	 * @param detail
	 * @return 추가된 index번호 or -1 반환
	 */
	int todoAdd(String title, String detail) throws Exception;

	
	/** 전달받은 index 번째 todo 반환 서비스(상세조회용)
	 * @param index
	 * @return index 번째 todo, 없으면 null 반환
	 */
	Todo todoDetailView(int index);

	
}
