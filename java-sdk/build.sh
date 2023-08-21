export LD_LIBRARY_PATH=/home/qianyy/java-tugraph-db/3rd/tugraph-db/build/output:${LD_LIBRARY_PATH}
export LD_LIBRARY_PATH=/usr/lib/jvm/java-1.8.0-openjdk/jre/lib/amd64/server:${LD_LIBRARY_PATH}
export LD_LIBRARY_PATH=/usr/lib/jvm/java-1.8.0-openjdk/jre/lib/amd64:${LD_LIBRARY_PATH}
export LD_LIBRARY_PATH=/lib64:${LD_LIBRARY_PATH}

# 生成JNI代码
mvn clean package

# hack一下生成的JNI代码，因为fastffi的特性并不能完全覆盖C++语法，需要手动调整部分地方
python3 hack.py

# 编译 liblgraph-javasdk.so，这里和编译tugraph基本上是一模一样，只是把生成的jni_*.cc包括到tugraph的cmake文件中
cd ../3rd/tugraph-db
deps/build_deps.sh
mkdir build
cd build
pwd
cmake .. -DOURSYSTEM=centos -DENABLE_PREDOWNLOAD_DEPENDS_PACKAGE=1
make -j4

cp ./output/liblgraph4jni.so ../../..
cd -