package org.zerock.service;

import java.util.List;
import java.util.Map;

public interface BoardService  {
	
	public List<Map<String, Object>> getList(Map<String, Object> map);
	
	public void insert(Map<String, Object> map);
	
	public Map<String, Object> read(Map<String, Object> map);

	public int delete(Map<String, Object> map);

	public int update(Map<String, Object> map);

}
