// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/merchant_center_link_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * Response message for Merchant Center link mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse}
 */
public final class MutateMerchantCenterLinkResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse)
    MutateMerchantCenterLinkResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateMerchantCenterLinkResponse.newBuilder() to construct.
  private MutateMerchantCenterLinkResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateMerchantCenterLinkResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateMerchantCenterLinkResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v12_services_MutateMerchantCenterLinkResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v12_services_MutateMerchantCenterLinkResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse.class, com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result_;
  /**
   * <pre>
   * Result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   * Result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
   * @return The result.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult getResult() {
    return result_ == null ? com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * Result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResultOrBuilder getResultOrBuilder() {
    return result_ == null ? com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.getDefaultInstance() : result_;
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
    if (result_ != null) {
      output.writeMessage(2, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse other = (com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse prototype) {
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
   * Response message for Merchant Center link mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse)
      com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v12_services_MutateMerchantCenterLinkResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v12_services_MutateMerchantCenterLinkResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse.class, com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse.newBuilder()
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
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.MerchantCenterLinkServiceProto.internal_static_google_ads_googleads_v12_services_MutateMerchantCenterLinkResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse build() {
      com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse buildPartial() {
      com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse result = new com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse) {
        return mergeFrom((com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse other) {
      if (other == com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
            case 18: {
              input.readMessage(
                  getResultFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult, com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.Builder, com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResultOrBuilder> resultBuilder_;
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
     * @return The result.
     */
    public com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
     */
    public Builder setResult(com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
     */
    public Builder setResult(
        com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
     */
    public Builder mergeResult(com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          result_ != null &&
          result_ != com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
     */
    public com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.Builder getResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
     */
    public com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult, com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.Builder, com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult, com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResult.Builder, com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse)
  private static final com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse();
  }

  public static com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateMerchantCenterLinkResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateMerchantCenterLinkResponse>() {
    @java.lang.Override
    public MutateMerchantCenterLinkResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateMerchantCenterLinkResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateMerchantCenterLinkResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.MutateMerchantCenterLinkResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

