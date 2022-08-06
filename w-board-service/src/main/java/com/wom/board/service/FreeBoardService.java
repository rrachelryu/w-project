package com.wom.board.service;


import com.wom.board.dto.FreeBoardDTO;


public interface FreeBoardService {
	/* 자유게시판 게시글 등록 */
	Long register(FreeBoardDTO dto);
	
	//List<FreeBoardDTO> getList()
}
