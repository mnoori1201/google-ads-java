// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/criteria.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Custom attribute of a product offer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.ProductCustomAttributeInfo}
 */
public final class ProductCustomAttributeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.ProductCustomAttributeInfo)
    ProductCustomAttributeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductCustomAttributeInfo.newBuilder() to construct.
  private ProductCustomAttributeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductCustomAttributeInfo() {
    value_ = "";
    index_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductCustomAttributeInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProductCustomAttributeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProductCustomAttributeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.ProductCustomAttributeInfo.class, com.google.ads.googleads.v11.common.ProductCustomAttributeInfo.Builder.class);
  }

  private int bitField0_;
  public static final int VALUE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   * <pre>
   * String value of the product custom attribute.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * String value of the product custom attribute.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * String value of the product custom attribute.
   * </pre>
   *
   * <code>optional string value = 3;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INDEX_FIELD_NUMBER = 2;
  private int index_ = 0;
  /**
   * <pre>
   * Indicates the index of the custom attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
   * @return The enum numeric value on the wire for index.
   */
  @java.lang.Override public int getIndexValue() {
    return index_;
  }
  /**
   * <pre>
   * Indicates the index of the custom attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
   * @return The index.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex getIndex() {
    com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex result = com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex.forNumber(index_);
    return result == null ? com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex.UNRECOGNIZED : result;
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
    if (index_ != com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, index_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, index_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.ProductCustomAttributeInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.ProductCustomAttributeInfo other = (com.google.ads.googleads.v11.common.ProductCustomAttributeInfo) obj;

    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (index_ != other.index_) return false;
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
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + index_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.ProductCustomAttributeInfo prototype) {
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
   * Custom attribute of a product offer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.ProductCustomAttributeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.ProductCustomAttributeInfo)
      com.google.ads.googleads.v11.common.ProductCustomAttributeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProductCustomAttributeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProductCustomAttributeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.ProductCustomAttributeInfo.class, com.google.ads.googleads.v11.common.ProductCustomAttributeInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.ProductCustomAttributeInfo.newBuilder()
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
      value_ = "";
      index_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProductCustomAttributeInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ProductCustomAttributeInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.ProductCustomAttributeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ProductCustomAttributeInfo build() {
      com.google.ads.googleads.v11.common.ProductCustomAttributeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ProductCustomAttributeInfo buildPartial() {
      com.google.ads.googleads.v11.common.ProductCustomAttributeInfo result = new com.google.ads.googleads.v11.common.ProductCustomAttributeInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.common.ProductCustomAttributeInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.index_ = index_;
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
      if (other instanceof com.google.ads.googleads.v11.common.ProductCustomAttributeInfo) {
        return mergeFrom((com.google.ads.googleads.v11.common.ProductCustomAttributeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.ProductCustomAttributeInfo other) {
      if (other == com.google.ads.googleads.v11.common.ProductCustomAttributeInfo.getDefaultInstance()) return this;
      if (other.hasValue()) {
        value_ = other.value_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.index_ != 0) {
        setIndexValue(other.getIndexValue());
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
            case 16: {
              index_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              value_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
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

    private java.lang.Object value_ = "";
    /**
     * <pre>
     * String value of the product custom attribute.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * String value of the product custom attribute.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * String value of the product custom attribute.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * String value of the product custom attribute.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String value of the product custom attribute.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String value of the product custom attribute.
     * </pre>
     *
     * <code>optional string value = 3;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int index_ = 0;
    /**
     * <pre>
     * Indicates the index of the custom attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
     * @return The enum numeric value on the wire for index.
     */
    @java.lang.Override public int getIndexValue() {
      return index_;
    }
    /**
     * <pre>
     * Indicates the index of the custom attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
     * @param value The enum numeric value on the wire for index to set.
     * @return This builder for chaining.
     */
    public Builder setIndexValue(int value) {
      index_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the index of the custom attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
     * @return The index.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex getIndex() {
      com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex result = com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex.forNumber(index_);
      return result == null ? com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Indicates the index of the custom attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(com.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      index_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the index of the custom attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      index_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.ProductCustomAttributeInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.ProductCustomAttributeInfo)
  private static final com.google.ads.googleads.v11.common.ProductCustomAttributeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.ProductCustomAttributeInfo();
  }

  public static com.google.ads.googleads.v11.common.ProductCustomAttributeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductCustomAttributeInfo>
      PARSER = new com.google.protobuf.AbstractParser<ProductCustomAttributeInfo>() {
    @java.lang.Override
    public ProductCustomAttributeInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProductCustomAttributeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductCustomAttributeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.ProductCustomAttributeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

