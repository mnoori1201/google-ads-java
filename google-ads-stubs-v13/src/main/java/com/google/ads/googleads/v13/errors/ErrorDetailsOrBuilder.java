// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/errors/errors.proto

package com.google.ads.googleads.v13.errors;

public interface ErrorDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.errors.ErrorDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The error code that should have been returned, but wasn't. This is used
   * when the error code is not published in the client specified version.
   * </pre>
   *
   * <code>string unpublished_error_code = 1;</code>
   * @return The unpublishedErrorCode.
   */
  java.lang.String getUnpublishedErrorCode();
  /**
   * <pre>
   * The error code that should have been returned, but wasn't. This is used
   * when the error code is not published in the client specified version.
   * </pre>
   *
   * <code>string unpublished_error_code = 1;</code>
   * @return The bytes for unpublishedErrorCode.
   */
  com.google.protobuf.ByteString
      getUnpublishedErrorCodeBytes();

  /**
   * <pre>
   * Describes an ad policy violation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.PolicyViolationDetails policy_violation_details = 2;</code>
   * @return Whether the policyViolationDetails field is set.
   */
  boolean hasPolicyViolationDetails();
  /**
   * <pre>
   * Describes an ad policy violation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.PolicyViolationDetails policy_violation_details = 2;</code>
   * @return The policyViolationDetails.
   */
  com.google.ads.googleads.v13.errors.PolicyViolationDetails getPolicyViolationDetails();
  /**
   * <pre>
   * Describes an ad policy violation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.PolicyViolationDetails policy_violation_details = 2;</code>
   */
  com.google.ads.googleads.v13.errors.PolicyViolationDetailsOrBuilder getPolicyViolationDetailsOrBuilder();

  /**
   * <pre>
   * Describes policy violation findings.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.PolicyFindingDetails policy_finding_details = 3;</code>
   * @return Whether the policyFindingDetails field is set.
   */
  boolean hasPolicyFindingDetails();
  /**
   * <pre>
   * Describes policy violation findings.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.PolicyFindingDetails policy_finding_details = 3;</code>
   * @return The policyFindingDetails.
   */
  com.google.ads.googleads.v13.errors.PolicyFindingDetails getPolicyFindingDetails();
  /**
   * <pre>
   * Describes policy violation findings.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.PolicyFindingDetails policy_finding_details = 3;</code>
   */
  com.google.ads.googleads.v13.errors.PolicyFindingDetailsOrBuilder getPolicyFindingDetailsOrBuilder();

  /**
   * <pre>
   * Details on the quota error, including the scope (account or developer), the
   * rate bucket name and the retry delay.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.QuotaErrorDetails quota_error_details = 4;</code>
   * @return Whether the quotaErrorDetails field is set.
   */
  boolean hasQuotaErrorDetails();
  /**
   * <pre>
   * Details on the quota error, including the scope (account or developer), the
   * rate bucket name and the retry delay.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.QuotaErrorDetails quota_error_details = 4;</code>
   * @return The quotaErrorDetails.
   */
  com.google.ads.googleads.v13.errors.QuotaErrorDetails getQuotaErrorDetails();
  /**
   * <pre>
   * Details on the quota error, including the scope (account or developer), the
   * rate bucket name and the retry delay.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.QuotaErrorDetails quota_error_details = 4;</code>
   */
  com.google.ads.googleads.v13.errors.QuotaErrorDetailsOrBuilder getQuotaErrorDetailsOrBuilder();

  /**
   * <pre>
   * Details for a resource count limit exceeded error.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.ResourceCountDetails resource_count_details = 5;</code>
   * @return Whether the resourceCountDetails field is set.
   */
  boolean hasResourceCountDetails();
  /**
   * <pre>
   * Details for a resource count limit exceeded error.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.ResourceCountDetails resource_count_details = 5;</code>
   * @return The resourceCountDetails.
   */
  com.google.ads.googleads.v13.errors.ResourceCountDetails getResourceCountDetails();
  /**
   * <pre>
   * Details for a resource count limit exceeded error.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.errors.ResourceCountDetails resource_count_details = 5;</code>
   */
  com.google.ads.googleads.v13.errors.ResourceCountDetailsOrBuilder getResourceCountDetailsOrBuilder();
}
