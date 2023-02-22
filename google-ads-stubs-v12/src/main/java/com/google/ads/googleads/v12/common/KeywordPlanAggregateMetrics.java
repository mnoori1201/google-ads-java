// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/keyword_plan_common.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * The aggregate metrics specification of the request.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.KeywordPlanAggregateMetrics}
 */
public final class KeywordPlanAggregateMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.KeywordPlanAggregateMetrics)
    KeywordPlanAggregateMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanAggregateMetrics.newBuilder() to construct.
  private KeywordPlanAggregateMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanAggregateMetrics() {
    aggregateMetricTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanAggregateMetrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v12_common_KeywordPlanAggregateMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v12_common_KeywordPlanAggregateMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics.class, com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics.Builder.class);
  }

  public static final int AGGREGATE_METRIC_TYPES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> aggregateMetricTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType> aggregateMetricTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType>() {
            public com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType convert(java.lang.Integer from) {
              com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType result = com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType.forNumber(from);
              return result == null ? com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @return A list containing the aggregateMetricTypes.
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType> getAggregateMetricTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType>(aggregateMetricTypes_, aggregateMetricTypes_converter_);
  }
  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @return The count of aggregateMetricTypes.
   */
  @java.lang.Override
  public int getAggregateMetricTypesCount() {
    return aggregateMetricTypes_.size();
  }
  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @param index The index of the element to return.
   * @return The aggregateMetricTypes at the given index.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType getAggregateMetricTypes(int index) {
    return aggregateMetricTypes_converter_.convert(aggregateMetricTypes_.get(index));
  }
  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @return A list containing the enum numeric values on the wire for aggregateMetricTypes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getAggregateMetricTypesValueList() {
    return aggregateMetricTypes_;
  }
  /**
   * <pre>
   * The list of aggregate metrics to fetch data.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of aggregateMetricTypes at the given index.
   */
  @java.lang.Override
  public int getAggregateMetricTypesValue(int index) {
    return aggregateMetricTypes_.get(index);
  }
  private int aggregateMetricTypesMemoizedSerializedSize;

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
    getSerializedSize();
    if (getAggregateMetricTypesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(aggregateMetricTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < aggregateMetricTypes_.size(); i++) {
      output.writeEnumNoTag(aggregateMetricTypes_.get(i));
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
      for (int i = 0; i < aggregateMetricTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(aggregateMetricTypes_.get(i));
      }
      size += dataSize;
      if (!getAggregateMetricTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }aggregateMetricTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics other = (com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics) obj;

    if (!aggregateMetricTypes_.equals(other.aggregateMetricTypes_)) return false;
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
    if (getAggregateMetricTypesCount() > 0) {
      hash = (37 * hash) + AGGREGATE_METRIC_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + aggregateMetricTypes_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics prototype) {
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
   * The aggregate metrics specification of the request.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.KeywordPlanAggregateMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.KeywordPlanAggregateMetrics)
      com.google.ads.googleads.v12.common.KeywordPlanAggregateMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v12_common_KeywordPlanAggregateMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v12_common_KeywordPlanAggregateMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics.class, com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics.newBuilder()
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
      aggregateMetricTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v12_common_KeywordPlanAggregateMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics build() {
      com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics buildPartial() {
      com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics result = new com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        aggregateMetricTypes_ = java.util.Collections.unmodifiableList(aggregateMetricTypes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.aggregateMetricTypes_ = aggregateMetricTypes_;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics result) {
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
      if (other instanceof com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics) {
        return mergeFrom((com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics other) {
      if (other == com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics.getDefaultInstance()) return this;
      if (!other.aggregateMetricTypes_.isEmpty()) {
        if (aggregateMetricTypes_.isEmpty()) {
          aggregateMetricTypes_ = other.aggregateMetricTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAggregateMetricTypesIsMutable();
          aggregateMetricTypes_.addAll(other.aggregateMetricTypes_);
        }
        onChanged();
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
            case 8: {
              int tmpRaw = input.readEnum();
              ensureAggregateMetricTypesIsMutable();
              aggregateMetricTypes_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureAggregateMetricTypesIsMutable();
                aggregateMetricTypes_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
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

    private java.util.List<java.lang.Integer> aggregateMetricTypes_ =
      java.util.Collections.emptyList();
    private void ensureAggregateMetricTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        aggregateMetricTypes_ = new java.util.ArrayList<java.lang.Integer>(aggregateMetricTypes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @return A list containing the aggregateMetricTypes.
     */
    public java.util.List<com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType> getAggregateMetricTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType>(aggregateMetricTypes_, aggregateMetricTypes_converter_);
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @return The count of aggregateMetricTypes.
     */
    public int getAggregateMetricTypesCount() {
      return aggregateMetricTypes_.size();
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @param index The index of the element to return.
     * @return The aggregateMetricTypes at the given index.
     */
    public com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType getAggregateMetricTypes(int index) {
      return aggregateMetricTypes_converter_.convert(aggregateMetricTypes_.get(index));
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @param index The index to set the value at.
     * @param value The aggregateMetricTypes to set.
     * @return This builder for chaining.
     */
    public Builder setAggregateMetricTypes(
        int index, com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAggregateMetricTypesIsMutable();
      aggregateMetricTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @param value The aggregateMetricTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAggregateMetricTypes(com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAggregateMetricTypesIsMutable();
      aggregateMetricTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @param values The aggregateMetricTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllAggregateMetricTypes(
        java.lang.Iterable<? extends com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType> values) {
      ensureAggregateMetricTypesIsMutable();
      for (com.google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType value : values) {
        aggregateMetricTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAggregateMetricTypes() {
      aggregateMetricTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @return A list containing the enum numeric values on the wire for aggregateMetricTypes.
     */
    public java.util.List<java.lang.Integer>
    getAggregateMetricTypesValueList() {
      return java.util.Collections.unmodifiableList(aggregateMetricTypes_);
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of aggregateMetricTypes at the given index.
     */
    public int getAggregateMetricTypesValue(int index) {
      return aggregateMetricTypes_.get(index);
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for aggregateMetricTypes to set.
     * @return This builder for chaining.
     */
    public Builder setAggregateMetricTypesValue(
        int index, int value) {
      ensureAggregateMetricTypesIsMutable();
      aggregateMetricTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @param value The enum numeric value on the wire for aggregateMetricTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAggregateMetricTypesValue(int value) {
      ensureAggregateMetricTypesIsMutable();
      aggregateMetricTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of aggregate metrics to fetch data.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType aggregate_metric_types = 1;</code>
     * @param values The enum numeric values on the wire for aggregateMetricTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllAggregateMetricTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureAggregateMetricTypesIsMutable();
      for (int value : values) {
        aggregateMetricTypes_.add(value);
      }
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.KeywordPlanAggregateMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.KeywordPlanAggregateMetrics)
  private static final com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics();
  }

  public static com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanAggregateMetrics>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanAggregateMetrics>() {
    @java.lang.Override
    public KeywordPlanAggregateMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordPlanAggregateMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanAggregateMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

