package kr.co.goc.animal.animalService;

import java.util.List;

import kr.co.goc.animal.animalDAO.AnimalDAOImpl;
import kr.co.goc.animal.animalVO.AnimalVO;

public class AnimalServiceImpl implements IAnimalService{
	private AnimalDAOImpl animalDao;
	
	private static AnimalServiceImpl animalService;

	private AnimalServiceImpl() {
		animalDao = AnimalDAOImpl.getInstance();
	}

	public static AnimalServiceImpl getInstance() {
		if (animalService == null) {
			animalService = new AnimalServiceImpl();
		}
		return animalService;
	}

	@Override
	public int insertUserInfo(AnimalVO vo) {
		int cnt = animalDao.insertUserInfo(vo);
		return cnt;
	}

	@Override
	public int updateUserInfo(AnimalVO vo) {
		int cnt = animalDao.updateUserInfo(vo);
		return cnt;
	}
	@Override
	public int deleteUserInfo(AnimalVO vo) {
		int cnt = animalDao.deleteUserInfo(vo);
		return cnt;
	}

	@Override
	public List<AnimalVO> searchMyInfo(AnimalVO vo) {
		List<AnimalVO> infoList = searchMyInfo(vo);
		return infoList;
	}

	@Override
	public int phoneNumDuplCheck(String phoneNum) {
		int isExist = animalDao.phoneNumDuplCheck(phoneNum);
		return isExist;
	}

	@Override
	public int nicknameDuplCheck(String nickname) {
		int isExist = animalDao.nicknameDuplCheck(nickname);
		return isExist;
	}
	
	@Override
	public List<AnimalVO> selectAllInfo() {
		List<AnimalVO> infoList = animalDao.selectAllInfo();
		return infoList;
	}
}