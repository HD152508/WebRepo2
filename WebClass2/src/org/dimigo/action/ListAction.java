/**
 * 
 */
package org.dimigo.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dimigo.vo.UserVO;

/**
 * <pre>
 * org.dimigo.action
 *   |_ListAction
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 11. 3.
 * </pre>
 *
 * @author : KHH
 * @version : 1.0
 */
public class ListAction implements IAction{

	/* (non-Javadoc)
	 * @see org.dimigo.action.IAction#execute(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<UserVO> list = new ArrayList<>();
		list.add(new UserVO("aaa@naver.com", "안용식", "용팔이"));
		list.add(new UserVO("bbb@naver.com", "이재승", "리중딱"));
		list.add(new UserVO("ccc@naver.com", "주현도", "쭈삼이"));
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("jsp/list.jsp");
		rd.forward(request, response);
		
	}

}
