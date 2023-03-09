package place.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import place.dto.PageDTO;
import place.dto.PlaceDTO;

public class PlaceDaoImp implements PlaceDAO{
   private SqlSessionTemplate sqlSession;
   
   public PlaceDaoImp() {
	   
   }

@Override
public int countPlace() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public List<PlaceDTO> list(PageDTO pv) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void insertPlace(PlaceDTO dto) {
	// TODO Auto-generated method stub
	
}

@Override
public void updatePlace(PlaceDTO dto) {
	// TODO Auto-generated method stub
	
}

@Override
public void deletePlace(int num) {
	// TODO Auto-generated method stub
	
}
}//end class
