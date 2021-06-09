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
@EnableSwagger2 // swagger2.0を使用
public class SwaggerDemoConfiguration {

    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2) // Swagger2.0を使用します宣言
                .select()
                .paths(PathSelectors.ant("/apis/**"))
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfoBuilder()
                        .title("Customise Title Swagger Demo Application")
                        .description("自分好みにカスタマイズしてたよ")
                        .contact(new Contact("customise-name", "http://customise-contact", "customise-email"))
                        .version("1.0")
                        .termsOfServiceUrl("http://customise.com")
                        .license("Customise License").licenseUrl("http://customise-license-url") // licenseのみだとテキスト、licenseUrl設定するとリンクになる
                        .build());
    }
}
