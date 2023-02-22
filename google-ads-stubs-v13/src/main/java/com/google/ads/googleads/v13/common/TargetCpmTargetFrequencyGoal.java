// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/bidding.proto

package com.google.ads.googleads.v13.common;

/**
 * <pre>
 * Target Frequency bidding goal details.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal}
 */
public final class TargetCpmTargetFrequencyGoal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal)
    TargetCpmTargetFrequencyGoalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetCpmTargetFrequencyGoal.newBuilder() to construct.
  private TargetCpmTargetFrequencyGoal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetCpmTargetFrequencyGoal() {
    timeUnit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetCpmTargetFrequencyGoal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetCpmTargetFrequencyGoal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetCpmTargetFrequencyGoal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal.class, com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal.Builder.class);
  }

  public static final int TARGET_COUNT_FIELD_NUMBER = 1;
  private long targetCount_ = 0L;
  /**
   * <pre>
   * Target Frequency count representing how many times you want to reach
   * a single user.
   * </pre>
   *
   * <code>int64 target_count = 1;</code>
   * @return The targetCount.
   */
  @java.lang.Override
  public long getTargetCount() {
    return targetCount_;
  }

  public static final int TIME_UNIT_FIELD_NUMBER = 2;
  private int timeUnit_ = 0;
  /**
   * <pre>
   * Time window expressing the period over which you want to reach
   * the specified target_count.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit time_unit = 2;</code>
   * @return The enum numeric value on the wire for timeUnit.
   */
  @java.lang.Override public int getTimeUnitValue() {
    return timeUnit_;
  }
  /**
   * <pre>
   * Time window expressing the period over which you want to reach
   * the specified target_count.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit time_unit = 2;</code>
   * @return The timeUnit.
   */
  @java.lang.Override public com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit getTimeUnit() {
    com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit result = com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit.forNumber(timeUnit_);
    return result == null ? com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit.UNRECOGNIZED : result;
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
    if (targetCount_ != 0L) {
      output.writeInt64(1, targetCount_);
    }
    if (timeUnit_ != com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, timeUnit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, targetCount_);
    }
    if (timeUnit_ != com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, timeUnit_);
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
    if (!(obj instanceof com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal other = (com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal) obj;

    if (getTargetCount()
        != other.getTargetCount()) return false;
    if (timeUnit_ != other.timeUnit_) return false;
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
    hash = (37 * hash) + TARGET_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTargetCount());
    hash = (37 * hash) + TIME_UNIT_FIELD_NUMBER;
    hash = (53 * hash) + timeUnit_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal prototype) {
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
   * Target Frequency bidding goal details.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal)
      com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetCpmTargetFrequencyGoal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetCpmTargetFrequencyGoal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal.class, com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal.newBuilder()
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
      targetCount_ = 0L;
      timeUnit_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetCpmTargetFrequencyGoal_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal build() {
      com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal buildPartial() {
      com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal result = new com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetCount_ = targetCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeUnit_ = timeUnit_;
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
      if (other instanceof com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal) {
        return mergeFrom((com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal other) {
      if (other == com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal.getDefaultInstance()) return this;
      if (other.getTargetCount() != 0L) {
        setTargetCount(other.getTargetCount());
      }
      if (other.timeUnit_ != 0) {
        setTimeUnitValue(other.getTimeUnitValue());
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
              targetCount_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              timeUnit_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long targetCount_ ;
    /**
     * <pre>
     * Target Frequency count representing how many times you want to reach
     * a single user.
     * </pre>
     *
     * <code>int64 target_count = 1;</code>
     * @return The targetCount.
     */
    @java.lang.Override
    public long getTargetCount() {
      return targetCount_;
    }
    /**
     * <pre>
     * Target Frequency count representing how many times you want to reach
     * a single user.
     * </pre>
     *
     * <code>int64 target_count = 1;</code>
     * @param value The targetCount to set.
     * @return This builder for chaining.
     */
    public Builder setTargetCount(long value) {
      
      targetCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target Frequency count representing how many times you want to reach
     * a single user.
     * </pre>
     *
     * <code>int64 target_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetCount_ = 0L;
      onChanged();
      return this;
    }

    private int timeUnit_ = 0;
    /**
     * <pre>
     * Time window expressing the period over which you want to reach
     * the specified target_count.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit time_unit = 2;</code>
     * @return The enum numeric value on the wire for timeUnit.
     */
    @java.lang.Override public int getTimeUnitValue() {
      return timeUnit_;
    }
    /**
     * <pre>
     * Time window expressing the period over which you want to reach
     * the specified target_count.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit time_unit = 2;</code>
     * @param value The enum numeric value on the wire for timeUnit to set.
     * @return This builder for chaining.
     */
    public Builder setTimeUnitValue(int value) {
      timeUnit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time window expressing the period over which you want to reach
     * the specified target_count.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit time_unit = 2;</code>
     * @return The timeUnit.
     */
    @java.lang.Override
    public com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit getTimeUnit() {
      com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit result = com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit.forNumber(timeUnit_);
      return result == null ? com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Time window expressing the period over which you want to reach
     * the specified target_count.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit time_unit = 2;</code>
     * @param value The timeUnit to set.
     * @return This builder for chaining.
     */
    public Builder setTimeUnit(com.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      timeUnit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time window expressing the period over which you want to reach
     * the specified target_count.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.TargetFrequencyTimeUnitEnum.TargetFrequencyTimeUnit time_unit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeUnit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeUnit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal)
  private static final com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal();
  }

  public static com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetCpmTargetFrequencyGoal>
      PARSER = new com.google.protobuf.AbstractParser<TargetCpmTargetFrequencyGoal>() {
    @java.lang.Override
    public TargetCpmTargetFrequencyGoal parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetCpmTargetFrequencyGoal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetCpmTargetFrequencyGoal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.common.TargetCpmTargetFrequencyGoal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

