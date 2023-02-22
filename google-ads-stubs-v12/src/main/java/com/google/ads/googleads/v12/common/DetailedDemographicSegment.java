// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/audiences.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * Detailed demographic segment.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.DetailedDemographicSegment}
 */
public final class DetailedDemographicSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.DetailedDemographicSegment)
    DetailedDemographicSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DetailedDemographicSegment.newBuilder() to construct.
  private DetailedDemographicSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DetailedDemographicSegment() {
    detailedDemographic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DetailedDemographicSegment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AudiencesProto.internal_static_google_ads_googleads_v12_common_DetailedDemographicSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AudiencesProto.internal_static_google_ads_googleads_v12_common_DetailedDemographicSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.DetailedDemographicSegment.class, com.google.ads.googleads.v12.common.DetailedDemographicSegment.Builder.class);
  }

  private int bitField0_;
  public static final int DETAILED_DEMOGRAPHIC_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object detailedDemographic_ = "";
  /**
   * <pre>
   * The detailed demographic resource.
   * </pre>
   *
   * <code>optional string detailed_demographic = 1;</code>
   * @return Whether the detailedDemographic field is set.
   */
  @java.lang.Override
  public boolean hasDetailedDemographic() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The detailed demographic resource.
   * </pre>
   *
   * <code>optional string detailed_demographic = 1;</code>
   * @return The detailedDemographic.
   */
  @java.lang.Override
  public java.lang.String getDetailedDemographic() {
    java.lang.Object ref = detailedDemographic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      detailedDemographic_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The detailed demographic resource.
   * </pre>
   *
   * <code>optional string detailed_demographic = 1;</code>
   * @return The bytes for detailedDemographic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDetailedDemographicBytes() {
    java.lang.Object ref = detailedDemographic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      detailedDemographic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, detailedDemographic_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, detailedDemographic_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.DetailedDemographicSegment)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.DetailedDemographicSegment other = (com.google.ads.googleads.v12.common.DetailedDemographicSegment) obj;

    if (hasDetailedDemographic() != other.hasDetailedDemographic()) return false;
    if (hasDetailedDemographic()) {
      if (!getDetailedDemographic()
          .equals(other.getDetailedDemographic())) return false;
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
    if (hasDetailedDemographic()) {
      hash = (37 * hash) + DETAILED_DEMOGRAPHIC_FIELD_NUMBER;
      hash = (53 * hash) + getDetailedDemographic().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.DetailedDemographicSegment prototype) {
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
   * Detailed demographic segment.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.DetailedDemographicSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.DetailedDemographicSegment)
      com.google.ads.googleads.v12.common.DetailedDemographicSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AudiencesProto.internal_static_google_ads_googleads_v12_common_DetailedDemographicSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AudiencesProto.internal_static_google_ads_googleads_v12_common_DetailedDemographicSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.DetailedDemographicSegment.class, com.google.ads.googleads.v12.common.DetailedDemographicSegment.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.DetailedDemographicSegment.newBuilder()
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
      detailedDemographic_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AudiencesProto.internal_static_google_ads_googleads_v12_common_DetailedDemographicSegment_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.DetailedDemographicSegment getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.DetailedDemographicSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.DetailedDemographicSegment build() {
      com.google.ads.googleads.v12.common.DetailedDemographicSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.DetailedDemographicSegment buildPartial() {
      com.google.ads.googleads.v12.common.DetailedDemographicSegment result = new com.google.ads.googleads.v12.common.DetailedDemographicSegment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.DetailedDemographicSegment result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.detailedDemographic_ = detailedDemographic_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v12.common.DetailedDemographicSegment) {
        return mergeFrom((com.google.ads.googleads.v12.common.DetailedDemographicSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.DetailedDemographicSegment other) {
      if (other == com.google.ads.googleads.v12.common.DetailedDemographicSegment.getDefaultInstance()) return this;
      if (other.hasDetailedDemographic()) {
        detailedDemographic_ = other.detailedDemographic_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              detailedDemographic_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object detailedDemographic_ = "";
    /**
     * <pre>
     * The detailed demographic resource.
     * </pre>
     *
     * <code>optional string detailed_demographic = 1;</code>
     * @return Whether the detailedDemographic field is set.
     */
    public boolean hasDetailedDemographic() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The detailed demographic resource.
     * </pre>
     *
     * <code>optional string detailed_demographic = 1;</code>
     * @return The detailedDemographic.
     */
    public java.lang.String getDetailedDemographic() {
      java.lang.Object ref = detailedDemographic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        detailedDemographic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The detailed demographic resource.
     * </pre>
     *
     * <code>optional string detailed_demographic = 1;</code>
     * @return The bytes for detailedDemographic.
     */
    public com.google.protobuf.ByteString
        getDetailedDemographicBytes() {
      java.lang.Object ref = detailedDemographic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detailedDemographic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The detailed demographic resource.
     * </pre>
     *
     * <code>optional string detailed_demographic = 1;</code>
     * @param value The detailedDemographic to set.
     * @return This builder for chaining.
     */
    public Builder setDetailedDemographic(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      detailedDemographic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The detailed demographic resource.
     * </pre>
     *
     * <code>optional string detailed_demographic = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDetailedDemographic() {
      detailedDemographic_ = getDefaultInstance().getDetailedDemographic();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The detailed demographic resource.
     * </pre>
     *
     * <code>optional string detailed_demographic = 1;</code>
     * @param value The bytes for detailedDemographic to set.
     * @return This builder for chaining.
     */
    public Builder setDetailedDemographicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      detailedDemographic_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.DetailedDemographicSegment)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.DetailedDemographicSegment)
  private static final com.google.ads.googleads.v12.common.DetailedDemographicSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.DetailedDemographicSegment();
  }

  public static com.google.ads.googleads.v12.common.DetailedDemographicSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DetailedDemographicSegment>
      PARSER = new com.google.protobuf.AbstractParser<DetailedDemographicSegment>() {
    @java.lang.Override
    public DetailedDemographicSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<DetailedDemographicSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DetailedDemographicSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.DetailedDemographicSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

