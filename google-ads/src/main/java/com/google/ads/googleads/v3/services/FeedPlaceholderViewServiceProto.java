// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/feed_placeholder_view_service.proto

package com.google.ads.googleads.v3.services;

public final class FeedPlaceholderViewServiceProto {
  private FeedPlaceholderViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetFeedPlaceholderViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetFeedPlaceholderViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v3/services/feed_" +
      "placeholder_view_service.proto\022 google.a" +
      "ds.googleads.v3.services\032=google/ads/goo" +
      "gleads/v3/resources/feed_placeholder_vie" +
      "w.proto\032\034google/api/annotations.proto\032\027g" +
      "oogle/api/client.proto\032\037google/api/field" +
      "_behavior.proto\";\n\035GetFeedPlaceholderVie" +
      "wRequest\022\032\n\rresource_name\030\001 \001(\tB\003\340A\0022\235\002\n" +
      "\032FeedPlaceholderViewService\022\341\001\n\026GetFeedP" +
      "laceholderView\022?.google.ads.googleads.v3" +
      ".services.GetFeedPlaceholderViewRequest\032" +
      "6.google.ads.googleads.v3.resources.Feed" +
      "PlaceholderView\"N\202\323\344\223\0028\0226/v3/{resource_n" +
      "ame=customers/*/feedPlaceholderViews/*}\332" +
      "A\rresource_name\032\033\312A\030googleads.googleapis" +
      ".comB\206\002\n$com.google.ads.googleads.v3.ser" +
      "vicesB\037FeedPlaceholderViewServiceProtoP\001" +
      "ZHgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v3/services;services\242\002\003GAA" +
      "\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Go" +
      "ogle\\Ads\\GoogleAds\\V3\\Services\352\002$Google:" +
      ":Ads::GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.FeedPlaceholderViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetFeedPlaceholderViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetFeedPlaceholderViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetFeedPlaceholderViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.FeedPlaceholderViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}