package kr.co.goc.animal.animalController;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.co.goc.animal.animalService.AnimalServiceImpl;
import kr.co.goc.animal.animalService.IAnimalService;
import kr.co.goc.animal.animalVO.AnimalVO;

/**
 * Servlet implementation class BoardWrite
 */
@WebServlet("/AnimalController")
public class AnimalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void intertAnimalInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//한글데이터 포함시 setting - post일때 만
		request.setCharacterEncoding("utf-8");

		//0. 요청데이터 가져오기
		AnimalVO vo = new AnimalVO();
		try {
			BeanUtils.populate(vo, request.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		vo.setUserNum(Integer.parseInt(request.getRemoteAddr()));
		vo.setUserName(request.getRemoteAddr());
		vo.setPhoneNum(request.getRemoteAddr());
		vo.setNickname(request.getRemoteAddr());
		vo.setPassword(request.getRemoteAddr());
		vo.setAgreement(request.getRemoteAddr());
		vo.setPost(request.getRemoteAddr());


		IAnimalService AnimalService = AnimalServiceImpl.getInstance();


		int seq = AnimalService.insertUserInfo(vo);

		request.setAttribute("seq", seq);
		request.getRequestDispatcher("반환값.jsp 경로 설정 해야함.").forward(request, response);

	}
}