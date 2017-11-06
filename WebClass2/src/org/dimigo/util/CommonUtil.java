/**
 * 
 */
package org.dimigo.util;

/**
 * <pre>
 * org.dimigo.util
 *   |_CommonUtil
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 10. 31.
 * </pre>
 *
 * @author : KHH
 * @version : 1.0
 */
public class CommonUtil {

	public static boolean isEmpty(String s) {
		return s == null || "".equals(s.trim());
	}
	
	public static void main(String[] args) {
		String uri = "/WebClass/jsp/aa/bb/login.do";
		
		String actionName = uri.substring(uri.lastIndexOf("/") + 1);
		actionName = actionName.substring(0, actionName.indexOf("."));
		System.out.println("actionName : " + actionName);
	}
}
