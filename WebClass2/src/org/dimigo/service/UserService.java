/**
 * 
 */
package org.dimigo.service;

import org.dimigo.vo.UserVO;

/**
 * <pre>
 * org.dimigo.service
 *   |_UserService
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 11. 7.
 * </pre>
 *
 * @author : KHH
 * @version : 1.0
 */
public class UserService {
	
	public UserVO login(UserVO user) throws Exception {
		// DB에서 id, pwd조회
		boolean result = true;
		
		if (result) {
			user.setName("홍길동");
			user.setNickname("의적");
		} else {
			throw new Exception ("Invalid username or password");
		}
		
		return user;
	}

}
