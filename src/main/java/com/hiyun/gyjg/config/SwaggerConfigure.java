/*    */ package com.hiyun.gyjg.config;
/*    */ 
/*    */ import org.springframework.context.annotation.Bean;
/*    */ import org.springframework.context.annotation.Configuration;
/*    */ import springfox.documentation.builders.ApiInfoBuilder;
/*    */ import springfox.documentation.builders.PathSelectors;
/*    */ import springfox.documentation.builders.RequestHandlerSelectors;
/*    */ import springfox.documentation.spi.DocumentationType;
/*    */ import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
/*    */ import springfox.documentation.spring.web.plugins.Docket;
/*    */ import springfox.documentation.swagger2.annotations.EnableSwagger2;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EnableSwagger2
/*    */ @Configuration
/*    */ public class SwaggerConfigure
/*    */ {
/*    */   @Bean
/*    */   public Docket docket()
/*    */   {
/* 24 */     return 
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 29 */       new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfoBuilder().title("贵阳交管服务").description("贵阳交管服务API文档").build()).select().apis(RequestHandlerSelectors.basePackage("com.hiynn.gyjg")).paths(PathSelectors.any()).build();
/*    */   }
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\config\SwaggerConfigure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */