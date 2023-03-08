package log.dao;

import log.dto.LoginDTO;

public interface LoginDAO {
	
	public int insertLogin(LoginDTO dto);
	public LoginDTO selectById(String memId);
	
	public void updateByLogin(LoginDTO dto);
	public void updateBypass(LoginDTO dto);
	

}
