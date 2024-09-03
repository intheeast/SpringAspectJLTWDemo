package com.intheeast.aspectjw.config;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.instrument.classloading.ReflectiveLoadTimeWeaver;

@Configuration
@EnableSpringConfigured
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableLoadTimeWeaving(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.ENABLED)
@ComponentScan(basePackages = "com.intheeast.aspectjw")
public class AppConfig  /*implements LoadTimeWeavingConfigurer*/ {

//    @Override
//    public LoadTimeWeaver getLoadTimeWeaver() {
//        return new InstrumentationLoadTimeWeaver();
//    }
}
