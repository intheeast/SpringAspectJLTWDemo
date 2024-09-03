package com.intheeast.aspectjw;

import com.intheeast.aspectjw.dao.Account;
import com.intheeast.aspectjw.service.StubEntitlementCalculationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.intheeast.aspectjw.config.AppConfig;
import com.intheeast.aspectjw.service.EntitlementCalculationService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	// 이 섹션의 소개에서 Spring을 사용하여 클래스 로더(ClassLoader)별로 선택적으로 LTW(Load-Time Weaving)를 활성화할 수 있다고 언급했는데, 이는 사실입니다.
	// // 하지만, 이 예제에서는 LTW를 활성화하기 위해 Spring에서 제공하는 Java 에이전트를 사용합니다.
	public static void main(String ...args) {
//		AnnotationConfigApplicationContext context =
//				new AnnotationConfigApplicationContext(AppConfig.class);

		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");


		EntitlementCalculationService service =
				context.getBean(EntitlementCalculationService.class);

//		EntitlementCalculationService service =
//				new StubEntitlementCalculationService();
		service.calculateEntitlement();
		
		Account account = new Account();
		account.doSomething();


	}

}
