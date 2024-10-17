package edu.kh.todolist.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter + Setter + ToString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 매개변수 생성자
public class Todo implements Serializable{
							 // 직렬화
	private String title; // 제목
	private String detail; // 상세내용
	// + 와료여부
	// + 등록날짜
}