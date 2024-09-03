package com.intheeast.aspectjw.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class ProfilingAspect {

	@Around("methodsToBeProfiled()")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+ProfilingAspect::profile: " + 
				pjp.getTarget().getClass().getName() + "." +
				pjp.getSignature().getName());
		StopWatch sw = new StopWatch(getClass().getSimpleName());
		try {
			sw.start(pjp.getSignature().getName());
			return pjp.proceed();
		} finally {
			sw.stop();
			System.out.println(sw.prettyPrint());
			System.out.println("-ProfilingAspect::profile");
			System.out.println("--------------------------------------------");
		}
	}

	@Pointcut("execution(public * com.intheeast.aspectjw..*.*(..))")
	public void methodsToBeProfiled(){}
}
