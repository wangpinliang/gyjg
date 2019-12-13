/*    */ package com.hiyun.gyjg.controller;
/*    */ 
/*    */ import com.hiynn.gyjg.common.holder.DeviceListHolder;
/*    */ import com.hiynn.gyjg.entity.MotorVehicle;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Api("服务")
/*    */ @RestController
/*    */ @RequestMapping({"/_ping"})
/*    */ public class PingController
/*    */ {
/*    */   @GetMapping({"/updateDeviceList"})
/*    */   @ApiOperation(value="更新设备列表文件缓存", httpMethod="GET")
/*    */   public String updateDeviceList()
/*    */   {
/* 28 */     DeviceListHolder.load();
/* 29 */     return "更新设备列表成功";
/*    */   }
/*    */   
/*    */   private List<MotorVehicle> motorVehicles() {
/* 33 */     MotorVehicle data = new MotorVehicle();
/* 34 */     data.setDeviceNo("5201000009020227961");
/* 35 */     data.setPicUrl1("ftp://vion:vion@193.5.103.171:21/52.3.100.172/kk/2019-10-30/11/2019103011125804000001740.jpg");
/* 36 */     data.setCarNo("贵JQ4442");
/* 37 */     data.setWatchTime("2019-10-30 11:12:58.000");
/* 38 */     data.setCarColor("1");
/* 39 */     data.setCarSpeed("21.00");
/* 40 */     data.setDirection("2");
/* 41 */     data.setPlateColor("3");
/* 42 */     MotorVehicle data1 = new MotorVehicle();
/* 43 */     data1.setDeviceNo("52032500001190000021");
/* 44 */     data1.setPicUrl1("KAKOU_2019103011125804000001740.jpg");
/* 45 */     data1.setCarNo("贵AC53M5");
/* 46 */     data1.setWatchTime("2019-10-30 11:12:58.000");
/* 47 */     data1.setCarColor("2");
/* 48 */     data1.setCarSpeed("21.00");
/* 49 */     data1.setDirection("2");
/* 50 */     data1.setPlateColor("3");
/* 51 */     MotorVehicle data2 = new MotorVehicle();
/* 52 */     data2.setDeviceNo("3201000009020227961");
/* 53 */     data2.setPicUrl1("东二环龙家寨路段.jpg");
/* 54 */     data2.setCarNo("贵A4FB91");
/* 55 */     data2.setWatchTime("2019-10-30 11:12:58.000");
/* 56 */     data2.setCarColor("4");
/* 57 */     data2.setCarSpeed("21.00");
/* 58 */     data2.setDirection("2");
/* 59 */     data2.setPlateColor("3");
/* 60 */     return Arrays.asList(new MotorVehicle[] { data, data1, data2 });
/*    */   }
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\controller\PingController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */