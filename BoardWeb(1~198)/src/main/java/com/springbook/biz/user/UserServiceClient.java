package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		//1.spring 컨테이너를 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2.spring 컨테이너로부터 userServiceImpl객체를 lookup한다
		UserService userService =
				(UserService)container.getBean("userService");
		
		//3.로그인 기능 테스트
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName()+ "님 환영합니다.");
		}else {
			System.out.println("로그인 실패");
		}
		//4.spring 컨테이너를 종료한다
		container.close();

	}

}
