package org.zerock.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
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
@AllArgsConstructor
public class BoardController {
	
	private BoardService service;
	
//	@GetMapping("/list")
//	public void list(Model model) {
//		log.info("list");
//		Map<String, Object> map = new HashMap<String, Object>();
//		
//		map.put("BNO", 2);
//		
//		model.addAttribute("list", service.getList(map));
//	}
	
	@GetMapping("/list")
	public List<Map<String, Object>> list(@RequestParam Map<String, Object> map) {
		log.info("list");
		
		
		log.info("serviceimpl list 실행:" + map);

		return service.getList(map);
	}
	
    
//    @PostMapping("/register")
//    public String register(M)
    @PostMapping("/register")
    public  String register(@RequestParam Map<String, Object> map, RedirectAttributes rttr) {
    	log.info("register: " + map);
    	service.insert(map);
    	rttr.addFlashAttribute("result", map.get("BNO"));
		return "redirect:/board/list";
    	
		    	
    }
    
    @GetMapping("/get")
    public void get(@RequestParam Map<String, Object> map, Model model) {
    
    	log.info("/get");
    	
    	model.addAttribute("board", service.read(map));
    	
    	
    }
    
    @PostMapping("/update")
    public  String update(@RequestParam Map<String, Object> map, RedirectAttributes rttr) {
    	log.info("register: " + map);
    	service.insert(map);
    	rttr.addFlashAttribute("result", map.get("BNO"));
		return "redirect:/board/list";
    	
		    	
    }
    
	
	
}
