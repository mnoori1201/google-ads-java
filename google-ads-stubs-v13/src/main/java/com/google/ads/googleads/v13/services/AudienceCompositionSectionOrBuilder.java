// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/audience_insights_service.proto

package com.google.ads.googleads.v13.services;

public interface AudienceCompositionSectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.services.AudienceCompositionSection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the attributes in this section.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
   * @return The enum numeric value on the wire for dimension.
   */
  int getDimensionValue();
  /**
   * <pre>
   * The type of the attributes in this section.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
   * @return The dimension.
   */
  com.google.ads.googleads.v13.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension getDimension();

  /**
   * <pre>
   * The most relevant segments for this audience.  If dimension is GENDER,
   * AGE_RANGE or PARENTAL_STATUS, then this list of attributes is exhaustive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttribute top_attributes = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v13.services.AudienceCompositionAttribute> 
      getTopAttributesList();
  /**
   * <pre>
   * The most relevant segments for this audience.  If dimension is GENDER,
   * AGE_RANGE or PARENTAL_STATUS, then this list of attributes is exhaustive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttribute top_attributes = 3;</code>
   */
  com.google.ads.googleads.v13.services.AudienceCompositionAttribute getTopAttributes(int index);
  /**
   * <pre>
   * The most relevant segments for this audience.  If dimension is GENDER,
   * AGE_RANGE or PARENTAL_STATUS, then this list of attributes is exhaustive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttribute top_attributes = 3;</code>
   */
  int getTopAttributesCount();
  /**
   * <pre>
   * The most relevant segments for this audience.  If dimension is GENDER,
   * AGE_RANGE or PARENTAL_STATUS, then this list of attributes is exhaustive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttribute top_attributes = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v13.services.AudienceCompositionAttributeOrBuilder> 
      getTopAttributesOrBuilderList();
  /**
   * <pre>
   * The most relevant segments for this audience.  If dimension is GENDER,
   * AGE_RANGE or PARENTAL_STATUS, then this list of attributes is exhaustive.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttribute top_attributes = 3;</code>
   */
  com.google.ads.googleads.v13.services.AudienceCompositionAttributeOrBuilder getTopAttributesOrBuilder(
      int index);

  /**
   * <pre>
   * Additional attributes for this audience, grouped into clusters.  Only
   * populated if dimension is YOUTUBE_CHANNEL.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttributeCluster clustered_attributes = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v13.services.AudienceCompositionAttributeCluster> 
      getClusteredAttributesList();
  /**
   * <pre>
   * Additional attributes for this audience, grouped into clusters.  Only
   * populated if dimension is YOUTUBE_CHANNEL.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttributeCluster clustered_attributes = 4;</code>
   */
  com.google.ads.googleads.v13.services.AudienceCompositionAttributeCluster getClusteredAttributes(int index);
  /**
   * <pre>
   * Additional attributes for this audience, grouped into clusters.  Only
   * populated if dimension is YOUTUBE_CHANNEL.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttributeCluster clustered_attributes = 4;</code>
   */
  int getClusteredAttributesCount();
  /**
   * <pre>
   * Additional attributes for this audience, grouped into clusters.  Only
   * populated if dimension is YOUTUBE_CHANNEL.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttributeCluster clustered_attributes = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v13.services.AudienceCompositionAttributeClusterOrBuilder> 
      getClusteredAttributesOrBuilderList();
  /**
   * <pre>
   * Additional attributes for this audience, grouped into clusters.  Only
   * populated if dimension is YOUTUBE_CHANNEL.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionAttributeCluster clustered_attributes = 4;</code>
   */
  com.google.ads.googleads.v13.services.AudienceCompositionAttributeClusterOrBuilder getClusteredAttributesOrBuilder(
      int index);
}
