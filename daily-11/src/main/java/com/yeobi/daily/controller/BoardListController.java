package com.yeobi.daily.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yeobi.daily.board.BoardVO;
import com.yeobi.daily.mapper.BoardMapper;

@Controller
@RestController
public class BoardListController {

	@Autowired
	private BoardMapper boardMapper;

	// 게시글 목록
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() throws Exception {

		List<BoardVO> list = boardMapper.boardList();

		return new ModelAndView("boardList", "list", list);
	}

	// 게시글 작성 페이지(GET)
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public ModelAndView writeForm() throws Exception {

		return new ModelAndView("boardWrite");
	}

	// 게시글 작성(POST)
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String write(@ModelAttribute("BoardVO") BoardVO board) throws Exception {

		boardMapper.boardInsert(board);

		return "redirect://localhost:8080/board";
	}

}
