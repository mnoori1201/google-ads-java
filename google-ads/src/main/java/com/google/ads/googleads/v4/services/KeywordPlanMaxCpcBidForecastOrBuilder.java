// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/keyword_plan_service.proto

package com.google.ads.googleads.v4.services;

public interface KeywordPlanMaxCpcBidForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.services.KeywordPlanMaxCpcBidForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The max cpc bid in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
   * @return Whether the maxCpcBidMicros field is set.
   */
  boolean hasMaxCpcBidMicros();
  /**
   * <pre>
   * The max cpc bid in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
   * @return The maxCpcBidMicros.
   */
  com.google.protobuf.Int64Value getMaxCpcBidMicros();
  /**
   * <pre>
   * The max cpc bid in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_cpc_bid_micros = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMaxCpcBidMicrosOrBuilder();

  /**
   * <pre>
   * The forecast for the Keyword Plan campaign at the specific bid.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
   * @return Whether the maxCpcBidForecast field is set.
   */
  boolean hasMaxCpcBidForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign at the specific bid.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
   * @return The maxCpcBidForecast.
   */
  com.google.ads.googleads.v4.services.ForecastMetrics getMaxCpcBidForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign at the specific bid.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.services.ForecastMetrics max_cpc_bid_forecast = 2;</code>
   */
  com.google.ads.googleads.v4.services.ForecastMetricsOrBuilder getMaxCpcBidForecastOrBuilder();
}