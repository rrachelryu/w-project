package com.wom.board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReplyDTO {

	private Long rno;
	private String userId;
	private String nickname;
	private String rcontent;
	private LocalDateTime regDate;
	private LocalDateTime modDate;
	private Long bno;
}
