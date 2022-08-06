package com.wom.board.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wom.board.entity.FreeBoard;

public interface FreeBoardRepository extends JpaRepository<FreeBoard, String>{

	Optional<FreeBoard> findByUserId(String userId);
	List<FreeBoard> findAll();
	
}
