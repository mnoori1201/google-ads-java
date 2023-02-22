// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/bidding.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * An automated bidding strategy that sets bids so that a certain percentage of
 * search ads are shown at the top of the first page (or other targeted
 * location).
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.TargetImpressionShare}
 */
public final class TargetImpressionShare extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.TargetImpressionShare)
    TargetImpressionShareOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetImpressionShare.newBuilder() to construct.
  private TargetImpressionShare(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetImpressionShare() {
    location_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetImpressionShare();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.BiddingProto.internal_static_google_ads_googleads_v12_common_TargetImpressionShare_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.BiddingProto.internal_static_google_ads_googleads_v12_common_TargetImpressionShare_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.TargetImpressionShare.class, com.google.ads.googleads.v12.common.TargetImpressionShare.Builder.class);
  }

  private int bitField0_;
  public static final int LOCATION_FIELD_NUMBER = 1;
  private int location_ = 0;
  /**
   * <pre>
   * The targeted location on the search results page.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
   * @return The enum numeric value on the wire for location.
   */
  @java.lang.Override public int getLocationValue() {
    return location_;
  }
  /**
   * <pre>
   * The targeted location on the search results page.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
   * @return The location.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation getLocation() {
    com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation result = com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation.forNumber(location_);
    return result == null ? com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation.UNRECOGNIZED : result;
  }

  public static final int LOCATION_FRACTION_MICROS_FIELD_NUMBER = 4;
  private long locationFractionMicros_ = 0L;
  /**
   * <pre>
   * The chosen fraction of ads to be shown in the targeted location in micros.
   * For example, 1% equals 10,000.
   * </pre>
   *
   * <code>optional int64 location_fraction_micros = 4;</code>
   * @return Whether the locationFractionMicros field is set.
   */
  @java.lang.Override
  public boolean hasLocationFractionMicros() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The chosen fraction of ads to be shown in the targeted location in micros.
   * For example, 1% equals 10,000.
   * </pre>
   *
   * <code>optional int64 location_fraction_micros = 4;</code>
   * @return The locationFractionMicros.
   */
  @java.lang.Override
  public long getLocationFractionMicros() {
    return locationFractionMicros_;
  }

  public static final int CPC_BID_CEILING_MICROS_FIELD_NUMBER = 5;
  private long cpcBidCeilingMicros_ = 0L;
  /**
   * <pre>
   * The highest CPC bid the automated bidding system is permitted to specify.
   * This is a required field entered by the advertiser that sets the ceiling
   * and specified in local micros.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  @java.lang.Override
  public boolean hasCpcBidCeilingMicros() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The highest CPC bid the automated bidding system is permitted to specify.
   * This is a required field entered by the advertiser that sets the ceiling
   * and specified in local micros.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return The cpcBidCeilingMicros.
   */
  @java.lang.Override
  public long getCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_;
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
    if (location_ != com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, location_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(4, locationFractionMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(5, cpcBidCeilingMicros_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (location_ != com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, location_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, locationFractionMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, cpcBidCeilingMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.TargetImpressionShare)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.TargetImpressionShare other = (com.google.ads.googleads.v12.common.TargetImpressionShare) obj;

    if (location_ != other.location_) return false;
    if (hasLocationFractionMicros() != other.hasLocationFractionMicros()) return false;
    if (hasLocationFractionMicros()) {
      if (getLocationFractionMicros()
          != other.getLocationFractionMicros()) return false;
    }
    if (hasCpcBidCeilingMicros() != other.hasCpcBidCeilingMicros()) return false;
    if (hasCpcBidCeilingMicros()) {
      if (getCpcBidCeilingMicros()
          != other.getCpcBidCeilingMicros()) return false;
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
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + location_;
    if (hasLocationFractionMicros()) {
      hash = (37 * hash) + LOCATION_FRACTION_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLocationFractionMicros());
    }
    if (hasCpcBidCeilingMicros()) {
      hash = (37 * hash) + CPC_BID_CEILING_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCpcBidCeilingMicros());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.TargetImpressionShare parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.TargetImpressionShare prototype) {
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
   * An automated bidding strategy that sets bids so that a certain percentage of
   * search ads are shown at the top of the first page (or other targeted
   * location).
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.TargetImpressionShare}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.TargetImpressionShare)
      com.google.ads.googleads.v12.common.TargetImpressionShareOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.BiddingProto.internal_static_google_ads_googleads_v12_common_TargetImpressionShare_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.BiddingProto.internal_static_google_ads_googleads_v12_common_TargetImpressionShare_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.TargetImpressionShare.class, com.google.ads.googleads.v12.common.TargetImpressionShare.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.TargetImpressionShare.newBuilder()
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
      location_ = 0;
      locationFractionMicros_ = 0L;
      cpcBidCeilingMicros_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.BiddingProto.internal_static_google_ads_googleads_v12_common_TargetImpressionShare_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.TargetImpressionShare getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.TargetImpressionShare.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.TargetImpressionShare build() {
      com.google.ads.googleads.v12.common.TargetImpressionShare result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.TargetImpressionShare buildPartial() {
      com.google.ads.googleads.v12.common.TargetImpressionShare result = new com.google.ads.googleads.v12.common.TargetImpressionShare(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.TargetImpressionShare result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = location_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.locationFractionMicros_ = locationFractionMicros_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cpcBidCeilingMicros_ = cpcBidCeilingMicros_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v12.common.TargetImpressionShare) {
        return mergeFrom((com.google.ads.googleads.v12.common.TargetImpressionShare)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.TargetImpressionShare other) {
      if (other == com.google.ads.googleads.v12.common.TargetImpressionShare.getDefaultInstance()) return this;
      if (other.location_ != 0) {
        setLocationValue(other.getLocationValue());
      }
      if (other.hasLocationFractionMicros()) {
        setLocationFractionMicros(other.getLocationFractionMicros());
      }
      if (other.hasCpcBidCeilingMicros()) {
        setCpcBidCeilingMicros(other.getCpcBidCeilingMicros());
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
              location_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 32: {
              locationFractionMicros_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
            case 40: {
              cpcBidCeilingMicros_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 40
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

    private int location_ = 0;
    /**
     * <pre>
     * The targeted location on the search results page.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
     * @return The enum numeric value on the wire for location.
     */
    @java.lang.Override public int getLocationValue() {
      return location_;
    }
    /**
     * <pre>
     * The targeted location on the search results page.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
     * @param value The enum numeric value on the wire for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationValue(int value) {
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The targeted location on the search results page.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
     * @return The location.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation getLocation() {
      com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation result = com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation.forNumber(location_);
      return result == null ? com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The targeted location on the search results page.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      location_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The targeted location on the search results page.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      location_ = 0;
      onChanged();
      return this;
    }

    private long locationFractionMicros_ ;
    /**
     * <pre>
     * The chosen fraction of ads to be shown in the targeted location in micros.
     * For example, 1% equals 10,000.
     * </pre>
     *
     * <code>optional int64 location_fraction_micros = 4;</code>
     * @return Whether the locationFractionMicros field is set.
     */
    @java.lang.Override
    public boolean hasLocationFractionMicros() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The chosen fraction of ads to be shown in the targeted location in micros.
     * For example, 1% equals 10,000.
     * </pre>
     *
     * <code>optional int64 location_fraction_micros = 4;</code>
     * @return The locationFractionMicros.
     */
    @java.lang.Override
    public long getLocationFractionMicros() {
      return locationFractionMicros_;
    }
    /**
     * <pre>
     * The chosen fraction of ads to be shown in the targeted location in micros.
     * For example, 1% equals 10,000.
     * </pre>
     *
     * <code>optional int64 location_fraction_micros = 4;</code>
     * @param value The locationFractionMicros to set.
     * @return This builder for chaining.
     */
    public Builder setLocationFractionMicros(long value) {
      
      locationFractionMicros_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The chosen fraction of ads to be shown in the targeted location in micros.
     * For example, 1% equals 10,000.
     * </pre>
     *
     * <code>optional int64 location_fraction_micros = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocationFractionMicros() {
      bitField0_ = (bitField0_ & ~0x00000002);
      locationFractionMicros_ = 0L;
      onChanged();
      return this;
    }

    private long cpcBidCeilingMicros_ ;
    /**
     * <pre>
     * The highest CPC bid the automated bidding system is permitted to specify.
     * This is a required field entered by the advertiser that sets the ceiling
     * and specified in local micros.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
     * @return Whether the cpcBidCeilingMicros field is set.
     */
    @java.lang.Override
    public boolean hasCpcBidCeilingMicros() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The highest CPC bid the automated bidding system is permitted to specify.
     * This is a required field entered by the advertiser that sets the ceiling
     * and specified in local micros.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
     * @return The cpcBidCeilingMicros.
     */
    @java.lang.Override
    public long getCpcBidCeilingMicros() {
      return cpcBidCeilingMicros_;
    }
    /**
     * <pre>
     * The highest CPC bid the automated bidding system is permitted to specify.
     * This is a required field entered by the advertiser that sets the ceiling
     * and specified in local micros.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
     * @param value The cpcBidCeilingMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCpcBidCeilingMicros(long value) {
      
      cpcBidCeilingMicros_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The highest CPC bid the automated bidding system is permitted to specify.
     * This is a required field entered by the advertiser that sets the ceiling
     * and specified in local micros.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidCeilingMicros() {
      bitField0_ = (bitField0_ & ~0x00000004);
      cpcBidCeilingMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.TargetImpressionShare)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.TargetImpressionShare)
  private static final com.google.ads.googleads.v12.common.TargetImpressionShare DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.TargetImpressionShare();
  }

  public static com.google.ads.googleads.v12.common.TargetImpressionShare getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetImpressionShare>
      PARSER = new com.google.protobuf.AbstractParser<TargetImpressionShare>() {
    @java.lang.Override
    public TargetImpressionShare parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetImpressionShare> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetImpressionShare> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.TargetImpressionShare getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

