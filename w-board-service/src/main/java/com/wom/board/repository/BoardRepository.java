package com.wom.board.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.wom.board.entity.FreeBoard;

public interface BoardRepository extends CrudRepository<FreeBoard, String>{

	Optional<FreeBoard> findByUserId(String userId);
}
