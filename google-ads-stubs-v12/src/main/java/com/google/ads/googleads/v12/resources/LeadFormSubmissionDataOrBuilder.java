// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/lead_form_submission_data.proto

package com.google.ads.googleads.v12.resources;

public interface LeadFormSubmissionDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.LeadFormSubmissionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the lead form submission data.
   * Lead form submission data resource names have the form:
   * `customers/{customer_id}/leadFormSubmissionData/{lead_form_submission_data_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the lead form submission data.
   * Lead form submission data resource names have the form:
   * `customers/{customer_id}/leadFormSubmissionData/{lead_form_submission_data_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ID of this lead form submission.
   * </pre>
   *
   * <code>string id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. ID of this lead form submission.
   * </pre>
   *
   * <code>string id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. Asset associated with the submitted lead form.
   * </pre>
   *
   * <code>string asset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * Output only. Asset associated with the submitted lead form.
   * </pre>
   *
   * <code>string asset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * Output only. Campaign associated with the submitted lead form.
   * </pre>
   *
   * <code>string campaign = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Output only. Campaign associated with the submitted lead form.
   * </pre>
   *
   * <code>string campaign = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Output only. Submission data associated with a lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.LeadFormSubmissionField lead_form_submission_fields = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v12.resources.LeadFormSubmissionField> 
      getLeadFormSubmissionFieldsList();
  /**
   * <pre>
   * Output only. Submission data associated with a lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.LeadFormSubmissionField lead_form_submission_fields = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v12.resources.LeadFormSubmissionField getLeadFormSubmissionFields(int index);
  /**
   * <pre>
   * Output only. Submission data associated with a lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.LeadFormSubmissionField lead_form_submission_fields = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getLeadFormSubmissionFieldsCount();
  /**
   * <pre>
   * Output only. Submission data associated with a lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.LeadFormSubmissionField lead_form_submission_fields = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.resources.LeadFormSubmissionFieldOrBuilder> 
      getLeadFormSubmissionFieldsOrBuilderList();
  /**
   * <pre>
   * Output only. Submission data associated with a lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.LeadFormSubmissionField lead_form_submission_fields = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v12.resources.LeadFormSubmissionFieldOrBuilder getLeadFormSubmissionFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Submission data associated with a custom lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomLeadFormSubmissionField custom_lead_form_submission_fields = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v12.resources.CustomLeadFormSubmissionField> 
      getCustomLeadFormSubmissionFieldsList();
  /**
   * <pre>
   * Output only. Submission data associated with a custom lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomLeadFormSubmissionField custom_lead_form_submission_fields = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v12.resources.CustomLeadFormSubmissionField getCustomLeadFormSubmissionFields(int index);
  /**
   * <pre>
   * Output only. Submission data associated with a custom lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomLeadFormSubmissionField custom_lead_form_submission_fields = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getCustomLeadFormSubmissionFieldsCount();
  /**
   * <pre>
   * Output only. Submission data associated with a custom lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomLeadFormSubmissionField custom_lead_form_submission_fields = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.resources.CustomLeadFormSubmissionFieldOrBuilder> 
      getCustomLeadFormSubmissionFieldsOrBuilderList();
  /**
   * <pre>
   * Output only. Submission data associated with a custom lead form.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomLeadFormSubmissionField custom_lead_form_submission_fields = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v12.resources.CustomLeadFormSubmissionFieldOrBuilder getCustomLeadFormSubmissionFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. AdGroup associated with the submitted lead form.
   * </pre>
   *
   * <code>string ad_group = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * Output only. AdGroup associated with the submitted lead form.
   * </pre>
   *
   * <code>string ad_group = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * Output only. AdGroupAd associated with the submitted lead form.
   * </pre>
   *
   * <code>string ad_group_ad = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupAd.
   */
  java.lang.String getAdGroupAd();
  /**
   * <pre>
   * Output only. AdGroupAd associated with the submitted lead form.
   * </pre>
   *
   * <code>string ad_group_ad = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupAd.
   */
  com.google.protobuf.ByteString
      getAdGroupAdBytes();

  /**
   * <pre>
   * Output only. Google Click Id associated with the submissed lead form.
   * </pre>
   *
   * <code>string gclid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The gclid.
   */
  java.lang.String getGclid();
  /**
   * <pre>
   * Output only. Google Click Id associated with the submissed lead form.
   * </pre>
   *
   * <code>string gclid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for gclid.
   */
  com.google.protobuf.ByteString
      getGclidBytes();

  /**
   * <pre>
   * Output only. The date and time at which the lead form was submitted. The
   * format is "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01
   * 12:32:45-08:00".
   * </pre>
   *
   * <code>string submission_date_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The submissionDateTime.
   */
  java.lang.String getSubmissionDateTime();
  /**
   * <pre>
   * Output only. The date and time at which the lead form was submitted. The
   * format is "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01
   * 12:32:45-08:00".
   * </pre>
   *
   * <code>string submission_date_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for submissionDateTime.
   */
  com.google.protobuf.ByteString
      getSubmissionDateTimeBytes();
}
