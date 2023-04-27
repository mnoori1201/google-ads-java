// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/audience_insights_service.proto

package com.google.ads.googleads.v13.services;

/**
 * <pre>
 * Response message for [AudienceInsightsService.ListAudienceInsightsDates][].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse}
 */
public final class ListInsightsEligibleDatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse)
    ListInsightsEligibleDatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListInsightsEligibleDatesResponse.newBuilder() to construct.
  private ListInsightsEligibleDatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInsightsEligibleDatesResponse() {
    dataMonths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListInsightsEligibleDatesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_ListInsightsEligibleDatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_ListInsightsEligibleDatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse.class, com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse.Builder.class);
  }

  public static final int DATA_MONTHS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList dataMonths_;
  /**
   * <pre>
   * The months for which AudienceInsights data is currently
   * available, each represented as a string in the form "YYYY-MM".
   * </pre>
   *
   * <code>repeated string data_months = 1;</code>
   * @return A list containing the dataMonths.
   */
  public com.google.protobuf.ProtocolStringList
      getDataMonthsList() {
    return dataMonths_;
  }
  /**
   * <pre>
   * The months for which AudienceInsights data is currently
   * available, each represented as a string in the form "YYYY-MM".
   * </pre>
   *
   * <code>repeated string data_months = 1;</code>
   * @return The count of dataMonths.
   */
  public int getDataMonthsCount() {
    return dataMonths_.size();
  }
  /**
   * <pre>
   * The months for which AudienceInsights data is currently
   * available, each represented as a string in the form "YYYY-MM".
   * </pre>
   *
   * <code>repeated string data_months = 1;</code>
   * @param index The index of the element to return.
   * @return The dataMonths at the given index.
   */
  public java.lang.String getDataMonths(int index) {
    return dataMonths_.get(index);
  }
  /**
   * <pre>
   * The months for which AudienceInsights data is currently
   * available, each represented as a string in the form "YYYY-MM".
   * </pre>
   *
   * <code>repeated string data_months = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dataMonths at the given index.
   */
  public com.google.protobuf.ByteString
      getDataMonthsBytes(int index) {
    return dataMonths_.getByteString(index);
  }

  public static final int LAST_THIRTY_DAYS_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v13.common.DateRange lastThirtyDays_;
  /**
   * <pre>
   * The actual dates covered by the "last 30 days" date range that will be used
   * implicitly for
   * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
   * requests that have no data_month set.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
   * @return Whether the lastThirtyDays field is set.
   */
  @java.lang.Override
  public boolean hasLastThirtyDays() {
    return lastThirtyDays_ != null;
  }
  /**
   * <pre>
   * The actual dates covered by the "last 30 days" date range that will be used
   * implicitly for
   * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
   * requests that have no data_month set.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
   * @return The lastThirtyDays.
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.DateRange getLastThirtyDays() {
    return lastThirtyDays_ == null ? com.google.ads.googleads.v13.common.DateRange.getDefaultInstance() : lastThirtyDays_;
  }
  /**
   * <pre>
   * The actual dates covered by the "last 30 days" date range that will be used
   * implicitly for
   * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
   * requests that have no data_month set.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.DateRangeOrBuilder getLastThirtyDaysOrBuilder() {
    return lastThirtyDays_ == null ? com.google.ads.googleads.v13.common.DateRange.getDefaultInstance() : lastThirtyDays_;
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
    for (int i = 0; i < dataMonths_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataMonths_.getRaw(i));
    }
    if (lastThirtyDays_ != null) {
      output.writeMessage(2, getLastThirtyDays());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < dataMonths_.size(); i++) {
        dataSize += computeStringSizeNoTag(dataMonths_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDataMonthsList().size();
    }
    if (lastThirtyDays_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLastThirtyDays());
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
    if (!(obj instanceof com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse other = (com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse) obj;

    if (!getDataMonthsList()
        .equals(other.getDataMonthsList())) return false;
    if (hasLastThirtyDays() != other.hasLastThirtyDays()) return false;
    if (hasLastThirtyDays()) {
      if (!getLastThirtyDays()
          .equals(other.getLastThirtyDays())) return false;
    }
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
    if (getDataMonthsCount() > 0) {
      hash = (37 * hash) + DATA_MONTHS_FIELD_NUMBER;
      hash = (53 * hash) + getDataMonthsList().hashCode();
    }
    if (hasLastThirtyDays()) {
      hash = (37 * hash) + LAST_THIRTY_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getLastThirtyDays().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse prototype) {
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
   * Response message for [AudienceInsightsService.ListAudienceInsightsDates][].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse)
      com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_ListInsightsEligibleDatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_ListInsightsEligibleDatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse.class, com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse.newBuilder()
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
      dataMonths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      lastThirtyDays_ = null;
      if (lastThirtyDaysBuilder_ != null) {
        lastThirtyDaysBuilder_.dispose();
        lastThirtyDaysBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_ListInsightsEligibleDatesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse build() {
      com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse buildPartial() {
      com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse result = new com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        dataMonths_ = dataMonths_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dataMonths_ = dataMonths_;
    }

    private void buildPartial0(com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastThirtyDays_ = lastThirtyDaysBuilder_ == null
            ? lastThirtyDays_
            : lastThirtyDaysBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse) {
        return mergeFrom((com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse other) {
      if (other == com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse.getDefaultInstance()) return this;
      if (!other.dataMonths_.isEmpty()) {
        if (dataMonths_.isEmpty()) {
          dataMonths_ = other.dataMonths_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDataMonthsIsMutable();
          dataMonths_.addAll(other.dataMonths_);
        }
        onChanged();
      }
      if (other.hasLastThirtyDays()) {
        mergeLastThirtyDays(other.getLastThirtyDays());
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureDataMonthsIsMutable();
              dataMonths_.add(s);
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getLastThirtyDaysFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.protobuf.LazyStringList dataMonths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDataMonthsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataMonths_ = new com.google.protobuf.LazyStringArrayList(dataMonths_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The months for which AudienceInsights data is currently
     * available, each represented as a string in the form "YYYY-MM".
     * </pre>
     *
     * <code>repeated string data_months = 1;</code>
     * @return A list containing the dataMonths.
     */
    public com.google.protobuf.ProtocolStringList
        getDataMonthsList() {
      return dataMonths_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The months for which AudienceInsights data is currently
     * available, each represented as a string in the form "YYYY-MM".
     * </pre>
     *
     * <code>repeated string data_months = 1;</code>
     * @return The count of dataMonths.
     */
    public int getDataMonthsCount() {
      return dataMonths_.size();
    }
    /**
     * <pre>
     * The months for which AudienceInsights data is currently
     * available, each represented as a string in the form "YYYY-MM".
     * </pre>
     *
     * <code>repeated string data_months = 1;</code>
     * @param index The index of the element to return.
     * @return The dataMonths at the given index.
     */
    public java.lang.String getDataMonths(int index) {
      return dataMonths_.get(index);
    }
    /**
     * <pre>
     * The months for which AudienceInsights data is currently
     * available, each represented as a string in the form "YYYY-MM".
     * </pre>
     *
     * <code>repeated string data_months = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the dataMonths at the given index.
     */
    public com.google.protobuf.ByteString
        getDataMonthsBytes(int index) {
      return dataMonths_.getByteString(index);
    }
    /**
     * <pre>
     * The months for which AudienceInsights data is currently
     * available, each represented as a string in the form "YYYY-MM".
     * </pre>
     *
     * <code>repeated string data_months = 1;</code>
     * @param index The index to set the value at.
     * @param value The dataMonths to set.
     * @return This builder for chaining.
     */
    public Builder setDataMonths(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDataMonthsIsMutable();
      dataMonths_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The months for which AudienceInsights data is currently
     * available, each represented as a string in the form "YYYY-MM".
     * </pre>
     *
     * <code>repeated string data_months = 1;</code>
     * @param value The dataMonths to add.
     * @return This builder for chaining.
     */
    public Builder addDataMonths(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDataMonthsIsMutable();
      dataMonths_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The months for which AudienceInsights data is currently
     * available, each represented as a string in the form "YYYY-MM".
     * </pre>
     *
     * <code>repeated string data_months = 1;</code>
     * @param values The dataMonths to add.
     * @return This builder for chaining.
     */
    public Builder addAllDataMonths(
        java.lang.Iterable<java.lang.String> values) {
      ensureDataMonthsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dataMonths_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The months for which AudienceInsights data is currently
     * available, each represented as a string in the form "YYYY-MM".
     * </pre>
     *
     * <code>repeated string data_months = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataMonths() {
      dataMonths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The months for which AudienceInsights data is currently
     * available, each represented as a string in the form "YYYY-MM".
     * </pre>
     *
     * <code>repeated string data_months = 1;</code>
     * @param value The bytes of the dataMonths to add.
     * @return This builder for chaining.
     */
    public Builder addDataMonthsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDataMonthsIsMutable();
      dataMonths_.add(value);
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v13.common.DateRange lastThirtyDays_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v13.common.DateRange, com.google.ads.googleads.v13.common.DateRange.Builder, com.google.ads.googleads.v13.common.DateRangeOrBuilder> lastThirtyDaysBuilder_;
    /**
     * <pre>
     * The actual dates covered by the "last 30 days" date range that will be used
     * implicitly for
     * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
     * requests that have no data_month set.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
     * @return Whether the lastThirtyDays field is set.
     */
    public boolean hasLastThirtyDays() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The actual dates covered by the "last 30 days" date range that will be used
     * implicitly for
     * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
     * requests that have no data_month set.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
     * @return The lastThirtyDays.
     */
    public com.google.ads.googleads.v13.common.DateRange getLastThirtyDays() {
      if (lastThirtyDaysBuilder_ == null) {
        return lastThirtyDays_ == null ? com.google.ads.googleads.v13.common.DateRange.getDefaultInstance() : lastThirtyDays_;
      } else {
        return lastThirtyDaysBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The actual dates covered by the "last 30 days" date range that will be used
     * implicitly for
     * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
     * requests that have no data_month set.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
     */
    public Builder setLastThirtyDays(com.google.ads.googleads.v13.common.DateRange value) {
      if (lastThirtyDaysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastThirtyDays_ = value;
      } else {
        lastThirtyDaysBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The actual dates covered by the "last 30 days" date range that will be used
     * implicitly for
     * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
     * requests that have no data_month set.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
     */
    public Builder setLastThirtyDays(
        com.google.ads.googleads.v13.common.DateRange.Builder builderForValue) {
      if (lastThirtyDaysBuilder_ == null) {
        lastThirtyDays_ = builderForValue.build();
      } else {
        lastThirtyDaysBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The actual dates covered by the "last 30 days" date range that will be used
     * implicitly for
     * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
     * requests that have no data_month set.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
     */
    public Builder mergeLastThirtyDays(com.google.ads.googleads.v13.common.DateRange value) {
      if (lastThirtyDaysBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          lastThirtyDays_ != null &&
          lastThirtyDays_ != com.google.ads.googleads.v13.common.DateRange.getDefaultInstance()) {
          getLastThirtyDaysBuilder().mergeFrom(value);
        } else {
          lastThirtyDays_ = value;
        }
      } else {
        lastThirtyDaysBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The actual dates covered by the "last 30 days" date range that will be used
     * implicitly for
     * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
     * requests that have no data_month set.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
     */
    public Builder clearLastThirtyDays() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lastThirtyDays_ = null;
      if (lastThirtyDaysBuilder_ != null) {
        lastThirtyDaysBuilder_.dispose();
        lastThirtyDaysBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The actual dates covered by the "last 30 days" date range that will be used
     * implicitly for
     * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
     * requests that have no data_month set.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
     */
    public com.google.ads.googleads.v13.common.DateRange.Builder getLastThirtyDaysBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLastThirtyDaysFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The actual dates covered by the "last 30 days" date range that will be used
     * implicitly for
     * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
     * requests that have no data_month set.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
     */
    public com.google.ads.googleads.v13.common.DateRangeOrBuilder getLastThirtyDaysOrBuilder() {
      if (lastThirtyDaysBuilder_ != null) {
        return lastThirtyDaysBuilder_.getMessageOrBuilder();
      } else {
        return lastThirtyDays_ == null ?
            com.google.ads.googleads.v13.common.DateRange.getDefaultInstance() : lastThirtyDays_;
      }
    }
    /**
     * <pre>
     * The actual dates covered by the "last 30 days" date range that will be used
     * implicitly for
     * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights]
     * requests that have no data_month set.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.DateRange last_thirty_days = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v13.common.DateRange, com.google.ads.googleads.v13.common.DateRange.Builder, com.google.ads.googleads.v13.common.DateRangeOrBuilder> 
        getLastThirtyDaysFieldBuilder() {
      if (lastThirtyDaysBuilder_ == null) {
        lastThirtyDaysBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v13.common.DateRange, com.google.ads.googleads.v13.common.DateRange.Builder, com.google.ads.googleads.v13.common.DateRangeOrBuilder>(
                getLastThirtyDays(),
                getParentForChildren(),
                isClean());
        lastThirtyDays_ = null;
      }
      return lastThirtyDaysBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse)
  private static final com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse();
  }

  public static com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInsightsEligibleDatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListInsightsEligibleDatesResponse>() {
    @java.lang.Override
    public ListInsightsEligibleDatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListInsightsEligibleDatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInsightsEligibleDatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.services.ListInsightsEligibleDatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

