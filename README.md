ps:后面重新改写了一下这个项目，优化了代码结构，从MVC重构成MVP模式

> 我只是一个传送门：https://github.com/122627018/TeachingOffice2

前言
====================
这个项目是受到超级课程表的启发，想搞懂他为什么能获取到我们自己学校的校园网成绩和其他信息，于是就踏上了网页爬虫这条不归路
ps：因为这个项目是很久之前写的，最近在忙着为之前自己写过的一些小项目写文档，所以可能写的比较马虎。
项目功能
==================
 1. 实现对学校正方系统进行模拟登录
 2. 通过登录获取学生个人信息，成绩，课表等等
 3. 模拟图书馆登录，获取书本借阅情况，归还情况等
 4. 实现馆藏搜索
 
截图
=======================
![这里写图片描述](http://img.blog.csdn.net/20160617081320960)![这里写图片描述](http://img.blog.csdn.net/20160617081331523)![这里写图片描述](http://img.blog.csdn.net/20160617081344211)![这里写图片描述](http://img.blog.csdn.net/20160617081353539)![这里写图片描述](http://img.blog.csdn.net/20160617081402711)![这里写图片描述](http://img.blog.csdn.net/20160617081411930)![这里写图片描述](http://img.blog.csdn.net/20160617081419024)

涉及原理
=======================
后面我已经在我的blog中专门新建了一个分类讲解关于抓包的知识点，可以传送过去看看：

> 从一个网页到一个APP-前言(一)
> http://blog.csdn.net/qq122627018/article/details/51226552
> 
>  学会分析一个浏览器的行为(二)
>  http://blog.csdn.net/qq122627018/article/details/51469255
>  
>   java中模拟浏览器访问网页(三)
>   http://blog.csdn.net/qq122627018/article/details/51473150
>   
>   Java中解析html代码(四)
>   http://blog.csdn.net/qq122627018/article/details/51473152
>   
>   网页抓包实例---校园助手app
>   http://blog.csdn.net/qq122627018/article/details/51487411

