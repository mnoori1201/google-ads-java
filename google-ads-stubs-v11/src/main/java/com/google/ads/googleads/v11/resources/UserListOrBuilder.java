// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/user_list.proto

package com.google.ads.googleads.v11.resources;

public interface UserListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.UserList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the user list.
   * User list resource names have the form:
   * `customers/{customer_id}/userLists/{user_list_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the user list.
   * User list resource names have the form:
   * `customers/{customer_id}/userLists/{user_list_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Id of the user list.
   * </pre>
   *
   * <code>optional int64 id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. Id of the user list.
   * </pre>
   *
   * <code>optional int64 id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. An option that indicates if a user may edit a list. Depends on
   * the list ownership and list type. For example, external remarketing user
   * lists are not editable.
   * This field is read-only.
   * </pre>
   *
   * <code>optional bool read_only = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the readOnly field is set.
   */
  boolean hasReadOnly();
  /**
   * <pre>
   * Output only. An option that indicates if a user may edit a list. Depends on
   * the list ownership and list type. For example, external remarketing user
   * lists are not editable.
   * This field is read-only.
   * </pre>
   *
   * <code>optional bool read_only = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The readOnly.
   */
  boolean getReadOnly();

  /**
   * <pre>
   * Name of this user list. Depending on its access_reason, the user list name
   * may not be unique (for example, if access_reason=SHARED)
   * </pre>
   *
   * <code>optional string name = 27;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of this user list. Depending on its access_reason, the user list name
   * may not be unique (for example, if access_reason=SHARED)
   * </pre>
   *
   * <code>optional string name = 27;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of this user list. Depending on its access_reason, the user list name
   * may not be unique (for example, if access_reason=SHARED)
   * </pre>
   *
   * <code>optional string name = 27;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Description of this user list.
   * </pre>
   *
   * <code>optional string description = 28;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Description of this user list.
   * </pre>
   *
   * <code>optional string description = 28;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of this user list.
   * </pre>
   *
   * <code>optional string description = 28;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Membership status of this user list. Indicates whether a user list is open
   * or active. Only open user lists can accumulate more users and can be
   * targeted to.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListMembershipStatusEnum.UserListMembershipStatus membership_status = 6;</code>
   * @return The enum numeric value on the wire for membershipStatus.
   */
  int getMembershipStatusValue();
  /**
   * <pre>
   * Membership status of this user list. Indicates whether a user list is open
   * or active. Only open user lists can accumulate more users and can be
   * targeted to.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListMembershipStatusEnum.UserListMembershipStatus membership_status = 6;</code>
   * @return The membershipStatus.
   */
  com.google.ads.googleads.v11.enums.UserListMembershipStatusEnum.UserListMembershipStatus getMembershipStatus();

  /**
   * <pre>
   * An ID from external system. It is used by user list sellers to correlate
   * IDs on their systems.
   * </pre>
   *
   * <code>optional string integration_code = 29;</code>
   * @return Whether the integrationCode field is set.
   */
  boolean hasIntegrationCode();
  /**
   * <pre>
   * An ID from external system. It is used by user list sellers to correlate
   * IDs on their systems.
   * </pre>
   *
   * <code>optional string integration_code = 29;</code>
   * @return The integrationCode.
   */
  java.lang.String getIntegrationCode();
  /**
   * <pre>
   * An ID from external system. It is used by user list sellers to correlate
   * IDs on their systems.
   * </pre>
   *
   * <code>optional string integration_code = 29;</code>
   * @return The bytes for integrationCode.
   */
  com.google.protobuf.ByteString
      getIntegrationCodeBytes();

  /**
   * <pre>
   * Number of days a user's cookie stays on your list since its most recent
   * addition to the list. This field must be between 0 and 540 inclusive.
   * However, for CRM based userlists, this field can be set to 10000 which
   * means no expiration.
   * It'll be ignored for logical_user_list.
   * </pre>
   *
   * <code>optional int64 membership_life_span = 30;</code>
   * @return Whether the membershipLifeSpan field is set.
   */
  boolean hasMembershipLifeSpan();
  /**
   * <pre>
   * Number of days a user's cookie stays on your list since its most recent
   * addition to the list. This field must be between 0 and 540 inclusive.
   * However, for CRM based userlists, this field can be set to 10000 which
   * means no expiration.
   * It'll be ignored for logical_user_list.
   * </pre>
   *
   * <code>optional int64 membership_life_span = 30;</code>
   * @return The membershipLifeSpan.
   */
  long getMembershipLifeSpan();

  /**
   * <pre>
   * Output only. Estimated number of users in this user list, on the Google
   * Display Network. This value is null if the number of users has not yet been
   * determined.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 size_for_display = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the sizeForDisplay field is set.
   */
  boolean hasSizeForDisplay();
  /**
   * <pre>
   * Output only. Estimated number of users in this user list, on the Google
   * Display Network. This value is null if the number of users has not yet been
   * determined.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 size_for_display = 31 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The sizeForDisplay.
   */
  long getSizeForDisplay();

  /**
   * <pre>
   * Output only. Size range in terms of number of users of the UserList, on the
   * Google Display Network.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListSizeRangeEnum.UserListSizeRange size_range_for_display = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for sizeRangeForDisplay.
   */
  int getSizeRangeForDisplayValue();
  /**
   * <pre>
   * Output only. Size range in terms of number of users of the UserList, on the
   * Google Display Network.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListSizeRangeEnum.UserListSizeRange size_range_for_display = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The sizeRangeForDisplay.
   */
  com.google.ads.googleads.v11.enums.UserListSizeRangeEnum.UserListSizeRange getSizeRangeForDisplay();

  /**
   * <pre>
   * Output only. Estimated number of users in this user list in the google.com
   * domain. These are the users available for targeting in Search campaigns.
   * This value is null if the number of users has not yet been determined.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 size_for_search = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the sizeForSearch field is set.
   */
  boolean hasSizeForSearch();
  /**
   * <pre>
   * Output only. Estimated number of users in this user list in the google.com
   * domain. These are the users available for targeting in Search campaigns.
   * This value is null if the number of users has not yet been determined.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 size_for_search = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The sizeForSearch.
   */
  long getSizeForSearch();

  /**
   * <pre>
   * Output only. Size range in terms of number of users of the UserList, for
   * Search ads.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListSizeRangeEnum.UserListSizeRange size_range_for_search = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for sizeRangeForSearch.
   */
  int getSizeRangeForSearchValue();
  /**
   * <pre>
   * Output only. Size range in terms of number of users of the UserList, for
   * Search ads.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListSizeRangeEnum.UserListSizeRange size_range_for_search = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The sizeRangeForSearch.
   */
  com.google.ads.googleads.v11.enums.UserListSizeRangeEnum.UserListSizeRange getSizeRangeForSearch();

  /**
   * <pre>
   * Output only. Type of this list.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListTypeEnum.UserListType type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. Type of this list.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListTypeEnum.UserListType type = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v11.enums.UserListTypeEnum.UserListType getType();

  /**
   * <pre>
   * Indicating the reason why this user list membership status is closed. It is
   * only populated on lists that were automatically closed due to inactivity,
   * and will be cleared once the list membership status becomes open.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListClosingReasonEnum.UserListClosingReason closing_reason = 14;</code>
   * @return The enum numeric value on the wire for closingReason.
   */
  int getClosingReasonValue();
  /**
   * <pre>
   * Indicating the reason why this user list membership status is closed. It is
   * only populated on lists that were automatically closed due to inactivity,
   * and will be cleared once the list membership status becomes open.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListClosingReasonEnum.UserListClosingReason closing_reason = 14;</code>
   * @return The closingReason.
   */
  com.google.ads.googleads.v11.enums.UserListClosingReasonEnum.UserListClosingReason getClosingReason();

  /**
   * <pre>
   * Output only. Indicates the reason this account has been granted access to
   * the list. The reason can be SHARED, OWNED, LICENSED or SUBSCRIBED.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.AccessReasonEnum.AccessReason access_reason = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for accessReason.
   */
  int getAccessReasonValue();
  /**
   * <pre>
   * Output only. Indicates the reason this account has been granted access to
   * the list. The reason can be SHARED, OWNED, LICENSED or SUBSCRIBED.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.AccessReasonEnum.AccessReason access_reason = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The accessReason.
   */
  com.google.ads.googleads.v11.enums.AccessReasonEnum.AccessReason getAccessReason();

  /**
   * <pre>
   * Indicates if this share is still enabled. When a UserList is shared with
   * the user this field is set to ENABLED. Later the userList owner can decide
   * to revoke the share and make it DISABLED.
   * The default value of this field is set to ENABLED.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListAccessStatusEnum.UserListAccessStatus account_user_list_status = 16;</code>
   * @return The enum numeric value on the wire for accountUserListStatus.
   */
  int getAccountUserListStatusValue();
  /**
   * <pre>
   * Indicates if this share is still enabled. When a UserList is shared with
   * the user this field is set to ENABLED. Later the userList owner can decide
   * to revoke the share and make it DISABLED.
   * The default value of this field is set to ENABLED.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.UserListAccessStatusEnum.UserListAccessStatus account_user_list_status = 16;</code>
   * @return The accountUserListStatus.
   */
  com.google.ads.googleads.v11.enums.UserListAccessStatusEnum.UserListAccessStatus getAccountUserListStatus();

  /**
   * <pre>
   * Indicates if this user list is eligible for Google Search Network.
   * </pre>
   *
   * <code>optional bool eligible_for_search = 33;</code>
   * @return Whether the eligibleForSearch field is set.
   */
  boolean hasEligibleForSearch();
  /**
   * <pre>
   * Indicates if this user list is eligible for Google Search Network.
   * </pre>
   *
   * <code>optional bool eligible_for_search = 33;</code>
   * @return The eligibleForSearch.
   */
  boolean getEligibleForSearch();

  /**
   * <pre>
   * Output only. Indicates this user list is eligible for Google Display
   * Network.
   * This field is read-only.
   * </pre>
   *
   * <code>optional bool eligible_for_display = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the eligibleForDisplay field is set.
   */
  boolean hasEligibleForDisplay();
  /**
   * <pre>
   * Output only. Indicates this user list is eligible for Google Display
   * Network.
   * This field is read-only.
   * </pre>
   *
   * <code>optional bool eligible_for_display = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The eligibleForDisplay.
   */
  boolean getEligibleForDisplay();

  /**
   * <pre>
   * Output only. Indicates match rate for Customer Match lists. The range of
   * this field is [0-100]. This will be null for other list types or when it's
   * not possible to calculate the match rate.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int32 match_rate_percentage = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the matchRatePercentage field is set.
   */
  boolean hasMatchRatePercentage();
  /**
   * <pre>
   * Output only. Indicates match rate for Customer Match lists. The range of
   * this field is [0-100]. This will be null for other list types or when it's
   * not possible to calculate the match rate.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int32 match_rate_percentage = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The matchRatePercentage.
   */
  int getMatchRatePercentage();

  /**
   * <pre>
   * User list of CRM users provided by the advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.CrmBasedUserListInfo crm_based_user_list = 19;</code>
   * @return Whether the crmBasedUserList field is set.
   */
  boolean hasCrmBasedUserList();
  /**
   * <pre>
   * User list of CRM users provided by the advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.CrmBasedUserListInfo crm_based_user_list = 19;</code>
   * @return The crmBasedUserList.
   */
  com.google.ads.googleads.v11.common.CrmBasedUserListInfo getCrmBasedUserList();
  /**
   * <pre>
   * User list of CRM users provided by the advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.CrmBasedUserListInfo crm_based_user_list = 19;</code>
   */
  com.google.ads.googleads.v11.common.CrmBasedUserListInfoOrBuilder getCrmBasedUserListOrBuilder();

  /**
   * <pre>
   * Output only. User list which are similar to users from another UserList.
   * These lists are readonly and automatically created by google.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.SimilarUserListInfo similar_user_list = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the similarUserList field is set.
   */
  boolean hasSimilarUserList();
  /**
   * <pre>
   * Output only. User list which are similar to users from another UserList.
   * These lists are readonly and automatically created by google.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.SimilarUserListInfo similar_user_list = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The similarUserList.
   */
  com.google.ads.googleads.v11.common.SimilarUserListInfo getSimilarUserList();
  /**
   * <pre>
   * Output only. User list which are similar to users from another UserList.
   * These lists are readonly and automatically created by google.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.SimilarUserListInfo similar_user_list = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v11.common.SimilarUserListInfoOrBuilder getSimilarUserListOrBuilder();

  /**
   * <pre>
   * User list generated by a rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.RuleBasedUserListInfo rule_based_user_list = 21;</code>
   * @return Whether the ruleBasedUserList field is set.
   */
  boolean hasRuleBasedUserList();
  /**
   * <pre>
   * User list generated by a rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.RuleBasedUserListInfo rule_based_user_list = 21;</code>
   * @return The ruleBasedUserList.
   */
  com.google.ads.googleads.v11.common.RuleBasedUserListInfo getRuleBasedUserList();
  /**
   * <pre>
   * User list generated by a rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.RuleBasedUserListInfo rule_based_user_list = 21;</code>
   */
  com.google.ads.googleads.v11.common.RuleBasedUserListInfoOrBuilder getRuleBasedUserListOrBuilder();

  /**
   * <pre>
   * User list that is a custom combination of user lists and user interests.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.LogicalUserListInfo logical_user_list = 22;</code>
   * @return Whether the logicalUserList field is set.
   */
  boolean hasLogicalUserList();
  /**
   * <pre>
   * User list that is a custom combination of user lists and user interests.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.LogicalUserListInfo logical_user_list = 22;</code>
   * @return The logicalUserList.
   */
  com.google.ads.googleads.v11.common.LogicalUserListInfo getLogicalUserList();
  /**
   * <pre>
   * User list that is a custom combination of user lists and user interests.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.LogicalUserListInfo logical_user_list = 22;</code>
   */
  com.google.ads.googleads.v11.common.LogicalUserListInfoOrBuilder getLogicalUserListOrBuilder();

  /**
   * <pre>
   * User list targeting as a collection of conversion or remarketing actions.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.BasicUserListInfo basic_user_list = 23;</code>
   * @return Whether the basicUserList field is set.
   */
  boolean hasBasicUserList();
  /**
   * <pre>
   * User list targeting as a collection of conversion or remarketing actions.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.BasicUserListInfo basic_user_list = 23;</code>
   * @return The basicUserList.
   */
  com.google.ads.googleads.v11.common.BasicUserListInfo getBasicUserList();
  /**
   * <pre>
   * User list targeting as a collection of conversion or remarketing actions.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.BasicUserListInfo basic_user_list = 23;</code>
   */
  com.google.ads.googleads.v11.common.BasicUserListInfoOrBuilder getBasicUserListOrBuilder();

  public com.google.ads.googleads.v11.resources.UserList.UserListCase getUserListCase();
}
