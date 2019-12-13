/*     */ package com.hiyun.gyjg.common.utils;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class DateUtil
/*     */ {
/*  17 */   private static final Logger log = LoggerFactory.getLogger(DateUtil.class);
/*     */   
/*     */ 
/*     */   public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
/*     */   
/*     */ 
/*     */   public static final String DATE_FORMAT_YYYY_MM_DD_NOT_LINE = "yyyyMMdd";
/*     */   
/*     */ 
/*     */   public static final String DATE_FORMAT_YYYY_MM = "yyyy-MM";
/*     */   
/*     */ 
/*     */   public static final String DATE_FORMAT_YYYYMM = "yyyyMM";
/*     */   
/*     */ 
/*     */   public static final String DATE_FORMAT_YYYY = "yyyy";
/*     */   
/*     */   public static final String DATE_FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
/*     */   
/*     */   public static final String DATE_FORMAT_YYYY_MM_DD_HH_MM_SS_SSS_NOT_LINE = "yyyy-MM-dd HH:mm:ss.SSS";
/*     */   
/*     */   public static final String DATE_FORMAT_YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
/*     */   
/*     */   public static final String DATE_FORMAT_YYYY_MM_DD_HH_MM_SS_NOT_LINE = "yyyyMMddHHmmss";
/*     */   
/*     */ 
/*     */   public static String format(Date date)
/*     */   {
/*  45 */     return format(date, "yyyyMMddHHmmss");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String format(Date date, String pattern)
/*     */   {
/*  56 */     SimpleDateFormat smf = new SimpleDateFormat(pattern);
/*  57 */     return smf.format(date);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Date parse(String dateStr, String pattern)
/*     */   {
/*     */     try
/*     */     {
/*  67 */       SimpleDateFormat smf = new SimpleDateFormat(pattern);
/*  68 */       return smf.parse(dateStr);
/*     */     }
/*     */     catch (Throwable $ex)
/*     */     {
/*  65 */       throw $ex;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Date parse(String dateStr)
/*     */   {
/*  77 */     return parse(dateStr, "yyyy-MM-dd");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean before(String time1, String time2)
/*     */   {
/*  88 */     Date dateTime1 = parse(time1);
/*  89 */     Date dateTime2 = parse(time2);
/*  90 */     return dateTime1.before(dateTime2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int minus(String time1, String time2)
/*     */   {
/* 101 */     Date datetime1 = parse(time1);
/* 102 */     Date datetime2 = parse(time2);
/* 103 */     long millisecond = datetime1.getTime() - datetime2.getTime();
/* 104 */     return Integer.parseInt(String.valueOf(millisecond / 1000L));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String getDateHour(String datetime)
/*     */   {
/* 114 */     String date = datetime.split(" ")[0];
/* 115 */     String hourMinuteSecond = datetime.split(" ")[1];
/* 116 */     String hour = hourMinuteSecond.split(":")[0];
/* 117 */     return date + "_" + hour;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String getTodayDate()
/*     */   {
/* 126 */     return format(new Date());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Date getYesterdayDate(Date now)
/*     */   {
/* 136 */     Calendar cal = Calendar.getInstance();
/* 137 */     cal.setTime(now);
/* 138 */     cal.add(6, -1);
/* 139 */     return cal.getTime();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Date getPreMonDate(Date now)
/*     */   {
/* 150 */     Calendar cal = Calendar.getInstance();
/* 151 */     cal.setTime(now);
/* 152 */     cal.add(2, -1);
/* 153 */     return cal.getTime();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Date getPreYearDate(Date now)
/*     */   {
/* 163 */     Calendar cal = Calendar.getInstance();
/* 164 */     cal.setTime(now);
/* 165 */     cal.add(1, -1);
/* 166 */     return cal.getTime();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int getMaxDaysOfMonth(Date date)
/*     */   {
/* 176 */     Calendar calendar = Calendar.getInstance();
/* 177 */     calendar.setTime(date);
/* 178 */     return calendar.getActualMaximum(5);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String getNowYear()
/*     */   {
/* 187 */     Calendar cal = Calendar.getInstance();
/* 188 */     return String.valueOf(cal.get(1));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String getLastYear(Date date)
/*     */   {
/* 198 */     Calendar cal = Calendar.getInstance();
/* 199 */     cal.setTime(date);
/* 200 */     cal.add(1, -1);
/* 201 */     return String.valueOf(cal.get(1));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static ArrayList<String> getEveryMonthEndDate(String nowDate)
/*     */   {
/* 211 */     ArrayList<String> monthEndDateList = new ArrayList();
/* 212 */     monthEndDateList.add(format(parse(nowDate, "yyyy-MM-dd HH:mm:ss"), "yyyyMMddHHmmss"));
/*     */     
/* 214 */     Date date = parse(nowDate);
/* 215 */     Calendar calendar = Calendar.getInstance();
/* 216 */     calendar.setTime(date);
/*     */     
/* 218 */     int num = calendar.get(2);
/* 219 */     for (int i = 0; i < num; i++) {
/* 220 */       calendar.set(5, 1);
/* 221 */       calendar.add(5, -1);
/* 222 */       monthEndDateList.add(format(calendar.getTime(), "yyyyMMdd") + "245959");
/*     */     }
/* 224 */     return monthEndDateList;
/*     */   }
/*     */   
/*     */   public static String getThisMonthStr() {
/* 228 */     return format(new Date(), "yyyyMM");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String getBeforeTime(String minutes)
/*     */   {
/* 236 */     int i = Integer.parseInt("-" + minutes);
/* 237 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
/* 238 */     Calendar beforeTime = Calendar.getInstance();
/* 239 */     beforeTime.add(12, i);
/* 240 */     Date beforeD = beforeTime.getTime();
/* 241 */     String time = sdf.format(beforeD);
/* 242 */     return time;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static Date getBeforeDate(String minutes)
/*     */   {
/* 252 */     int i = Integer.parseInt("-" + minutes);
/* 253 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
/* 254 */     Calendar beforeTime = Calendar.getInstance();
/* 255 */     beforeTime.add(12, i);
/* 256 */     Date before = beforeTime.getTime();
/* 257 */     String time = sdf.format(before);
/* 258 */     Date parse = parse(time, "yyyy-MM-dd HH:mm");
/* 259 */     return parse;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String getTimeFormat(long time)
/*     */   {
/* 269 */     Calendar calendar = Calendar.getInstance();
/* 270 */     calendar.setTimeInMillis(time);
/* 271 */     int year = calendar.get(1);
/* 272 */     int month = calendar.get(2) + 1;
/* 273 */     String monthStr = addZero(month);
/* 274 */     int day = calendar.get(5);
/* 275 */     String dayStr = addZero(day);
/* 276 */     int hour = calendar.get(11);
/* 277 */     String hourStr = addZero(hour);
/* 278 */     int minute = calendar.get(12);
/* 279 */     String minuteStr = addZero(minute);
/* 280 */     int second = calendar.get(13);
/* 281 */     String secondStr = addZero(second);
/* 282 */     return year + "-" + monthStr + "-" + dayStr + " " + hourStr + ":" + minuteStr + ":" + secondStr;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static String addZero(int param)
/*     */   {
/* 293 */     String paramStr = "" + param;
/* 294 */     return paramStr;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String nowTimeStr()
/*     */   {
/* 303 */     return format(new Date(), "yyyyMMddHHmmss");
/*     */   }
/*     */   
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 309 */     String minutes = "5";
/* 310 */     int i = Integer.parseInt("-" + minutes);
/* 311 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
/* 312 */     Calendar beforeTime = Calendar.getInstance();
/* 313 */     beforeTime.add(12, i);
/* 314 */     Date before = beforeTime.getTime();
/* 315 */     String time = sdf.format(before);
/* 316 */     System.out.println(time);
/* 317 */     Date parse = parse(time, "yyyy-MM-dd HH:mm");
/* 318 */     System.out.println(parse);
/*     */   }
/*     */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\common\utils\DateUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */