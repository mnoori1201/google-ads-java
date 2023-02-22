// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/geo_target_constant_service.proto

package com.google.ads.googleads.v13.services;

public final class GeoTargetConstantServiceProto {
  private GeoTargetConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_LocationNames_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_LocationNames_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_GeoTargets_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_GeoTargets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_GeoTargetConstantSuggestion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_GeoTargetConstantSuggestion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v13/services/geo_" +
      "target_constant_service.proto\022!google.ad" +
      "s.googleads.v13.services\032<google/ads/goo" +
      "gleads/v13/resources/geo_target_constant" +
      ".proto\032\034google/api/annotations.proto\032\027go" +
      "ogle/api/client.proto\"\227\003\n SuggestGeoTarg" +
      "etConstantsRequest\022\023\n\006locale\030\006 \001(\tH\001\210\001\001\022" +
      "\031\n\014country_code\030\007 \001(\tH\002\210\001\001\022k\n\016location_n" +
      "ames\030\001 \001(\0132Q.google.ads.googleads.v13.se" +
      "rvices.SuggestGeoTargetConstantsRequest." +
      "LocationNamesH\000\022e\n\013geo_targets\030\002 \001(\0132N.g" +
      "oogle.ads.googleads.v13.services.Suggest" +
      "GeoTargetConstantsRequest.GeoTargetsH\000\032\036" +
      "\n\rLocationNames\022\r\n\005names\030\002 \003(\t\032*\n\nGeoTar" +
      "gets\022\034\n\024geo_target_constants\030\002 \003(\tB\007\n\005qu" +
      "eryB\t\n\007_localeB\017\n\r_country_code\"\214\001\n!Sugg" +
      "estGeoTargetConstantsResponse\022g\n\037geo_tar" +
      "get_constant_suggestions\030\001 \003(\0132>.google." +
      "ads.googleads.v13.services.GeoTargetCons" +
      "tantSuggestion\"\265\002\n\033GeoTargetConstantSugg" +
      "estion\022\023\n\006locale\030\006 \001(\tH\000\210\001\001\022\022\n\005reach\030\007 \001" +
      "(\003H\001\210\001\001\022\030\n\013search_term\030\010 \001(\tH\002\210\001\001\022R\n\023geo" +
      "_target_constant\030\004 \001(\01325.google.ads.goog" +
      "leads.v13.resources.GeoTargetConstant\022Z\n" +
      "\033geo_target_constant_parents\030\005 \003(\01325.goo" +
      "gle.ads.googleads.v13.resources.GeoTarge" +
      "tConstantB\t\n\007_localeB\010\n\006_reachB\016\n\014_searc" +
      "h_term2\266\002\n\030GeoTargetConstantService\022\322\001\n\031" +
      "SuggestGeoTargetConstants\022C.google.ads.g" +
      "oogleads.v13.services.SuggestGeoTargetCo" +
      "nstantsRequest\032D.google.ads.googleads.v1" +
      "3.services.SuggestGeoTargetConstantsResp" +
      "onse\"*\202\323\344\223\002$\"\037/v13/geoTargetConstants:su" +
      "ggest:\001*\032E\312A\030googleads.googleapis.com\322A\'" +
      "https://www.googleapis.com/auth/adwordsB" +
      "\211\002\n%com.google.ads.googleads.v13.service" +
      "sB\035GeoTargetConstantServiceProtoP\001ZIgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v13/services;services\242\002\003GAA\252\002!Go" +
      "ogle.Ads.GoogleAds.V13.Services\312\002!Google" +
      "\\Ads\\GoogleAds\\V13\\Services\352\002%Google::Ad" +
      "s::GoogleAds::V13::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.resources.GeoTargetConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_descriptor,
        new java.lang.String[] { "Locale", "CountryCode", "LocationNames", "GeoTargets", "Query", "Locale", "CountryCode", });
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_LocationNames_descriptor =
      internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_LocationNames_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_LocationNames_descriptor,
        new java.lang.String[] { "Names", });
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_GeoTargets_descriptor =
      internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_GeoTargets_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsRequest_GeoTargets_descriptor,
        new java.lang.String[] { "GeoTargetConstants", });
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SuggestGeoTargetConstantsResponse_descriptor,
        new java.lang.String[] { "GeoTargetConstantSuggestions", });
    internal_static_google_ads_googleads_v13_services_GeoTargetConstantSuggestion_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_GeoTargetConstantSuggestion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_GeoTargetConstantSuggestion_descriptor,
        new java.lang.String[] { "Locale", "Reach", "SearchTerm", "GeoTargetConstant", "GeoTargetConstantParents", "Locale", "Reach", "SearchTerm", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.resources.GeoTargetConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
