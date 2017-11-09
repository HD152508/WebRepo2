/**
 * 
 */
package org.dimigo.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<UserVO> searchUserList() throws Exception {
		// DB에서 사용자 목록 조회
		List<UserVO> list = new ArrayList<>();
		list.add(new UserVO("aaa@naver.com", "안용식", "용팔이"));
		list.add(new UserVO("bbb@naver.com", "이재승", "리중딱"));
		list.add(new UserVO("ccc@naver.com", "주현도", "쭈삼이"));
		
		return list;
	}
	
	public void signup(UserVO user) throws Exception {
		// DB에 사용자 등록
		boolean result = true;
		
		if(!result) throw new Exception("회원가입 시 오류가 발생했습니다.");
	}
	
}
