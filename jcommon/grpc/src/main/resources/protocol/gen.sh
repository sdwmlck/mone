#PATH_TO_PLUGIN=/Users/zhangzhiyong/programs/protobuf/bin/protoc-gen-grpc-java-1.34.1-osx-x86_64
PATH_TO_PLUGIN=/Users/zzy/program/protobuf/bin/protoc-gen-grpc-java-1.34.1-osx-x86_64
protoc --plugin=protoc-gen-grpc-java=$PATH_TO_PLUGIN  --java_out=../../java/ --grpc-java_out=../../java/  sidecar.proto