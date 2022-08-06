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
public class FreeBoardDTO {

	private Long bno;
	private String title;
	private String userId;
	private String nickname;
	private String content;
	private LocalDateTime regDate;
	private LocalDateTime modDate;
}
