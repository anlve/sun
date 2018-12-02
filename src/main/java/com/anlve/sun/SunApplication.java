package com.anlve.sun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.anlve.sun.dao")//将项目中对应的dao类的路径加进来就可以了
public class SunApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunApplication.class, args);
	}
}
