/*     */ package com.hiyun.gyjg.entity.topic;
/*     */ 
/*     */ import com.alibaba.fastjson.annotation.JSONField;
/*     */ 
/*     */ public class HkQyMotorVehicle implements java.io.Serializable { private String deviceNo;
/*     */   private String picture;
/*     */   private String plateColor;
/*     */   private String carNo;
/*     */   private String carSpeed;
/*     */   private String direction;
/*     */   private String carColor;
/*     */   private String watchTime;
/*     */   
/*  14 */   public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof HkQyMotorVehicle)) return false; HkQyMotorVehicle other = (HkQyMotorVehicle)o; if (!other.canEqual(this)) return false; Object this$deviceNo = getDeviceNo();Object other$deviceNo = other.getDeviceNo(); if (this$deviceNo == null ? other$deviceNo != null : !this$deviceNo.equals(other$deviceNo)) return false; Object this$picture = getPicture();Object other$picture = other.getPicture(); if (this$picture == null ? other$picture != null : !this$picture.equals(other$picture)) return false; Object this$plateColor = getPlateColor();Object other$plateColor = other.getPlateColor(); if (this$plateColor == null ? other$plateColor != null : !this$plateColor.equals(other$plateColor)) return false; Object this$carNo = getCarNo();Object other$carNo = other.getCarNo(); if (this$carNo == null ? other$carNo != null : !this$carNo.equals(other$carNo)) return false; Object this$carSpeed = getCarSpeed();Object other$carSpeed = other.getCarSpeed(); if (this$carSpeed == null ? other$carSpeed != null : !this$carSpeed.equals(other$carSpeed)) return false; Object this$direction = getDirection();Object other$direction = other.getDirection(); if (this$direction == null ? other$direction != null : !this$direction.equals(other$direction)) return false; Object this$carColor = getCarColor();Object other$carColor = other.getCarColor(); if (this$carColor == null ? other$carColor != null : !this$carColor.equals(other$carColor)) return false; Object this$watchTime = getWatchTime();Object other$watchTime = other.getWatchTime();return this$watchTime == null ? other$watchTime == null : this$watchTime.equals(other$watchTime); } protected boolean canEqual(Object other) { return other instanceof HkQyMotorVehicle; } public int hashCode() { int PRIME = 59;int result = 1;Object $deviceNo = getDeviceNo();result = result * 59 + ($deviceNo == null ? 43 : $deviceNo.hashCode());Object $picture = getPicture();result = result * 59 + ($picture == null ? 43 : $picture.hashCode());Object $plateColor = getPlateColor();result = result * 59 + ($plateColor == null ? 43 : $plateColor.hashCode());Object $carNo = getCarNo();result = result * 59 + ($carNo == null ? 43 : $carNo.hashCode());Object $carSpeed = getCarSpeed();result = result * 59 + ($carSpeed == null ? 43 : $carSpeed.hashCode());Object $direction = getDirection();result = result * 59 + ($direction == null ? 43 : $direction.hashCode());Object $carColor = getCarColor();result = result * 59 + ($carColor == null ? 43 : $carColor.hashCode());Object $watchTime = getWatchTime();result = result * 59 + ($watchTime == null ? 43 : $watchTime.hashCode());return result; } public String toString() { return "HkQyMotorVehicle(deviceNo=" + getDeviceNo() + ", picture=" + getPicture() + ", plateColor=" + getPlateColor() + ", carNo=" + getCarNo() + ", carSpeed=" + getCarSpeed() + ", direction=" + getDirection() + ", carColor=" + getCarColor() + ", watchTime=" + getWatchTime() + ")"; }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getDeviceNo()
/*     */   {
/*  20 */     return this.deviceNo;
/*     */   }
/*     */   
/*     */   public String getPicture()
/*     */   {
/*  25 */     return this.picture;
/*     */   }
/*     */   
/*     */   public String getPlateColor()
/*     */   {
/*  30 */     return this.plateColor;
/*     */   }
/*     */   
/*     */   public String getCarNo()
/*     */   {
/*  35 */     return this.carNo;
/*     */   }
/*     */   
/*     */   public String getCarSpeed()
/*     */   {
/*  40 */     return this.carSpeed;
/*     */   }
/*     */   
/*     */   public String getDirection()
/*     */   {
/*  45 */     return this.direction;
/*     */   }
/*     */   
/*     */   public String getCarColor()
/*     */   {
/*  50 */     return this.carColor;
/*     */   }
/*     */   
/*     */   public String getWatchTime()
/*     */   {
/*  55 */     return this.watchTime;
/*     */   }
/*     */   
/*     */   @JSONField(name="DeviceNo")
/*  59 */   public void setDeviceNo(String deviceNo) { this.deviceNo = deviceNo; }
/*     */   
/*     */   @JSONField(name="PicUrl1")
/*     */   public void setPicture(String picture)
/*     */   {
/*  64 */     this.picture = picture;
/*     */   }
/*     */   
/*     */   @JSONField(name="PlateColor")
/*     */   public void setPlateColor(String plateColor) {
/*  69 */     this.plateColor = plateColor;
/*     */   }
/*     */   
/*     */   @JSONField(name="CarNo")
/*     */   public void setCarNo(String carNo) {
/*  74 */     this.carNo = carNo;
/*     */   }
/*     */   
/*     */   @JSONField(name="CarSpeed")
/*     */   public void setCarSpeed(String carSpeed) {
/*  79 */     this.carSpeed = carSpeed;
/*     */   }
/*     */   
/*     */   @JSONField(name="Direction")
/*     */   public void setDirection(String direction) {
/*  84 */     this.direction = direction;
/*     */   }
/*     */   
/*     */   @JSONField(name="CarColor")
/*     */   public void setCarColor(String carColor) {
/*  89 */     this.carColor = carColor;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @JSONField(name="watchTime")
/*     */   public void setWatchTime(String watchTime)
/*     */   {
/* 100 */     this.watchTime = (watchTime + ".000");
/*     */   }
/*     */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\entity\topic\HkQyMotorVehicle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */