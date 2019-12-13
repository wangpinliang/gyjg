/*     */ package com.hiyun.gyjg.entity;
/*     */ 
/*     */ import com.hiynn.gyjg.common.converter.StandardBizConverter;
/*     */ 
/*     */ public class MotorVehicle implements java.io.Serializable { private String motorVehicleId;
/*     */   private String deviceNo;
/*     */   private String picUrl1;
/*     */   private String plateColor;
/*     */   private String carNo;
/*     */   private Double carSpeed;
/*     */   private String direction;
/*     */   private String carColor;
/*     */   private String watchTime;
/*     */   
/*  15 */   public void setMotorVehicleId(String motorVehicleId) { this.motorVehicleId = motorVehicleId; } public void setCarNo(String carNo) { this.carNo = carNo; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof MotorVehicle)) return false; MotorVehicle other = (MotorVehicle)o; if (!other.canEqual(this)) return false; Object this$motorVehicleId = getMotorVehicleId();Object other$motorVehicleId = other.getMotorVehicleId(); if (this$motorVehicleId == null ? other$motorVehicleId != null : !this$motorVehicleId.equals(other$motorVehicleId)) return false; Object this$deviceNo = getDeviceNo();Object other$deviceNo = other.getDeviceNo(); if (this$deviceNo == null ? other$deviceNo != null : !this$deviceNo.equals(other$deviceNo)) return false; Object this$picUrl1 = getPicUrl1();Object other$picUrl1 = other.getPicUrl1(); if (this$picUrl1 == null ? other$picUrl1 != null : !this$picUrl1.equals(other$picUrl1)) return false; Object this$plateColor = getPlateColor();Object other$plateColor = other.getPlateColor(); if (this$plateColor == null ? other$plateColor != null : !this$plateColor.equals(other$plateColor)) return false; Object this$carNo = getCarNo();Object other$carNo = other.getCarNo(); if (this$carNo == null ? other$carNo != null : !this$carNo.equals(other$carNo)) return false; Object this$carSpeed = getCarSpeed();Object other$carSpeed = other.getCarSpeed(); if (this$carSpeed == null ? other$carSpeed != null : !this$carSpeed.equals(other$carSpeed)) return false; Object this$direction = getDirection();Object other$direction = other.getDirection(); if (this$direction == null ? other$direction != null : !this$direction.equals(other$direction)) return false; Object this$carColor = getCarColor();Object other$carColor = other.getCarColor(); if (this$carColor == null ? other$carColor != null : !this$carColor.equals(other$carColor)) return false; Object this$watchTime = getWatchTime();Object other$watchTime = other.getWatchTime();return this$watchTime == null ? other$watchTime == null : this$watchTime.equals(other$watchTime); } protected boolean canEqual(Object other) { return other instanceof MotorVehicle; } public int hashCode() { int PRIME = 59;int result = 1;Object $motorVehicleId = getMotorVehicleId();result = result * 59 + ($motorVehicleId == null ? 43 : $motorVehicleId.hashCode());Object $deviceNo = getDeviceNo();result = result * 59 + ($deviceNo == null ? 43 : $deviceNo.hashCode());Object $picUrl1 = getPicUrl1();result = result * 59 + ($picUrl1 == null ? 43 : $picUrl1.hashCode());Object $plateColor = getPlateColor();result = result * 59 + ($plateColor == null ? 43 : $plateColor.hashCode());Object $carNo = getCarNo();result = result * 59 + ($carNo == null ? 43 : $carNo.hashCode());Object $carSpeed = getCarSpeed();result = result * 59 + ($carSpeed == null ? 43 : $carSpeed.hashCode());Object $direction = getDirection();result = result * 59 + ($direction == null ? 43 : $direction.hashCode());Object $carColor = getCarColor();result = result * 59 + ($carColor == null ? 43 : $carColor.hashCode());Object $watchTime = getWatchTime();result = result * 59 + ($watchTime == null ? 43 : $watchTime.hashCode());return result; } public String toString() { return "MotorVehicle(motorVehicleId=" + getMotorVehicleId() + ", deviceNo=" + getDeviceNo() + ", picUrl1=" + getPicUrl1() + ", plateColor=" + getPlateColor() + ", carNo=" + getCarNo() + ", carSpeed=" + getCarSpeed() + ", direction=" + getDirection() + ", carColor=" + getCarColor() + ", watchTime=" + getWatchTime() + ")"; }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getMotorVehicleId()
/*     */   {
/*  21 */     return this.motorVehicleId;
/*     */   }
/*     */   
/*     */   public String getDeviceNo()
/*     */   {
/*  26 */     return this.deviceNo;
/*     */   }
/*     */   
/*     */   public String getPicUrl1()
/*     */   {
/*  31 */     return this.picUrl1;
/*     */   }
/*     */   
/*     */   public String getPlateColor()
/*     */   {
/*  36 */     return this.plateColor;
/*     */   }
/*     */   
/*     */   public String getCarNo()
/*     */   {
/*  41 */     return this.carNo;
/*     */   }
/*     */   
/*     */   public Double getCarSpeed()
/*     */   {
/*  46 */     return this.carSpeed;
/*     */   }
/*     */   
/*     */   public String getDirection()
/*     */   {
/*  51 */     return this.direction;
/*     */   }
/*     */   
/*     */   public String getCarColor()
/*     */   {
/*  56 */     return this.carColor;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*  61 */   public String getWatchTime() { return this.watchTime; }
/*     */   
/*     */   public void setDeviceNo(String deviceNo) {
/*  64 */     this.deviceNo = com.hiynn.gyjg.common.StandardCodeGenerator.padDeviceNo(deviceNo);
/*  65 */     this.motorVehicleId = com.hiynn.gyjg.common.StandardCodeGenerator.motorVehicleId(deviceNo);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPicUrl1(String picUrl1)
/*     */   {
/*  74 */     this.picUrl1 = StandardBizConverter.ftp2Http(picUrl1);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPlateColor(String plateColor)
/*     */   {
/*  83 */     this.plateColor = StandardBizConverter.plateColor(plateColor);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setCarSpeed(String carSpeed)
/*     */   {
/*     */     try
/*     */     {
/*  92 */       this.carSpeed = Double.valueOf(Double.parseDouble(carSpeed));
/*     */     } catch (Throwable e) {
/*  94 */       this.carSpeed = Double.valueOf(0.0D);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDirection(String direction)
/*     */   {
/* 103 */     this.direction = StandardBizConverter.direction(direction);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCarColor(String carColor)
/*     */   {
/* 111 */     this.carColor = StandardBizConverter.carColor(carColor);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWatchTime(String watchTime)
/*     */   {
/* 119 */     this.watchTime = StandardBizConverter.watchTime(watchTime);
/*     */   }
/*     */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\entity\MotorVehicle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */