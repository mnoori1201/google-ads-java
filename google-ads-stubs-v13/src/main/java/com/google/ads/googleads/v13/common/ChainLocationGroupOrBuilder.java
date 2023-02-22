// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/asset_set_types.proto

package com.google.ads.googleads.v13.common;

public interface ChainLocationGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.common.ChainLocationGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v13.common.ChainFilter> 
      getDynamicChainLocationGroupFiltersList();
  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  com.google.ads.googleads.v13.common.ChainFilter getDynamicChainLocationGroupFilters(int index);
  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  int getDynamicChainLocationGroupFiltersCount();
  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v13.common.ChainFilterOrBuilder> 
      getDynamicChainLocationGroupFiltersOrBuilderList();
  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  com.google.ads.googleads.v13.common.ChainFilterOrBuilder getDynamicChainLocationGroupFiltersOrBuilder(
      int index);
}
