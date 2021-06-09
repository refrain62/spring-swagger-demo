package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // swagger2.0���g�p
public class SwaggerDemoConfiguration {

    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2) // Swagger2.0���g�p���܂��錾
                .select()
                .paths(PathSelectors.ant("/apis/**"))
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfoBuilder()
                        .title("Customise Title Swagger Demo Application")
                        .description("�����D�݂ɃJ�X�^�}�C�Y���Ă���")
                        .contact(new Contact("customise-name", "http://customise-contact", "customise-email"))
                        .version("1.0")
                        .termsOfServiceUrl("http://customise.com")
                        .license("Customise License").licenseUrl("http://customise-license-url") // license�݂̂��ƃe�L�X�g�AlicenseUrl�ݒ肷��ƃ����N�ɂȂ�
                        .build());
    }
}
