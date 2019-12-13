/*    */ package com.hiyun.gyjg.controller;
/*    */ 
/*    */ import com.google.common.collect.Maps;
/*    */ import com.hiynn.core.tool.utils.Func;
/*    */ import com.hiynn.gyjg.common.holder.SubscribeInfoHolder;
/*    */ import com.hiynn.gyjg.entity.SubscribeInfo;
/*    */ import com.hiynn.gyjg.entity.response.SubscribeStatusResponse;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import java.net.InetAddress;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Resource;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ @RestController
/*    */ @Api("订阅服务")
/*    */ public class SubscribeController
/*    */ {
/*    */   private static final Logger log;
/*    */   @Resource
/*    */   private HttpServletRequest httpServletRequest;
/*    */   
/*    */   static
/*    */   {
/* 30 */     SubscribeController.log = LoggerFactory.getLogger(SubscribeController.class);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   @PostMapping({"/VIID/Subscribes"})
/*    */   @ApiOperation(value="批量订阅请求", httpMethod="POST", notes="视图库对接技术要求0521 B.32 批量订阅")
/*    */   public Map<String, Object> subscribes(@org.springframework.web.bind.annotation.RequestBody Map<String, Object> subscribeRequest)
/*    */   {
/* 41 */     SubscribeController.log.info("接收到订阅请求: {}", subscribeRequest);
/* 42 */     return processSubscribeRequest(subscribeRequest);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   private Map<String, Object> processSubscribeRequest(Map<String, Object> subscribeRequest)
/*    */   {
/*    */     try
/*    */     {
/* 53 */       Map<String, Object> result = Maps.newLinkedHashMap();
/* 54 */       if (Func.isEmpty(subscribeRequest)) {
/* 55 */         SubscribeController.log.warn("订阅请求数据为空");
/* 56 */         return result;
/*    */       }
/* 58 */       Map<String, Object> subscribeListObject = (Map)subscribeRequest.get("SubscribeListObject");
/* 59 */       if (java.util.Objects.isNull(subscribeListObject)) {
/* 60 */         SubscribeController.log.warn("订阅请求 SubscribeListObject 数据为空");
/* 61 */         return result;
/*    */       }
/*    */       
/*    */ 
/* 65 */       ArrayList<Map<String, Object>> subscribeObjectList = (ArrayList)subscribeListObject.get("SubscribeObject");
/* 66 */       if (Func.isEmpty(subscribeObjectList)) {
/* 67 */         SubscribeController.log.warn("订阅请求 SubscribeListObject 数据为空");
/* 68 */         return result;
/*    */       }
/*    */       
/* 71 */       if (subscribeObjectList.size() > 1) {
/* 72 */         SubscribeController.log.warn("订阅请求 SubscribeList 数据超过 1 条, 请跟数据提供方确认!");
/*    */       }
/*    */       
/* 75 */       Map<String, Object> subscribeObject = (Map)subscribeObjectList.get(0);
/* 76 */       String subscribeDetailType = String.valueOf(subscribeObject.get("SubscribeDetail"));
/* 77 */       String subscribeId = String.valueOf(subscribeObject.get("SubscribeID"));
/*    */       
/* 79 */       if ("13".equals(subscribeDetailType)) {
/* 80 */         SubscribeController.log.info("当前订阅类型为 过车数据");
/* 81 */       } else if ("3".equals(subscribeDetailType)) {
/* 82 */         SubscribeController.log.info("当前订阅类型为 采集设备数据");
/*    */       } else {
/* 84 */         SubscribeController.log.error("当前订阅类型不支持, subscribeDetailType: {}", subscribeDetailType);
/* 85 */         return result;
/*    */       }
/*    */       
/* 88 */       SubscribeInfo subscribeInfo = new SubscribeInfo();
/* 89 */       subscribeInfo.setSubscribeId(subscribeId);
/* 90 */       subscribeInfo.setTitle(String.valueOf(subscribeObject.get("Title")));
/*    */       
/* 92 */       SubscribeInfoHolder.set(subscribeDetailType, subscribeInfo);
/* 93 */       InetAddress host = InetAddress.getLocalHost();
/* 94 */       String requestUrl = "http://" + host.getHostAddress() + ":" + this.httpServletRequest.getLocalPort() + "/VIID/Subscribes";
/* 95 */       return SubscribeStatusResponse.build(subscribeId, requestUrl);
/*    */     }
/*    */     catch (Throwable $ex)
/*    */     {
/* 50 */       throw $ex;
/*    */     }
/*    */   }
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\controller\SubscribeController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */