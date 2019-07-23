package com.yeobi.daily;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yeobi.daily.board.BoardVO;
import com.yeobi.daily.mapper.BoardMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(value = {"com.yeobi.daily"})
public class Daily11ApplicationTests4 {

	@Autowired
    private BoardMapper mapper;
    
    @Test
    public void contextLoads() {
    }
    
    @Test
    public void testMapper() throws Exception{//작성
        
        BoardVO vo = new BoardVO();
        
        vo.setSubject("제목입니다.");
        vo.setContent("내용입니다.");
        vo.setWriter("작성자입니다.");
        
        mapper.boardInsert(vo);
        
    }

}
