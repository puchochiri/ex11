package org.zerock.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.zerock.mapper.BoardMapper;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	//spring 4.3 시상에서 자동 처리
	private BoardMapper mapper;

	@Override
	public void insert(Map<String, Object> map) {
		// TODO Auto-generated method stub
		log.info("serviceimpl insert 실행");
		mapper.insert(map);
		
	}

	@Override
	public Map<String, Object> read(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		Map map2 = new HashMap();
		map2 = mapper.read(map);
		log.info("serviceimpl read 실행:" + map2);
		
		return map2;
	}

	@Override
	public int delete(Map<String, Object> map) {
		// TODO Auto-generated method stub
		 
		log.info("serviceimpl delete 실행:" + map);
		
		return mapper.delete(map);
	}

	@Override
	public int update(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		log.info("serviceimpl update 실행:" + map);
		
		return mapper.update(map);
	}

	@Override
	public List<Map<String, Object>> getList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		log.info("serviceimpl list 실행:" + map);

		return mapper.getList(map);
	}
	
	

}
