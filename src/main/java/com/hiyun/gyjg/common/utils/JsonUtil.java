/*     */ package com.hiyun.gyjg.common.utils;
/*     */ 
/*     */ import com.alibaba.fastjson.JSON;
/*     */ import com.alibaba.fastjson.JSONObject;
/*     */ import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
/*     */ import com.alibaba.fastjson.serializer.SerializeConfig;
/*     */ import com.alibaba.fastjson.serializer.SerializerFeature;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class JsonUtil
/*     */ {
/*     */   private static final SerializeConfig config;
/*  21 */   private static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty, SerializerFeature.WriteNullNumberAsZero, SerializerFeature.WriteNullBooleanAsFalse, SerializerFeature.WriteNullStringAsEmpty };
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
/*     */   static
/*     */   {
/*  35 */     config = new SerializeConfig();
/*     */     
/*  37 */     config.put(Date.class, new JSONLibDataFormatSerializer());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String toFeaturesJson(Object object)
/*     */   {
/*  47 */     return JSON.toJSONString(object, config, features);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String toJson(Object object)
/*     */   {
/*  57 */     return JSON.toJSONString(object, config, new SerializerFeature[0]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Object parse(String json)
/*     */   {
/*  67 */     return JSON.parse(json);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> T parse(String json, Class<T> cls)
/*     */   {
/*  79 */     return (T)JSON.parseObject(json, cls);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> Map<String, T> toMap(String json)
/*     */   {
/*  91 */     return JSONObject.parseObject(json);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static <T> List<T> toList(String json, Class<T> cls)
/*     */   {
/* 103 */     return JSON.parseArray(json, cls);
/*     */   }
/*     */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\common\utils\JsonUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */