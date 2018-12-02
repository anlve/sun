# sun
星期日创建的项目

#说明：
#数据源：MySQL5.X系列和MySQL8的驱动不一样
	pom文件mysql版本
	<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
	<dependency>
	    <groupId>mysql</groupId>
	    <artifactId>mysql-connector-java</artifactId>
	    <version>8.0.11</version>
	</dependency>
	Druid版本目前建议使用
	<!-- https://mvnrepository.com/artifact/com.alibaba/druid -->
	<dependency>
	    <groupId>com.alibaba</groupId>
	    <artifactId>druid</artifactId>
	    <version>1.1.10</version>
	</dependency>
	数据源连接driver-class-name: 
	com.mysql.jdbc.Driver需要修改为com.mysql.cj.jdbc.Driver
	URL链接建议加上useSSL=false
	完整配置如下：
	 url: jdbc:mysql://localhost:3306/sun?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true

#

