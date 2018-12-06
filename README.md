# 欢迎使用 sun

------
项目取名**sun**是因为在星期日创建的项目，项目的作用只是为了省去了每次创建一个项目以及创建项目时一些矛盾的不可预知的问题；

项目包含了一个简单的sql方便和一些基本的依赖，已经有了mybatis代码生成，和mybatis分页

**sun**用到的技术：

>**springboot**

任意门：[官网链接](http://spring.io/projects/spring-boot)
>**mybatis**

任意门：[官网链接](http://www.mybatis.org/mybatis-3/)
>**pagehelper**

任意门：[github链接](https://github.com/pagehelper/Mybatis-PageHelper)
>**druid**

任意门:[github链接](https://github.com/alibaba/druid)

## 使用须知

MySQL5.X系列和MySQL8的驱动不一样，如果你的数据源MySQL是MySQL8，需要做以下修改


Pom文件mysql版本：
```
	<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
	<dependency>
	    <groupId>mysql</groupId>
	    <artifactId>mysql-connector-java</artifactId>
	    <version>8.0.11</version>
	</dependency>
```
Druid版本目前建议使用
```
	<!-- https://mvnrepository.com/artifact/com.alibaba/druid -->
	<dependency>
	    <groupId>com.alibaba</groupId>
	    <artifactId>druid</artifactId>
	    <version>1.1.10</version>
	</dependency>
```
数据源连接driver-class-name: 需要修改为
```
	com.mysql.cj.jdbc.Driver
```
URL链接建议加上==useSSL=false==

完整配置如下：
```
	 url: jdbc:mysql://localhost:3306/sun?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
```


