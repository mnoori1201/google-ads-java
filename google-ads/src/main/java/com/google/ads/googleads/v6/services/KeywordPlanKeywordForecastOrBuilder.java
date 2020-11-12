// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/keyword_plan_service.proto

package com.google.ads.googleads.v6.services;

public interface KeywordPlanKeywordForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.KeywordPlanKeywordForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Plan keyword related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
   * </pre>
   *
   * <code>string keyword_plan_ad_group_keyword = 3;</code>
   * @return Whether the keywordPlanAdGroupKeyword field is set.
   */
  boolean hasKeywordPlanAdGroupKeyword();
  /**
   * <pre>
   * The resource name of the Keyword Plan keyword related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
   * </pre>
   *
   * <code>string keyword_plan_ad_group_keyword = 3;</code>
   * @return The keywordPlanAdGroupKeyword.
   */
  java.lang.String getKeywordPlanAdGroupKeyword();
  /**
   * <pre>
   * The resource name of the Keyword Plan keyword related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
   * </pre>
   *
   * <code>string keyword_plan_ad_group_keyword = 3;</code>
   * @return The bytes for keywordPlanAdGroupKeyword.
   */
  com.google.protobuf.ByteString
      getKeywordPlanAdGroupKeywordBytes();

  /**
   * <pre>
   * The forecast for the Keyword Plan keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.services.ForecastMetrics keyword_forecast = 2;</code>
   * @return Whether the keywordForecast field is set.
   */
  boolean hasKeywordForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.services.ForecastMetrics keyword_forecast = 2;</code>
   * @return The keywordForecast.
   */
  com.google.ads.googleads.v6.services.ForecastMetrics getKeywordForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.services.ForecastMetrics keyword_forecast = 2;</code>
   */
  com.google.ads.googleads.v6.services.ForecastMetricsOrBuilder getKeywordForecastOrBuilder();
}