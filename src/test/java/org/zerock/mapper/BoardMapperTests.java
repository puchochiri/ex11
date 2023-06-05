package org.zerock.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.zerock.aop.LogAdvice;
//import org.zerock.domain.BoardVO;
//import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		map.put("bno", 2);
		mapper.getList(map).forEach(board -> log.info(board));
		
	}
	
	
	@Test
	public void testInsert() {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("GCODE", "COMMUNITY");
		map.put("TITLE", "TITLEINSERT");
		map.put("CONTENT", "TITLEINSERT");
		map.put("WRITER", "푸초취리");
		map.put("FIRSTREGISTER", "doawishfor");
		map.put("LASTREGISTER", "doawishfor");
		
		mapper.insert(map);
		
		log.info(map);
		
	}
//	
//	@Test
//	public void testInsertSelectKey() {
//		log.info("testInsertSelectKey");
//
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글 select key");
//		board.setContent("새로 작성하는 내용 select key");
//		board.setWriter("newbie");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}
	
	@Test
	public void testRead() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		map.put("bno", 2);
		log.info("testRead");
		// 존재하는 게시물 번호로 테스트
		map = mapper.read(map);
		
		log.info(map);
		
	}
	
//	@Test
//	public void testDelete() {
//		
//		Map<String, Object> map = new HashMap<String, Object>();
//
//		map.put("BNO", "2");
//		map.put("GCODE", "COMMUNITY");
//		log.info("testDelete");
//
//		log.info("DELETE COUNT: " + mapper.delete(map));
//	}
//	
	@Test
	public void testUpdate() {
		log.info("testUpdate");

		Map<String, Object> map = new HashMap<String, Object>();

//		
//		TITLE = #{TITLE},
//				CONTENT = #{TITLE},
//				LASTREGISTER = #{LASTREGISTER},
//				UPDATEDATE = SYSDATE
//				WHERE BNO = #{BNO}
		map.put("BNO", "2");
		map.put("GCODE", "COMMUNITY");
		map.put("TITLE", "TITLEUPDATE");
		map.put("CONTENT", "CONTENTUPDATE");
		map.put("WRITER", "푸초취리");
		map.put("FIRSTREGISTER", "doawishfor");
		map.put("LASTREGISTER", "doawishfor");
		
		int count = mapper.update(map);
		log.info("UPDATE COUNT: " + count);
	}
//	
//	@Test
//	public void testPaging() {
//		
//		log.info("testPaging");
//		Criteria cri = new Criteria();
//		//10개씩 3page
//		cri.setPageNum(1);
//		cri.setAmount(30);
//		
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		
//		list.forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testSearch() {
//		
//		Criteria cri = new Criteria();
//		cri.setKeyword("새로");
//		cri.setType("TC");
//		
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		
//		list.forEach(board -> log.info(board));
//		
//	}

}
