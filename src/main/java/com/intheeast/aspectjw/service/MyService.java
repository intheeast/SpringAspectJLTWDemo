package com.intheeast.aspectjw.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	// ProfilingAspect LTE가 적용되지 않는 이유는?
	// :Account.doSomething에서 performService를 호출하기 때문에
	public void performService() {
		System.out.println("MyService::performService:Service is performing an operation");
	}

}
