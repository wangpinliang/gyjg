/*     */ package com.hiyun.gyjg.common.converter;
/*     */ 
/*     */ import com.google.common.collect.Maps;
/*     */ import com.hiynn.core.tool.utils.Func;
/*     */ import com.hiynn.gyjg.common.utils.DateUtil;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.lang3.StringUtils;
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
/*     */ public final class StandardBizConverter
/*     */ {
/*  24 */   private static Map<String, String> plateColorMap = ;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  29 */   private static Map<String, String> carColorMap = Maps.newHashMap();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  34 */   private static Map<String, String> directionMap = Maps.newHashMap();
/*     */   
/*     */ 
/*     */   static
/*     */   {
/*  39 */     plateColorMap.put("0", "5");
/*     */     
/*  41 */     plateColorMap.put("1", "5");
/*     */     
/*  43 */     plateColorMap.put("2", "1");
/*     */     
/*  45 */     plateColorMap.put("3", "6");
/*     */     
/*  47 */     plateColorMap.put("4", "2");
/*     */     
/*  49 */     plateColorMap.put("5", "99");
/*     */     
/*  51 */     plateColorMap.put("7", "99");
/*     */     
/*  53 */     plateColorMap.put("8", "99");
/*     */     
/*     */ 
/*     */ 
/*  57 */     carColorMap.put("1", "5");
/*     */     
/*  59 */     carColorMap.put("2", "3");
/*     */     
/*  61 */     carColorMap.put("3", "1");
/*     */     
/*  63 */     carColorMap.put("4", "4");
/*     */     
/*  65 */     carColorMap.put("5", "10");
/*     */     
/*  67 */     carColorMap.put("6", "5");
/*     */     
/*  69 */     carColorMap.put("7", "6");
/*     */     
/*  71 */     carColorMap.put("8", "9");
/*     */     
/*  73 */     carColorMap.put("9", "8");
/*     */     
/*  75 */     carColorMap.put("10", "12");
/*     */     
/*  77 */     carColorMap.put("11", "3");
/*     */     
/*  79 */     carColorMap.put("13", "8");
/*     */     
/*  81 */     carColorMap.put("14", "11");
/*     */     
/*  83 */     carColorMap.put("15", "99");
/*     */     
/*  85 */     carColorMap.put("16", "99");
/*     */     
/*     */ 
/*     */ 
/*  89 */     directionMap.put("1", "2");
/*     */     
/*  91 */     directionMap.put("2", "1");
/*     */     
/*  93 */     directionMap.put("3", "4");
/*     */     
/*  95 */     directionMap.put("4", "3");
/*     */     
/*  97 */     directionMap.put("5", "6");
/*     */     
/*  99 */     directionMap.put("6", "5");
/*     */     
/* 101 */     directionMap.put("7", "8");
/*     */     
/* 103 */     directionMap.put("8", "7");
/*     */     
/* 105 */     directionMap.put("9", "9");
/*     */     
/* 107 */     directionMap.put("0", "9");
/*     */     
/* 109 */     directionMap.put("10", "9");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String plateColor(String plateColor)
/*     */   {
/* 119 */     String color = (String)plateColorMap.get(replacePrefix0(plateColor));
/* 120 */     if (Func.isEmpty(color))
/*     */     {
/* 122 */       return "5";
/*     */     }
/* 124 */     return color;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String carColor(String carColor)
/*     */   {
/* 134 */     String color = (String)carColorMap.get(replacePrefix0(carColor));
/* 135 */     if (Func.isEmpty(color)) {
/* 136 */       return "99";
/*     */     }
/* 138 */     return color;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String direction(String direction)
/*     */   {
/* 148 */     String code = (String)directionMap.get(replacePrefix0(direction));
/* 149 */     if (Func.isEmpty(code)) {
/* 150 */       return "9";
/*     */     }
/* 152 */     return code;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String watchTime(String watchTime)
/*     */   {
/* 164 */     return DateUtil.format(DateUtil.parse(watchTime, "yyyy-MM-dd HH:mm:ss.SSS"));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static String replacePrefix0(String code)
/*     */   {
/* 174 */     return code.length() > 1 ? StringUtils.removeStart(code, "0") : code;
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
/*     */   public static String ftp2Http(String url)
/*     */   {
/* 187 */     String ftpPrefix = "ftp";String port = "81";
/* 188 */     if (url.toLowerCase().startsWith(ftpPrefix))
/*     */     {
/* 190 */       String temp = url.replace("ftp://", "");
/*     */       
/* 192 */       String subUrl = temp.substring(temp.indexOf('/'));
/*     */       
/* 194 */       url = url.replace("ftp:/", "");
/* 195 */       String userName = url.substring(url.indexOf("/") + 1, url.indexOf(":"));
/*     */       
/* 197 */       String ip = url.substring(url.lastIndexOf('@') + 1, url.lastIndexOf(':'));
/* 198 */       return "http://" + ip + ":" + port + "/" + userName + subUrl;
/*     */     }
/*     */     
/* 201 */     return url;
/*     */   }
/*     */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\common\converter\StandardBizConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */