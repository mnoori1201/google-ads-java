/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Google Ads API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>================================== AccountBudgetProposalServiceClient
 * ==================================
 *
 * <p>Service Description: A service for managing account-level budgets via proposals.
 *
 * <p>A proposal is a request to create a new budget or make changes to an existing one.
 *
 * <p>Reads for account-level budgets managed by these proposals will be supported in a future
 * version. Please use BudgetOrderService until then:
 * https://developers.google.com/adwords/api/docs/guides/budget-order
 *
 * <p>Mutates: The CREATE operation creates a new proposal. UPDATE operations aren't supported. The
 * REMOVE operation cancels a pending proposal.
 *
 * <p>Sample for AccountBudgetProposalServiceClient:
 *
 * <pre>
 * <code>
 * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
 *   String formattedResourceName = AccountBudgetProposalServiceClient.formatAccountBudgetProposalName("[CUSTOMER]", "[ACCOUNT_BUDGET_PROPOSAL]");
 *   AccountBudgetProposal response = accountBudgetProposalServiceClient.getAccountBudgetProposal(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================== AccountBudgetServiceClient ==========================
 *
 * <p>Service Description: A service for fetching an account-level budget.
 *
 * <p>Account-level budgets are mutated by creating proposal resources.
 *
 * <p>Sample for AccountBudgetServiceClient:
 *
 * <pre>
 * <code>
 * try (AccountBudgetServiceClient accountBudgetServiceClient = AccountBudgetServiceClient.create()) {
 *   String formattedResourceName = AccountBudgetServiceClient.formatAccountBudgetName("[CUSTOMER]", "[ACCOUNT_BUDGET]");
 *   AccountBudget response = accountBudgetServiceClient.getAccountBudget(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== AdGroupAdServiceClient ======================
 *
 * <p>Service Description: Service to manage ads in an ad group.
 *
 * <p>Sample for AdGroupAdServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
 *   String formattedResourceName = AdGroupAdServiceClient.formatAdGroupAdName("[CUSTOMER]", "[AD_GROUP_AD]");
 *   AdGroupAd response = adGroupAdServiceClient.getAdGroupAd(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================ AdGroupAudienceViewServiceClient
 * ================================
 *
 * <p>Service Description: Service to manage ad group audience views.
 *
 * <p>Sample for AdGroupAudienceViewServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupAudienceViewServiceClient adGroupAudienceViewServiceClient = AdGroupAudienceViewServiceClient.create()) {
 *   String formattedResourceName = AdGroupAudienceViewServiceClient.formatAdGroupAudienceViewName("[CUSTOMER]", "[AD_GROUP_AUDIENCE_VIEW]");
 *   AdGroupAudienceView response = adGroupAudienceViewServiceClient.getAdGroupAudienceView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== AdGroupBidModifierServiceClient ===============================
 *
 * <p>Service Description: Service to manage ad group bid modifiers.
 *
 * <p>Sample for AdGroupBidModifierServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupBidModifierServiceClient adGroupBidModifierServiceClient = AdGroupBidModifierServiceClient.create()) {
 *   String formattedResourceName = AdGroupBidModifierServiceClient.formatAdGroupBidModifierName("[CUSTOMER]", "[AD_GROUP_BID_MODIFIER]");
 *   AdGroupBidModifier response = adGroupBidModifierServiceClient.getAdGroupBidModifier(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================= AdGroupCriterionServiceClient =============================
 *
 * <p>Service Description: Service to manage ad group criteria.
 *
 * <p>Sample for AdGroupCriterionServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
 *   String formattedResourceName = AdGroupCriterionServiceClient.formatAdGroupCriteriaName("[CUSTOMER]", "[AD_GROUP_CRITERIA]");
 *   AdGroupCriterion response = adGroupCriterionServiceClient.getAdGroupCriterion(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ==================== AdGroupServiceClient ====================
 *
 * <p>Service Description: Service to manage ad groups.
 *
 * <p>Sample for AdGroupServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
 *   String formattedResourceName = AdGroupServiceClient.formatAdGroupName("[CUSTOMER]", "[AD_GROUP]");
 *   AdGroup response = adGroupServiceClient.getAdGroup(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= AgeRangeViewServiceClient =========================
 *
 * <p>Service Description: Service to manage age range views.
 *
 * <p>Sample for AgeRangeViewServiceClient:
 *
 * <pre>
 * <code>
 * try (AgeRangeViewServiceClient ageRangeViewServiceClient = AgeRangeViewServiceClient.create()) {
 *   String formattedResourceName = AgeRangeViewServiceClient.formatAgeRangeViewName("[CUSTOMER]", "[AGE_RANGE_VIEW]");
 *   AgeRangeView response = ageRangeViewServiceClient.getAgeRangeView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ BiddingStrategyServiceClient ============================
 *
 * <p>Service Description: Service to manage bidding strategies.
 *
 * <p>Sample for BiddingStrategyServiceClient:
 *
 * <pre>
 * <code>
 * try (BiddingStrategyServiceClient biddingStrategyServiceClient = BiddingStrategyServiceClient.create()) {
 *   String formattedResourceName = BiddingStrategyServiceClient.formatBiddingStrategyName("[CUSTOMER]", "[BIDDING_STRATEGY]");
 *   BiddingStrategy response = biddingStrategyServiceClient.getBiddingStrategy(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= BillingSetupServiceClient =========================
 *
 * <p>Service Description: A service for designating the business entity responsible for accrued
 * costs.
 *
 * <p>A billing setup is associated with a Payments account. Billing-related activity for all
 * billing setups associated with a particular Payments account will appear on a single invoice
 * generated monthly.
 *
 * <p>Mutates: The REMOVE operation cancels a pending billing setup. The CREATE operation creates a
 * new billing setup.
 *
 * <p>Sample for BillingSetupServiceClient:
 *
 * <pre>
 * <code>
 * try (BillingSetupServiceClient billingSetupServiceClient = BillingSetupServiceClient.create()) {
 *   String formattedResourceName = BillingSetupServiceClient.formatBillingSetupName("[CUSTOMER]", "[BILLING_SETUP]");
 *   BillingSetup response = billingSetupServiceClient.getBillingSetup(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================ CampaignBidModifierServiceClient
 * ================================
 *
 * <p>Service Description: Service to manage campaign bid modifiers.
 *
 * <p>Sample for CampaignBidModifierServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignBidModifierServiceClient campaignBidModifierServiceClient = CampaignBidModifierServiceClient.create()) {
 *   String formattedResourceName = CampaignBidModifierServiceClient.formatCampaignBidModifierName("[CUSTOMER]", "[CAMPAIGN_BID_MODIFIER]");
 *   CampaignBidModifier response = campaignBidModifierServiceClient.getCampaignBidModifier(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== CampaignBudgetServiceClient ===========================
 *
 * <p>Service Description: Service to manage campaign budgets.
 *
 * <p>Sample for CampaignBudgetServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignBudgetServiceClient campaignBudgetServiceClient = CampaignBudgetServiceClient.create()) {
 *   String formattedResourceName = CampaignBudgetServiceClient.formatCampaignBudgetName("[CUSTOMER]", "[CAMPAIGN_BUDGET]");
 *   CampaignBudget response = campaignBudgetServiceClient.getCampaignBudget(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================== CampaignCriterionServiceClient ==============================
 *
 * <p>Service Description: Service to manage campaign criteria.
 *
 * <p>Sample for CampaignCriterionServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
 *   String formattedResourceName = CampaignCriterionServiceClient.formatCampaignCriteriaName("[CUSTOMER]", "[CAMPAIGN_CRITERIA]");
 *   CampaignCriterion response = campaignCriterionServiceClient.getCampaignCriterion(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================== CampaignGroupServiceClient ==========================
 *
 * <p>Service Description: Service to manage campaign groups.
 *
 * <p>Sample for CampaignGroupServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignGroupServiceClient campaignGroupServiceClient = CampaignGroupServiceClient.create()) {
 *   String formattedResourceName = CampaignGroupServiceClient.formatCampaignGroupName("[CUSTOMER]", "[CAMPAIGN_GROUP]");
 *   CampaignGroup response = campaignGroupServiceClient.getCampaignGroup(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ===================== CampaignServiceClient =====================
 *
 * <p>Service Description: Service to manage campaigns.
 *
 * <p>Sample for CampaignServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
 *   String formattedResourceName = CampaignServiceClient.formatCampaignName("[CUSTOMER]", "[CAMPAIGN]");
 *   Campaign response = campaignServiceClient.getCampaign(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================== CampaignSharedSetServiceClient ==============================
 *
 * <p>Service Description: Service to manage campaign shared sets.
 *
 * <p>Sample for CampaignSharedSetServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
 *   String formattedResourceName = CampaignSharedSetServiceClient.formatCampaignSharedSetName("[CUSTOMER]", "[CAMPAIGN_SHARED_SET]");
 *   CampaignSharedSet response = campaignSharedSetServiceClient.getCampaignSharedSet(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= ChangeStatusServiceClient =========================
 *
 * <p>Service Description: Service to fetch change statuses.
 *
 * <p>Sample for ChangeStatusServiceClient:
 *
 * <pre>
 * <code>
 * try (ChangeStatusServiceClient changeStatusServiceClient = ChangeStatusServiceClient.create()) {
 *   String formattedResourceName = ChangeStatusServiceClient.formatChangeStatusName("[CUSTOMER]", "[CHANGE_STATUS]");
 *   ChangeStatus response = changeStatusServiceClient.getChangeStatus(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================= ConversionActionServiceClient =============================
 *
 * <p>Service Description: Service to manage conversion actions.
 *
 * <p>Sample for ConversionActionServiceClient:
 *
 * <pre>
 * <code>
 * try (ConversionActionServiceClient conversionActionServiceClient = ConversionActionServiceClient.create()) {
 *   String formattedResourceName = ConversionActionServiceClient.formatConversionActionName("[CUSTOMER]", "[CONVERSION_ACTION]");
 *   ConversionAction response = conversionActionServiceClient.getConversionAction(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== CustomerClientLinkServiceClient ===============================
 *
 * <p>Service Description: Service to manage customer client links.
 *
 * <p>Sample for CustomerClientLinkServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerClientLinkServiceClient customerClientLinkServiceClient = CustomerClientLinkServiceClient.create()) {
 *   String formattedResourceName = CustomerClientLinkServiceClient.formatCustomerClientLinkName("[CUSTOMER]", "[CUSTOMER_CLIENT_LINK]");
 *   CustomerClientLink response = customerClientLinkServiceClient.getCustomerClientLink(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================ CustomerManagerLinkServiceClient
 * ================================
 *
 * <p>Service Description: Service to manage customer-manager links.
 *
 * <p>Sample for CustomerManagerLinkServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
 *   String formattedResourceName = CustomerManagerLinkServiceClient.formatCustomerManagerLinkName("[CUSTOMER]", "[CUSTOMER_MANAGER_LINK]");
 *   CustomerManagerLink response = customerManagerLinkServiceClient.getCustomerManagerLink(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ===================== CustomerServiceClient =====================
 *
 * <p>Service Description: Service to manage customers.
 *
 * <p>Sample for CustomerServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
 *   String formattedResourceName = CustomerServiceClient.formatCustomerName("[CUSTOMER]");
 *   Customer response = customerServiceClient.getCustomer(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== DisplayKeywordViewServiceClient ===============================
 *
 * <p>Service Description: Service to manage display keyword views.
 *
 * <p>Sample for DisplayKeywordViewServiceClient:
 *
 * <pre>
 * <code>
 * try (DisplayKeywordViewServiceClient displayKeywordViewServiceClient = DisplayKeywordViewServiceClient.create()) {
 *   String formattedResourceName = DisplayKeywordViewServiceClient.formatDisplayKeywordViewName("[CUSTOMER]", "[DISPLAY_KEYWORD_VIEW]");
 *   DisplayKeywordView response = displayKeywordViewServiceClient.getDisplayKeywordView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================= GenderViewServiceClient =======================
 *
 * <p>Service Description: Service to manage gender views.
 *
 * <p>Sample for GenderViewServiceClient:
 *
 * <pre>
 * <code>
 * try (GenderViewServiceClient genderViewServiceClient = GenderViewServiceClient.create()) {
 *   String formattedResourceName = GenderViewServiceClient.formatGenderViewName("[CUSTOMER]", "[GENDER_VIEW]");
 *   GenderView response = genderViewServiceClient.getGenderView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================== GeoTargetConstantServiceClient ==============================
 *
 * <p>Service Description: Service to fetch geo target constants.
 *
 * <p>Sample for GeoTargetConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (GeoTargetConstantServiceClient geoTargetConstantServiceClient = GeoTargetConstantServiceClient.create()) {
 *   String formattedResourceName = GeoTargetConstantServiceClient.formatGeoTargetConstantName("[GEO_TARGET_CONSTANT]");
 *   GeoTargetConstant response = geoTargetConstantServiceClient.getGeoTargetConstant(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== GoogleAdsFieldServiceClient ===========================
 *
 * <p>Service Description: Service to fetch Google Ads API fields.
 *
 * <p>Sample for GoogleAdsFieldServiceClient:
 *
 * <pre>
 * <code>
 * try (GoogleAdsFieldServiceClient googleAdsFieldServiceClient = GoogleAdsFieldServiceClient.create()) {
 *   String formattedResourceName = GoogleAdsFieldServiceClient.formatGoogleAdsFieldName("[GOOGLE_ADS_FIELD]");
 *   GoogleAdsField response = googleAdsFieldServiceClient.getGoogleAdsField(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== GoogleAdsServiceClient ======================
 *
 * <p>Service Description: Service to fetch data and metrics across resources.
 *
 * <p>Sample for GoogleAdsServiceClient:
 *
 * <pre>
 * <code>
 * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
 *   String customerId = "";
 *   String query = "";
 *   SearchPagedResponse response = googleAdsServiceClient.search(customerId, query);
 * }
 * </code>
 * </pre>
 *
 * =========================== HotelGroupViewServiceClient ===========================
 *
 * <p>Service Description: Service to manage Hotel Group Views.
 *
 * <p>Sample for HotelGroupViewServiceClient:
 *
 * <pre>
 * <code>
 * try (HotelGroupViewServiceClient hotelGroupViewServiceClient = HotelGroupViewServiceClient.create()) {
 *   String formattedResourceName = HotelGroupViewServiceClient.formatHotelGroupViewName("[CUSTOMER]", "[HOTEL_GROUP_VIEW]");
 *   HotelGroupView response = hotelGroupViewServiceClient.getHotelGroupView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================== KeywordViewServiceClient ========================
 *
 * <p>Service Description: Service to manage keyword views.
 *
 * <p>Sample for KeywordViewServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordViewServiceClient keywordViewServiceClient = KeywordViewServiceClient.create()) {
 *   String formattedResourceName = KeywordViewServiceClient.formatKeywordViewName("[CUSTOMER]", "[KEYWORD_VIEW]");
 *   KeywordView response = keywordViewServiceClient.getKeywordView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================= ManagedPlacementViewServiceClient
 * =================================
 *
 * <p>Service Description: Service to manage Managed Placement views.
 *
 * <p>Sample for ManagedPlacementViewServiceClient:
 *
 * <pre>
 * <code>
 * try (ManagedPlacementViewServiceClient managedPlacementViewServiceClient = ManagedPlacementViewServiceClient.create()) {
 *   String formattedResourceName = ManagedPlacementViewServiceClient.formatManagedPlacementViewName("[CUSTOMER]", "[MANAGED_PLACEMENT_VIEW]");
 *   ManagedPlacementView response = managedPlacementViewServiceClient.getManagedPlacementView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== MediaFileServiceClient ======================
 *
 * <p>Service Description: Service to manage media files.
 *
 * <p>Sample for MediaFileServiceClient:
 *
 * <pre>
 * <code>
 * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
 *   String formattedResourceName = MediaFileServiceClient.formatMediaFileName("[CUSTOMER]", "[MEDIA_FILE]");
 *   MediaFile response = mediaFileServiceClient.getMediaFile(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== ParentalStatusViewServiceClient ===============================
 *
 * <p>Service Description: Service to manage parental status views.
 *
 * <p>Sample for ParentalStatusViewServiceClient:
 *
 * <pre>
 * <code>
 * try (ParentalStatusViewServiceClient parentalStatusViewServiceClient = ParentalStatusViewServiceClient.create()) {
 *   String formattedResourceName = ParentalStatusViewServiceClient.formatParentalStatusViewName("[CUSTOMER]", "[PARENTAL_STATUS_VIEW]");
 *   ParentalStatusView response = parentalStatusViewServiceClient.getParentalStatusView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================= ProductGroupViewServiceClient =============================
 *
 * <p>Service Description: Service to manage product group views.
 *
 * <p>Sample for ProductGroupViewServiceClient:
 *
 * <pre>
 * <code>
 * try (ProductGroupViewServiceClient productGroupViewServiceClient = ProductGroupViewServiceClient.create()) {
 *   String formattedResourceName = ProductGroupViewServiceClient.formatProductGroupViewName("[CUSTOMER]", "[PRODUCT_GROUP_VIEW]");
 *   ProductGroupView response = productGroupViewServiceClient.getProductGroupView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== RecommendationServiceClient ===========================
 *
 * <p>Service Description: Service to manage recommendations.
 *
 * <p>Sample for RecommendationServiceClient:
 *
 * <pre>
 * <code>
 * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
 *   String formattedResourceName = RecommendationServiceClient.formatRecommendationName("[CUSTOMER]", "[RECOMMENDATION]");
 *   Recommendation response = recommendationServiceClient.getRecommendation(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ SharedCriterionServiceClient ============================
 *
 * <p>Service Description: Service to manage shared criteria.
 *
 * <p>Sample for SharedCriterionServiceClient:
 *
 * <pre>
 * <code>
 * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
 *   String formattedResourceName = SharedCriterionServiceClient.formatSharedCriteriaName("[CUSTOMER]", "[SHARED_CRITERIA]");
 *   SharedCriterion response = sharedCriterionServiceClient.getSharedCriterion(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== SharedSetServiceClient ======================
 *
 * <p>Service Description: Service to manage shared sets.
 *
 * <p>Sample for SharedSetServiceClient:
 *
 * <pre>
 * <code>
 * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
 *   String formattedResourceName = SharedSetServiceClient.formatSharedSetName("[CUSTOMER]", "[SHARED_SET]");
 *   SharedSet response = sharedSetServiceClient.getSharedSet(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================== TopicConstantServiceClient ==========================
 *
 * <p>Service Description: Service to fetch topic constants.
 *
 * <p>Sample for TopicConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (TopicConstantServiceClient topicConstantServiceClient = TopicConstantServiceClient.create()) {
 *   String formattedResourceName = TopicConstantServiceClient.formatTopicConstantName("[TOPIC_CONSTANT]");
 *   TopicConstant response = topicConstantServiceClient.getTopicConstant(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== TopicViewServiceClient ======================
 *
 * <p>Service Description: Service to manage topic views.
 *
 * <p>Sample for TopicViewServiceClient:
 *
 * <pre>
 * <code>
 * try (TopicViewServiceClient topicViewServiceClient = TopicViewServiceClient.create()) {
 *   String formattedResourceName = TopicViewServiceClient.formatTopicViewName("[CUSTOMER]", "[TOPIC_VIEW]");
 *   TopicView response = topicViewServiceClient.getTopicView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ================== VideoServiceClient ==================
 *
 * <p>Service Description: Service to manage videos.
 *
 * <p>Sample for VideoServiceClient:
 *
 * <pre>
 * <code>
 * try (VideoServiceClient videoServiceClient = VideoServiceClient.create()) {
 *   String formattedResourceName = VideoServiceClient.formatVideoName("[CUSTOMER]", "[VIDEO]");
 *   Video response = videoServiceClient.getVideo(formattedResourceName);
 * }
 * </code>
 * </pre>
 */
package com.google.ads.googleads.v0.services;
