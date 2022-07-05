package kr.co.goc.animal.animalService;

import java.util.List;

import kr.co.goc.animal.animalVO.AnimalVO;

public interface IAnimalService {
	public int insertUserInfo(AnimalVO vo);
	public int updateUserInfo(AnimalVO vo);
	/**
	 * 
	 * @param vo를 넘기지만 사용자에게서 phoneNum과 password만 받는다.
	 * @return 성공적으로 삭제되면 1이상의 int값을 반환한다.
	 */
	public int deleteUserInfo(AnimalVO vo);
	/**
	 * 
	 * @param vo를 넘기지만 사용자에게서 phoneNum과 password만 받는다.
	 * @return 검색한 본인의 정보
	 */
	public List<AnimalVO> searchMyInfo(AnimalVO vo);
	public List<AnimalVO> selectAllInfo();
	public int phoneNumDuplCheck(String phoneNum);
	public int nicknameDuplCheck(String nickname);
}