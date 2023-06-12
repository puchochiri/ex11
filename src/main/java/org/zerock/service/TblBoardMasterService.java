package org.zerock.service;

import java.util.List;
import java.util.Map;

public interface TblBoardMasterService  {
	
	public List<Map<String, Object>> getListMaster();

	public void insertMaster(Map<String, Object> map);
	
	public Map<String, Object> readMaster(Map<String, Object> map);
	
	public int deleteMaster(Map<String, Object> map);

	public int updateMaster(Map<String, Object> map);

}
