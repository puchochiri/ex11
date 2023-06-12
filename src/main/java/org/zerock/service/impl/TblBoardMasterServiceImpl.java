package org.zerock.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.TblBoardMasterMapper;
import org.zerock.service.BoardService;
import org.zerock.service.TblBoardMasterService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@AllArgsConstructor
public class TblBoardMasterServiceImpl implements TblBoardMasterService {
	
	//spring 4.3 시상에서 자동 처리
	private TblBoardMasterMapper mapper;

	@Override
	public List<Map<String, Object>> getListMaster() {
		// TODO Auto-generated method stub
		return mapper.getListMaster();
	}

	@Override
	public void insertMaster(Map<String, Object> map) {
		// TODO Auto-generated method stub
		mapper.insertMaster(map);
		
	}

	@Override
	public Map<String, Object> readMaster(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.readMaster(map);
	}

	@Override
	public int deleteMaster(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.deleteMaster(map);
	}

	@Override
	public int updateMaster(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.updateMaster(map);
	}


	
	

}
