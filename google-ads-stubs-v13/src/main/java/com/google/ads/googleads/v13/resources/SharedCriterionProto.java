// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/shared_criterion.proto

package com.google.ads.googleads.v13.resources;

public final class SharedCriterionProto {
  private SharedCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_SharedCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_SharedCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v13/resources/sha" +
      "red_criterion.proto\022\"google.ads.googlead" +
      "s.v13.resources\032.google/ads/googleads/v1" +
      "3/common/criteria.proto\0323google/ads/goog" +
      "leads/v13/enums/criterion_type.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\"\243\007\n\017SharedCriterion\022G\n\r" +
      "resource_name\030\001 \001(\tB0\340A\005\372A*\n(googleads.g" +
      "oogleapis.com/SharedCriterion\022C\n\nshared_" +
      "set\030\n \001(\tB*\340A\005\372A$\n\"googleads.googleapis." +
      "com/SharedSetH\001\210\001\001\022\036\n\014criterion_id\030\013 \001(\003" +
      "B\003\340A\003H\002\210\001\001\022R\n\004type\030\004 \001(\0162?.google.ads.go" +
      "ogleads.v13.enums.CriterionTypeEnum.Crit" +
      "erionTypeB\003\340A\003\022D\n\007keyword\030\003 \001(\0132,.google" +
      ".ads.googleads.v13.common.KeywordInfoB\003\340" +
      "A\005H\000\022O\n\ryoutube_video\030\005 \001(\01321.google.ads" +
      ".googleads.v13.common.YouTubeVideoInfoB\003" +
      "\340A\005H\000\022S\n\017youtube_channel\030\006 \001(\01323.google." +
      "ads.googleads.v13.common.YouTubeChannelI" +
      "nfoB\003\340A\005H\000\022H\n\tplacement\030\007 \001(\0132..google.a" +
      "ds.googleads.v13.common.PlacementInfoB\003\340" +
      "A\005H\000\022Z\n\023mobile_app_category\030\010 \001(\01326.goog" +
      "le.ads.googleads.v13.common.MobileAppCat" +
      "egoryInfoB\003\340A\005H\000\022Y\n\022mobile_application\030\t" +
      " \001(\01326.google.ads.googleads.v13.common.M" +
      "obileApplicationInfoB\003\340A\005H\000:t\352Aq\n(google" +
      "ads.googleapis.com/SharedCriterion\022Ecust" +
      "omers/{customer_id}/sharedCriteria/{shar" +
      "ed_set_id}~{criterion_id}B\013\n\tcriterionB\r" +
      "\n\013_shared_setB\017\n\r_criterion_idB\206\002\n&com.g" +
      "oogle.ads.googleads.v13.resourcesB\024Share" +
      "dCriterionProtoP\001ZKgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v13/resou" +
      "rces;resources\242\002\003GAA\252\002\"Google.Ads.Google" +
      "Ads.V13.Resources\312\002\"Google\\Ads\\GoogleAds" +
      "\\V13\\Resources\352\002&Google::Ads::GoogleAds:" +
      ":V13::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.CriterionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_SharedCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_SharedCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_SharedCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "SharedSet", "CriterionId", "Type", "Keyword", "YoutubeVideo", "YoutubeChannel", "Placement", "MobileAppCategory", "MobileApplication", "Criterion", "SharedSet", "CriterionId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v13.enums.CriterionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
