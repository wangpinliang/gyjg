/*    */ package com.hiyun.gyjg.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SubscribeInfo
/*    */   implements Serializable
/*    */ {
/*    */   private String subscribeId;
/*    */   private String title;
/*    */   
/* 15 */   public void setSubscribeId(String subscribeId) { this.subscribeId = subscribeId; } public void setTitle(String title) { this.title = title; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof SubscribeInfo)) return false; SubscribeInfo other = (SubscribeInfo)o; if (!other.canEqual(this)) return false; Object this$subscribeId = getSubscribeId();Object other$subscribeId = other.getSubscribeId(); if (this$subscribeId == null ? other$subscribeId != null : !this$subscribeId.equals(other$subscribeId)) return false; Object this$title = getTitle();Object other$title = other.getTitle();return this$title == null ? other$title == null : this$title.equals(other$title); } protected boolean canEqual(Object other) { return other instanceof SubscribeInfo; } public int hashCode() { int PRIME = 59;int result = 1;Object $subscribeId = getSubscribeId();result = result * 59 + ($subscribeId == null ? 43 : $subscribeId.hashCode());Object $title = getTitle();result = result * 59 + ($title == null ? 43 : $title.hashCode());return result; } public String toString() { return "SubscribeInfo(subscribeId=" + getSubscribeId() + ", title=" + getTitle() + ")"; }
/*    */   
/* 17 */   public SubscribeInfo(String subscribeId, String title) { this.subscribeId = subscribeId;this.title = title;
/*    */   }
/*    */   
/*    */ 
/*    */   public String getSubscribeId()
/*    */   {
/* 23 */     return this.subscribeId;
/*    */   }
/*    */   
/*    */   public String getTitle()
/*    */   {
/* 28 */     return this.title;
/*    */   }
/*    */   
/*    */   public SubscribeInfo() {}
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\entity\SubscribeInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */