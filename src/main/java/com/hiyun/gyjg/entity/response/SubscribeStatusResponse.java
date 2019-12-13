/*    */ package com.hiyun.gyjg.entity.response;
/*    */ 
/*    */ import com.google.common.collect.Maps;
/*    */ import com.hiynn.gyjg.common.Constants.ResponseStatusCode;
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
/*    */ 
/*    */ 
/*    */ public class SubscribeStatusResponse
/*    */ {
/*    */   public static Map<String, Object> build(String subscribeId, String requestUrl)
/*    */   {
/* 28 */     Map<String, Object> result = Maps.newHashMap();
/* 29 */     Map<String, List<Map<String, Object>>> responseStatusObject = Maps.newHashMap();
/* 30 */     Map<String, Object> responseStatusData = Maps.newLinkedHashMap();
/*    */     
/* 32 */     responseStatusData.put("Id", subscribeId);
/* 33 */     responseStatusData.put("StatusCode", Constants.ResponseStatusCode.OK);
/*    */     
/* 35 */     responseStatusData.put("RequestURL", requestUrl);
/* 36 */     responseStatusData.put("StatusString", "正常");
/* 37 */     responseStatusData.put("LocalTime", DateUtil.nowTimeStr());
/*    */     
/* 39 */     responseStatusObject.put("ResponseStatusObject", Collections.singletonList(responseStatusData));
/* 40 */     result.put("ResponseStatusListObject", responseStatusObject);
/* 41 */     return result;
/*    */   }
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\entity\response\SubscribeStatusResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */