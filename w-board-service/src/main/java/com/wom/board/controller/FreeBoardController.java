package com.wom.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wom.board.dto.FreeBoardDTO;
import com.wom.board.dto.PageRequestDTO;
import com.wom.board.dto.PageResultDTO;
import com.wom.board.entity.FreeBoard;
import com.wom.board.service.FreeBoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@RestController
@RequestMapping(path="/board", produces="application/json")
@CrossOrigin(origins="*")
@Log4j2
public class FreeBoardController {
	private final FreeBoardService frService;
	
	/*
	 * 자유게시판 조회 API
	 * 
	 */
	@GetMapping("/free")
	public List<FreeBoard> freeBoardList(PageRequestDTO pageRequestDTO){
		
		log.info("______list_____"+pageRequestDTO);
		// 조회 결과 리스트의 UserEntity -> ResponseUser
		//PageResultDTO<FreeBoardDTO, FreeBoard> freeBoardList = 	(PageResultDTO<FreeBoardDTO, FreeBoard>) frService.getAllList(pageRequestDTO);
		return frService.getAllList();
	}
	
}
