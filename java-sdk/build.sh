export LD_LIBRARY_PATH=/home/qianyy/java-tugraph-db/3rd/tugraph-db/build/output:${LD_LIBRARY_PATH}
export LD_LIBRARY_PATH=/usr/lib/jvm/java-1.8.0-openjdk/jre/lib/amd64/server:${LD_LIBRARY_PATH}
export LD_LIBRARY_PATH=/usr/lib/jvm/java-1.8.0-openjdk/jre/lib/amd64:${LD_LIBRARY_PATH}
export LD_LIBRARY_PATH=/lib64:${LD_LIBRARY_PATH}

echo "code gen"
mvn clean package

# # 临时hack一下，最佳选择是修改c.h，将struct的定义放在c.h
# python3 hack.py

# # 编译 liblgraph-javasdk.so
cd ../3rd/tugraph-db
# deps/build_deps.sh
# mkdir build
cd build
pwd
cmake .. -DOURSYSTEM=centos -DENABLE_PREDOWNLOAD_DEPENDS_PACKAGE=1
make -j4
cd -