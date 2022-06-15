// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/matching_function.proto

package com.google.ads.googleads.v11.common;

public final class MatchingFunctionProto {
  private MatchingFunctionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_MatchingFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_MatchingFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_Operand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_Operand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_Operand_ConstantOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_Operand_ConstantOperand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_Operand_FeedAttributeOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_Operand_FeedAttributeOperand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_Operand_FunctionOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_Operand_FunctionOperand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_Operand_RequestContextOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_Operand_RequestContextOperand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v11/common/matchi" +
      "ng_function.proto\022\037google.ads.googleads." +
      "v11.common\032Cgoogle/ads/googleads/v11/enu" +
      "ms/matching_function_context_type.proto\032" +
      "?google/ads/googleads/v11/enums/matching" +
      "_function_operator.proto\"\260\002\n\020MatchingFun" +
      "ction\022\034\n\017function_string\030\005 \001(\tH\000\210\001\001\022g\n\010o" +
      "perator\030\004 \001(\0162U.google.ads.googleads.v11" +
      ".enums.MatchingFunctionOperatorEnum.Matc" +
      "hingFunctionOperator\022?\n\rleft_operands\030\002 " +
      "\003(\0132(.google.ads.googleads.v11.common.Op" +
      "erand\022@\n\016right_operands\030\003 \003(\0132(.google.a" +
      "ds.googleads.v11.common.OperandB\022\n\020_func" +
      "tion_string\"\201\007\n\007Operand\022T\n\020constant_oper" +
      "and\030\001 \001(\01328.google.ads.googleads.v11.com" +
      "mon.Operand.ConstantOperandH\000\022_\n\026feed_at" +
      "tribute_operand\030\002 \001(\0132=.google.ads.googl" +
      "eads.v11.common.Operand.FeedAttributeOpe" +
      "randH\000\022T\n\020function_operand\030\003 \001(\01328.googl" +
      "e.ads.googleads.v11.common.Operand.Funct" +
      "ionOperandH\000\022a\n\027request_context_operand\030" +
      "\004 \001(\0132>.google.ads.googleads.v11.common." +
      "Operand.RequestContextOperandH\000\032\212\001\n\017Cons" +
      "tantOperand\022\026\n\014string_value\030\005 \001(\tH\000\022\024\n\nl" +
      "ong_value\030\006 \001(\003H\000\022\027\n\rboolean_value\030\007 \001(\010" +
      "H\000\022\026\n\014double_value\030\010 \001(\001H\000B\030\n\026constant_o" +
      "perand_value\032n\n\024FeedAttributeOperand\022\024\n\007" +
      "feed_id\030\003 \001(\003H\000\210\001\001\022\036\n\021feed_attribute_id\030" +
      "\004 \001(\003H\001\210\001\001B\n\n\010_feed_idB\024\n\022_feed_attribut" +
      "e_id\032_\n\017FunctionOperand\022L\n\021matching_func" +
      "tion\030\001 \001(\01321.google.ads.googleads.v11.co" +
      "mmon.MatchingFunction\032\212\001\n\025RequestContext" +
      "Operand\022q\n\014context_type\030\001 \001(\0162[.google.a" +
      "ds.googleads.v11.enums.MatchingFunctionC" +
      "ontextTypeEnum.MatchingFunctionContextTy" +
      "peB\033\n\031function_argument_operandB\365\001\n#com." +
      "google.ads.googleads.v11.commonB\025Matchin" +
      "gFunctionProtoP\001ZEgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v11/common" +
      ";common\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V11" +
      ".Common\312\002\037Google\\Ads\\GoogleAds\\V11\\Commo" +
      "n\352\002#Google::Ads::GoogleAds::V11::Commonb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.MatchingFunctionContextTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.MatchingFunctionOperatorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_common_MatchingFunction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_common_MatchingFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_MatchingFunction_descriptor,
        new java.lang.String[] { "FunctionString", "Operator", "LeftOperands", "RightOperands", "FunctionString", });
    internal_static_google_ads_googleads_v11_common_Operand_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_common_Operand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_Operand_descriptor,
        new java.lang.String[] { "ConstantOperand", "FeedAttributeOperand", "FunctionOperand", "RequestContextOperand", "FunctionArgumentOperand", });
    internal_static_google_ads_googleads_v11_common_Operand_ConstantOperand_descriptor =
      internal_static_google_ads_googleads_v11_common_Operand_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v11_common_Operand_ConstantOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_Operand_ConstantOperand_descriptor,
        new java.lang.String[] { "StringValue", "LongValue", "BooleanValue", "DoubleValue", "ConstantOperandValue", });
    internal_static_google_ads_googleads_v11_common_Operand_FeedAttributeOperand_descriptor =
      internal_static_google_ads_googleads_v11_common_Operand_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v11_common_Operand_FeedAttributeOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_Operand_FeedAttributeOperand_descriptor,
        new java.lang.String[] { "FeedId", "FeedAttributeId", "FeedId", "FeedAttributeId", });
    internal_static_google_ads_googleads_v11_common_Operand_FunctionOperand_descriptor =
      internal_static_google_ads_googleads_v11_common_Operand_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v11_common_Operand_FunctionOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_Operand_FunctionOperand_descriptor,
        new java.lang.String[] { "MatchingFunction", });
    internal_static_google_ads_googleads_v11_common_Operand_RequestContextOperand_descriptor =
      internal_static_google_ads_googleads_v11_common_Operand_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v11_common_Operand_RequestContextOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_Operand_RequestContextOperand_descriptor,
        new java.lang.String[] { "ContextType", });
    com.google.ads.googleads.v11.enums.MatchingFunctionContextTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.MatchingFunctionOperatorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}