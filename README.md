## SpringAspectJLTWDemo
- 사용한 java agent : spring instrument
- java 런처 옵션 : -javaagent:C:\Users\USERNAME\$.m2\repository\org\springframework\spring-instrument\6.1.6\spring-instrument-6.1.6.jar 또는 프로젝트내의 특정 디렉토리
- Java based configuration metadata : @EnableLoadTimeWeaving 으로 특정 Spring IoC Bean에게 특정 Aspect를 위빙할 수 없음.
- xml based configuration metadata : <context:load-time-weaver aspectj-weaving="on"/> 적용함으로써, 특정 Spring IoC Bean에게 특정 Aspect를 위빙할 수 있음.
