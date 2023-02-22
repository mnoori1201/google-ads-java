// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/ad_group_asset_set_service.proto

package com.google.ads.googleads.v13.services;

public final class AdGroupAssetSetServiceProto {
  private AdGroupAssetSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v13/services/ad_g" +
      "roup_asset_set_service.proto\022!google.ads" +
      ".googleads.v13.services\032:google/ads/goog" +
      "leads/v13/enums/response_content_type.pr" +
      "oto\032;google/ads/googleads/v13/resources/" +
      "ad_group_asset_set.proto\032\034google/api/ann" +
      "otations.proto\032\027google/api/client.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032\027google/rpc/status.p" +
      "roto\"\253\002\n\035MutateAdGroupAssetSetsRequest\022\030" +
      "\n\013customer_id\030\001 \001(\tB\003\340A\002\022T\n\noperations\030\002" +
      " \003(\0132;.google.ads.googleads.v13.services" +
      ".AdGroupAssetSetOperationB\003\340A\002\022\027\n\017partia" +
      "l_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j" +
      "\n\025response_content_type\030\005 \001(\0162K.google.a" +
      "ds.googleads.v13.enums.ResponseContentTy" +
      "peEnum.ResponseContentType\"\257\001\n\030AdGroupAs" +
      "setSetOperation\022E\n\006create\030\001 \001(\01323.google" +
      ".ads.googleads.v13.resources.AdGroupAsse" +
      "tSetH\000\022?\n\006remove\030\002 \001(\tB-\372A*\n(googleads.g" +
      "oogleapis.com/AdGroupAssetSetH\000B\013\n\topera" +
      "tion\"\244\001\n\036MutateAdGroupAssetSetsResponse\022" +
      "O\n\007results\030\001 \003(\0132>.google.ads.googleads." +
      "v13.services.MutateAdGroupAssetSetResult" +
      "\0221\n\025partial_failure_error\030\002 \001(\0132\022.google" +
      ".rpc.Status\"\264\001\n\033MutateAdGroupAssetSetRes" +
      "ult\022D\n\rresource_name\030\001 \001(\tB-\372A*\n(googlea" +
      "ds.googleapis.com/AdGroupAssetSet\022O\n\022ad_" +
      "group_asset_set\030\002 \001(\01323.google.ads.googl" +
      "eads.v13.resources.AdGroupAssetSet2\333\002\n\026A" +
      "dGroupAssetSetService\022\371\001\n\026MutateAdGroupA" +
      "ssetSets\022@.google.ads.googleads.v13.serv" +
      "ices.MutateAdGroupAssetSetsRequest\032A.goo" +
      "gle.ads.googleads.v13.services.MutateAdG" +
      "roupAssetSetsResponse\"Z\202\323\344\223\002;\"6/v13/cust" +
      "omers/{customer_id=*}/adGroupAssetSets:m" +
      "utate:\001*\332A\026customer_id,operations\032E\312A\030go" +
      "ogleads.googleapis.com\322A\'https://www.goo" +
      "gleapis.com/auth/adwordsB\207\002\n%com.google." +
      "ads.googleads.v13.servicesB\033AdGroupAsset" +
      "SetServiceProtoP\001ZIgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v13/servi" +
      "ces;services\242\002\003GAA\252\002!Google.Ads.GoogleAd" +
      "s.V13.Services\312\002!Google\\Ads\\GoogleAds\\V1" +
      "3\\Services\352\002%Google::Ads::GoogleAds::V13" +
      "::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.resources.AdGroupAssetSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAssetSet", });
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
    com.google.ads.googleads.v13.resources.AdGroupAssetSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
