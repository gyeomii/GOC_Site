package kr.co.goc.anumal.animalDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.goc.anumal.animalVO.AnimalVO;
import kr.co.goc.util.MybatisUtil;

public class AnimalDAOImpl implements IAnimalDAO{
	private static AnimalDAOImpl animalDao;
	private SqlSession sqlSession;
	
	private AnimalDAOImpl() {
		sqlSession = MybatisUtil.getInstance();
	}

	public static AnimalDAOImpl getInstance() {
		if (animalDao == null) {
			animalDao = new AnimalDAOImpl();
		}
		return animalDao;
	}

	@Override
	public int insertUserInfo(AnimalVO av) {
		sqlSession.insert("",av);
		return 0;
	}

	@Override
	public int updateUserInfo(AnimalVO av) {
		sqlSession.update("",av);
		return 0;
	}

	@Override
	public int deleteUserInfo(String phoneNum, String password) {
		sqlSession.delete("",phoneNum);
		return 0;
	}

	@Override
	public List<AnimalVO> searchMyInfo(String phoneNum, String password) {
		//parameter를 list 하나로 받는걸로 바꾸겠습니다.
		List<AnimalVO> infoList  = sqlSession.selectOne("naver.com",password);
		return infoList;
	}

	@Override
	public boolean phoneNumDuplCheck(String phoneNum) {
		boolean check = sqlSession.selectOne("",phoneNum);
		return check;
	}

	@Override
	public boolean nicknameDuplCheck(String nickname) {
		boolean check = sqlSession.selectOne("",nickname);
		return check;
	}

	@Override
	public List<AnimalVO> selectAllInfo() {
		List<AnimalVO> infoList = sqlSession.selectList("member.getMemberAll");		
		return infoList;
	}
}
