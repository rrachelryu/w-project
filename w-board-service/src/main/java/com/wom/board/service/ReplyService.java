package com.wom.board.service;


import java.util.List;

import com.wom.board.dto.FreeBoardDTO;
import com.wom.board.dto.PageRequestDTO;
import com.wom.board.dto.PageResultDTO;
import com.wom.board.dto.ReplyDTO;
import com.wom.board.entity.FreeBoard;
import com.wom.board.entity.Reply;


public interface ReplyService {
	/* 댓글 등록 */
	Long register(ReplyDTO dto);
	
	/* 특정 게시글의 댓글 목록 */
	List<ReplyDTO> getList(Long bno); 
	
	/* 댓글 수정 */
	void modify(ReplyDTO dto); 
	/* 댓글 삭제 */
	void remove(Long rno); 
	default Reply dtoToEntity(ReplyDTO dto) {
		FreeBoard freeboard = FreeBoard.builder()
							.bno(dto.getBno())
							.build();
		Reply entity = Reply.builder()
				.rno(dto.getRno())
				.rcontent(dto.getRcontent())
				.nickname(dto.getNickname())
				.userId(dto.getUserId())
				.freeboard(freeboard)
				.build();
		return entity;
	}
	
	default ReplyDTO entityToDto(Reply entity) {
		ReplyDTO dto = ReplyDTO.builder()
				.rno(entity.getRno())
				.rcontent(entity.getRcontent())
				.nickname(entity.getNickname())
				.userId(entity.getUserId())
				.regDate(entity.getRegDate())
				.modDate(entity.getModDate())
				.build();
		return dto;
	}
}
