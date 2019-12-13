/*     */ package com.hiyun.gyjg.common.utils;
/*     */ 
/*     */ import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RestTemplateUtil
/*     */ {
/*  20 */   private static final RestTemplate REST_TEMPLATE = new RestTemplate();
/*     */   
/*     */   static
/*     */   {
/*  24 */     SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
/*     */     
/*     */ 
/*  27 */     REST_TEMPLATE.setRequestFactory(requestFactory);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> get(String url, Class<T> responseType)
/*     */   {
/*  39 */     return REST_TEMPLATE.getForEntity(url, responseType, new Object[0]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> get(String url, Class<T> responseType, Object... uriVariables)
/*     */   {
/*  51 */     return REST_TEMPLATE.getForEntity(url, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> get(String url, Class<T> responseType, Map<String, ?> uriVariables)
/*     */   {
/*  63 */     return REST_TEMPLATE.getForEntity(url, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> get(String url, Map<String, String> headers, Class<T> responseType, Object... uriVariables)
/*     */   {
/*  76 */     HttpHeaders httpHeaders = new HttpHeaders();
/*  77 */     httpHeaders.setAll(headers);
/*  78 */     return get(url, httpHeaders, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> get(String url, HttpHeaders headers, Class<T> responseType, Object... uriVariables)
/*     */   {
/*  91 */     HttpEntity<?> requestEntity = new HttpEntity(headers);
/*  92 */     return exchange(url, HttpMethod.GET, requestEntity, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> get(String url, Map<String, String> headers, Class<T> responseType, Map<String, ?> uriVariables)
/*     */   {
/* 105 */     HttpHeaders httpHeaders = new HttpHeaders();
/* 106 */     httpHeaders.setAll(headers);
/* 107 */     return get(url, httpHeaders, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> get(String url, HttpHeaders headers, Class<T> responseType, Map<String, ?> uriVariables)
/*     */   {
/* 120 */     HttpEntity<?> requestEntity = new HttpEntity(headers);
/* 121 */     return exchange(url, HttpMethod.GET, requestEntity, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> post(String url, Object requestBody, Class<T> responseType)
/*     */   {
/* 135 */     return REST_TEMPLATE.postForEntity(url, requestBody, responseType, new Object[0]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> post(String url, Object requestBody, Class<T> responseType, Object... uriVariables)
/*     */   {
/* 148 */     return REST_TEMPLATE.postForEntity(url, requestBody, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> post(String url, Object requestBody, Class<T> responseType, Map<String, ?> uriVariables)
/*     */   {
/* 161 */     return REST_TEMPLATE.postForEntity(url, requestBody, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> post(String url, Map<String, String> headers, Object requestBody, Class<T> responseType, Object... uriVariables)
/*     */   {
/* 175 */     HttpHeaders httpHeaders = new HttpHeaders();
/* 176 */     httpHeaders.setAll(headers);
/* 177 */     return post(url, httpHeaders, requestBody, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> post(String url, HttpHeaders headers, Object requestBody, Class<T> responseType, Object... uriVariables)
/*     */   {
/* 191 */     HttpEntity<Object> requestEntity = new HttpEntity(requestBody, headers);
/* 192 */     return post(url, requestEntity, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> post(String url, Map<String, String> headers, Object requestBody, Class<T> responseType, Map<String, ?> uriVariables)
/*     */   {
/* 206 */     HttpHeaders httpHeaders = new HttpHeaders();
/* 207 */     httpHeaders.setAll(headers);
/* 208 */     return post(url, httpHeaders, requestBody, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> post(String url, HttpHeaders headers, Object requestBody, Class<T> responseType, Map<String, ?> uriVariables)
/*     */   {
/* 222 */     HttpEntity<Object> requestEntity = new HttpEntity(requestBody, headers);
/* 223 */     return post(url, requestEntity, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> post(String url, HttpEntity<?> requestEntity, Class<T> responseType, Object... uriVariables)
/*     */   {
/* 236 */     return REST_TEMPLATE.exchange(url, HttpMethod.POST, requestEntity, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> post(String url, HttpEntity<?> requestEntity, Class<T> responseType, Map<String, ?> uriVariables)
/*     */   {
/* 249 */     return REST_TEMPLATE.exchange(url, HttpMethod.POST, requestEntity, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType, Object... uriVariables)
/*     */   {
/* 265 */     return REST_TEMPLATE.exchange(url, method, requestEntity, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType, Map<String, ?> uriVariables)
/*     */   {
/* 279 */     return REST_TEMPLATE.exchange(url, method, requestEntity, responseType, uriVariables);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static RestTemplate getRestTemplate()
/*     */   {
/* 288 */     return REST_TEMPLATE;
/*     */   }
/*     */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\common\utils\RestTemplateUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */