# com.nero.springmvc
依赖使用maven引入
[TOC]
## basic-sample1
SpringMVC基本demo（Handler采用继承Controller接口的方式）
## basic-sample2
SpringMVC基本demo（Handler采用@Controller注解的方式）
## handler-mapping-adapter
- SpringMVC演示HandlerMapping和HandlerAdapter的使用
- 演示了控制器handler的多种实现方式，如使用注解@Controller、继承Controller接口等方式
- 演示使用<mvc:annotation-driven />标签，在web.xml修改使用的spring配置文件即可
## view-resolver
演示常用视图解析器的使用
1. UrlBasedViewResolver
1. InternalResourceViewResolver
1. FreeMarkerViewResolver
通过去除相关注释 查看不同视图解析器的效果

## locale1-resolver
演示实现SpringMVC 国际化
>使用 SessionLocaleResolver（更多详情查看com.nero.springmvc.locale1）