# java-tugraph-db
java sdk for tugraph-db built with FastFFI

## 运行
```shell
# 拉取代码
git clone https://github.com/yangyang233333/java-tugraph-db.git
git clone https://github.com/yangyang233333/tugraph-db.git  # 放到3rd中

# 拉取镜像
用tugraph的tugraph/tugraph-compile-centos7:latest镜像即可

# 启动镜像
docker run -it --name build-env -v {你克隆的代码目录}:/home/qianyy/java-tugraph-db tugraph/tugraph-compile-centos7 /bin/bash

# 进入到容器的/home/qianyy/java-tugraph-db/java-sdk目录，然后运行下面的命令
bash ./build.sh # 生成jni以及编译出libtugraphjni.so
bash ./run_test.sh # 运行单元测试

```
