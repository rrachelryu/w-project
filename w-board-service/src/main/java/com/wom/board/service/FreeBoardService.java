package com.wom.board.service;


import java.util.List;

import com.wom.board.dto.FreeBoardDTO;
import com.wom.board.dto.PageRequestDTO;
import com.wom.board.dto.PageResultDTO;
import com.wom.board.entity.FreeBoard;


public interface FreeBoardService {
	/* 자유게시판 게시글 등록 */
	Long register(FreeBoardDTO dto);
	
	/* 자유게시판 목록 처리*/
	/*PageResultDTO<FreeBoardDTO, FreeBoard> getList(PageRequestDTO requestDTO);*/
	/* 자유 게시판 목록 */
	List<FreeBoard> getAllList();
	
	default FreeBoard dtoToEntity(FreeBoardDTO dto) {
		FreeBoard entity = FreeBoard.builder()
				.bno(dto.getBno())
				.title(dto.getTitle())
				.content(dto.getContent())
				.nickname(dto.getNickname())
				.build();
		return entity;
	}
	
	default FreeBoardDTO entityToDto(FreeBoard entity) {
		FreeBoardDTO dto = FreeBoardDTO.builder()
				.bno(entity.getBno())
				.title(entity.getTitle())
				.content(entity.getContent())
				.nickname(entity.getNickname())
				.regDate(entity.getRegDate())
				.modDate(entity.getModDate())
				.build();
		return dto;
	}
}
