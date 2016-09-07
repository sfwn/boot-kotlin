# API 接口文档

## 1. 用户注册

`POST: http://ip:port/api/users/register`

params:

|name|type|describe|
|:--|:--:|--:|
|mobile|String|用于登录的手机号(唯一)|
|email|String|用于登录的邮箱(唯一)|
|nick|String|昵称(可以重复)|
|password|String|密码|

```json
{
  "mobile": "18312345678",
  "email": "sfwnlin@gmail.com",
  "nick": "sfwn",
  "password": "mypass"
}
```

