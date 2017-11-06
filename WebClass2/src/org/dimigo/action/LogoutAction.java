/**
 * 
 */
package org.dimigo.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <pre>
 * org.dimigo.action
 *   |_LogoutAction
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 11. 3.
 * </pre>
 *
 * @author : KHH
 * @version : 1.0
 */
public class LogoutAction implements IAction{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 세션에 사용자 정보 삭제
		HttpSession session = request.getSession();
		
		// session.removeAttribute("use");
		session.invalidate();
			
		RequestDispatcher rd = request.getRequestDispatcher("jsp/home.jsp");
		rd.forward(request, response);
	}
	
}
