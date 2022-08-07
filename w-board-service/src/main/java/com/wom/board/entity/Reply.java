package com.wom.board.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
@ToString(exclude = "freeboard")
public class Reply extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rno;
	
	@Column(length = 100, nullable = false)
	private String userId;
	
	@Column(length = 50, nullable = false)
	private String nickname;
	
	@Column(length = 5000, nullable = false)
	private String rcontent;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private FreeBoard freeboard;
}
