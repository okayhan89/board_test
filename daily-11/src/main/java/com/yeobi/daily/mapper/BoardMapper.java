package com.yeobi.daily.mapper;

import java.util.List;

import com.yeobi.daily.board.BoardVO;

public interface BoardMapper {
	 
	//글작성
    public void boardInsert(BoardVO board)throws Exception;
 
    //글목록
    public List<BoardVO> boardList()throws Exception; //추가
    
}
