package com.board.web.free;
import org.springframework.stereotype.Controller;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/board")
@Log4j2
public class FreeBoardWebController {

	@GetMapping("/list")
	public String freeList() {
		
		return "/free/list";
	}
}
