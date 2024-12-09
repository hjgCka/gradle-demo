FROM openjdk:8u312-oracle
MAINTAINER hjg<computer_cka@163.com>

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo 'Asia/Shanghai' >/etc/timezone

WORKDIR /opt/app
# 这个jarName变量相当于进行了一次声明，其值由插件进行赋值
# 在使用前，必须进行声明
#ARG jarName
#COPY ${jarName} app.jar
COPY app.jar ./

EXPOSE 8088

#生产环境需要设置这2个环境变量
ENV JVM_OPTS -server -Djava.security.egd=file:/dev/./urandom
ENV ARGS --spring.profiles.active=dev

ENTRYPOINT java $JVM_OPTS -jar /opt/app/app.jar $ARGS
