# java-tugraph-db
java sdk for tugraph-db built with FastFFI

## 运行
```shell
# 拉取代码
git clone --recursive xx.git

# 拉取镜像
docker pull tugraph/tugraph-compile-centos7:latest

# 启动镜像
docker run -it --name build-env -v {你克隆的代码所在的目录, 例如/home/xxx/java-tugraph-db}:/java-tugraph-db tugraph/tugraph-compile-centos7 /bin/bash

# Build
cd /java-tugraph-db/java-sdk
bash ./build.sh # 生成jni以及编译出libtugraphjni.so
bash ./run_test.sh # 运行单元测试

```
