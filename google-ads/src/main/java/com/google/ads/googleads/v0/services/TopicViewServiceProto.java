// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/topic_view_service.proto

package com.google.ads.googleads.v0.services;

public final class TopicViewServiceProto {
  private TopicViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetTopicViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetTopicViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v0/services/topic" +
      "_view_service.proto\022 google.ads.googlead" +
      "s.v0.services\0322google/ads/googleads/v0/r" +
      "esources/topic_view.proto\032\034google/api/an" +
      "notations.proto\",\n\023GetTopicViewRequest\022\025" +
      "\n\rresource_name\030\001 \001(\t2\276\001\n\020TopicViewServi" +
      "ce\022\251\001\n\014GetTopicView\0225.google.ads.googlea" +
      "ds.v0.services.GetTopicViewRequest\032,.goo" +
      "gle.ads.googleads.v0.resources.TopicView" +
      "\"4\202\323\344\223\002.\022,/v0/{resource_name=customers/*" +
      "/topicViews/*}B\325\001\n$com.google.ads.google" +
      "ads.v0.servicesB\025TopicViewServiceProtoP\001" +
      "ZHgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v0/services;services\242\002\003GAA" +
      "\252\002 Google.Ads.GoogleAds.V0.Services\312\002 Go" +
      "ogle\\Ads\\GoogleAds\\V0\\Servicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.TopicViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetTopicViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetTopicViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetTopicViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.TopicViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
