### Gradle练习项目

该项目用于巩固和掌握Gradle的相关知识，版本7.6。



#### buildSrc

写了一个`convention plugin`，这部分涉及到插件开发，在`Developing Gradle Plugins`中有提到，即`Precompiled script plugins`相关知识。



还有一个自定义的task：`BuildInfo`。用于实验文档中的例子。`Declaring Dependencies between Subprojects`。



#### consumer和producer

`buildSrc`中的`buildInfo`就是给这2个例子使用的。可以分别看看代码，体会java中的程序classpath设置。



#### entity

使用了java-library插件，并且提供了发布到本地maven仓库的代码。

使用了由pluginDemo提供的自定义插件。



#### includedBuildLibs

用于掌握复合构建相关知识，在父工程的`settings.gradle`中用的是`includedBuild`。

includedBuild进来的项目，可以使用它的task。并且如果有模块依赖的话，会替换为项目依赖。



#### jdk17Test

实验了toolChain功能，toolChain设置后会用于编译、测试、javadoc。



#### pluginDemo

在这个项目编写插件并且发布到maven本地仓库。



#### services

用来掌握settings.gradle中的`include`语句，它会创建对应的工程。



#### stream-demo

使用了`application`插件，并且使用了构建镜像的插件。



#### taskDemo

在该项目验证了一些task编写。



#### web-app

是一个springboot项目，并且编写了测试用例。