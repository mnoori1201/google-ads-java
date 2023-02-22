// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/custom_conversion_goal_service.proto

package com.google.ads.googleads.v11.services;

public interface MutateCustomConversionGoalsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.MutateCustomConversionGoalsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer whose custom conversion goals are being
   * modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer whose custom conversion goals are being
   * modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to perform on individual custom conversion
   * goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.CustomConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v11.services.CustomConversionGoalOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual custom conversion
   * goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.CustomConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v11.services.CustomConversionGoalOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on individual custom conversion
   * goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.CustomConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on individual custom conversion
   * goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.CustomConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.services.CustomConversionGoalOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual custom conversion
   * goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.CustomConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v11.services.CustomConversionGoalOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned post mutation.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
   * @return The enum numeric value on the wire for responseContentType.
   */
  int getResponseContentTypeValue();
  /**
   * <pre>
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned post mutation.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
   * @return The responseContentType.
   */
  com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType getResponseContentType();
}
