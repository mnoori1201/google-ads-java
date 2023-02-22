// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/customer.proto

package com.google.ads.googleads.v11.resources;

public interface CustomerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.Customer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer.
   * Customer resource names have the form:
   * `customers/{customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer.
   * Customer resource names have the form:
   * `customers/{customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the customer.
   * </pre>
   *
   * <code>optional int64 id = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the customer.
   * </pre>
   *
   * <code>optional int64 id = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>optional string descriptive_name = 20;</code>
   * @return Whether the descriptiveName field is set.
   */
  boolean hasDescriptiveName();
  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>optional string descriptive_name = 20;</code>
   * @return The descriptiveName.
   */
  java.lang.String getDescriptiveName();
  /**
   * <pre>
   * Optional, non-unique descriptive name of the customer.
   * </pre>
   *
   * <code>optional string descriptive_name = 20;</code>
   * @return The bytes for descriptiveName.
   */
  com.google.protobuf.ByteString
      getDescriptiveNameBytes();

  /**
   * <pre>
   * Immutable. The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>optional string currency_code = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Immutable. The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>optional string currency_code = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Immutable. The currency in which the account operates.
   * A subset of the currency codes from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>optional string currency_code = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * Immutable. The local timezone ID of the customer.
   * </pre>
   *
   * <code>optional string time_zone = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * Immutable. The local timezone ID of the customer.
   * </pre>
   *
   * <code>optional string time_zone = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   * <pre>
   * Immutable. The local timezone ID of the customer.
   * </pre>
   *
   * <code>optional string time_zone = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString
      getTimeZoneBytes();

  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * Only mutable in an `update` operation.
   * </pre>
   *
   * <code>optional string tracking_url_template = 23;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * Only mutable in an `update` operation.
   * </pre>
   *
   * <code>optional string tracking_url_template = 23;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL out of parameters.
   * Only mutable in an `update` operation.
   * </pre>
   *
   * <code>optional string tracking_url_template = 23;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();

  /**
   * <pre>
   * The URL template for appending params to the final URL.
   * Only mutable in an `update` operation.
   * </pre>
   *
   * <code>optional string final_url_suffix = 24;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * The URL template for appending params to the final URL.
   * Only mutable in an `update` operation.
   * </pre>
   *
   * <code>optional string final_url_suffix = 24;</code>
   * @return The finalUrlSuffix.
   */
  java.lang.String getFinalUrlSuffix();
  /**
   * <pre>
   * The URL template for appending params to the final URL.
   * Only mutable in an `update` operation.
   * </pre>
   *
   * <code>optional string final_url_suffix = 24;</code>
   * @return The bytes for finalUrlSuffix.
   */
  com.google.protobuf.ByteString
      getFinalUrlSuffixBytes();

  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>optional bool auto_tagging_enabled = 25;</code>
   * @return Whether the autoTaggingEnabled field is set.
   */
  boolean hasAutoTaggingEnabled();
  /**
   * <pre>
   * Whether auto-tagging is enabled for the customer.
   * </pre>
   *
   * <code>optional bool auto_tagging_enabled = 25;</code>
   * @return The autoTaggingEnabled.
   */
  boolean getAutoTaggingEnabled();

  /**
   * <pre>
   * Output only. Whether the Customer has a Partners program badge. If the
   * Customer is not associated with the Partners program, this will be false.
   * For more information, see
   * https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>optional bool has_partners_badge = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasPartnersBadge field is set.
   */
  boolean hasHasPartnersBadge();
  /**
   * <pre>
   * Output only. Whether the Customer has a Partners program badge. If the
   * Customer is not associated with the Partners program, this will be false.
   * For more information, see
   * https://support.google.com/partners/answer/3125774.
   * </pre>
   *
   * <code>optional bool has_partners_badge = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasPartnersBadge.
   */
  boolean getHasPartnersBadge();

  /**
   * <pre>
   * Output only. Whether the customer is a manager.
   * </pre>
   *
   * <code>optional bool manager = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the manager field is set.
   */
  boolean hasManager();
  /**
   * <pre>
   * Output only. Whether the customer is a manager.
   * </pre>
   *
   * <code>optional bool manager = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The manager.
   */
  boolean getManager();

  /**
   * <pre>
   * Output only. Whether the customer is a test account.
   * </pre>
   *
   * <code>optional bool test_account = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the testAccount field is set.
   */
  boolean hasTestAccount();
  /**
   * <pre>
   * Output only. Whether the customer is a test account.
   * </pre>
   *
   * <code>optional bool test_account = 28 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The testAccount.
   */
  boolean getTestAccount();

  /**
   * <pre>
   * Call reporting setting for a customer. Only mutable in an `update`
   * operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.CallReportingSetting call_reporting_setting = 10;</code>
   * @return Whether the callReportingSetting field is set.
   */
  boolean hasCallReportingSetting();
  /**
   * <pre>
   * Call reporting setting for a customer. Only mutable in an `update`
   * operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.CallReportingSetting call_reporting_setting = 10;</code>
   * @return The callReportingSetting.
   */
  com.google.ads.googleads.v11.resources.CallReportingSetting getCallReportingSetting();
  /**
   * <pre>
   * Call reporting setting for a customer. Only mutable in an `update`
   * operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.CallReportingSetting call_reporting_setting = 10;</code>
   */
  com.google.ads.googleads.v11.resources.CallReportingSettingOrBuilder getCallReportingSettingOrBuilder();

  /**
   * <pre>
   * Output only. Conversion tracking setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.ConversionTrackingSetting conversion_tracking_setting = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the conversionTrackingSetting field is set.
   */
  boolean hasConversionTrackingSetting();
  /**
   * <pre>
   * Output only. Conversion tracking setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.ConversionTrackingSetting conversion_tracking_setting = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The conversionTrackingSetting.
   */
  com.google.ads.googleads.v11.resources.ConversionTrackingSetting getConversionTrackingSetting();
  /**
   * <pre>
   * Output only. Conversion tracking setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.ConversionTrackingSetting conversion_tracking_setting = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v11.resources.ConversionTrackingSettingOrBuilder getConversionTrackingSettingOrBuilder();

  /**
   * <pre>
   * Output only. Remarketing setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.RemarketingSetting remarketing_setting = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the remarketingSetting field is set.
   */
  boolean hasRemarketingSetting();
  /**
   * <pre>
   * Output only. Remarketing setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.RemarketingSetting remarketing_setting = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The remarketingSetting.
   */
  com.google.ads.googleads.v11.resources.RemarketingSetting getRemarketingSetting();
  /**
   * <pre>
   * Output only. Remarketing setting for a customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.RemarketingSetting remarketing_setting = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v11.resources.RemarketingSettingOrBuilder getRemarketingSettingOrBuilder();

  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use
   * PaymentMode.CONVERSIONS. If the list is empty, the customer is eligible.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the payPerConversionEligibilityFailureReasons.
   */
  java.util.List<com.google.ads.googleads.v11.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason> getPayPerConversionEligibilityFailureReasonsList();
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use
   * PaymentMode.CONVERSIONS. If the list is empty, the customer is eligible.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of payPerConversionEligibilityFailureReasons.
   */
  int getPayPerConversionEligibilityFailureReasonsCount();
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use
   * PaymentMode.CONVERSIONS. If the list is empty, the customer is eligible.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The payPerConversionEligibilityFailureReasons at the given index.
   */
  com.google.ads.googleads.v11.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason getPayPerConversionEligibilityFailureReasons(int index);
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use
   * PaymentMode.CONVERSIONS. If the list is empty, the customer is eligible.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the enum numeric values on the wire for payPerConversionEligibilityFailureReasons.
   */
  java.util.List<java.lang.Integer>
  getPayPerConversionEligibilityFailureReasonsValueList();
  /**
   * <pre>
   * Output only. Reasons why the customer is not eligible to use
   * PaymentMode.CONVERSIONS. If the list is empty, the customer is eligible.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason pay_per_conversion_eligibility_failure_reasons = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of payPerConversionEligibilityFailureReasons at the given index.
   */
  int getPayPerConversionEligibilityFailureReasonsValue(int index);

  /**
   * <pre>
   * Output only. Optimization score of the customer.
   * Optimization score is an estimate of how well a customer's campaigns are
   * set to perform. It ranges from 0% (0.0) to 100% (1.0). This field is null
   * for all manager customers, and for unscored non-manager customers.
   * See "About optimization score" at
   * https://support.google.com/google-ads/answer/9061546.
   * This field is read-only.
   * </pre>
   *
   * <code>optional double optimization_score = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the optimizationScore field is set.
   */
  boolean hasOptimizationScore();
  /**
   * <pre>
   * Output only. Optimization score of the customer.
   * Optimization score is an estimate of how well a customer's campaigns are
   * set to perform. It ranges from 0% (0.0) to 100% (1.0). This field is null
   * for all manager customers, and for unscored non-manager customers.
   * See "About optimization score" at
   * https://support.google.com/google-ads/answer/9061546.
   * This field is read-only.
   * </pre>
   *
   * <code>optional double optimization_score = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The optimizationScore.
   */
  double getOptimizationScore();

  /**
   * <pre>
   * Output only. Optimization score weight of the customer.
   * Optimization score weight can be used to compare/aggregate optimization
   * scores across multiple non-manager customers. The aggregate optimization
   * score of a manager is computed as the sum over all of their customers of
   * `Customer.optimization_score * Customer.optimization_score_weight`. This
   * field is 0 for all manager customers, and for unscored non-manager
   * customers.
   * This field is read-only.
   * </pre>
   *
   * <code>double optimization_score_weight = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The optimizationScoreWeight.
   */
  double getOptimizationScoreWeight();

  /**
   * <pre>
   * Output only. The status of the customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.CustomerStatusEnum.CustomerStatus status = 36 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the customer.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.CustomerStatusEnum.CustomerStatus status = 36 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v11.enums.CustomerStatusEnum.CustomerStatus getStatus();
}
