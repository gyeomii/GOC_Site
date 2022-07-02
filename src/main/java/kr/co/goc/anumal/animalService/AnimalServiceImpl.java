package kr.co.goc.anumal.animalService;

import java.util.List;

import kr.co.goc.anumal.animalDAO.AnimalDAOImpl;
import kr.co.goc.anumal.animalVO.AnimalVO;
import kr.co.goc.anumal.animalVO.ContentVO;

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
	public int insertUserInfo(AnimalVO av, ContentVO cv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserInfo(AnimalVO av, ContentVO cv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUserInfo(String phoneNum, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AnimalVO> searchMyInfo(String phoneNum, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean phoneNumDuplCheck(String phoneNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean nicknameDuplCheck(String nickname) {
		// TODO Auto-generated method stub
		return false;
	}
}
