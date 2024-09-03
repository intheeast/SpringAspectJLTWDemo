package com.intheeast.aspectjw;

import com.intheeast.aspectjw.dao.Account;
import com.intheeast.aspectjw.service.StubEntitlementCalculationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.intheeast.aspectjw.config.AppConfig;
import com.intheeast.aspectjw.service.EntitlementCalculationService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
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
