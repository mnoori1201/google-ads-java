// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/media_file.proto

package com.google.ads.googleads.v0.resources;

public final class MediaFileProto {
  private MediaFileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_MediaFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_MediaFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_MediaImage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_MediaImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_MediaBundle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_MediaBundle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v0/resources/medi" +
      "a_file.proto\022!google.ads.googleads.v0.re" +
      "sources\032.google/ads/googleads/v0/enums/m" +
      "edia_type.proto\032-google/ads/googleads/v0" +
      "/enums/mime_type.proto\032\036google/protobuf/" +
      "wrappers.proto\"\375\003\n\tMediaFile\022\025\n\rresource" +
      "_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.google.protobu" +
      "f.Int64Value\022D\n\004type\030\005 \001(\01626.google.ads." +
      "googleads.v0.enums.MediaTypeEnum.MediaTy" +
      "pe\022G\n\tmime_type\030\006 \001(\01624.google.ads.googl" +
      "eads.v0.enums.MimeTypeEnum.MimeType\0220\n\ns" +
      "ource_url\030\007 \001(\0132\034.google.protobuf.String" +
      "Value\022*\n\004name\030\010 \001(\0132\034.google.protobuf.St" +
      "ringValue\022.\n\tfile_size\030\t \001(\0132\033.google.pr" +
      "otobuf.Int64Value\022>\n\005image\030\003 \001(\0132-.googl" +
      "e.ads.googleads.v0.resources.MediaImageH" +
      "\000\022F\n\014media_bundle\030\004 \001(\0132..google.ads.goo" +
      "gleads.v0.resources.MediaBundleH\000B\013\n\tmed" +
      "iatype\"7\n\nMediaImage\022)\n\004data\030\001 \001(\0132\033.goo" +
      "gle.protobuf.BytesValue\"8\n\013MediaBundle\022)" +
      "\n\004data\030\001 \001(\0132\033.google.protobuf.BytesValu" +
      "eB\323\001\n%com.google.ads.googleads.v0.resour" +
      "cesB\016MediaFileProtoP\001ZJgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v0/re" +
      "sources;resources\242\002\003GAA\252\002!Google.Ads.Goo" +
      "gleAds.V0.Resources\312\002!Google\\Ads\\GoogleA" +
      "ds\\V0\\Resourcesb\006proto3"
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
          com.google.ads.googleads.v0.enums.MediaTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.MimeTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_MediaFile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_MediaFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_MediaFile_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "MimeType", "SourceUrl", "Name", "FileSize", "Image", "MediaBundle", "Mediatype", });
    internal_static_google_ads_googleads_v0_resources_MediaImage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_resources_MediaImage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_MediaImage_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_google_ads_googleads_v0_resources_MediaBundle_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_resources_MediaBundle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_MediaBundle_descriptor,
        new java.lang.String[] { "Data", });
    com.google.ads.googleads.v0.enums.MediaTypeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.MimeTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
