package place.service;

import java.util.List;

import place.dao.PlaceDAO;
import place.dto.PageDTO;
import place.dto.PlaceDTO;

public class PlaceServiceImp implements PlaceService {
	
	private PlaceDAO placeDao;
	
	public PlaceServiceImp() {
		
	}
	
	public void setPlaceDao(PlaceDAO placeDao) {
		this.placeDao = placeDao;
	}

	@Override
	public int countPlaceProcess() {
		return placeDao.countPlace();
	}

	@Override
	public List<PlaceDTO> listProcess(PageDTO pv) {
		return placeDao.list(pv);
	}

//	@Override
//	public void intsertPlaceProcess(PlaceDTO dto) {	
//			
//	}
//
//	@Override
//	public void updatePlaceProcess(PlaceDTO dto) {
//		
//	}
//
//	@Override
//	public void deletePlaceProcess(int placeNum) {
//		
//	}

}//end class
