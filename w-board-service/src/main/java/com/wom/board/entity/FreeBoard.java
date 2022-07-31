package com.wom.board.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FreeBoard extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bno;
	
	@Column(length = 100, nullable = false)
	private String userId;
	
	@Column(length = 50, nullable = false)
	private String nickname;
	
	@Column(length = 100, nullable = false)
	private String title;
	
	@Column(length = 5000, nullable = false)
	private String content;
}
