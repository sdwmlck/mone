// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.xiaomi.mone.grpc.demo;

public final class Service {
  private Service() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xiaomi_mone_grpc_demo_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_xiaomi_mone_grpc_demo_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xiaomi_mone_grpc_demo_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_xiaomi_mone_grpc_demo_HelloResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xiaomi_mone_grpc_demo_MeshAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_xiaomi_mone_grpc_demo_MeshAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xiaomi_mone_grpc_demo_PushMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_xiaomi_mone_grpc_demo_PushMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\031com.xiaomi.mone.grpc.de" +
      "mo\"3\n\014HelloRequest\022\021\n\tfirstName\030\001 \001(\t\022\020\n" +
      "\010lastName\030\002 \001(\t\"!\n\rHelloResponse\022\020\n\010gree" +
      "ting\030\001 \001(\t\"\'\n\013MeshAddress\022\n\n\002ip\030\001 \001(\t\022\014\n" +
      "\004port\030\002 \001(\005\"\341\001\n\017GrpcMeshRequest\022\023\n\013servi" +
      "ceName\030\001 \001(\t\022\022\n\nmethodName\030\002 \001(\t\022\022\n\npara" +
      "mTypes\030\003 \003(\t\022\016\n\006params\030\004 \003(\t\022\r\n\005group\030\005 " +
      "\001(\t\022\017\n\007version\030\006 \001(\t\0227\n\007address\030\007 \001(\0132&." +
      "com.xiaomi.mone.grpc.demo.MeshAddress\022\n\n" +
      "\002id\030\010 \001(\t\022\013\n\003app\030\t \001(\t\022\017\n\007timeout\030\n \001(\003\"" +
      "?\n\020GrpcMeshResponse\022\014\n\004code\030\001 \001(\005\022\017\n\007mes" +
      "sage\030\002 \001(\t\022\014\n\004data\030\003 \001(\t\"6\n\007PushMsg\022\014\n\004c" +
      "ode\030\001 \001(\005\022\017\n\007message\030\002 \001(\t\022\014\n\004data\030\003 \001(\t" +
      "2\312\001\n\013MeshService\022_\n\004call\022*.com.xiaomi.mo" +
      "ne.grpc.demo.GrpcMeshRequest\032+.com.xiaom" +
      "i.mone.grpc.demo.GrpcMeshResponse\022Z\n\006lis" +
      "ten\022*.com.xiaomi.mone.grpc.demo.GrpcMesh" +
      "Request\032\".com.xiaomi.mone.grpc.demo.Push" +
      "Msg0\0012j\n\014HelloService\022Z\n\005hello\022\'.com.xia" +
      "omi.mone.grpc.demo.HelloRequest\032(.com.xi" +
      "aomi.mone.grpc.demo.HelloResponseB\002P\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_xiaomi_mone_grpc_demo_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_xiaomi_mone_grpc_demo_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_xiaomi_mone_grpc_demo_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_com_xiaomi_mone_grpc_demo_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_xiaomi_mone_grpc_demo_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_xiaomi_mone_grpc_demo_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_com_xiaomi_mone_grpc_demo_MeshAddress_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_xiaomi_mone_grpc_demo_MeshAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_xiaomi_mone_grpc_demo_MeshAddress_descriptor,
        new java.lang.String[] { "Ip", "Port", });
    internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshRequest_descriptor,
        new java.lang.String[] { "ServiceName", "MethodName", "ParamTypes", "Params", "Group", "Version", "Address", "Id", "App", "Timeout", });
    internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_xiaomi_mone_grpc_demo_GrpcMeshResponse_descriptor,
        new java.lang.String[] { "Code", "Message", "Data", });
    internal_static_com_xiaomi_mone_grpc_demo_PushMsg_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_xiaomi_mone_grpc_demo_PushMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_xiaomi_mone_grpc_demo_PushMsg_descriptor,
        new java.lang.String[] { "Code", "Message", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
