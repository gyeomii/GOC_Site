package kr.co.goc.animal.animalController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.goc.animal.animalService.AnimalServiceImpl;
import kr.co.goc.animal.animalService.IAnimalService;
import kr.co.goc.animal.animalVO.AnimalVO;

/**
 * don't fucking touch this.
 * 
 * @author JayAl
 */
@WebServlet("/AnimalController")
public class AnimalController extends HttpServlet { //
	private static final long serialVersionUID = 1L;

	IAnimalService animalService = AnimalServiceImpl.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		try {
			String switchType = request.getParameter("switch");

			switch (switchType) {
			case "insert":
				insert(request, response);
				break;
			case "update":
				update(request, response);
				break;
			case "delete":
				delete(request, response);
				break;
			case "readAll":
				readAll(request, response);
				break;
			case "readOne":
				readOne(request, response);
				break;
			default:
				throw new Exception();
			}
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("/animalErr.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}

	protected void readOne(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			AnimalVO vo = new AnimalVO();

			String pw = (String) request.getParameter("pw");
			String phoneNumber = (String) request.getParameter("phoneNumber");

			vo.setPassword(pw);
			vo.setPhoneNum(phoneNumber);

			List<AnimalVO> list = animalService.searchMyInfo(vo);

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("/animalListOne.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("/animalErr.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}

	protected void readAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<AnimalVO> list = animalService.selectAllInfo();

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("/animalList.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("/animalErr.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}

	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AnimalVO vo = new AnimalVO();

		String pw = (String) request.getParameter("pw");
		String phoneNumber = (String) request.getParameter("phoneNumber");

		vo.setPassword(pw);
		vo.setPhoneNum(phoneNumber);

		try {
			int cnt = animalService.phoneNumDuplCheck(phoneNumber);
			if (cnt > 0) {
				cnt = animalService.deleteUserInfo(vo);
				if (cnt > 0) {
					RequestDispatcher rd = request.getRequestDispatcher("/animalDel.jsp");
					rd.forward(request, response);
				} else {
					throw new Exception("Delete Controller Error");
				}
			} else {
				throw new Exception("It has duplicate Nickname");
			}
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("/animalErr.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}

	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AnimalVO vo = new AnimalVO();

		String name = (String) request.getParameter("name");
		String pw = (String) request.getParameter("pw");
		String phoneNumber = (String) request.getParameter("phoneNumber");
		String nickname = (String) request.getParameter("nickname");

		vo.setUserName(name);
		vo.setPassword(pw);
		vo.setPhoneNum(phoneNumber);
		vo.setNickname(nickname);

		try {
			int cnt = animalService.nicknameDuplCheck(nickname);
			if (cnt > 0) {
				cnt = animalService.updateUserInfo(vo);
				if (cnt > 0) {
					RequestDispatcher rd = request.getRequestDispatcher("/animalMod.jsp");
					rd.forward(request, response);
				} else {
					throw new Exception("Update Controller Error");
				}
			} else {
				throw new Exception("doesn't match Nickname");
			}
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("/animalErr.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}

	protected void insert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AnimalVO vo = new AnimalVO();

		String name = (String) request.getParameter("name");
		String pw = (String) request.getParameter("pw");
		String phoneNumber = (String) request.getParameter("phoneNumber");
		String nickname = (String) request.getParameter("nickname");

		vo.setUserName(name);
		vo.setPassword(pw);
		vo.setPhoneNum(phoneNumber);
		vo.setNickname(nickname);

		try {
			int cnt = animalService.nicknameDuplCheck(nickname);
			if (cnt < 0) {
				cnt = animalService.insertUserInfo(vo);
				if (cnt > 0) {
					RequestDispatcher rd = request.getRequestDispatcher("/animalAdd.jsp");
					rd.forward(request, response);
				} else {
					throw new Exception("Insert Controller Error");
				}
			} else {
				throw new Exception("It has duplicate Nickname");
			}
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("/animalErr.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}