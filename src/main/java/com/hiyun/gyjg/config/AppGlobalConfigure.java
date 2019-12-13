/*    */ package com.hiyun.gyjg.config;
/*    */ 
/*    */ import com.hiynn.gyjg.common.holder.DeviceListHolder;
/*    */ import java.util.concurrent.Executor;
/*    */ import javax.annotation.PostConstruct;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.boot.context.properties.EnableConfigurationProperties;
/*    */ import org.springframework.boot.web.servlet.FilterRegistrationBean;
/*    */ import org.springframework.boot.web.servlet.ServletRegistrationBean;
/*    */ import org.springframework.context.annotation.Bean;
/*    */ import org.springframework.context.annotation.Configuration;
/*    */ import org.springframework.core.annotation.Order;
/*    */ import org.springframework.scheduling.annotation.EnableAsync;
/*    */ import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
/*    */ import org.springframework.web.cors.CorsConfiguration;
/*    */ import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
/*    */ import org.springframework.web.filter.CorsFilter;
/*    */ 
/*    */ @EnableAsync
/*    */ @Configuration
/*    */ @EnableConfigurationProperties
/*    */ public class AppGlobalConfigure
/*    */ {
/* 25 */   private static final Logger log = LoggerFactory.getLogger(AppGlobalConfigure.class);
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @Bean({"data-push-executor"})
/*    */   public Executor executor()
/*    */   {
/* 38 */     ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
/* 39 */     executor.setCorePoolSize(10);
/* 40 */     executor.setMaxPoolSize(200);
/* 41 */     executor.setQueueCapacity(10);
/* 42 */     executor.initialize();
/* 43 */     return executor;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @Bean
/*    */   @Order(0)
/*    */   public FilterRegistrationBean corsFilter()
/*    */   {
/* 55 */     UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
/* 56 */     CorsConfiguration config = new CorsConfiguration();
/* 57 */     config.setAllowCredentials(Boolean.valueOf(true));
/*    */     
/* 59 */     config.addAllowedOrigin("*");
/*    */     
/* 61 */     config.addAllowedHeader("*");
/* 62 */     config.addAllowedMethod("*");
/* 63 */     source.registerCorsConfiguration("/**", config);
/* 64 */     log.info("Cors configuration load.");
/* 65 */     return new FilterRegistrationBean(new CorsFilter(source), new ServletRegistrationBean[0]);
/*    */   }
/*    */   
/*    */   @PostConstruct
/*    */   public void postConstruct() {}
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\config\AppGlobalConfigure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */