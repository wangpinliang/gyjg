/*     */ package com.hiyun.gyjg.config;
/*     */ 
/*     */ import com.google.common.collect.Maps;
/*     */ import com.hiynn.gyjg.config.properties.KafkaProperties;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Resource;
/*     */ import org.apache.kafka.common.serialization.StringDeserializer;
/*     */ import org.apache.kafka.common.serialization.StringSerializer;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.context.annotation.Bean;
/*     */ import org.springframework.context.annotation.Configuration;
/*     */ import org.springframework.kafka.annotation.EnableKafka;
/*     */ import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
/*     */ import org.springframework.kafka.config.KafkaListenerContainerFactory;
/*     */ import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
/*     */ import org.springframework.kafka.core.DefaultKafkaProducerFactory;
/*     */ import org.springframework.kafka.core.KafkaTemplate;
/*     */ import org.springframework.kafka.core.ProducerFactory;
/*     */ import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
/*     */ import org.springframework.kafka.listener.ContainerProperties;
/*     */ 
/*     */ @EnableKafka
/*     */ @Configuration
/*     */ public class KafkaConfigure
/*     */ {
/*  27 */   private static final Logger log = LoggerFactory.getLogger(KafkaConfigure.class);
/*     */   
/*     */ 
/*     */ 
/*     */   @Resource
/*     */   private KafkaProperties kafkaProperties;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @Bean
/*     */   public org.springframework.kafka.core.ConsumerFactory<String, String> consumerFactory()
/*     */   {
/*  40 */     return new DefaultKafkaConsumerFactory(consumerProps());
/*     */   }
/*     */   
/*     */   @Bean({"batchContainerFactory"})
/*     */   public ConcurrentKafkaListenerContainerFactory listenerContainer()
/*     */   {
/*  46 */     ConcurrentKafkaListenerContainerFactory container = new ConcurrentKafkaListenerContainerFactory();
/*  47 */     container.setConsumerFactory(new DefaultKafkaConsumerFactory(consumerProps()));
/*     */     
/*  49 */     container.setConcurrency(Integer.valueOf(5));
/*     */     
/*  51 */     container.setBatchListener(Boolean.valueOf(true));
/*  52 */     return container;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Map<String, Object> consumerProps()
/*     */   {
/*  61 */     Map<String, Object> props = Maps.newHashMap();
/*  62 */     props.put("bootstrap.servers", this.kafkaProperties.getServers());
/*     */     
/*  64 */     props.put("group.id", this.kafkaProperties.getGroupId());
/*     */     
/*  66 */     props.put("enable.auto.commit", Boolean.valueOf(true));
/*     */     
/*  68 */     props.put("auto.commit.interval.ms", "100");
/*     */     
/*  70 */     props.put("session.timeout.ms", "15000");
/*     */     
/*     */ 
/*     */ 
/*  74 */     props.put("max.poll.records", Integer.valueOf(60));
/*     */     
/*  76 */     props.put("key.deserializer", StringDeserializer.class);
/*     */     
/*  78 */     props.put("value.deserializer", StringDeserializer.class);
/*  79 */     return props;
/*     */   }
/*     */   
/*     */   @Bean
/*     */   public KafkaTemplate<String, String> kafkaTemplate() {
/*  84 */     return new KafkaTemplate(producerFactory());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @Bean
/*     */   public ProducerFactory<String, String> producerFactory()
/*     */   {
/*  93 */     return new DefaultKafkaProducerFactory(producerProps());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private Map<String, Object> producerProps()
/*     */   {
/* 102 */     Map<String, Object> props = Maps.newHashMap();
/*     */     
/* 104 */     props.put("bootstrap.servers", this.kafkaProperties.getServers());
/*     */     
/* 106 */     props.put("retries", Integer.valueOf(0));
/*     */     
/* 108 */     props.put("batch.size", Integer.valueOf(16384));
/*     */     
/* 110 */     props.put("linger.ms", Integer.valueOf(1));
/*     */     
/* 112 */     props.put("buffer.memory", Integer.valueOf(1024000));
/*     */     
/* 114 */     props.put("key.serializer", StringSerializer.class);
/*     */     
/* 116 */     props.put("value.serializer", StringSerializer.class);
/* 117 */     return props;
/*     */   }
/*     */   
/*     */   @Bean
/*     */   public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory()
/*     */   {
/* 123 */     ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory();
/*     */     
/* 125 */     factory.setConsumerFactory(consumerFactory());
/* 126 */     factory.setConcurrency(Integer.valueOf(3));
/* 127 */     factory.getContainerProperties().setPollTimeout(3000L);
/* 128 */     factory.setBatchListener(Boolean.valueOf(true));
/* 129 */     return factory;
/*     */   }
/*     */ }


/* Location:              E:\thinkDES\gyjg(10).jar!\BOOT-INF\classes\com\hiynn\gyjg\config\KafkaConfigure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */