package com.wom.board.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.wom.board.dto.FreeBoardDTO;
import com.wom.board.dto.PageRequestDTO;
import com.wom.board.dto.PageResultDTO;
import com.wom.board.dto.ReplyDTO;
import com.wom.board.entity.FreeBoard;
import com.wom.board.entity.Reply;
import com.wom.board.repository.FreeBoardRepository;
import com.wom.board.repository.ReplyRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{
	
	private final ReplyRepository repository;
	

	@Override
	public Long register(ReplyDTO dto) {
		Reply reply = dtoToEntity(dto);
		
		repository.save(reply);
		
		return reply.getRno();
	}

	@Override
	public List<ReplyDTO> getList(Long bno) {
		List<Reply> result = repository.getRepliesByFreeboardOrderByRno(FreeBoard.builder()
							.bno(bno)
							.build());
		
		return result.stream().map(reply -> entityToDto(reply)).collect(Collectors.toList());
	}

	@Override
	public void modify(ReplyDTO dto) {
		Reply reply = dtoToEntity(dto);
		repository.save(reply);
	}

	@Override
	public void remove(Long rno) {
		repository.deleteById(rno);
	}

}
