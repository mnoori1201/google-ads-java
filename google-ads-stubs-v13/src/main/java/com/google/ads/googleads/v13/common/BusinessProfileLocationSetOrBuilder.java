// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/asset_set_types.proto

package com.google.ads.googleads.v13.common;

public interface BusinessProfileLocationSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.common.BusinessProfileLocationSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Immutable. The HTTP authorization token used to obtain
   * authorization.
   * </pre>
   *
   * <code>string http_authorization_token = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];</code>
   * @return The httpAuthorizationToken.
   */
  java.lang.String getHttpAuthorizationToken();
  /**
   * <pre>
   * Required. Immutable. The HTTP authorization token used to obtain
   * authorization.
   * </pre>
   *
   * <code>string http_authorization_token = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for httpAuthorizationToken.
   */
  com.google.protobuf.ByteString
      getHttpAuthorizationTokenBytes();

  /**
   * <pre>
   * Required. Immutable. Email address of a Google Business Profile account or
   * email address of a manager of the Google Business Profile account.
   * </pre>
   *
   * <code>string email_address = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The emailAddress.
   */
  java.lang.String getEmailAddress();
  /**
   * <pre>
   * Required. Immutable. Email address of a Google Business Profile account or
   * email address of a manager of the Google Business Profile account.
   * </pre>
   *
   * <code>string email_address = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for emailAddress.
   */
  com.google.protobuf.ByteString
      getEmailAddressBytes();

  /**
   * <pre>
   * Used to filter Google Business Profile listings by business name. If
   * businessNameFilter is set, only listings with a matching business name are
   * candidates to be sync'd into Assets.
   * </pre>
   *
   * <code>string business_name_filter = 3;</code>
   * @return The businessNameFilter.
   */
  java.lang.String getBusinessNameFilter();
  /**
   * <pre>
   * Used to filter Google Business Profile listings by business name. If
   * businessNameFilter is set, only listings with a matching business name are
   * candidates to be sync'd into Assets.
   * </pre>
   *
   * <code>string business_name_filter = 3;</code>
   * @return The bytes for businessNameFilter.
   */
  com.google.protobuf.ByteString
      getBusinessNameFilterBytes();

  /**
   * <pre>
   * Used to filter Google Business Profile listings by labels. If entries exist
   * in labelFilters, only listings that have any of the labels set are
   * candidates to be synchronized into Assets. If no entries exist in
   * labelFilters, then all listings are candidates for syncing.
   * Label filters are OR'ed together.
   * </pre>
   *
   * <code>repeated string label_filters = 4;</code>
   * @return A list containing the labelFilters.
   */
  java.util.List<java.lang.String>
      getLabelFiltersList();
  /**
   * <pre>
   * Used to filter Google Business Profile listings by labels. If entries exist
   * in labelFilters, only listings that have any of the labels set are
   * candidates to be synchronized into Assets. If no entries exist in
   * labelFilters, then all listings are candidates for syncing.
   * Label filters are OR'ed together.
   * </pre>
   *
   * <code>repeated string label_filters = 4;</code>
   * @return The count of labelFilters.
   */
  int getLabelFiltersCount();
  /**
   * <pre>
   * Used to filter Google Business Profile listings by labels. If entries exist
   * in labelFilters, only listings that have any of the labels set are
   * candidates to be synchronized into Assets. If no entries exist in
   * labelFilters, then all listings are candidates for syncing.
   * Label filters are OR'ed together.
   * </pre>
   *
   * <code>repeated string label_filters = 4;</code>
   * @param index The index of the element to return.
   * @return The labelFilters at the given index.
   */
  java.lang.String getLabelFilters(int index);
  /**
   * <pre>
   * Used to filter Google Business Profile listings by labels. If entries exist
   * in labelFilters, only listings that have any of the labels set are
   * candidates to be synchronized into Assets. If no entries exist in
   * labelFilters, then all listings are candidates for syncing.
   * Label filters are OR'ed together.
   * </pre>
   *
   * <code>repeated string label_filters = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labelFilters at the given index.
   */
  com.google.protobuf.ByteString
      getLabelFiltersBytes(int index);

  /**
   * <pre>
   * Used to filter Google Business Profile listings by listing id. If entries
   * exist in listingIdFilters, only listings specified by the filters are
   * candidates to be synchronized into Assets. If no entries exist in
   * listingIdFilters, then all listings are candidates for syncing.
   * Listing ID filters are OR'ed together.
   * </pre>
   *
   * <code>repeated int64 listing_id_filters = 5;</code>
   * @return A list containing the listingIdFilters.
   */
  java.util.List<java.lang.Long> getListingIdFiltersList();
  /**
   * <pre>
   * Used to filter Google Business Profile listings by listing id. If entries
   * exist in listingIdFilters, only listings specified by the filters are
   * candidates to be synchronized into Assets. If no entries exist in
   * listingIdFilters, then all listings are candidates for syncing.
   * Listing ID filters are OR'ed together.
   * </pre>
   *
   * <code>repeated int64 listing_id_filters = 5;</code>
   * @return The count of listingIdFilters.
   */
  int getListingIdFiltersCount();
  /**
   * <pre>
   * Used to filter Google Business Profile listings by listing id. If entries
   * exist in listingIdFilters, only listings specified by the filters are
   * candidates to be synchronized into Assets. If no entries exist in
   * listingIdFilters, then all listings are candidates for syncing.
   * Listing ID filters are OR'ed together.
   * </pre>
   *
   * <code>repeated int64 listing_id_filters = 5;</code>
   * @param index The index of the element to return.
   * @return The listingIdFilters at the given index.
   */
  long getListingIdFilters(int index);

  /**
   * <pre>
   * Immutable. The account ID of the managed business whose locations are to be
   * used. If this field is not set, then all businesses accessible by the user
   * (specified by the emailAddress) are used.
   * </pre>
   *
   * <code>string business_account_id = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The businessAccountId.
   */
  java.lang.String getBusinessAccountId();
  /**
   * <pre>
   * Immutable. The account ID of the managed business whose locations are to be
   * used. If this field is not set, then all businesses accessible by the user
   * (specified by the emailAddress) are used.
   * </pre>
   *
   * <code>string business_account_id = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for businessAccountId.
   */
  com.google.protobuf.ByteString
      getBusinessAccountIdBytes();
}
