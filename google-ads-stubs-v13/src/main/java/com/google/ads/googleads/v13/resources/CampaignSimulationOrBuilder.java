// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/campaign_simulation.proto

package com.google.ads.googleads.v13.resources;

public interface CampaignSimulationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.resources.CampaignSimulation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the campaign simulation.
   * Campaign simulation resource names have the form:
   * `customers/{customer_id}/campaignSimulations/{campaign_id}~{type}~{modification_method}~{start_date}~{end_date}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the campaign simulation.
   * Campaign simulation resource names have the form:
   * `customers/{customer_id}/campaignSimulations/{campaign_id}~{type}~{modification_method}~{start_date}~{end_date}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Campaign id of the simulation.
   * </pre>
   *
   * <code>int64 campaign_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The campaignId.
   */
  long getCampaignId();

  /**
   * <pre>
   * Output only. The field that the simulation modifies.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.SimulationTypeEnum.SimulationType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The field that the simulation modifies.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.SimulationTypeEnum.SimulationType type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v13.enums.SimulationTypeEnum.SimulationType getType();

  /**
   * <pre>
   * Output only. How the simulation modifies the field.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.SimulationModificationMethodEnum.SimulationModificationMethod modification_method = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for modificationMethod.
   */
  int getModificationMethodValue();
  /**
   * <pre>
   * Output only. How the simulation modifies the field.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.SimulationModificationMethodEnum.SimulationModificationMethod modification_method = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The modificationMethod.
   */
  com.google.ads.googleads.v13.enums.SimulationModificationMethodEnum.SimulationModificationMethod getModificationMethod();

  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD
   * format.
   * </pre>
   *
   * <code>string start_date = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * Output only. First day on which the simulation is based, in YYYY-MM-DD
   * format.
   * </pre>
   *
   * <code>string start_date = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD
   * format
   * </pre>
   *
   * <code>string end_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * Output only. Last day on which the simulation is based, in YYYY-MM-DD
   * format
   * </pre>
   *
   * <code>string end_date = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPC_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.CpcBidSimulationPointList cpc_bid_point_list = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the cpcBidPointList field is set.
   */
  boolean hasCpcBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPC_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.CpcBidSimulationPointList cpc_bid_point_list = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The cpcBidPointList.
   */
  com.google.ads.googleads.v13.common.CpcBidSimulationPointList getCpcBidPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is CPC_BID.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.CpcBidSimulationPointList cpc_bid_point_list = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v13.common.CpcBidSimulationPointListOrBuilder getCpcBidPointListOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_CPA.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TargetCpaSimulationPointList target_cpa_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetCpaPointList field is set.
   */
  boolean hasTargetCpaPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_CPA.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TargetCpaSimulationPointList target_cpa_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetCpaPointList.
   */
  com.google.ads.googleads.v13.common.TargetCpaSimulationPointList getTargetCpaPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_CPA.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TargetCpaSimulationPointList target_cpa_point_list = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v13.common.TargetCpaSimulationPointListOrBuilder getTargetCpaPointListOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_ROAS.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TargetRoasSimulationPointList target_roas_point_list = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetRoasPointList field is set.
   */
  boolean hasTargetRoasPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_ROAS.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TargetRoasSimulationPointList target_roas_point_list = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetRoasPointList.
   */
  com.google.ads.googleads.v13.common.TargetRoasSimulationPointList getTargetRoasPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is TARGET_ROAS.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TargetRoasSimulationPointList target_roas_point_list = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v13.common.TargetRoasSimulationPointListOrBuilder getTargetRoasPointListOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is
   * TARGET_IMPRESSION_SHARE.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TargetImpressionShareSimulationPointList target_impression_share_point_list = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetImpressionSharePointList field is set.
   */
  boolean hasTargetImpressionSharePointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is
   * TARGET_IMPRESSION_SHARE.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TargetImpressionShareSimulationPointList target_impression_share_point_list = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetImpressionSharePointList.
   */
  com.google.ads.googleads.v13.common.TargetImpressionShareSimulationPointList getTargetImpressionSharePointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is
   * TARGET_IMPRESSION_SHARE.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.TargetImpressionShareSimulationPointList target_impression_share_point_list = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v13.common.TargetImpressionShareSimulationPointListOrBuilder getTargetImpressionSharePointListOrBuilder();

  /**
   * <pre>
   * Output only. Simulation points if the simulation type is BUDGET.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.BudgetSimulationPointList budget_point_list = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the budgetPointList field is set.
   */
  boolean hasBudgetPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is BUDGET.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.BudgetSimulationPointList budget_point_list = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The budgetPointList.
   */
  com.google.ads.googleads.v13.common.BudgetSimulationPointList getBudgetPointList();
  /**
   * <pre>
   * Output only. Simulation points if the simulation type is BUDGET.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.BudgetSimulationPointList budget_point_list = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v13.common.BudgetSimulationPointListOrBuilder getBudgetPointListOrBuilder();

  public com.google.ads.googleads.v13.resources.CampaignSimulation.PointListCase getPointListCase();
}
