package org.zerock.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
//import org.zerock.domain.BoardVO;
//import org.zerock.domain.Criteria;

public interface TblBoardMasterMapper {
	
	public List<Map<String, Object>> getListMaster();

	public void insertMaster(Map<String, Object> map);
	
	public Map<String, Object> readMaster(Map<String, Object> map);
	
	public int deleteMaster(Map<String, Object> map);

	public int updateMaster(Map<String, Object> map);

	//	public List<BoardVO> getListWithPaging(Criteria cri);
//	
//	public int getTotalCount(Criteria cri);
//	
//	public void updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);
}
