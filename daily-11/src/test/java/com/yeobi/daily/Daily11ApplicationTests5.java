package com.yeobi.daily;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yeobi.daily.board.BoardVO;
import com.yeobi.daily.mapper.BoardMapper;

@RunWith(SpringRunner.class)
@MapperScan(value = {"com.yeobi.daily"})
@SpringBootTest
public class Daily11ApplicationTests5 {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private BoardMapper boardMapper;

    @Test
    public List<BoardVO> testMapper() throws Exception{//작성
 
        List<BoardVO> board = boardMapper.boardList();
        return board;
        
    }


}
