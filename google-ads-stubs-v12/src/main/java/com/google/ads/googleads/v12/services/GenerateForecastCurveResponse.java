// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/keyword_plan_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * Response message for
 * [KeywordPlanService.GenerateForecastCurve][google.ads.googleads.v12.services.KeywordPlanService.GenerateForecastCurve].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.GenerateForecastCurveResponse}
 */
public final class GenerateForecastCurveResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.GenerateForecastCurveResponse)
    GenerateForecastCurveResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateForecastCurveResponse.newBuilder() to construct.
  private GenerateForecastCurveResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateForecastCurveResponse() {
    campaignForecastCurves_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateForecastCurveResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_GenerateForecastCurveResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_GenerateForecastCurveResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.GenerateForecastCurveResponse.class, com.google.ads.googleads.v12.services.GenerateForecastCurveResponse.Builder.class);
  }

  public static final int CAMPAIGN_FORECAST_CURVES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve> campaignForecastCurves_;
  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve> getCampaignForecastCurvesList() {
    return campaignForecastCurves_;
  }
  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurveOrBuilder> 
      getCampaignForecastCurvesOrBuilderList() {
    return campaignForecastCurves_;
  }
  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  @java.lang.Override
  public int getCampaignForecastCurvesCount() {
    return campaignForecastCurves_.size();
  }
  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve getCampaignForecastCurves(int index) {
    return campaignForecastCurves_.get(index);
  }
  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurveOrBuilder getCampaignForecastCurvesOrBuilder(
      int index) {
    return campaignForecastCurves_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < campaignForecastCurves_.size(); i++) {
      output.writeMessage(1, campaignForecastCurves_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < campaignForecastCurves_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, campaignForecastCurves_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v12.services.GenerateForecastCurveResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.GenerateForecastCurveResponse other = (com.google.ads.googleads.v12.services.GenerateForecastCurveResponse) obj;

    if (!getCampaignForecastCurvesList()
        .equals(other.getCampaignForecastCurvesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCampaignForecastCurvesCount() > 0) {
      hash = (37 * hash) + CAMPAIGN_FORECAST_CURVES_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignForecastCurvesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v12.services.GenerateForecastCurveResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for
   * [KeywordPlanService.GenerateForecastCurve][google.ads.googleads.v12.services.KeywordPlanService.GenerateForecastCurve].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.GenerateForecastCurveResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.GenerateForecastCurveResponse)
      com.google.ads.googleads.v12.services.GenerateForecastCurveResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_GenerateForecastCurveResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_GenerateForecastCurveResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.GenerateForecastCurveResponse.class, com.google.ads.googleads.v12.services.GenerateForecastCurveResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.GenerateForecastCurveResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (campaignForecastCurvesBuilder_ == null) {
        campaignForecastCurves_ = java.util.Collections.emptyList();
      } else {
        campaignForecastCurves_ = null;
        campaignForecastCurvesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_GenerateForecastCurveResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.GenerateForecastCurveResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.GenerateForecastCurveResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.GenerateForecastCurveResponse build() {
      com.google.ads.googleads.v12.services.GenerateForecastCurveResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.GenerateForecastCurveResponse buildPartial() {
      com.google.ads.googleads.v12.services.GenerateForecastCurveResponse result = new com.google.ads.googleads.v12.services.GenerateForecastCurveResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v12.services.GenerateForecastCurveResponse result) {
      if (campaignForecastCurvesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          campaignForecastCurves_ = java.util.Collections.unmodifiableList(campaignForecastCurves_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.campaignForecastCurves_ = campaignForecastCurves_;
      } else {
        result.campaignForecastCurves_ = campaignForecastCurvesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.GenerateForecastCurveResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v12.services.GenerateForecastCurveResponse) {
        return mergeFrom((com.google.ads.googleads.v12.services.GenerateForecastCurveResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.GenerateForecastCurveResponse other) {
      if (other == com.google.ads.googleads.v12.services.GenerateForecastCurveResponse.getDefaultInstance()) return this;
      if (campaignForecastCurvesBuilder_ == null) {
        if (!other.campaignForecastCurves_.isEmpty()) {
          if (campaignForecastCurves_.isEmpty()) {
            campaignForecastCurves_ = other.campaignForecastCurves_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCampaignForecastCurvesIsMutable();
            campaignForecastCurves_.addAll(other.campaignForecastCurves_);
          }
          onChanged();
        }
      } else {
        if (!other.campaignForecastCurves_.isEmpty()) {
          if (campaignForecastCurvesBuilder_.isEmpty()) {
            campaignForecastCurvesBuilder_.dispose();
            campaignForecastCurvesBuilder_ = null;
            campaignForecastCurves_ = other.campaignForecastCurves_;
            bitField0_ = (bitField0_ & ~0x00000001);
            campaignForecastCurvesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCampaignForecastCurvesFieldBuilder() : null;
          } else {
            campaignForecastCurvesBuilder_.addAllMessages(other.campaignForecastCurves_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve m =
                  input.readMessage(
                      com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.parser(),
                      extensionRegistry);
              if (campaignForecastCurvesBuilder_ == null) {
                ensureCampaignForecastCurvesIsMutable();
                campaignForecastCurves_.add(m);
              } else {
                campaignForecastCurvesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve> campaignForecastCurves_ =
      java.util.Collections.emptyList();
    private void ensureCampaignForecastCurvesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        campaignForecastCurves_ = new java.util.ArrayList<com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve>(campaignForecastCurves_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurveOrBuilder> campaignForecastCurvesBuilder_;

    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve> getCampaignForecastCurvesList() {
      if (campaignForecastCurvesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(campaignForecastCurves_);
      } else {
        return campaignForecastCurvesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public int getCampaignForecastCurvesCount() {
      if (campaignForecastCurvesBuilder_ == null) {
        return campaignForecastCurves_.size();
      } else {
        return campaignForecastCurvesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve getCampaignForecastCurves(int index) {
      if (campaignForecastCurvesBuilder_ == null) {
        return campaignForecastCurves_.get(index);
      } else {
        return campaignForecastCurvesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public Builder setCampaignForecastCurves(
        int index, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve value) {
      if (campaignForecastCurvesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampaignForecastCurvesIsMutable();
        campaignForecastCurves_.set(index, value);
        onChanged();
      } else {
        campaignForecastCurvesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public Builder setCampaignForecastCurves(
        int index, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder builderForValue) {
      if (campaignForecastCurvesBuilder_ == null) {
        ensureCampaignForecastCurvesIsMutable();
        campaignForecastCurves_.set(index, builderForValue.build());
        onChanged();
      } else {
        campaignForecastCurvesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public Builder addCampaignForecastCurves(com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve value) {
      if (campaignForecastCurvesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampaignForecastCurvesIsMutable();
        campaignForecastCurves_.add(value);
        onChanged();
      } else {
        campaignForecastCurvesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public Builder addCampaignForecastCurves(
        int index, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve value) {
      if (campaignForecastCurvesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampaignForecastCurvesIsMutable();
        campaignForecastCurves_.add(index, value);
        onChanged();
      } else {
        campaignForecastCurvesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public Builder addCampaignForecastCurves(
        com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder builderForValue) {
      if (campaignForecastCurvesBuilder_ == null) {
        ensureCampaignForecastCurvesIsMutable();
        campaignForecastCurves_.add(builderForValue.build());
        onChanged();
      } else {
        campaignForecastCurvesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public Builder addCampaignForecastCurves(
        int index, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder builderForValue) {
      if (campaignForecastCurvesBuilder_ == null) {
        ensureCampaignForecastCurvesIsMutable();
        campaignForecastCurves_.add(index, builderForValue.build());
        onChanged();
      } else {
        campaignForecastCurvesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public Builder addAllCampaignForecastCurves(
        java.lang.Iterable<? extends com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve> values) {
      if (campaignForecastCurvesBuilder_ == null) {
        ensureCampaignForecastCurvesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, campaignForecastCurves_);
        onChanged();
      } else {
        campaignForecastCurvesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public Builder clearCampaignForecastCurves() {
      if (campaignForecastCurvesBuilder_ == null) {
        campaignForecastCurves_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        campaignForecastCurvesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public Builder removeCampaignForecastCurves(int index) {
      if (campaignForecastCurvesBuilder_ == null) {
        ensureCampaignForecastCurvesIsMutable();
        campaignForecastCurves_.remove(index);
        onChanged();
      } else {
        campaignForecastCurvesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder getCampaignForecastCurvesBuilder(
        int index) {
      return getCampaignForecastCurvesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurveOrBuilder getCampaignForecastCurvesOrBuilder(
        int index) {
      if (campaignForecastCurvesBuilder_ == null) {
        return campaignForecastCurves_.get(index);  } else {
        return campaignForecastCurvesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurveOrBuilder> 
         getCampaignForecastCurvesOrBuilderList() {
      if (campaignForecastCurvesBuilder_ != null) {
        return campaignForecastCurvesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(campaignForecastCurves_);
      }
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder addCampaignForecastCurvesBuilder() {
      return getCampaignForecastCurvesFieldBuilder().addBuilder(
          com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.getDefaultInstance());
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder addCampaignForecastCurvesBuilder(
        int index) {
      return getCampaignForecastCurvesFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.getDefaultInstance());
    }
    /**
     * <pre>
     * List of forecast curves for the keyword plan campaign.
     * One maximum.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder> 
         getCampaignForecastCurvesBuilderList() {
      return getCampaignForecastCurvesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurveOrBuilder> 
        getCampaignForecastCurvesFieldBuilder() {
      if (campaignForecastCurvesBuilder_ == null) {
        campaignForecastCurvesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurveOrBuilder>(
                campaignForecastCurves_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        campaignForecastCurves_ = null;
      }
      return campaignForecastCurvesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.GenerateForecastCurveResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.GenerateForecastCurveResponse)
  private static final com.google.ads.googleads.v12.services.GenerateForecastCurveResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.GenerateForecastCurveResponse();
  }

  public static com.google.ads.googleads.v12.services.GenerateForecastCurveResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateForecastCurveResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateForecastCurveResponse>() {
    @java.lang.Override
    public GenerateForecastCurveResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GenerateForecastCurveResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateForecastCurveResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.GenerateForecastCurveResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

