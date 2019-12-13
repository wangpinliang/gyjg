/*     */ package com.hiyun.gyjg.common;
/*     */ 
/*     */

import com.hiynn.core.tool.utils.Func;
import com.hiynn.core.tool.utils.RandomType;
import com.hiyun.gyjg.common.utils.DateUtil;
import org.apache.commons.lang3.StringUtils;

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
/*     */ 
/*     */ 
/*     */ public final class StandardCodeGenerator
/*     */ {
/*  22 */   private static String ORGANIZATION_CODE = "520100000002";
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
/*     */   public static String notificationId()
/*     */   {
/*  39 */     String type = "04";
/*  40 */     return ORGANIZATION_CODE + type + DateUtil.nowTimeStr() + randomNumberStr(5);
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
/*     */   public static String motorVehicleId(String devicePlatformCode)
/*     */   {
/*  56 */     return 
/*     */     
/*  58 */       videoImageUnifiedCode(devicePlatformCode, "02") + "02" + randomNumberStr(5);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String videoImageUnifiedCode(String devicePlatformCode, String videoImageType)
/*     */   {
/*  81 */     return 
/*  82 */       padDeviceNo(devicePlatformCode) + videoImageType + DateUtil.nowTimeStr() + randomNumberStr(5);
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
/*     */   public static String padDeviceNo(String devicePlatformCode)
/*     */   {
/*  96 */     String regionCode = devicePlatformCode.substring(0, 8);
/*  97 */     String businessCode = "00";
/*  98 */     String deviceTypeCode = "199";
/*  99 */     String netCode = "5";
/*     */     
/* 101 */     String orderNum = StringUtils.leftPad(devicePlatformCode.substring(15), 6, '0');
/* 102 */     return regionCode + businessCode + deviceTypeCode + netCode + orderNum;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static String randomNumberStr(int length)
/*     */   {
/* 112 */     return Func.random(length, RandomType.INT) + "";
/*     */   }
/*     */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\common\StandardCodeGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */