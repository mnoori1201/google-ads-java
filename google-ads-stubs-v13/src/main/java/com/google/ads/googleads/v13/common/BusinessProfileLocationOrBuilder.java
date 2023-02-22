// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/asset_types.proto

package com.google.ads.googleads.v13.common;

public interface BusinessProfileLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.common.BusinessProfileLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Advertiser specified label for the location on the Business Profile
   * account. This is synced from the Business Profile account.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @return A list containing the labels.
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * Advertiser specified label for the location on the Business Profile
   * account. This is synced from the Business Profile account.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @return The count of labels.
   */
  int getLabelsCount();
  /**
   * <pre>
   * Advertiser specified label for the location on the Business Profile
   * account. This is synced from the Business Profile account.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  java.lang.String getLabels(int index);
  /**
   * <pre>
   * Advertiser specified label for the location on the Business Profile
   * account. This is synced from the Business Profile account.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);

  /**
   * <pre>
   * Business Profile store code of this location. This is synced from the
   * Business Profile account.
   * </pre>
   *
   * <code>string store_code = 2;</code>
   * @return The storeCode.
   */
  java.lang.String getStoreCode();
  /**
   * <pre>
   * Business Profile store code of this location. This is synced from the
   * Business Profile account.
   * </pre>
   *
   * <code>string store_code = 2;</code>
   * @return The bytes for storeCode.
   */
  com.google.protobuf.ByteString
      getStoreCodeBytes();

  /**
   * <pre>
   * Listing ID of this Business Profile location. This is synced from the
   * linked Business Profile account.
   * </pre>
   *
   * <code>int64 listing_id = 3;</code>
   * @return The listingId.
   */
  long getListingId();
}
