// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/vmess/inbound/config.proto

package com.v2ray.core.proxy.vmess.inbound;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_vmess_inbound_DetourConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_vmess_inbound_DetourConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_vmess_inbound_DefaultConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_vmess_inbound_DefaultConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_vmess_inbound_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_vmess_inbound_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n/v2ray.com/core/proxy/vmess/inbound/con" +
      "fig.proto\022\036v2ray.core.proxy.vmess.inboun" +
      "d\032)v2ray.com/core/common/protocol/user.p" +
      "roto\"\032\n\014DetourConfig\022\n\n\002to\030\001 \001(\t\"0\n\rDefa" +
      "ultConfig\022\020\n\010alter_id\030\001 \001(\r\022\r\n\005level\030\002 \001" +
      "(\r\"\326\001\n\006Config\022.\n\004user\030\001 \003(\0132 .v2ray.core" +
      ".common.protocol.User\022>\n\007default\030\002 \001(\0132-" +
      ".v2ray.core.proxy.vmess.inbound.DefaultC" +
      "onfig\022<\n\006detour\030\003 \001(\0132,.v2ray.core.proxy" +
      ".vmess.inbound.DetourConfig\022\036\n\026secure_en" +
      "cryption_only\030\004 \001(\010BP\n\"com.v2ray.core.pr" +
      "oxy.vmess.inboundP\001Z\007inbound\252\002\036V2Ray.Cor" +
      "e.Proxy.Vmess.Inboundb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.protocol.UserOuterClass.getDescriptor(),
        }, assigner);
    internal_static_v2ray_core_proxy_vmess_inbound_DetourConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_proxy_vmess_inbound_DetourConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_vmess_inbound_DetourConfig_descriptor,
        new String[] { "To", });
    internal_static_v2ray_core_proxy_vmess_inbound_DefaultConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_proxy_vmess_inbound_DefaultConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_vmess_inbound_DefaultConfig_descriptor,
        new String[] { "AlterId", "Level", });
    internal_static_v2ray_core_proxy_vmess_inbound_Config_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v2ray_core_proxy_vmess_inbound_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_vmess_inbound_Config_descriptor,
        new String[] { "User", "Default", "Detour", "SecureEncryptionOnly", });
    com.v2ray.core.common.protocol.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
