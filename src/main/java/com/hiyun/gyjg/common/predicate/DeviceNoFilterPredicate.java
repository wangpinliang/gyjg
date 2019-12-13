/*    */ package com.hiyun.gyjg.common.predicate;
/*    */ 
/*    */ import com.hiynn.gyjg.common.holder.DeviceListHolder;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DeviceNoFilterPredicate
/*    */ {
/* 12 */   private static final Logger log = LoggerFactory.getLogger(DeviceNoFilterPredicate.class);
/*    */   
/*    */   public static Boolean filter(String deviceNo)
/*    */   {
/* 16 */     return DeviceListHolder.contains(deviceNo);
/*    */   }
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\common\predicate\DeviceNoFilterPredicate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */