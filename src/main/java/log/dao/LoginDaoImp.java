package log.dao;

import org.apache.ibatis.session.SqlSession;

import log.dto.LoginDTO;

public class LoginDaoImp implements LoginDAO {
	private SqlSession sqlSession;

	public LoginDaoImp() {

	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int insertLogin(LoginDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LoginDTO selectById(String memId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateByLogin(LoginDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBypass(LoginDTO dto) {
		// TODO Auto-generated method stub

	}

}