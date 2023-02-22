// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/keyword_plan_service.proto

package com.google.ads.googleads.v13.services;

public interface GenerateForecastTimeSeriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.services.GenerateForecastTimeSeriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecast> 
      getWeeklyTimeSeriesForecastsList();
  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  com.google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecast getWeeklyTimeSeriesForecasts(int index);
  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  int getWeeklyTimeSeriesForecastsCount();
  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecastOrBuilder> 
      getWeeklyTimeSeriesForecastsOrBuilderList();
  /**
   * <pre>
   * List of weekly time series forecasts for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecast weekly_time_series_forecasts = 1;</code>
   */
  com.google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecastOrBuilder getWeeklyTimeSeriesForecastsOrBuilder(
      int index);
}
