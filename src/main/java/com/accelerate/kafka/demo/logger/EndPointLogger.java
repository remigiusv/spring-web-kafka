package com.accelerate.kafka.demo.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EndPointLogger {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @Pointcut(value = "execution(* com.accelerate.kafka.demo.controller.EmployeeController.*(..))")
    public void logEmployeeControllerBefore(JoinPoint joinPoint,Object data){
        kafkaTemplate.send("log-request","Listing all employee");
    }
}
