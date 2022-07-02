package kr.co.goc.anumal.animalService;

import java.util.List;

import kr.co.goc.anumal.animalDAO.AnimalDAOImpl;
import kr.co.goc.anumal.animalVO.AnimalVO;

public class AnimalServiceImpl implements IAnimalService{
	private AnimalDAOImpl animalDao;
	
	private static AnimalServiceImpl animalSer;

	private AnimalServiceImpl() {
		animalDao = AnimalDAOImpl.getInstance();
	}

	public static AnimalServiceImpl getInstance() {
		if (animalSer == null) {
			animalSer = new AnimalServiceImpl();
		}
		return animalSer;
	}

	@Override
	public int insertUserInfo(AnimalVO av) {
		int cnt = 0;
		return cnt;
	}

	@Override
	public int updateUserInfo(AnimalVO av) {
		int cnt = 0;
		return cnt;
	}

	@Override
	public int deleteUserInfo(String phoneNum, String password) {
		int cnt = 0;
		return cnt;
	}

	@Override
	public List<AnimalVO> searchMyInfo(String phoneNum, String password) {
		return null;
	}

	@Override
	public boolean phoneNumDuplCheck(String phoneNum) {
		return false;
	}

	@Override
	public boolean nicknameDuplCheck(String nickname) {
		return false;
	}
	
	@Override
	public List<AnimalVO> selectAllInfo() {
		List<AnimalVO> infoList = animalDao.selectAllInfo();
		return null;
	}
}
