// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/audience_insights_service.proto

package com.google.ads.googleads.v12.services;

public interface InsightsAudienceAttributeGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.InsightsAudienceAttributeGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical
   * OR. Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v12.services.AudienceInsightsAttribute> 
      getAttributesList();
  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical
   * OR. Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v12.services.AudienceInsightsAttribute getAttributes(int index);
  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical
   * OR. Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical
   * OR. Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.services.AudienceInsightsAttributeOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical
   * OR. Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v12.services.AudienceInsightsAttributeOrBuilder getAttributesOrBuilder(
      int index);
}
