// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/campaign_shared_set.proto

package com.google.ads.googleads.v12.resources;

public interface CampaignSharedSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.CampaignSharedSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign shared set.
   * Campaign shared set resource names have the form:
   * `customers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign shared set.
   * Campaign shared set resource names have the form:
   * `customers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The campaign to which the campaign shared set belongs.
   * </pre>
   *
   * <code>optional string campaign = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the campaign shared set belongs.
   * </pre>
   *
   * <code>optional string campaign = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the campaign shared set belongs.
   * </pre>
   *
   * <code>optional string campaign = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Immutable. The shared set associated with the campaign. This may be a
   * negative keyword shared set of another customer. This customer should be a
   * manager of the other customer, otherwise the campaign shared set will exist
   * but have no serving effect. Only negative keyword shared sets can be
   * associated with Shopping campaigns. Only negative placement shared sets can
   * be associated with Display mobile app campaigns.
   * </pre>
   *
   * <code>optional string shared_set = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the sharedSet field is set.
   */
  boolean hasSharedSet();
  /**
   * <pre>
   * Immutable. The shared set associated with the campaign. This may be a
   * negative keyword shared set of another customer. This customer should be a
   * manager of the other customer, otherwise the campaign shared set will exist
   * but have no serving effect. Only negative keyword shared sets can be
   * associated with Shopping campaigns. Only negative placement shared sets can
   * be associated with Display mobile app campaigns.
   * </pre>
   *
   * <code>optional string shared_set = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The sharedSet.
   */
  java.lang.String getSharedSet();
  /**
   * <pre>
   * Immutable. The shared set associated with the campaign. This may be a
   * negative keyword shared set of another customer. This customer should be a
   * manager of the other customer, otherwise the campaign shared set will exist
   * but have no serving effect. Only negative keyword shared sets can be
   * associated with Shopping campaigns. Only negative placement shared sets can
   * be associated with Display mobile app campaigns.
   * </pre>
   *
   * <code>optional string shared_set = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for sharedSet.
   */
  com.google.protobuf.ByteString
      getSharedSetBytes();

  /**
   * <pre>
   * Output only. The status of this campaign shared set. Read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CampaignSharedSetStatusEnum.CampaignSharedSetStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of this campaign shared set. Read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CampaignSharedSetStatusEnum.CampaignSharedSetStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v12.enums.CampaignSharedSetStatusEnum.CampaignSharedSetStatus getStatus();
}
