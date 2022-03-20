#编辑记录
## update 2022-03-21
2022-03-21 03:06
vue实现增删改查+使用路由

注意：导入vuex需要使用如下命令
npm i vuex@3.6.2 -S

## update 2022-03-20
2022-03-20 19:54
vue实现crud
## update 2022-03-20
2022-03-20 01:09
实现前端分页展示
### 修改默认启动ip地址，防止0.0.0.0:8080导致无数据的问题
在vue.config.js中，加入如下代码：
```js
devServer:{
host:'127.0.0.1',
port:8080
}
```
以上实现了vue run serve 从127.0.0.1:8080中打开

## update 2022-03-19
2022-03-19 19:48
vue页面主题布局完善，在前端基本实现了curd的button布局、侧边栏缩放和页面布局
2022-03-19 20:37
后端代码基础框架搭建，完成springboot+maven基本运行环境

#服务调试
### springboot_vue_test

## Project setup
#### cd 进入项目文件夹，使用如下命令
```
npm install
```

#### 安装完后使用如下命令开启前端网页
```
npm run serve
```

### 打包
```
npm run build
```

###后端调试：
导入maven项目，刷新、clean、install，等待安装所有依赖即可

#### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).

