plugins {
	java
	id("org.springframework.boot") version "3.0.0"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
//	maven("https://jitpack.io")
}

dependencies {
	//HTML과 JAVA 연동하는 view 템플릿엔진
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	//자바 언어로 만들어진 웹서비스
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	//getter, setter, 생성자 등 많이 쓰는 코드를 단축시켜주는 어노테이션 모음
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	//JSON 포맷으로 데이터 받고, 전달하기
	implementation("org.json:json:20190722")
	implementation("com.googlecode.json-simple:json-simple:1.1.1")
	//DB 연동
	implementation("mysql:mysql-connector-java")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	//jsoup : use scraping
	implementation("org.jsoup:jsoup:1.13.1")
	//Selenium
	implementation("org.seleniumhq.selenium:selenium-java")
	//swagger
	implementation("org.springdoc:springdoc-openapi-ui:1.6.6")
	//
	implementation("com.google.code.gson:gson:2.9.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
