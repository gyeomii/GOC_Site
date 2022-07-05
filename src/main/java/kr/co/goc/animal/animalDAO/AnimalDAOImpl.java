package kr.co.goc.animal.animalDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.goc.animal.animalVO.AnimalVO;
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
	public int insertUserInfo(AnimalVO vo) {
		int cnt = sqlSession.insert("",vo);
		if (cnt > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		return cnt;
	}

	@Override
	public int updateUserInfo(AnimalVO vo) {
		int cnt = sqlSession.update("",vo);
		if (cnt > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		return cnt;
	}

	@Override
	public int deleteUserInfo(AnimalVO vo) {
		int cnt = sqlSession.delete("",vo);
		if (cnt > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		return cnt;
	}

	@Override
	public List<AnimalVO> searchMyInfo(AnimalVO vo) {
		List<AnimalVO> infoList  = sqlSession.selectOne("",vo);
		return infoList;
	}

	@Override
	public int phoneNumDuplCheck(String phoneNum) {
		int isExist = sqlSession.selectOne("",phoneNum);
		return isExist;
	}

	@Override
	public int nicknameDuplCheck(String nickname) {
		int isExist = sqlSession.selectOne("",nickname);
		return isExist;
	}

	@Override
	public List<AnimalVO> selectAllInfo() {
		List<AnimalVO> infoList = sqlSession.selectList("");		
		return infoList;
	}
}