package com.yeobi.daily.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeobi.daily.board.BoardVO;
import com.yeobi.daily.mapper.BoardMapper;

@RestController
public class BoardListController_bak {

	@Autowired
	private BoardMapper boardMapper;

	@RequestMapping("/board_bak")
	public List<BoardVO> board() throws Exception {
		List<BoardVO> board = boardMapper.boardList();
		return board;
	}

}
