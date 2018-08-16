# GitDemo
个人学习git的demo

## 2016-07-18 实现多行业，不同文本的解决方案
查看效果图：

<img src="https://github.com/leafseelight/GitDemo/blob/master/project-res/effect-picture.jpg" height="530" width="320" />
<!--
![image](https://github.com/leafseelight/GitDemo/blob/master/project-res/effect-picture.jpg)
-->
主要实现的代码：

``` java
    String languageToLoad = "gg"; // your language,you can define a new locale,default is ""null string
    Locale locale = new Locale(languageToLoad);
    Locale.setDefault(locale);
    Configuration config = new Configuration();
    config.locale = locale;
    getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
```

gg指向value-gg/string.xml

![image](https://github.com/leafseelight/GitDemo/blob/master/project-res/value-string.png)
