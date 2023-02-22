// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/extension_feed_item.proto

package com.google.ads.googleads.v13.resources;

public interface ExtensionFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.resources.ExtensionFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the extension feed item.
   * Extension feed item resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the extension feed item.
   * Extension feed item resource names have the form:
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of this feed item. Read-only.
   * </pre>
   *
   * <code>optional int64 id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of this feed item. Read-only.
   * </pre>
   *
   * <code>optional int64 id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The extension type of the extension feed item.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.ExtensionTypeEnum.ExtensionType extension_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for extensionType.
   */
  int getExtensionTypeValue();
  /**
   * <pre>
   * Output only. The extension type of the extension feed item.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.ExtensionTypeEnum.ExtensionType extension_type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The extensionType.
   */
  com.google.ads.googleads.v13.enums.ExtensionTypeEnum.ExtensionType getExtensionType();

  /**
   * <pre>
   * Start time in which this feed item is effective and can begin serving. The
   * time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string start_date_time = 26;</code>
   * @return Whether the startDateTime field is set.
   */
  boolean hasStartDateTime();
  /**
   * <pre>
   * Start time in which this feed item is effective and can begin serving. The
   * time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string start_date_time = 26;</code>
   * @return The startDateTime.
   */
  java.lang.String getStartDateTime();
  /**
   * <pre>
   * Start time in which this feed item is effective and can begin serving. The
   * time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string start_date_time = 26;</code>
   * @return The bytes for startDateTime.
   */
  com.google.protobuf.ByteString
      getStartDateTimeBytes();

  /**
   * <pre>
   * End time in which this feed item is no longer effective and will stop
   * serving. The time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string end_date_time = 27;</code>
   * @return Whether the endDateTime field is set.
   */
  boolean hasEndDateTime();
  /**
   * <pre>
   * End time in which this feed item is no longer effective and will stop
   * serving. The time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string end_date_time = 27;</code>
   * @return The endDateTime.
   */
  java.lang.String getEndDateTime();
  /**
   * <pre>
   * End time in which this feed item is no longer effective and will stop
   * serving. The time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string end_date_time = 27;</code>
   * @return The bytes for endDateTime.
   */
  com.google.protobuf.ByteString
      getEndDateTimeBytes();

  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals
   * for which the feed item may serve. There can be a maximum of 6 schedules
   * per day.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedules = 16;</code>
   */
  java.util.List<com.google.ads.googleads.v13.common.AdScheduleInfo> 
      getAdSchedulesList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals
   * for which the feed item may serve. There can be a maximum of 6 schedules
   * per day.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedules = 16;</code>
   */
  com.google.ads.googleads.v13.common.AdScheduleInfo getAdSchedules(int index);
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals
   * for which the feed item may serve. There can be a maximum of 6 schedules
   * per day.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedules = 16;</code>
   */
  int getAdSchedulesCount();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals
   * for which the feed item may serve. There can be a maximum of 6 schedules
   * per day.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedules = 16;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v13.common.AdScheduleInfoOrBuilder> 
      getAdSchedulesOrBuilderList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals
   * for which the feed item may serve. There can be a maximum of 6 schedules
   * per day.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedules = 16;</code>
   */
  com.google.ads.googleads.v13.common.AdScheduleInfoOrBuilder getAdSchedulesOrBuilder(
      int index);

  /**
   * <pre>
   * The targeted device.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice device = 17;</code>
   * @return The enum numeric value on the wire for device.
   */
  int getDeviceValue();
  /**
   * <pre>
   * The targeted device.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice device = 17;</code>
   * @return The device.
   */
  com.google.ads.googleads.v13.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice getDevice();

  /**
   * <pre>
   * The targeted geo target constant.
   * </pre>
   *
   * <code>optional string targeted_geo_target_constant = 30 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the targetedGeoTargetConstant field is set.
   */
  boolean hasTargetedGeoTargetConstant();
  /**
   * <pre>
   * The targeted geo target constant.
   * </pre>
   *
   * <code>optional string targeted_geo_target_constant = 30 [(.google.api.resource_reference) = { ... }</code>
   * @return The targetedGeoTargetConstant.
   */
  java.lang.String getTargetedGeoTargetConstant();
  /**
   * <pre>
   * The targeted geo target constant.
   * </pre>
   *
   * <code>optional string targeted_geo_target_constant = 30 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for targetedGeoTargetConstant.
   */
  com.google.protobuf.ByteString
      getTargetedGeoTargetConstantBytes();

  /**
   * <pre>
   * The targeted keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.KeywordInfo targeted_keyword = 22;</code>
   * @return Whether the targetedKeyword field is set.
   */
  boolean hasTargetedKeyword();
  /**
   * <pre>
   * The targeted keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.KeywordInfo targeted_keyword = 22;</code>
   * @return The targetedKeyword.
   */
  com.google.ads.googleads.v13.common.KeywordInfo getTargetedKeyword();
  /**
   * <pre>
   * The targeted keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.KeywordInfo targeted_keyword = 22;</code>
   */
  com.google.ads.googleads.v13.common.KeywordInfoOrBuilder getTargetedKeywordOrBuilder();

  /**
   * <pre>
   * Output only. Status of the feed item.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.FeedItemStatusEnum.FeedItemStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the feed item.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.FeedItemStatusEnum.FeedItemStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v13.enums.FeedItemStatusEnum.FeedItemStatus getStatus();

  /**
   * <pre>
   * Sitelink extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.SitelinkFeedItem sitelink_feed_item = 2;</code>
   * @return Whether the sitelinkFeedItem field is set.
   */
  boolean hasSitelinkFeedItem();
  /**
   * <pre>
   * Sitelink extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.SitelinkFeedItem sitelink_feed_item = 2;</code>
   * @return The sitelinkFeedItem.
   */
  com.google.ads.googleads.v13.common.SitelinkFeedItem getSitelinkFeedItem();
  /**
   * <pre>
   * Sitelink extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.SitelinkFeedItem sitelink_feed_item = 2;</code>
   */
  com.google.ads.googleads.v13.common.SitelinkFeedItemOrBuilder getSitelinkFeedItemOrBuilder();

  /**
   * <pre>
   * Structured snippet extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.StructuredSnippetFeedItem structured_snippet_feed_item = 3;</code>
   * @return Whether the structuredSnippetFeedItem field is set.
   */
  boolean hasStructuredSnippetFeedItem();
  /**
   * <pre>
   * Structured snippet extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.StructuredSnippetFeedItem structured_snippet_feed_item = 3;</code>
   * @return The structuredSnippetFeedItem.
   */
  com.google.ads.googleads.v13.common.StructuredSnippetFeedItem getStructuredSnippetFeedItem();
  /**
   * <pre>
   * Structured snippet extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.StructuredSnippetFeedItem structured_snippet_feed_item = 3;</code>
   */
  com.google.ads.googleads.v13.common.StructuredSnippetFeedItemOrBuilder getStructuredSnippetFeedItemOrBuilder();

  /**
   * <pre>
   * App extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AppFeedItem app_feed_item = 7;</code>
   * @return Whether the appFeedItem field is set.
   */
  boolean hasAppFeedItem();
  /**
   * <pre>
   * App extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AppFeedItem app_feed_item = 7;</code>
   * @return The appFeedItem.
   */
  com.google.ads.googleads.v13.common.AppFeedItem getAppFeedItem();
  /**
   * <pre>
   * App extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AppFeedItem app_feed_item = 7;</code>
   */
  com.google.ads.googleads.v13.common.AppFeedItemOrBuilder getAppFeedItemOrBuilder();

  /**
   * <pre>
   * Call extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.CallFeedItem call_feed_item = 8;</code>
   * @return Whether the callFeedItem field is set.
   */
  boolean hasCallFeedItem();
  /**
   * <pre>
   * Call extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.CallFeedItem call_feed_item = 8;</code>
   * @return The callFeedItem.
   */
  com.google.ads.googleads.v13.common.CallFeedItem getCallFeedItem();
  /**
   * <pre>
   * Call extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.CallFeedItem call_feed_item = 8;</code>
   */
  com.google.ads.googleads.v13.common.CallFeedItemOrBuilder getCallFeedItemOrBuilder();

  /**
   * <pre>
   * Callout extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.CalloutFeedItem callout_feed_item = 9;</code>
   * @return Whether the calloutFeedItem field is set.
   */
  boolean hasCalloutFeedItem();
  /**
   * <pre>
   * Callout extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.CalloutFeedItem callout_feed_item = 9;</code>
   * @return The calloutFeedItem.
   */
  com.google.ads.googleads.v13.common.CalloutFeedItem getCalloutFeedItem();
  /**
   * <pre>
   * Callout extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.CalloutFeedItem callout_feed_item = 9;</code>
   */
  com.google.ads.googleads.v13.common.CalloutFeedItemOrBuilder getCalloutFeedItemOrBuilder();

  /**
   * <pre>
   * Text message extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TextMessageFeedItem text_message_feed_item = 10;</code>
   * @return Whether the textMessageFeedItem field is set.
   */
  boolean hasTextMessageFeedItem();
  /**
   * <pre>
   * Text message extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TextMessageFeedItem text_message_feed_item = 10;</code>
   * @return The textMessageFeedItem.
   */
  com.google.ads.googleads.v13.common.TextMessageFeedItem getTextMessageFeedItem();
  /**
   * <pre>
   * Text message extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TextMessageFeedItem text_message_feed_item = 10;</code>
   */
  com.google.ads.googleads.v13.common.TextMessageFeedItemOrBuilder getTextMessageFeedItemOrBuilder();

  /**
   * <pre>
   * Price extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.PriceFeedItem price_feed_item = 11;</code>
   * @return Whether the priceFeedItem field is set.
   */
  boolean hasPriceFeedItem();
  /**
   * <pre>
   * Price extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.PriceFeedItem price_feed_item = 11;</code>
   * @return The priceFeedItem.
   */
  com.google.ads.googleads.v13.common.PriceFeedItem getPriceFeedItem();
  /**
   * <pre>
   * Price extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.PriceFeedItem price_feed_item = 11;</code>
   */
  com.google.ads.googleads.v13.common.PriceFeedItemOrBuilder getPriceFeedItemOrBuilder();

  /**
   * <pre>
   * Promotion extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.PromotionFeedItem promotion_feed_item = 12;</code>
   * @return Whether the promotionFeedItem field is set.
   */
  boolean hasPromotionFeedItem();
  /**
   * <pre>
   * Promotion extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.PromotionFeedItem promotion_feed_item = 12;</code>
   * @return The promotionFeedItem.
   */
  com.google.ads.googleads.v13.common.PromotionFeedItem getPromotionFeedItem();
  /**
   * <pre>
   * Promotion extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.PromotionFeedItem promotion_feed_item = 12;</code>
   */
  com.google.ads.googleads.v13.common.PromotionFeedItemOrBuilder getPromotionFeedItemOrBuilder();

  /**
   * <pre>
   * Output only. Location extension. Locations are synced from a Business
   * Profile into a feed. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.LocationFeedItem location_feed_item = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the locationFeedItem field is set.
   */
  boolean hasLocationFeedItem();
  /**
   * <pre>
   * Output only. Location extension. Locations are synced from a Business
   * Profile into a feed. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.LocationFeedItem location_feed_item = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The locationFeedItem.
   */
  com.google.ads.googleads.v13.common.LocationFeedItem getLocationFeedItem();
  /**
   * <pre>
   * Output only. Location extension. Locations are synced from a Business
   * Profile into a feed. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.LocationFeedItem location_feed_item = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v13.common.LocationFeedItemOrBuilder getLocationFeedItemOrBuilder();

  /**
   * <pre>
   * Output only. Affiliate location extension. Feed locations are populated
   * by Google Ads based on a chain ID. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AffiliateLocationFeedItem affiliate_location_feed_item = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the affiliateLocationFeedItem field is set.
   */
  boolean hasAffiliateLocationFeedItem();
  /**
   * <pre>
   * Output only. Affiliate location extension. Feed locations are populated
   * by Google Ads based on a chain ID. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AffiliateLocationFeedItem affiliate_location_feed_item = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The affiliateLocationFeedItem.
   */
  com.google.ads.googleads.v13.common.AffiliateLocationFeedItem getAffiliateLocationFeedItem();
  /**
   * <pre>
   * Output only. Affiliate location extension. Feed locations are populated
   * by Google Ads based on a chain ID. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AffiliateLocationFeedItem affiliate_location_feed_item = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v13.common.AffiliateLocationFeedItemOrBuilder getAffiliateLocationFeedItemOrBuilder();

  /**
   * <pre>
   * Hotel Callout extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.HotelCalloutFeedItem hotel_callout_feed_item = 23;</code>
   * @return Whether the hotelCalloutFeedItem field is set.
   */
  boolean hasHotelCalloutFeedItem();
  /**
   * <pre>
   * Hotel Callout extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.HotelCalloutFeedItem hotel_callout_feed_item = 23;</code>
   * @return The hotelCalloutFeedItem.
   */
  com.google.ads.googleads.v13.common.HotelCalloutFeedItem getHotelCalloutFeedItem();
  /**
   * <pre>
   * Hotel Callout extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.HotelCalloutFeedItem hotel_callout_feed_item = 23;</code>
   */
  com.google.ads.googleads.v13.common.HotelCalloutFeedItemOrBuilder getHotelCalloutFeedItemOrBuilder();

  /**
   * <pre>
   * Immutable. Advertiser provided image extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.ImageFeedItem image_feed_item = 31 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the imageFeedItem field is set.
   */
  boolean hasImageFeedItem();
  /**
   * <pre>
   * Immutable. Advertiser provided image extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.ImageFeedItem image_feed_item = 31 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The imageFeedItem.
   */
  com.google.ads.googleads.v13.common.ImageFeedItem getImageFeedItem();
  /**
   * <pre>
   * Immutable. Advertiser provided image extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.ImageFeedItem image_feed_item = 31 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v13.common.ImageFeedItemOrBuilder getImageFeedItemOrBuilder();

  /**
   * <pre>
   * The targeted campaign.
   * </pre>
   *
   * <code>string targeted_campaign = 28 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the targetedCampaign field is set.
   */
  boolean hasTargetedCampaign();
  /**
   * <pre>
   * The targeted campaign.
   * </pre>
   *
   * <code>string targeted_campaign = 28 [(.google.api.resource_reference) = { ... }</code>
   * @return The targetedCampaign.
   */
  java.lang.String getTargetedCampaign();
  /**
   * <pre>
   * The targeted campaign.
   * </pre>
   *
   * <code>string targeted_campaign = 28 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for targetedCampaign.
   */
  com.google.protobuf.ByteString
      getTargetedCampaignBytes();

  /**
   * <pre>
   * The targeted ad group.
   * </pre>
   *
   * <code>string targeted_ad_group = 29 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the targetedAdGroup field is set.
   */
  boolean hasTargetedAdGroup();
  /**
   * <pre>
   * The targeted ad group.
   * </pre>
   *
   * <code>string targeted_ad_group = 29 [(.google.api.resource_reference) = { ... }</code>
   * @return The targetedAdGroup.
   */
  java.lang.String getTargetedAdGroup();
  /**
   * <pre>
   * The targeted ad group.
   * </pre>
   *
   * <code>string targeted_ad_group = 29 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for targetedAdGroup.
   */
  com.google.protobuf.ByteString
      getTargetedAdGroupBytes();

  public com.google.ads.googleads.v13.resources.ExtensionFeedItem.ExtensionCase getExtensionCase();

  public com.google.ads.googleads.v13.resources.ExtensionFeedItem.ServingResourceTargetingCase getServingResourceTargetingCase();
}
