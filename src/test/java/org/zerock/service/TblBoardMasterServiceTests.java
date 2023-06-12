package org.zerock.service;

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
public class TblBoardMasterServiceTests {
	
	@Setter(onMethod_ = @Autowired)
	private TblBoardMasterService service;

	
	
	
	
	@Test
	public void testGetListMaster() {

		service.getListMaster().forEach(board -> log.info(board));
		
	}
	
	
	@Test
	public void testInsertMaster() {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("GCODE","HOSPITAL");
		map.put("GDEPTH", "1");
		map.put("GTITLE", "건강");
		map.put("ETC1", "");
		map.put("ETC2", "");
		map.put("ETC3", "");
		map.put("WRITER", "푸초취리");
		map.put("FIRSTREGISTER", "doawishfor");
		map.put("LASTREGISTER", "doawishfor");
		
		service.insertMaster(map);
		
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
	public void testReadMaster() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		map.put("GCODE", "COMMUNITY");
		log.info("testRead");
		// 존재하는 게시물 번호로 테스트
		map = service.readMaster(map);
		
		log.info(map);
		
	}
	
	@Test
	public void testDeleteMaster() {
		
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("GCODE", "COMMUNITY");
		log.info("testDelete");

		log.info("DELETE COUNT: " + service.deleteMaster(map));
	}
	
	@Test
	public void testUpdateMaster() {
		log.info("testUpdate");

		Map<String, Object> map = new HashMap<String, Object>();

//		
//		TITLE = #{TITLE},
//				CONTENT = #{TITLE},
//				LASTREGISTER = #{LASTREGISTER},
//				UPDATEDATE = SYSDATE
//				WHERE BNO = #{BNO}
		map.put("GCODE", "COMMUNITY");
		map.put("GDEPTH", "1");
		map.put("GTITLE", "커뮤니티수정");
		map.put("ETC1", "");
		map.put("ETC2", "");
		map.put("ETC3", "");
		map.put("WRITER", "푸초취리");
		map.put("FIRSTREGISTER", "doawishfor");
		map.put("LASTREGISTER", "doawishfor");
		
		int count = service.updateMaster(map);
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
