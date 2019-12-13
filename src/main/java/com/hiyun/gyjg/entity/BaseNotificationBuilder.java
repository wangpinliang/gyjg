/*    */ package com.hiyun.gyjg.entity;
/*    */ 
/*    */ import com.google.common.collect.Maps;
/*    */ import com.hiynn.gyjg.common.Constants.ExecuteOperation;
/*    */ import com.hiynn.gyjg.common.StandardCodeGenerator;
/*    */ import com.hiynn.gyjg.common.utils.DateUtil;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class BaseNotificationBuilder<T>
/*    */ {
/*    */   public Map<String, Object> build(SubscribeInfo subscribeInfo, List<T> subscribeDataList)
/*    */   {
/* 27 */     Map<String, Object> result = Maps.newLinkedHashMap();
/* 28 */     Map<String, List<Map<String, Object>>> subscribeNotificationObject = Maps.newLinkedHashMap();
/* 29 */     Map<String, Object> notificationObject = Maps.newLinkedHashMap();
/*    */     
/* 31 */     notificationObject.put("NotificationID", StandardCodeGenerator.notificationId());
/* 32 */     notificationObject.put("SubscribeID", subscribeInfo.getSubscribeId());
/* 33 */     notificationObject.put("Title", subscribeInfo.getTitle());
/* 34 */     notificationObject.put("TriggerTime", DateUtil.nowTimeStr());
/* 35 */     notificationObject.put("InfoIDs", infoIds(subscribeDataList));
/* 36 */     notificationObject.putAll(notificationObjectList(subscribeDataList));
/*    */     
/* 38 */     notificationObject.put("ExecuteOperation", Constants.ExecuteOperation.ADD);
/* 39 */     subscribeNotificationObject.put("SubscribeNotificationObject", Collections.singletonList(notificationObject));
/* 40 */     result.put("SubscribeNotificationListObject", subscribeNotificationObject);
/* 41 */     return result;
/*    */   }
/*    */   
/*    */   protected abstract String infoIds(List<T> paramList);
/*    */   
/*    */   protected abstract Map<String, Map<String, Object>> notificationObjectList(List<T> paramList);
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\entity\BaseNotificationBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */