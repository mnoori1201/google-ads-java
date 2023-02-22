// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/offline_user_data.proto

package com.google.ads.googleads.v12.common;

public interface EventAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.common.EventAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Advertiser defined event to be used for remarketing. The accepted
   * values are "Viewed", "Cart", "Purchased" and "Recommended".
   * </pre>
   *
   * <code>string event = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The event.
   */
  java.lang.String getEvent();
  /**
   * <pre>
   * Required. Advertiser defined event to be used for remarketing. The accepted
   * values are "Viewed", "Cart", "Purchased" and "Recommended".
   * </pre>
   *
   * <code>string event = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for event.
   */
  com.google.protobuf.ByteString
      getEventBytes();

  /**
   * <pre>
   * Required. Timestamp at which the event happened.
   * The format is YYYY-MM-DD HH:MM:SS[+/-HH:MM], where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * </pre>
   *
   * <code>string event_date_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The eventDateTime.
   */
  java.lang.String getEventDateTime();
  /**
   * <pre>
   * Required. Timestamp at which the event happened.
   * The format is YYYY-MM-DD HH:MM:SS[+/-HH:MM], where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * </pre>
   *
   * <code>string event_date_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for eventDateTime.
   */
  com.google.protobuf.ByteString
      getEventDateTimeBytes();

  /**
   * <pre>
   * Required. Item attributes of the event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.EventItemAttribute item_attribute = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v12.common.EventItemAttribute> 
      getItemAttributeList();
  /**
   * <pre>
   * Required. Item attributes of the event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.EventItemAttribute item_attribute = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v12.common.EventItemAttribute getItemAttribute(int index);
  /**
   * <pre>
   * Required. Item attributes of the event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.EventItemAttribute item_attribute = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getItemAttributeCount();
  /**
   * <pre>
   * Required. Item attributes of the event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.EventItemAttribute item_attribute = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.common.EventItemAttributeOrBuilder> 
      getItemAttributeOrBuilderList();
  /**
   * <pre>
   * Required. Item attributes of the event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.EventItemAttribute item_attribute = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v12.common.EventItemAttributeOrBuilder getItemAttributeOrBuilder(
      int index);
}
