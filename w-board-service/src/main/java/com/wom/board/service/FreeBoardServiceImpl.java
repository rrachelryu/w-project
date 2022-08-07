package com.wom.board.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.wom.board.dto.FreeBoardDTO;
import com.wom.board.dto.PageRequestDTO;
import com.wom.board.dto.PageResultDTO;
import com.wom.board.entity.FreeBoard;
import com.wom.board.repository.FreeBoardRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class FreeBoardServiceImpl implements FreeBoardService{
	
	private final FreeBoardRepository repository;
	
	@Override
	public Long register(FreeBoardDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FreeBoard> getAllList() {
		//Pageable pageable = requestDTO.getPageable(Sort.by("bno").descending());
		
		List<FreeBoard> result = repository.findAll();

		Function<FreeBoard, FreeBoardDTO> fn = (entity -> entityToDto(entity));
		
		/*List<FreeBoard> list = new ArrayList();
		for(FreeBoard dto : result) {
		
		}*/
		return result;
	}

	/*@Override
	public PageResultDTO<FreeBoardDTO, FreeBoard> getList(PageRequestDTO requestDTO) {
		Pageable pageable = requestDTO.getPageable(Sort.by("bno").descending());
		
		Page<FreeBoard> result = repository.findAll(pageable);

		Function<FreeBoard, FreeBoardDTO> fn = (entity -> entityToDto(entity));
		
		
		return new PageResultDTO<>(result, fn);
	}*/

}
