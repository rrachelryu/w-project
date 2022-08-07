package com.wom.board.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.wom.board.entity.FreeBoard;
import com.wom.board.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long>{

	//게시판 삭제시 댓글 삭제
	@Modifying
	@Query("delete from Reply r where r.freeboard.bno =:bno")
	void deleteByBno(Long bno);
	
	//게시글로 댓글 목록 가져오기
	List<Reply> getRepliesByFreeboardOrderByRno(FreeBoard freeboard);
	
}
