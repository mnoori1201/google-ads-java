// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/asset_set_types.proto

package com.google.ads.googleads.v13.common;

public final class AssetSetTypesProto {
  private AssetSetTypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_LocationSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_LocationSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_BusinessProfileLocationSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_BusinessProfileLocationSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_ChainSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_ChainSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_ChainFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_ChainFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_MapsLocationSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_MapsLocationSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_MapsLocationInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_MapsLocationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_BusinessProfileLocationGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_BusinessProfileLocationGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_DynamicBusinessProfileLocationGroupFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_DynamicBusinessProfileLocationGroupFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_BusinessProfileBusinessNameFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_BusinessProfileBusinessNameFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_ChainLocationGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_ChainLocationGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v13/common/asset_" +
      "set_types.proto\022\037google.ads.googleads.v1" +
      "3.common\032<google/ads/googleads/v13/enums" +
      "/chain_relationship_type.proto\032<google/a" +
      "ds/googleads/v13/enums/location_ownershi" +
      "p_type.proto\032@google/ads/googleads/v13/e" +
      "nums/location_string_filter_type.proto\032\037" +
      "google/api/field_behavior.proto\"\217\003\n\013Loca" +
      "tionSet\022x\n\027location_ownership_type\030\003 \001(\016" +
      "2O.google.ads.googleads.v13.enums.Locati" +
      "onOwnershipTypeEnum.LocationOwnershipTyp" +
      "eB\006\340A\002\340A\005\022d\n\035business_profile_location_s" +
      "et\030\001 \001(\0132;.google.ads.googleads.v13.comm" +
      "on.BusinessProfileLocationSetH\000\022G\n\022chain" +
      "_location_set\030\002 \001(\0132).google.ads.googlea" +
      "ds.v13.common.ChainSetH\000\022M\n\021maps_locatio" +
      "n_set\030\005 \001(\01320.google.ads.googleads.v13.c" +
      "ommon.MapsLocationSetH\000B\010\n\006source\"\330\001\n\032Bu" +
      "sinessProfileLocationSet\022(\n\030http_authori" +
      "zation_token\030\001 \001(\tB\006\340A\005\340A\002\022\035\n\remail_addr" +
      "ess\030\002 \001(\tB\006\340A\002\340A\005\022\034\n\024business_name_filte" +
      "r\030\003 \001(\t\022\025\n\rlabel_filters\030\004 \003(\t\022\032\n\022listin" +
      "g_id_filters\030\005 \003(\003\022 \n\023business_account_i" +
      "d\030\006 \001(\tB\003\340A\005\"\301\001\n\010ChainSet\022r\n\021relationshi" +
      "p_type\030\001 \001(\0162O.google.ads.googleads.v13." +
      "enums.ChainRelationshipTypeEnum.ChainRel" +
      "ationshipTypeB\006\340A\002\340A\005\022A\n\006chains\030\002 \003(\0132,." +
      "google.ads.googleads.v13.common.ChainFil" +
      "terB\003\340A\002\"A\n\013ChainFilter\022\025\n\010chain_id\030\001 \001(" +
      "\003B\003\340A\002\022\033\n\023location_attributes\030\002 \003(\t\"a\n\017M" +
      "apsLocationSet\022N\n\016maps_locations\030\001 \003(\01321" +
      ".google.ads.googleads.v13.common.MapsLoc" +
      "ationInfoB\003\340A\002\"$\n\020MapsLocationInfo\022\020\n\010pl" +
      "ace_id\030\001 \001(\t\"\243\001\n\034BusinessProfileLocation" +
      "Group\022\202\001\n.dynamic_business_profile_locat" +
      "ion_group_filter\030\001 \001(\0132J.google.ads.goog" +
      "leads.v13.common.DynamicBusinessProfileL" +
      "ocationGroupFilter\"\336\001\n)DynamicBusinessPr" +
      "ofileLocationGroupFilter\022\025\n\rlabel_filter" +
      "s\030\001 \003(\t\022e\n\024business_name_filter\030\002 \001(\0132B." +
      "google.ads.googleads.v13.common.Business" +
      "ProfileBusinessNameFilterH\000\210\001\001\022\032\n\022listin" +
      "g_id_filters\030\003 \003(\003B\027\n\025_business_name_fil" +
      "ter\"\246\001\n!BusinessProfileBusinessNameFilte" +
      "r\022\025\n\rbusiness_name\030\001 \001(\t\022j\n\013filter_type\030" +
      "\002 \001(\0162U.google.ads.googleads.v13.enums.L" +
      "ocationStringFilterTypeEnum.LocationStri" +
      "ngFilterType\"p\n\022ChainLocationGroup\022Z\n$dy" +
      "namic_chain_location_group_filters\030\001 \003(\013" +
      "2,.google.ads.googleads.v13.common.Chain" +
      "FilterB\362\001\n#com.google.ads.googleads.v13." +
      "commonB\022AssetSetTypesProtoP\001ZEgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v13/common;common\242\002\003GAA\252\002\037Google.Ads.G" +
      "oogleAds.V13.Common\312\002\037Google\\Ads\\GoogleA" +
      "ds\\V13\\Common\352\002#Google::Ads::GoogleAds::" +
      "V13::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ChainRelationshipTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.LocationOwnershipTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.LocationStringFilterTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_common_LocationSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_common_LocationSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_LocationSet_descriptor,
        new java.lang.String[] { "LocationOwnershipType", "BusinessProfileLocationSet", "ChainLocationSet", "MapsLocationSet", "Source", });
    internal_static_google_ads_googleads_v13_common_BusinessProfileLocationSet_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_common_BusinessProfileLocationSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_BusinessProfileLocationSet_descriptor,
        new java.lang.String[] { "HttpAuthorizationToken", "EmailAddress", "BusinessNameFilter", "LabelFilters", "ListingIdFilters", "BusinessAccountId", });
    internal_static_google_ads_googleads_v13_common_ChainSet_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_common_ChainSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_ChainSet_descriptor,
        new java.lang.String[] { "RelationshipType", "Chains", });
    internal_static_google_ads_googleads_v13_common_ChainFilter_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_common_ChainFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_ChainFilter_descriptor,
        new java.lang.String[] { "ChainId", "LocationAttributes", });
    internal_static_google_ads_googleads_v13_common_MapsLocationSet_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v13_common_MapsLocationSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_MapsLocationSet_descriptor,
        new java.lang.String[] { "MapsLocations", });
    internal_static_google_ads_googleads_v13_common_MapsLocationInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v13_common_MapsLocationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_MapsLocationInfo_descriptor,
        new java.lang.String[] { "PlaceId", });
    internal_static_google_ads_googleads_v13_common_BusinessProfileLocationGroup_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v13_common_BusinessProfileLocationGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_BusinessProfileLocationGroup_descriptor,
        new java.lang.String[] { "DynamicBusinessProfileLocationGroupFilter", });
    internal_static_google_ads_googleads_v13_common_DynamicBusinessProfileLocationGroupFilter_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v13_common_DynamicBusinessProfileLocationGroupFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_DynamicBusinessProfileLocationGroupFilter_descriptor,
        new java.lang.String[] { "LabelFilters", "BusinessNameFilter", "ListingIdFilters", "BusinessNameFilter", });
    internal_static_google_ads_googleads_v13_common_BusinessProfileBusinessNameFilter_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v13_common_BusinessProfileBusinessNameFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_BusinessProfileBusinessNameFilter_descriptor,
        new java.lang.String[] { "BusinessName", "FilterType", });
    internal_static_google_ads_googleads_v13_common_ChainLocationGroup_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v13_common_ChainLocationGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_ChainLocationGroup_descriptor,
        new java.lang.String[] { "DynamicChainLocationGroupFilters", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.ChainRelationshipTypeProto.getDescriptor();
    com.google.ads.googleads.v13.enums.LocationOwnershipTypeProto.getDescriptor();
    com.google.ads.googleads.v13.enums.LocationStringFilterTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
