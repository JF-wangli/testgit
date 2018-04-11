package com.demo.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	//http://localhost:8080/swagger-ui.html
	@Bean
    public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.demo"))//扫描路径下的api文档
                .paths(PathSelectors.any())//路径判断
                .build();

	}
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建Restful Api")//标题
                .description("测试  Swagger2 UI ")//描述
                .termsOfServiceUrl("http://www.baidu.com/")//（不可见）条款地址
                .contact("交付团队")//创建者
                .version("1.0")//版本号
                .build();
    }

}
