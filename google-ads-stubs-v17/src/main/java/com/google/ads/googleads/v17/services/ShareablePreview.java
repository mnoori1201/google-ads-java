// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/shareable_preview_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

/**
 * <pre>
 * A shareable preview with its identifier.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.services.ShareablePreview}
 */
public final class ShareablePreview extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.services.ShareablePreview)
    ShareablePreviewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShareablePreview.newBuilder() to construct.
  private ShareablePreview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShareablePreview() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShareablePreview();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v17_services_ShareablePreview_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v17_services_ShareablePreview_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.services.ShareablePreview.class, com.google.ads.googleads.v17.services.ShareablePreview.Builder.class);
  }

  private int bitField0_;
  public static final int ASSET_GROUP_IDENTIFIER_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v17.services.AssetGroupIdentifier assetGroupIdentifier_;
  /**
   * <pre>
   * Required. Asset group of the shareable preview.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the assetGroupIdentifier field is set.
   */
  @java.lang.Override
  public boolean hasAssetGroupIdentifier() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. Asset group of the shareable preview.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The assetGroupIdentifier.
   */
  @java.lang.Override
  public com.google.ads.googleads.v17.services.AssetGroupIdentifier getAssetGroupIdentifier() {
    return assetGroupIdentifier_ == null ? com.google.ads.googleads.v17.services.AssetGroupIdentifier.getDefaultInstance() : assetGroupIdentifier_;
  }
  /**
   * <pre>
   * Required. Asset group of the shareable preview.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v17.services.AssetGroupIdentifierOrBuilder getAssetGroupIdentifierOrBuilder() {
    return assetGroupIdentifier_ == null ? com.google.ads.googleads.v17.services.AssetGroupIdentifier.getDefaultInstance() : assetGroupIdentifier_;
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
      output.writeMessage(1, getAssetGroupIdentifier());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAssetGroupIdentifier());
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
    if (!(obj instanceof com.google.ads.googleads.v17.services.ShareablePreview)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.services.ShareablePreview other = (com.google.ads.googleads.v17.services.ShareablePreview) obj;

    if (hasAssetGroupIdentifier() != other.hasAssetGroupIdentifier()) return false;
    if (hasAssetGroupIdentifier()) {
      if (!getAssetGroupIdentifier()
          .equals(other.getAssetGroupIdentifier())) return false;
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
    if (hasAssetGroupIdentifier()) {
      hash = (37 * hash) + ASSET_GROUP_IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getAssetGroupIdentifier().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.services.ShareablePreview parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.services.ShareablePreview parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.ShareablePreview parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.services.ShareablePreview prototype) {
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
   * A shareable preview with its identifier.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.services.ShareablePreview}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.services.ShareablePreview)
      com.google.ads.googleads.v17.services.ShareablePreviewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v17_services_ShareablePreview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v17_services_ShareablePreview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.services.ShareablePreview.class, com.google.ads.googleads.v17.services.ShareablePreview.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.services.ShareablePreview.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAssetGroupIdentifierFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      assetGroupIdentifier_ = null;
      if (assetGroupIdentifierBuilder_ != null) {
        assetGroupIdentifierBuilder_.dispose();
        assetGroupIdentifierBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v17.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v17_services_ShareablePreview_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.ShareablePreview getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.services.ShareablePreview.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.ShareablePreview build() {
      com.google.ads.googleads.v17.services.ShareablePreview result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.ShareablePreview buildPartial() {
      com.google.ads.googleads.v17.services.ShareablePreview result = new com.google.ads.googleads.v17.services.ShareablePreview(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v17.services.ShareablePreview result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.assetGroupIdentifier_ = assetGroupIdentifierBuilder_ == null
            ? assetGroupIdentifier_
            : assetGroupIdentifierBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v17.services.ShareablePreview) {
        return mergeFrom((com.google.ads.googleads.v17.services.ShareablePreview)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.services.ShareablePreview other) {
      if (other == com.google.ads.googleads.v17.services.ShareablePreview.getDefaultInstance()) return this;
      if (other.hasAssetGroupIdentifier()) {
        mergeAssetGroupIdentifier(other.getAssetGroupIdentifier());
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
                  getAssetGroupIdentifierFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.ads.googleads.v17.services.AssetGroupIdentifier assetGroupIdentifier_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v17.services.AssetGroupIdentifier, com.google.ads.googleads.v17.services.AssetGroupIdentifier.Builder, com.google.ads.googleads.v17.services.AssetGroupIdentifierOrBuilder> assetGroupIdentifierBuilder_;
    /**
     * <pre>
     * Required. Asset group of the shareable preview.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the assetGroupIdentifier field is set.
     */
    public boolean hasAssetGroupIdentifier() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Asset group of the shareable preview.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The assetGroupIdentifier.
     */
    public com.google.ads.googleads.v17.services.AssetGroupIdentifier getAssetGroupIdentifier() {
      if (assetGroupIdentifierBuilder_ == null) {
        return assetGroupIdentifier_ == null ? com.google.ads.googleads.v17.services.AssetGroupIdentifier.getDefaultInstance() : assetGroupIdentifier_;
      } else {
        return assetGroupIdentifierBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Asset group of the shareable preview.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAssetGroupIdentifier(com.google.ads.googleads.v17.services.AssetGroupIdentifier value) {
      if (assetGroupIdentifierBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assetGroupIdentifier_ = value;
      } else {
        assetGroupIdentifierBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Asset group of the shareable preview.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAssetGroupIdentifier(
        com.google.ads.googleads.v17.services.AssetGroupIdentifier.Builder builderForValue) {
      if (assetGroupIdentifierBuilder_ == null) {
        assetGroupIdentifier_ = builderForValue.build();
      } else {
        assetGroupIdentifierBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Asset group of the shareable preview.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeAssetGroupIdentifier(com.google.ads.googleads.v17.services.AssetGroupIdentifier value) {
      if (assetGroupIdentifierBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          assetGroupIdentifier_ != null &&
          assetGroupIdentifier_ != com.google.ads.googleads.v17.services.AssetGroupIdentifier.getDefaultInstance()) {
          getAssetGroupIdentifierBuilder().mergeFrom(value);
        } else {
          assetGroupIdentifier_ = value;
        }
      } else {
        assetGroupIdentifierBuilder_.mergeFrom(value);
      }
      if (assetGroupIdentifier_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Asset group of the shareable preview.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAssetGroupIdentifier() {
      bitField0_ = (bitField0_ & ~0x00000001);
      assetGroupIdentifier_ = null;
      if (assetGroupIdentifierBuilder_ != null) {
        assetGroupIdentifierBuilder_.dispose();
        assetGroupIdentifierBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Asset group of the shareable preview.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v17.services.AssetGroupIdentifier.Builder getAssetGroupIdentifierBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAssetGroupIdentifierFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Asset group of the shareable preview.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v17.services.AssetGroupIdentifierOrBuilder getAssetGroupIdentifierOrBuilder() {
      if (assetGroupIdentifierBuilder_ != null) {
        return assetGroupIdentifierBuilder_.getMessageOrBuilder();
      } else {
        return assetGroupIdentifier_ == null ?
            com.google.ads.googleads.v17.services.AssetGroupIdentifier.getDefaultInstance() : assetGroupIdentifier_;
      }
    }
    /**
     * <pre>
     * Required. Asset group of the shareable preview.
     * </pre>
     *
     * <code>.google.ads.googleads.v17.services.AssetGroupIdentifier asset_group_identifier = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v17.services.AssetGroupIdentifier, com.google.ads.googleads.v17.services.AssetGroupIdentifier.Builder, com.google.ads.googleads.v17.services.AssetGroupIdentifierOrBuilder> 
        getAssetGroupIdentifierFieldBuilder() {
      if (assetGroupIdentifierBuilder_ == null) {
        assetGroupIdentifierBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v17.services.AssetGroupIdentifier, com.google.ads.googleads.v17.services.AssetGroupIdentifier.Builder, com.google.ads.googleads.v17.services.AssetGroupIdentifierOrBuilder>(
                getAssetGroupIdentifier(),
                getParentForChildren(),
                isClean());
        assetGroupIdentifier_ = null;
      }
      return assetGroupIdentifierBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.services.ShareablePreview)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.services.ShareablePreview)
  private static final com.google.ads.googleads.v17.services.ShareablePreview DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.services.ShareablePreview();
  }

  public static com.google.ads.googleads.v17.services.ShareablePreview getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShareablePreview>
      PARSER = new com.google.protobuf.AbstractParser<ShareablePreview>() {
    @java.lang.Override
    public ShareablePreview parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShareablePreview> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShareablePreview> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.services.ShareablePreview getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

