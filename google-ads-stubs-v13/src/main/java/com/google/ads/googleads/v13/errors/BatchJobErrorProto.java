// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/errors/batch_job_error.proto

package com.google.ads.googleads.v13.errors;

public final class BatchJobErrorProto {
  private BatchJobErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_errors_BatchJobErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_errors_BatchJobErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v13/errors/batch_" +
      "job_error.proto\022\037google.ads.googleads.v1" +
      "3.errors\"\364\001\n\021BatchJobErrorEnum\"\336\001\n\rBatch" +
      "JobError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022." +
      "\n*CANNOT_MODIFY_JOB_AFTER_JOB_STARTS_RUN" +
      "NING\020\002\022\024\n\020EMPTY_OPERATIONS\020\003\022\032\n\026INVALID_" +
      "SEQUENCE_TOKEN\020\004\022\025\n\021RESULTS_NOT_READY\020\005\022" +
      "\025\n\021INVALID_PAGE_SIZE\020\006\022\037\n\033CAN_ONLY_REMOV" +
      "E_PENDING_JOB\020\007B\362\001\n#com.google.ads.googl" +
      "eads.v13.errorsB\022BatchJobErrorProtoP\001ZEg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v13/errors;errors\242\002\003GAA\252\002\037Goo" +
      "gle.Ads.GoogleAds.V13.Errors\312\002\037Google\\Ad" +
      "s\\GoogleAds\\V13\\Errors\352\002#Google::Ads::Go" +
      "ogleAds::V13::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v13_errors_BatchJobErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_errors_BatchJobErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_errors_BatchJobErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
