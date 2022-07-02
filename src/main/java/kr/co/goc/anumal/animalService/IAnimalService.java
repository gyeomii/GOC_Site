package kr.co.goc.anumal.animalService;

import java.util.List;

import kr.co.goc.anumal.animalVO.AnimalVO;

public interface IAnimalService {
	public int insertUserInfo(AnimalVO vo);
	public int updateUserInfo(AnimalVO vo);
	public int deleteUserInfo(String phoneNum, String password);
	public List<AnimalVO> searchMyInfo(String phoneNum, String password);
	public List<AnimalVO> selectAllInfo();
	public boolean phoneNumDuplCheck(String phoneNum);
	public boolean nicknameDuplCheck(String nickname);
}
