/**
 * 
 */
package org.dimigo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre>
 * org.dimigo.action
 *   |_IAction
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 10. 31.
 * </pre>
 *
 * @author : KHH
 * @version : 1.0
 */
public interface IAction {
	
	void execute(HttpServletRequest req, HttpServletResponse res) throws Exception;
	
}
