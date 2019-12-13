/*     */ package com.hiyun.gyjg.listener;
/*     */ 
/*     */ import com.hiynn.core.tool.utils.Func;
/*     */ import com.hiynn.gyjg.common.converter.SubscribeMotorVehicleConverter;
/*     */ import com.hiynn.gyjg.common.holder.SubscribeInfoHolder;
/*     */ import com.hiynn.gyjg.entity.MotorVehicle;
/*     */ import com.hiynn.gyjg.entity.MotorVehicleNotificationBuilder;
/*     */ import com.hiynn.gyjg.entity.SubscribeInfo;
/*     */ import com.hiynn.gyjg.service.MotorVehicleNotificationService;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import javax.annotation.Resource;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.kafka.annotation.KafkaListener;
/*     */ import org.springframework.stereotype.Component;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Component
/*     */ public class SubscribeMotorVehicleListener
/*     */ {
/*  26 */   private static final Logger log = LoggerFactory.getLogger(SubscribeMotorVehicleListener.class);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @Resource
/*     */   private MotorVehicleNotificationService motorVehicleNotificationService;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @KafkaListener(topics={"PLATE"}, containerFactory="batchContainerFactory")
/*     */   public void plateListener(List<String> motorVehicleList)
/*     */   {
/*  40 */     log.debug("接收到PLATE数据");
/*     */     
/*     */ 
/*  43 */     SubscribeInfo subscribeInfo = SubscribeInfoHolder.get("13");
/*  44 */     if (Objects.isNull(subscribeInfo)) {
/*  45 */       log.warn("PLATE 当前没有服务订阅过车数据");
/*  46 */       return;
/*     */     }
/*     */     
/*  49 */     List<MotorVehicle> motorVehicles = SubscribeMotorVehicleConverter.convertFromPlate(motorVehicleList);
/*  50 */     if (Func.isEmpty(motorVehicles)) {
/*  51 */       return;
/*     */     }
/*     */     
/*  54 */     Map<String, Object> motorVehicleNotification = new MotorVehicleNotificationBuilder().build(subscribeInfo, motorVehicles);
/*     */     
/*  56 */     this.motorVehicleNotificationService.send(motorVehicleNotification);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @KafkaListener(topics={"HK_QY_PLATE"}, containerFactory="batchContainerFactory")
/*     */   public void hkQyPlateListener(List<String> motorVehicleList)
/*     */   {
/*  66 */     log.debug("接收到HK_QY_PLATE数据");
/*     */     
/*     */ 
/*  69 */     SubscribeInfo subscribeInfo = SubscribeInfoHolder.get("13");
/*  70 */     if (Objects.isNull(subscribeInfo)) {
/*  71 */       log.warn("HK_QY_PLATE 当前没有服务订阅过车数据");
/*  72 */       return;
/*     */     }
/*     */     
/*  75 */     List<MotorVehicle> motorVehicles = SubscribeMotorVehicleConverter.convertFromHkQyPlate(motorVehicleList);
/*  76 */     if (Func.isEmpty(motorVehicles)) {
/*  77 */       log.warn("HK_QY_PLATE topic 数据没有命中设备编号列表");
/*  78 */       return;
/*     */     }
/*     */     
/*  81 */     Map<String, Object> motorVehicleNotification = new MotorVehicleNotificationBuilder().build(subscribeInfo, motorVehicles);
/*     */     
/*  83 */     this.motorVehicleNotificationService.send(motorVehicleNotification);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @KafkaListener(topics={"SQBZ_PLATE"}, containerFactory="batchContainerFactory")
/*     */   public void sqBzPlateListener(List<String> motorVehicleList)
/*     */   {
/*  93 */     log.debug("接收到SQBZ_PLATE数据");
/*     */     
/*     */ 
/*  96 */     SubscribeInfo subscribeInfo = SubscribeInfoHolder.get("13");
/*  97 */     if (Objects.isNull(subscribeInfo)) {
/*  98 */       log.warn("SQBZ_PLATE 当前没有服务订阅过车数据");
/*  99 */       return;
/*     */     }
/*     */     
/* 102 */     List<MotorVehicle> motorVehicles = SubscribeMotorVehicleConverter.convertFromPlateSqBz(motorVehicleList);
/* 103 */     if (Func.isEmpty(motorVehicles)) {
/* 104 */       log.warn("SQBZ_PLATE topic 数据没有命中设备编号列表");
/* 105 */       return;
/*     */     }
/*     */     
/* 108 */     Map<String, Object> motorVehicleNotification = new MotorVehicleNotificationBuilder().build(subscribeInfo, motorVehicles);
/*     */     
/* 110 */     this.motorVehicleNotificationService.send(motorVehicleNotification);
/*     */   }
/*     */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\listener\SubscribeMotorVehicleListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */