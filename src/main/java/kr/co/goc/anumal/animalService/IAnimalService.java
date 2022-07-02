package kr.co.goc.anumal.animalService;

import java.util.List;

import kr.co.goc.anumal.animalVO.AnimalVO;
import kr.co.goc.anumal.animalVO.ContentVO;

public interface IAnimalService {
	public int insertUserInfo(AnimalVO av,ContentVO cv);
	public int updateUserInfo(AnimalVO av,ContentVO cv);
	public int deleteUserInfo(String phoneNum, String password);
	public List<AnimalVO> searchMyInfo(String phoneNum, String password);
	public boolean phoneNumDuplCheck(String phoneNum);
	public boolean nicknameDuplCheck(String nickname);
}
