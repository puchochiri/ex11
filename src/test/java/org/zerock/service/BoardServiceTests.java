package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
// @ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j2
public class BoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	@Test
	public void testExist() {
		
		log.info(service);
		assertNotNull(service);
		
	}
	
	@Test
	public void testRegister() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("GCODE", "COMMUNITY");
		map.put("TITLE", "TITLEINSERT");
		map.put("CONTENT", "TITLEINSERT");
		map.put("WRITER", "푸초취리");
		map.put("FIRSTREGISTER", "doawishfor");
		map.put("LASTREGISTER", "doawishfor");
		
		service.insert(map);
		
		log.info("생성된 게시물의 번호: " + map);
		
	}
	
	@Test
	public void testGetList() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("BNO", 2);
		log.info("testGetList 실행");
	//	service.getList().forEach(board -> log.info(board));
		
		service.getList(map).forEach(board -> log.info(board));
	}

	@Test
	public void testGet() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("BNO",2);
		log.info("testRead실행");
		log.info(service.read(map));
	}
	
	@Test
	public void testDelete() {
		// 게시물 번호의 존재 여부를 확인하고 테스트 할 것
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("BNO", "2");
		map.put("GCODE", "COMMUNITY");
		log.info("REMOVE RESULT: " + service.delete(map));
	}
	
	
	@Test
	public void testUpdate() {
		
		log.info("testUpdate");

		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("BNO", "2");
		map.put("GCODE", "COMMUNITY");
		map.put("TITLE", "TITLEUPDATE");
		map.put("CONTENT", "CONTENTUPDATE");
		map.put("WRITER", "푸초취리");
		map.put("FIRSTREGISTER", "doawishfor");
		map.put("LASTREGISTER", "doawishfor");
		int count = service.update(map);

		log.info("UPDATE COUNT: " + count);
		

	}
	
	
}
