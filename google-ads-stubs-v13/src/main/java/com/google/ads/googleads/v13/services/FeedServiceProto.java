// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/feed_service.proto

package com.google.ads.googleads.v13.services;

public final class FeedServiceProto {
  private FeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateFeedsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_FeedOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_FeedOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateFeedsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateFeedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateFeedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v13/services/feed" +
      "_service.proto\022!google.ads.googleads.v13" +
      ".services\032:google/ads/googleads/v13/enum" +
      "s/response_content_type.proto\032-google/ad" +
      "s/googleads/v13/resources/feed.proto\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032 google/" +
      "protobuf/field_mask.proto\032\027google/rpc/st" +
      "atus.proto\"\225\002\n\022MutateFeedsRequest\022\030\n\013cus" +
      "tomer_id\030\001 \001(\tB\003\340A\002\022I\n\noperations\030\002 \003(\0132" +
      "0.google.ads.googleads.v13.services.Feed" +
      "OperationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022" +
      "\025\n\rvalidate_only\030\004 \001(\010\022j\n\025response_conte" +
      "nt_type\030\005 \001(\0162K.google.ads.googleads.v13" +
      ".enums.ResponseContentTypeEnum.ResponseC" +
      "ontentType\"\373\001\n\rFeedOperation\022/\n\013update_m" +
      "ask\030\004 \001(\0132\032.google.protobuf.FieldMask\022:\n" +
      "\006create\030\001 \001(\0132(.google.ads.googleads.v13" +
      ".resources.FeedH\000\022:\n\006update\030\002 \001(\0132(.goog" +
      "le.ads.googleads.v13.resources.FeedH\000\0224\n" +
      "\006remove\030\003 \001(\tB\"\372A\037\n\035googleads.googleapis" +
      ".com/FeedH\000B\013\n\toperation\"\216\001\n\023MutateFeeds" +
      "Response\0221\n\025partial_failure_error\030\003 \001(\0132" +
      "\022.google.rpc.Status\022D\n\007results\030\002 \003(\01323.g" +
      "oogle.ads.googleads.v13.services.MutateF" +
      "eedResult\"\205\001\n\020MutateFeedResult\0229\n\rresour" +
      "ce_name\030\001 \001(\tB\"\372A\037\n\035googleads.googleapis" +
      ".com/Feed\0226\n\004feed\030\002 \001(\0132(.google.ads.goo" +
      "gleads.v13.resources.Feed2\244\002\n\013FeedServic" +
      "e\022\315\001\n\013MutateFeeds\0225.google.ads.googleads" +
      ".v13.services.MutateFeedsRequest\0326.googl" +
      "e.ads.googleads.v13.services.MutateFeeds" +
      "Response\"O\202\323\344\223\0020\"+/v13/customers/{custom" +
      "er_id=*}/feeds:mutate:\001*\332A\026customer_id,o" +
      "perations\032E\312A\030googleads.googleapis.com\322A" +
      "\'https://www.googleapis.com/auth/adwords" +
      "B\374\001\n%com.google.ads.googleads.v13.servic" +
      "esB\020FeedServiceProtoP\001ZIgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v13/" +
      "services;services\242\002\003GAA\252\002!Google.Ads.Goo" +
      "gleAds.V13.Services\312\002!Google\\Ads\\GoogleA" +
      "ds\\V13\\Services\352\002%Google::Ads::GoogleAds" +
      "::V13::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.resources.FeedProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_MutateFeedsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_MutateFeedsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateFeedsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v13_services_FeedOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_FeedOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_FeedOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v13_services_MutateFeedsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_MutateFeedsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateFeedsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v13_services_MutateFeedResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_MutateFeedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateFeedResult_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v13.resources.FeedProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
