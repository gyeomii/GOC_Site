package kr.co.goc.anumal.animalDAO;

import java.util.List;

import kr.co.goc.anumal.animalVO.AnimalVO;

public interface IAnimalDAO {
	
	public int insertUserInfo(AnimalVO av);
	public int updateUserInfo(AnimalVO av);
	public int deleteUserInfo(String phoneNum, String password);
	public List<AnimalVO> searchMyInfo(String phoneNum, String password);
	public List<AnimalVO> selectAllInfo();
	public boolean phoneNumDuplCheck(String phoneNum);
	public boolean nicknameDuplCheck(String nickname);
}
