// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/tag_snippet.proto

package com.google.ads.googleads.v13.common;

public final class TagSnippetProto {
  private TagSnippetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_common_TagSnippet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_common_TagSnippet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v13/common/tag_sn" +
      "ippet.proto\022\037google.ads.googleads.v13.co" +
      "mmon\032>google/ads/googleads/v13/enums/tra" +
      "cking_code_page_format.proto\0327google/ads" +
      "/googleads/v13/enums/tracking_code_type." +
      "proto\"\251\002\n\nTagSnippet\022S\n\004type\030\001 \001(\0162E.goo" +
      "gle.ads.googleads.v13.enums.TrackingCode" +
      "TypeEnum.TrackingCodeType\022f\n\013page_format" +
      "\030\002 \001(\0162Q.google.ads.googleads.v13.enums." +
      "TrackingCodePageFormatEnum.TrackingCodeP" +
      "ageFormat\022\034\n\017global_site_tag\030\005 \001(\tH\000\210\001\001\022" +
      "\032\n\revent_snippet\030\006 \001(\tH\001\210\001\001B\022\n\020_global_s" +
      "ite_tagB\020\n\016_event_snippetB\357\001\n#com.google" +
      ".ads.googleads.v13.commonB\017TagSnippetPro" +
      "toP\001ZEgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v13/common;common\242\002\003GA" +
      "A\252\002\037Google.Ads.GoogleAds.V13.Common\312\002\037Go" +
      "ogle\\Ads\\GoogleAds\\V13\\Common\352\002#Google::" +
      "Ads::GoogleAds::V13::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.TrackingCodePageFormatProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.TrackingCodeTypeProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_common_TagSnippet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_common_TagSnippet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_common_TagSnippet_descriptor,
        new java.lang.String[] { "Type", "PageFormat", "GlobalSiteTag", "EventSnippet", "GlobalSiteTag", "EventSnippet", });
    com.google.ads.googleads.v13.enums.TrackingCodePageFormatProto.getDescriptor();
    com.google.ads.googleads.v13.enums.TrackingCodeTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
