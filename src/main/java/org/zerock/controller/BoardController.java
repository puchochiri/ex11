package org.zerock.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/board/*")
public class BoardController {
	
	private BoardService service;
	
	
	@GetMapping("/list")
    public void getList(@RequestParam Map<String, Object> parameter) {
		
		log.info("controller getList실행:" + parameter);


		List<Map<String, Object>> employeeList = service.getList(parameter);
		
		log.info("controller getList실행 employeeList:" + employeeList);


    }
    
    @RequestMapping(value="insert.do")
    public ModelAndView insert(@RequestParam Map<String, Object> parameter) {
        ModelAndView mav = new ModelAndView();


		 service.insert(parameter);


        return mav;
    }
    
    
	
	
}
