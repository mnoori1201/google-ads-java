// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/frequency_cap.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * A rule specifying the maximum number of times an ad (or some set of ads) can
 * be shown to a user over a particular time period.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.FrequencyCapEntry}
 */
public final class FrequencyCapEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.FrequencyCapEntry)
    FrequencyCapEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FrequencyCapEntry.newBuilder() to construct.
  private FrequencyCapEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FrequencyCapEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FrequencyCapEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.FrequencyCapProto.internal_static_google_ads_googleads_v11_common_FrequencyCapEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.FrequencyCapProto.internal_static_google_ads_googleads_v11_common_FrequencyCapEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.FrequencyCapEntry.class, com.google.ads.googleads.v11.common.FrequencyCapEntry.Builder.class);
  }

  private int bitField0_;
  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v11.common.FrequencyCapKey key_;
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.FrequencyCapKey getKey() {
    return key_ == null ? com.google.ads.googleads.v11.common.FrequencyCapKey.getDefaultInstance() : key_;
  }
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.FrequencyCapKeyOrBuilder getKeyOrBuilder() {
    return key_ == null ? com.google.ads.googleads.v11.common.FrequencyCapKey.getDefaultInstance() : key_;
  }

  public static final int CAP_FIELD_NUMBER = 3;
  private int cap_ = 0;
  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>optional int32 cap = 3;</code>
   * @return Whether the cap field is set.
   */
  @java.lang.Override
  public boolean hasCap() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>optional int32 cap = 3;</code>
   * @return The cap.
   */
  @java.lang.Override
  public int getCap() {
    return cap_;
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
    if (key_ != null) {
      output.writeMessage(1, getKey());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(3, cap_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, cap_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.FrequencyCapEntry)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.FrequencyCapEntry other = (com.google.ads.googleads.v11.common.FrequencyCapEntry) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (hasCap() != other.hasCap()) return false;
    if (hasCap()) {
      if (getCap()
          != other.getCap()) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasCap()) {
      hash = (37 * hash) + CAP_FIELD_NUMBER;
      hash = (53 * hash) + getCap();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.FrequencyCapEntry parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.FrequencyCapEntry prototype) {
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
   * A rule specifying the maximum number of times an ad (or some set of ads) can
   * be shown to a user over a particular time period.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.FrequencyCapEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.FrequencyCapEntry)
      com.google.ads.googleads.v11.common.FrequencyCapEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.FrequencyCapProto.internal_static_google_ads_googleads_v11_common_FrequencyCapEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.FrequencyCapProto.internal_static_google_ads_googleads_v11_common_FrequencyCapEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.FrequencyCapEntry.class, com.google.ads.googleads.v11.common.FrequencyCapEntry.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.FrequencyCapEntry.newBuilder()
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
      key_ = null;
      if (keyBuilder_ != null) {
        keyBuilder_.dispose();
        keyBuilder_ = null;
      }
      cap_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.FrequencyCapProto.internal_static_google_ads_googleads_v11_common_FrequencyCapEntry_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.FrequencyCapEntry getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.FrequencyCapEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.FrequencyCapEntry build() {
      com.google.ads.googleads.v11.common.FrequencyCapEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.FrequencyCapEntry buildPartial() {
      com.google.ads.googleads.v11.common.FrequencyCapEntry result = new com.google.ads.googleads.v11.common.FrequencyCapEntry(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.common.FrequencyCapEntry result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = keyBuilder_ == null
            ? key_
            : keyBuilder_.build();
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cap_ = cap_;
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
      if (other instanceof com.google.ads.googleads.v11.common.FrequencyCapEntry) {
        return mergeFrom((com.google.ads.googleads.v11.common.FrequencyCapEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.FrequencyCapEntry other) {
      if (other == com.google.ads.googleads.v11.common.FrequencyCapEntry.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.hasCap()) {
        setCap(other.getCap());
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
              input.readMessage(
                  getKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 24: {
              cap_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
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

    private com.google.ads.googleads.v11.common.FrequencyCapKey key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.FrequencyCapKey, com.google.ads.googleads.v11.common.FrequencyCapKey.Builder, com.google.ads.googleads.v11.common.FrequencyCapKeyOrBuilder> keyBuilder_;
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
     * @return The key.
     */
    public com.google.ads.googleads.v11.common.FrequencyCapKey getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? com.google.ads.googleads.v11.common.FrequencyCapKey.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
     */
    public Builder setKey(com.google.ads.googleads.v11.common.FrequencyCapKey value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
      } else {
        keyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
     */
    public Builder setKey(
        com.google.ads.googleads.v11.common.FrequencyCapKey.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
     */
    public Builder mergeKey(com.google.ads.googleads.v11.common.FrequencyCapKey value) {
      if (keyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          key_ != null &&
          key_ != com.google.ads.googleads.v11.common.FrequencyCapKey.getDefaultInstance()) {
          getKeyBuilder().mergeFrom(value);
        } else {
          key_ = value;
        }
      } else {
        keyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      key_ = null;
      if (keyBuilder_ != null) {
        keyBuilder_.dispose();
        keyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
     */
    public com.google.ads.googleads.v11.common.FrequencyCapKey.Builder getKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
     */
    public com.google.ads.googleads.v11.common.FrequencyCapKeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            com.google.ads.googleads.v11.common.FrequencyCapKey.getDefaultInstance() : key_;
      }
    }
    /**
     * <pre>
     * The key of a particular frequency cap. There can be no more
     * than one frequency cap with the same key.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.FrequencyCapKey key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.FrequencyCapKey, com.google.ads.googleads.v11.common.FrequencyCapKey.Builder, com.google.ads.googleads.v11.common.FrequencyCapKeyOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.common.FrequencyCapKey, com.google.ads.googleads.v11.common.FrequencyCapKey.Builder, com.google.ads.googleads.v11.common.FrequencyCapKeyOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private int cap_ ;
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>optional int32 cap = 3;</code>
     * @return Whether the cap field is set.
     */
    @java.lang.Override
    public boolean hasCap() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>optional int32 cap = 3;</code>
     * @return The cap.
     */
    @java.lang.Override
    public int getCap() {
      return cap_;
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>optional int32 cap = 3;</code>
     * @param value The cap to set.
     * @return This builder for chaining.
     */
    public Builder setCap(int value) {
      
      cap_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of events allowed during the time range by this cap.
     * </pre>
     *
     * <code>optional int32 cap = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCap() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cap_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.FrequencyCapEntry)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.FrequencyCapEntry)
  private static final com.google.ads.googleads.v11.common.FrequencyCapEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.FrequencyCapEntry();
  }

  public static com.google.ads.googleads.v11.common.FrequencyCapEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrequencyCapEntry>
      PARSER = new com.google.protobuf.AbstractParser<FrequencyCapEntry>() {
    @java.lang.Override
    public FrequencyCapEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<FrequencyCapEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrequencyCapEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.FrequencyCapEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

