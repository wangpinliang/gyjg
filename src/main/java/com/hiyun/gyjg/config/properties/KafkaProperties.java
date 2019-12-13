/*    */ package com.hiyun.gyjg.config.properties;
/*    */ 
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.boot.context.properties.ConfigurationProperties;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Component
/*    */ @ConfigurationProperties(prefix="kafka")
/*    */ public class KafkaProperties
/*    */ {
/* 17 */   private static final Logger log = LoggerFactory.getLogger(KafkaProperties.class);
/* 18 */   public void setServers(List<String> servers) { this.servers = servers; } public void setGroupId(String groupId) { this.groupId = groupId; } public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof KafkaProperties)) return false; KafkaProperties other = (KafkaProperties)o; if (!other.canEqual(this)) return false; Object this$servers = getServers();Object other$servers = other.getServers(); if (this$servers == null ? other$servers != null : !this$servers.equals(other$servers)) return false; Object this$groupId = getGroupId();Object other$groupId = other.getGroupId();return this$groupId == null ? other$groupId == null : this$groupId.equals(other$groupId); } protected boolean canEqual(Object other) { return other instanceof KafkaProperties; } public int hashCode() { int PRIME = 59;int result = 1;Object $servers = getServers();result = result * 59 + ($servers == null ? 43 : $servers.hashCode());Object $groupId = getGroupId();result = result * 59 + ($groupId == null ? 43 : $groupId.hashCode());return result; } public String toString() { return "KafkaProperties(servers=" + getServers() + ", groupId=" + getGroupId() + ")"; }
/*    */   
/*    */ 
/*    */   private List<String> servers;
/*    */   
/*    */   private String groupId;
/*    */   public List<String> getServers()
/*    */   {
/* 26 */     return this.servers;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 31 */   public String getGroupId() { return this.groupId; }
/*    */   
/*    */   @PostConstruct
/*    */   public void postConstruct() {
/* 35 */     log.info("Config kafka servers: {}", this.servers);
/* 36 */     log.info("Config kafka group id: {}", this.groupId);
/*    */   }
/*    */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\config\properties\KafkaProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */