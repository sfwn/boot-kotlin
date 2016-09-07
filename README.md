# Boot-Kotlin

## 简介
这是一个用来练手的项目。

## 如何启动
1.`clone`仓库  
2.`$ cd boot-kotlin`  
3.`$ mvn clean package -DskipTests`  
4.`$ cd boot-web/target`  
5.`$ java -jar boot-web-0.1-SNAPSHOT.jar`, 该项目已经在 `localhost:8080` 启动  

## 功能
### 1.注册
- [ ] 发送短信验证手机号
- [ ] 发送邮件验证邮箱
- [ ] 密码加盐后存储
- [ ] 验证码
 
### 2.登录
- [ ] 密码 decode
- [ ] session 保存

### 3.其他
- [ ] RESTful 接口