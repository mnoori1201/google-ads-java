// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/audience_insights_service.proto

package com.google.ads.googleads.v13.services;

public interface GenerateInsightsFinderReportRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.services.GenerateInsightsFinderReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. A baseline audience for this report, typically all people in a
   * region.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.BasicInsightsAudience baseline_audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the baselineAudience field is set.
   */
  boolean hasBaselineAudience();
  /**
   * <pre>
   * Required. A baseline audience for this report, typically all people in a
   * region.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.BasicInsightsAudience baseline_audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The baselineAudience.
   */
  com.google.ads.googleads.v13.services.BasicInsightsAudience getBaselineAudience();
  /**
   * <pre>
   * Required. A baseline audience for this report, typically all people in a
   * region.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.BasicInsightsAudience baseline_audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v13.services.BasicInsightsAudienceOrBuilder getBaselineAudienceOrBuilder();

  /**
   * <pre>
   * Required. The specific audience of interest for this report.  The insights
   * in the report will be based on attributes more prevalent in this audience
   * than in the report's baseline audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.BasicInsightsAudience specific_audience = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the specificAudience field is set.
   */
  boolean hasSpecificAudience();
  /**
   * <pre>
   * Required. The specific audience of interest for this report.  The insights
   * in the report will be based on attributes more prevalent in this audience
   * than in the report's baseline audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.BasicInsightsAudience specific_audience = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The specificAudience.
   */
  com.google.ads.googleads.v13.services.BasicInsightsAudience getSpecificAudience();
  /**
   * <pre>
   * Required. The specific audience of interest for this report.  The insights
   * in the report will be based on attributes more prevalent in this audience
   * than in the report's baseline audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.BasicInsightsAudience specific_audience = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v13.services.BasicInsightsAudienceOrBuilder getSpecificAudienceOrBuilder();

  /**
   * <pre>
   * The name of the customer being planned for.  This is a user-defined value.
   * </pre>
   *
   * <code>string customer_insights_group = 4;</code>
   * @return The customerInsightsGroup.
   */
  java.lang.String getCustomerInsightsGroup();
  /**
   * <pre>
   * The name of the customer being planned for.  This is a user-defined value.
   * </pre>
   *
   * <code>string customer_insights_group = 4;</code>
   * @return The bytes for customerInsightsGroup.
   */
  com.google.protobuf.ByteString
      getCustomerInsightsGroupBytes();
}
