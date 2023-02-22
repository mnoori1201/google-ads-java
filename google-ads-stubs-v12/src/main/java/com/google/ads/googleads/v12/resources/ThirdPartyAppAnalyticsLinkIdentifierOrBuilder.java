// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/account_link.proto

package com.google.ads.googleads.v12.resources;

public interface ThirdPartyAppAnalyticsLinkIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.ThirdPartyAppAnalyticsLinkIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The ID of the app analytics provider.
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional int64 app_analytics_provider_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the appAnalyticsProviderId field is set.
   */
  boolean hasAppAnalyticsProviderId();
  /**
   * <pre>
   * Immutable. The ID of the app analytics provider.
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional int64 app_analytics_provider_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The appAnalyticsProviderId.
   */
  long getAppAnalyticsProviderId();

  /**
   * <pre>
   * Immutable. A string that uniquely identifies a mobile application from
   * which the data was collected to the Google Ads API. For iOS, the ID string
   * is the 9 digit string that appears at the end of an App Store URL (for
   * example, "422689480" for "Gmail" whose App Store link is
   * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
   * Android, the ID string is the application's package name (for example,
   * "com.google.android.gm" for "Gmail" given Google Play link
   * https://play.google.com/store/apps/details?id=com.google.android.gm)
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the appId field is set.
   */
  boolean hasAppId();
  /**
   * <pre>
   * Immutable. A string that uniquely identifies a mobile application from
   * which the data was collected to the Google Ads API. For iOS, the ID string
   * is the 9 digit string that appears at the end of an App Store URL (for
   * example, "422689480" for "Gmail" whose App Store link is
   * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
   * Android, the ID string is the application's package name (for example,
   * "com.google.android.gm" for "Gmail" given Google Play link
   * https://play.google.com/store/apps/details?id=com.google.android.gm)
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * Immutable. A string that uniquely identifies a mobile application from
   * which the data was collected to the Google Ads API. For iOS, the ID string
   * is the 9 digit string that appears at the end of an App Store URL (for
   * example, "422689480" for "Gmail" whose App Store link is
   * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
   * Android, the ID string is the application's package name (for example,
   * "com.google.android.gm" for "Gmail" given Google Play link
   * https://play.google.com/store/apps/details?id=com.google.android.gm)
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * Immutable. The vendor of the app.
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.MobileAppVendorEnum.MobileAppVendor app_vendor = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for appVendor.
   */
  int getAppVendorValue();
  /**
   * <pre>
   * Immutable. The vendor of the app.
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.MobileAppVendorEnum.MobileAppVendor app_vendor = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The appVendor.
   */
  com.google.ads.googleads.v12.enums.MobileAppVendorEnum.MobileAppVendor getAppVendor();
}
