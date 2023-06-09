package org.zerock.controller;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
//import org.zerock.aop.LogAdvice;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
//Test for Controller
@WebAppConfiguration

@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
// Java Config
// @ContextConfiguration(classes = {
//		org.zerock.config.RootConfig.class,
//		org.zerock.config.ServletConfig.class} )	
@Log4j2
public class BoardControllerTests {
	
	@Setter(onMethod_ = {@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
		
	}
	
//	@Test
//	public void testList() throws Exception {
//		
//		log.info("testList실행");
//		
//		log.info(
//				mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
//				.andReturn()
//				.getModelAndView()
//				.getModelMap()
//				);
//		
//	}
	
	
	@Test
	public void testList() throws Exception {
		
		log.info("testList실행");
		
		
		
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list")
				.param("BNO", "2"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
		
	}
	
	
//	@Test
//	public void testListPaging() throws Exception {
//		
//		log.info("testListPaging 실행");
//		log.info(mockMvc.perform(
//				MockMvcRequestBuilders.get("/board/list")
//				.param("pageNum", "2")
//				.param("amount", "50"))
//				.andReturn().getModelAndView().getModelMap());
//		
//	}
//	
//	
	@Test
	public void testRegister() throws Exception{
		
		log.info("testRegister 실행");
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
				.param("GCODE", "COMMUNITY")
				.param("TITLE", "TITLEINSERT 새글 내용")
				.param("CONTENT", "TITLEINSERT")
				.param("WRITER", "푸초취리")
				.param("FIRSTREGISTER", "doawishfor")
				.param("LASTREGISTER", "doawishfor")
				).andReturn().getModelAndView().getViewName();
		log.info(resultPage);
	}
	
	
	
	@Test
	public void testread() throws Exception {
		
		log.info("testread실행");
		
		
		
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/get")
				.param("BNO", "22"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
		
	}
	
//	
//	@Test
//	public void testGet() throws Exception {
//		log.info("testGet 실행");
//		log.info(mockMvc.perform(MockMvcRequestBuilders
//				.get("/board/get")
//				.param("bno", "30"))
//				.andReturn()
//				.getModelAndView().getModelMap());
//	}
//	
//	@Test
//	public void testModify() throws Exception {
//		log.info("testModify");
//		String resultPage = mockMvc
//				.perform(MockMvcRequestBuilders.post("/board/modify")
//						.param("bno", "1")
//						.param("title", "수정된 테스트 새글 제목")
//						.param("content", "수정된 테스트 새글 내용")
//						.param("writer", "user00"))
//				.andReturn().getModelAndView().getViewName();
//		
//		log.info(resultPage);
//	}
//
//	
//	@Test
//	public void testRemove() throws Exception{
//		//삭제전 데이터베이스에 게시물 번호 확인 할 것
//		log.info("testRemove 실행");
//		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
//				.param("bno", "25")
//				).andReturn().getModelAndView().getViewName();
//		log.info(resultPage);
//	}
}
