/**
 * 
 */
package org.dimigo.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dimigo.vo.UserVO;

/**
 * <pre>
 * org.dimigo.action
 *   |_SignupAction
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 11. 3.
 * </pre>
 *
 * @author : KHH
 * @version : 1.0
 */
public class SignupAction implements IAction{

	/* (non-Javadoc)
	 * @see org.dimigo.action.IAction#execute(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		
		System.out.printf("id : %s, password : %s, pwd : %s, nickname : %s\n", id, pwd, name, nickname);
		
		// 회원가입 성공 또는 실패 경우 처리
		boolean result = false;
		
		if (result) {
			response.sendRedirect("jsp/login.jsp");
		} else {
			HttpSession session = request.getSession();
			UserVO user = new UserVO();
			user.setId(id);
			user.setName(name);
			user.setNickname(nickname);
			
			session.setAttribute("user", user);
			
			request.setAttribute("msg", "error");
			
			RequestDispatcher rd = request.getRequestDispatcher("jsp/signup.jsp");
			rd.forward(request, response);
		}
	}

}
