package com.wom.board.dto;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import lombok.Data;

@Data
public class PageResultDTO <DTO, ENT>{

	private List<DTO> dtoList;
	
	public PageResultDTO(Page<ENT> result, Function<ENT, DTO> fn) {
		
		dtoList = result.stream().map(fn).collect(Collectors.toList());
	}
}
