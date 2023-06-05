package org.zerock.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
//import org.zerock.domain.BoardVO;
//import org.zerock.domain.Criteria;

public interface BoardMapper {
	
	//@Select("select * from tbl_board where bno > 0")
	public List<Map<String, Object>> getList(Map<String, Object> map);

	
	public void insert(Map<String, Object> map);
	
//	public void insertSelectKey(BoardVO board);
//	
	public Map<String, Object> read(Map<String, Object> map);
//	
	public int delete(Map<String, Object> map);
//	
	public int update(Map<String, Object> map);
//
//	public List<BoardVO> getListWithPaging(Criteria cri);
//	
//	public int getTotalCount(Criteria cri);
//	
//	public void updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);
}
