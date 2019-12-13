/*    */ package com.hiyun.gyjg.entity.topic;
/*    */ 
/*    */ import com.google.common.collect.Maps;
/*    */ import java.io.Serializable;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PlateMotorVehicle
/*    */   implements Serializable
/*    */ {
/*    */   private String deviceNo;
/*    */   
/* 17 */   public void setDeviceNo(String deviceNo) { this.deviceNo = deviceNo; } public void setPicture(Map<String, String> picture) { this.picture = picture; } public void setPlateColor(String plateColor) { this.plateColor = plateColor; } public void setCarNo(String carNo) { this.carNo = carNo; } public void setCarSpeed(String carSpeed) { this.carSpeed = carSpeed; } public void setDirection(String direction) { this.direction = direction; } public void setCarColor(String carColor) { this.carColor = carColor; } public void setWatchTime(String watchTime) { this.watchTime = watchTime; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof PlateMotorVehicle)) return false; PlateMotorVehicle other = (PlateMotorVehicle)o; if (!other.canEqual(this)) return false; Object this$deviceNo = getDeviceNo();Object other$deviceNo = other.getDeviceNo(); if (this$deviceNo == null ? other$deviceNo != null : !this$deviceNo.equals(other$deviceNo)) return false; Object this$picture = getPicture();Object other$picture = other.getPicture(); if (this$picture == null ? other$picture != null : !this$picture.equals(other$picture)) return false; Object this$plateColor = getPlateColor();Object other$plateColor = other.getPlateColor(); if (this$plateColor == null ? other$plateColor != null : !this$plateColor.equals(other$plateColor)) return false; Object this$carNo = getCarNo();Object other$carNo = other.getCarNo(); if (this$carNo == null ? other$carNo != null : !this$carNo.equals(other$carNo)) return false; Object this$carSpeed = getCarSpeed();Object other$carSpeed = other.getCarSpeed(); if (this$carSpeed == null ? other$carSpeed != null : !this$carSpeed.equals(other$carSpeed)) return false; Object this$direction = getDirection();Object other$direction = other.getDirection(); if (this$direction == null ? other$direction != null : !this$direction.equals(other$direction)) return false; Object this$carColor = getCarColor();Object other$carColor = other.getCarColor(); if (this$carColor == null ? other$carColor != null : !this$carColor.equals(other$carColor)) return false; Object this$watchTime = getWatchTime();Object other$watchTime = other.getWatchTime();return this$watchTime == null ? other$watchTime == null : this$watchTime.equals(other$watchTime); } protected boolean canEqual(Object other) { return other instanceof PlateMotorVehicle; } public int hashCode() { int PRIME = 59;int result = 1;Object $deviceNo = getDeviceNo();result = result * 59 + ($deviceNo == null ? 43 : $deviceNo.hashCode());Object $picture = getPicture();result = result * 59 + ($picture == null ? 43 : $picture.hashCode());Object $plateColor = getPlateColor();result = result * 59 + ($plateColor == null ? 43 : $plateColor.hashCode());Object $carNo = getCarNo();result = result * 59 + ($carNo == null ? 43 : $carNo.hashCode());Object $carSpeed = getCarSpeed();result = result * 59 + ($carSpeed == null ? 43 : $carSpeed.hashCode());Object $direction = getDirection();result = result * 59 + ($direction == null ? 43 : $direction.hashCode());Object $carColor = getCarColor();result = result * 59 + ($carColor == null ? 43 : $carColor.hashCode());Object $watchTime = getWatchTime();result = result * 59 + ($watchTime == null ? 43 : $watchTime.hashCode());return result; } public String toString() { return "PlateMotorVehicle(deviceNo=" + getDeviceNo() + ", picture=" + getPicture() + ", plateColor=" + getPlateColor() + ", carNo=" + getCarNo() + ", carSpeed=" + getCarSpeed() + ", direction=" + getDirection() + ", carColor=" + getCarColor() + ", watchTime=" + getWatchTime() + ")"; }
/*    */   
/* 19 */   public PlateMotorVehicle(String deviceNo, Map<String, String> picture, String plateColor, String carNo, String carSpeed, String direction, String carColor, String watchTime) { this.deviceNo = deviceNo;this.picture = picture;this.plateColor = plateColor;this.carNo = carNo;this.carSpeed = carSpeed;this.direction = direction;this.carColor = carColor;this.watchTime = watchTime;
/*    */   }
/*    */   
/*    */ 
/*    */   public String getDeviceNo()
/*    */   {
/* 25 */     return this.deviceNo;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 30 */   public Map<String, String> getPicture() { return this.picture; } private Map<String, String> picture = Maps.newHashMap();
/*    */   private String plateColor;
/*    */   private String carNo;
/*    */   private String carSpeed;
/*    */   
/* 35 */   public String getPlateColor() { return this.plateColor; }
/*    */   
/*    */   private String direction;
/*    */   private String carColor;
/*    */   private String watchTime;
/* 40 */   public String getCarNo() { return this.carNo; }
/*    */   
/*    */ 
/*    */   public String getCarSpeed()
/*    */   {
/* 45 */     return this.carSpeed;
/*    */   }
/*    */   
/*    */   public String getDirection()
/*    */   {
/* 50 */     return this.direction;
/*    */   }
/*    */   
/*    */   public String getCarColor()
/*    */   {
/* 55 */     return this.carColor;
/*    */   }
/*    */   
/*    */   public String getWatchTime()
/*    */   {
/* 60 */     return this.watchTime;
/*    */   }
/*    */   
/*    */   public PlateMotorVehicle() {}
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\entity\topic\PlateMotorVehicle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */