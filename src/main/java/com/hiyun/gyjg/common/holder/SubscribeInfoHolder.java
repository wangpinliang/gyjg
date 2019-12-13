/*    */ package com.hiyun.gyjg.common.holder;
/*    */ 
/*    */ import com.google.common.collect.Maps;
/*    */ import com.hiynn.gyjg.entity.SubscribeInfo;
/*    */ import java.util.Map;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SubscribeInfoHolder
/*    */ {
/* 15 */   private static final Logger log = LoggerFactory.getLogger(SubscribeInfoHolder.class);
/*    */   
/*    */ 
/* 18 */   private static Map<String, SubscribeInfo> map = Maps.newConcurrentMap();
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void set(String subscribeDetailType, SubscribeInfo subscribeInfo)
/*    */   {
/* 27 */     map.put(subscribeDetailType, subscribeInfo);
/* 28 */     log.info("设置订阅请求信息映射 - 订阅类型: {}, 订阅数据: {}, 当前映射总条数: {}", new Object[] { subscribeDetailType, subscribeInfo, Integer.valueOf(map.size()) });
/*    */   }
/*    */   
/*    */   public static SubscribeInfo get(String subscribeDetailType) {
/* 32 */     return (SubscribeInfo)map.get(subscribeDetailType);
/*    */   }
/*    */   
/*    */   public static void clear(String subscribeDetailType) {
/* 36 */     map.remove(subscribeDetailType);
/* 37 */     log.info("移除订阅请求信息映射 - 订阅类型: {}, 当前映射总条数: {}", subscribeDetailType, Integer.valueOf(map.size()));
/*    */   }
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\common\holder\SubscribeInfoHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */