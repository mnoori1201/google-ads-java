// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/value.proto

package com.google.ads.googleads.v13.common;

public final class ValueProto {
  private ValueProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_Value_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/ads/googleads/v13/common/value." +
      "proto\022\037google.ads.googleads.v13.common\"\207" +
      "\001\n\005Value\022\027\n\rboolean_value\030\001 \001(\010H\000\022\025\n\013int" +
      "64_value\030\002 \001(\003H\000\022\025\n\013float_value\030\003 \001(\002H\000\022" +
      "\026\n\014double_value\030\004 \001(\001H\000\022\026\n\014string_value\030" +
      "\005 \001(\tH\000B\007\n\005valueB\352\001\n#com.google.ads.goog" +
      "leads.v13.commonB\nValueProtoP\001ZEgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v13/common;common\242\002\003GAA\252\002\037Google.Ads" +
      ".GoogleAds.V13.Common\312\002\037Google\\Ads\\Googl" +
      "eAds\\V13\\Common\352\002#Google::Ads::GoogleAds" +
      "::V13::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v13_common_Value_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_common_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_Value_descriptor,
        new java.lang.String[] { "BooleanValue", "Int64Value", "FloatValue", "DoubleValue", "StringValue", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
