// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/audience_insights_service.proto

package com.google.ads.googleads.v13.services;

public interface AudienceInsightsAttributeMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.services.AudienceInsightsAttributeMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
   * @return The enum numeric value on the wire for dimension.
   */
  int getDimensionValue();
  /**
   * <pre>
   * The type of the attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
   * @return The dimension.
   */
  com.google.ads.googleads.v13.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension getDimension();

  /**
   * <pre>
   * The attribute itself.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.AudienceInsightsAttribute attribute = 2;</code>
   * @return Whether the attribute field is set.
   */
  boolean hasAttribute();
  /**
   * <pre>
   * The attribute itself.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.AudienceInsightsAttribute attribute = 2;</code>
   * @return The attribute.
   */
  com.google.ads.googleads.v13.services.AudienceInsightsAttribute getAttribute();
  /**
   * <pre>
   * The attribute itself.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.AudienceInsightsAttribute attribute = 2;</code>
   */
  com.google.ads.googleads.v13.services.AudienceInsightsAttributeOrBuilder getAttributeOrBuilder();

  /**
   * <pre>
   * The human-readable name of the attribute.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The human-readable name of the attribute.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * A relevance score for this attribute, between 0 and 1.
   * </pre>
   *
   * <code>double score = 4;</code>
   * @return The score.
   */
  double getScore();

  /**
   * <pre>
   * A string that supplements the display_name to identify the attribute.
   * If the dimension is TOPIC, this is a brief description of the
   * Knowledge Graph entity, such as "American singer-songwriter".
   * If the dimension is CATEGORY, this is the complete path to the category in
   * The Product &amp; Service taxonomy, for example
   * "/Apparel/Clothing/Outerwear".
   * </pre>
   *
   * <code>string display_info = 5;</code>
   * @return The displayInfo.
   */
  java.lang.String getDisplayInfo();
  /**
   * <pre>
   * A string that supplements the display_name to identify the attribute.
   * If the dimension is TOPIC, this is a brief description of the
   * Knowledge Graph entity, such as "American singer-songwriter".
   * If the dimension is CATEGORY, this is the complete path to the category in
   * The Product &amp; Service taxonomy, for example
   * "/Apparel/Clothing/Outerwear".
   * </pre>
   *
   * <code>string display_info = 5;</code>
   * @return The bytes for displayInfo.
   */
  com.google.protobuf.ByteString
      getDisplayInfoBytes();

  /**
   * <pre>
   * Special metadata for a YouTube channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.YouTubeChannelAttributeMetadata youtube_channel_metadata = 6;</code>
   * @return Whether the youtubeChannelMetadata field is set.
   */
  boolean hasYoutubeChannelMetadata();
  /**
   * <pre>
   * Special metadata for a YouTube channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.YouTubeChannelAttributeMetadata youtube_channel_metadata = 6;</code>
   * @return The youtubeChannelMetadata.
   */
  com.google.ads.googleads.v13.services.YouTubeChannelAttributeMetadata getYoutubeChannelMetadata();
  /**
   * <pre>
   * Special metadata for a YouTube channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.YouTubeChannelAttributeMetadata youtube_channel_metadata = 6;</code>
   */
  com.google.ads.googleads.v13.services.YouTubeChannelAttributeMetadataOrBuilder getYoutubeChannelMetadataOrBuilder();

  /**
   * <pre>
   * Special metadata for a YouTube Dynamic Lineup.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.DynamicLineupAttributeMetadata dynamic_attribute_metadata = 7;</code>
   * @return Whether the dynamicAttributeMetadata field is set.
   */
  boolean hasDynamicAttributeMetadata();
  /**
   * <pre>
   * Special metadata for a YouTube Dynamic Lineup.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.DynamicLineupAttributeMetadata dynamic_attribute_metadata = 7;</code>
   * @return The dynamicAttributeMetadata.
   */
  com.google.ads.googleads.v13.services.DynamicLineupAttributeMetadata getDynamicAttributeMetadata();
  /**
   * <pre>
   * Special metadata for a YouTube Dynamic Lineup.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.DynamicLineupAttributeMetadata dynamic_attribute_metadata = 7;</code>
   */
  com.google.ads.googleads.v13.services.DynamicLineupAttributeMetadataOrBuilder getDynamicAttributeMetadataOrBuilder();

  /**
   * <pre>
   * Special metadata for a Location.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.LocationAttributeMetadata location_attribute_metadata = 8;</code>
   * @return Whether the locationAttributeMetadata field is set.
   */
  boolean hasLocationAttributeMetadata();
  /**
   * <pre>
   * Special metadata for a Location.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.LocationAttributeMetadata location_attribute_metadata = 8;</code>
   * @return The locationAttributeMetadata.
   */
  com.google.ads.googleads.v13.services.LocationAttributeMetadata getLocationAttributeMetadata();
  /**
   * <pre>
   * Special metadata for a Location.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.LocationAttributeMetadata location_attribute_metadata = 8;</code>
   */
  com.google.ads.googleads.v13.services.LocationAttributeMetadataOrBuilder getLocationAttributeMetadataOrBuilder();

  public com.google.ads.googleads.v13.services.AudienceInsightsAttributeMetadata.DimensionMetadataCase getDimensionMetadataCase();
}
