package com.wom.board;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.wom.board.entity.FreeBoard;
import com.wom.board.repository.BoardRepository;

@SpringBootTest
public class FreeBoardTests {

	@Autowired
	private BoardRepository boardRepository;
	
	@Test
	public void insertDummies() {
		IntStream.rangeClosed(1, 20).forEach(i->{
			FreeBoard freeboard = FreeBoard.builder()
					.title("제목___"+i)
					.content("내용이에요___"+i)
					.nickname("작성자는___"+i+"대장")
					.userId("id"+i)
					.build();
			System.out.println(boardRepository.save(freeboard));
		});
	}
	
	@Test
	public void selectTest() {
		Pageable pageable = PageRequest.of(0, 10, Sort.by("bno").descending());
		
	}
}
