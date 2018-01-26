# lmhy-dubbo-springboot
> dubbo官方出了[dubbo-spring-boot-starter](https://github.com/dubbo/dubbo-spring-boot-project),个人踩了踩坑，发现几个地方需要改动才能正常运行
1. provider 配置文件application.yml  (consumer类似，均在Spring.dubbo下)
```
server:
  port: 8001
spring:
  application:
    name: lmhy-demo-provider
  dubbo:
    appname: lmhy-demo-provider
    protocol: dubbo
    port: 12345
    registry: zookeeper://127.0.0.1:2181
```
2. 启动类需增加注解 `@EnableDubboConfiguration`
3. 相关Service需要spring `@Service`和Dubbo `@Service`两个注解
