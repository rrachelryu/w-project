package com.wom.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wom.board.dto.FreeBoardDTO;
import com.wom.board.dto.PageRequestDTO;
import com.wom.board.dto.PageResultDTO;
import com.wom.board.dto.ReplyDTO;
import com.wom.board.entity.FreeBoard;
import com.wom.board.service.FreeBoardService;
import com.wom.board.service.ReplyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@RestController
@RequestMapping(path="/board", produces="application/json")
@CrossOrigin(origins="*")
@Log4j2
public class ReplyController {
	private final ReplyService rpService;
	
	/*
	 * 댓글 조회 API
	 * 
	 */
	@GetMapping(value="/free/{bno}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ReplyDTO>> getListByFreeBoard(@PathVariable("bno") Long bno){
		log.info("_________"+bno);
		// 조회 결과 리스트의 UserEntity -> ResponseUser
		//PageResultDTO<FreeBoardDTO, FreeBoard> freeBoardList = 	(PageResultDTO<FreeBoardDTO, FreeBoard>) frService.getAllList(pageRequestDTO);
		return new ResponseEntity<>(rpService.getList(bno), HttpStatus.OK);
	}
	
}
