# brave-dubbo-demo
基于zipkin、brave的追踪系统使用demo

# 使用步骤
## 1. 添加pom
```xml
        <dependency>
            <groupId>io.zipkin.brave</groupId>
            <artifactId>brave-dubbo</artifactId>
            <version>1.0.0-SNAPSHOT</version>
        </dependency>
```

## 2. 配置brave-dubbo.xml文件
```xml
     <bean id="brave" class="com.github.kristofa.brave.dubbo.BraveFactoryBean" p:serviceName="provider" p:spanCollector-ref="httpSpanCollector" />
     <bean id="defaultSpanNameProvider" class="com.github.kristofa.brave.dubbo.support.DefaultSpanNameProvider" />
     <bean id="dubboStringServiceNameProvider" class="com.github.kristofa.brave.dubbo.support.DefaultServerNameProvider" />

     <bean id="httpSpanCollector" class="com.github.kristofa.brave.http.HttpSpanCollector" factory-method="create">
          <constructor-arg type="java.lang.String" value="http://10.168.16.111:9411/" />
          <constructor-arg type="com.github.kristofa.brave.SpanCollectorMetricsHandler" ref="testMetricsHander" />
     </bean>

     <bean id="testMetricsHander" class="com.github.kristofa.brave.EmptySpanCollectorMetricsHandler" />
```
## 3. 修改上述配置中的zipkin服务器ip地址
      如果不想使用http，仅想打印日志，仅需修改,BraveFactoryBean默认为日志trace
```xml
<bean id="brave" class="com.github.kristofa.brave.dubbo.BraveFactoryBean" p:serviceName="provider"/>
```

## 4.安装运行zipkin服务器
    安装过程略
```bash
    nohup java -jar  zipkin-*.jar  &
```

## 参考
https://github.com/jackcooper2015/brave-dubbo

# brave-dubbo-demo
