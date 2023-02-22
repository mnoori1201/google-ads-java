// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/ad_type_infos.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Product image specific data.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.ProductImage}
 */
public final class ProductImage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.ProductImage)
    ProductImageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductImage.newBuilder() to construct.
  private ProductImage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductImage() {
    productImage_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductImage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.AdTypeInfosProto.internal_static_google_ads_googleads_v11_common_ProductImage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.AdTypeInfosProto.internal_static_google_ads_googleads_v11_common_ProductImage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.ProductImage.class, com.google.ads.googleads.v11.common.ProductImage.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCT_IMAGE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object productImage_ = "";
  /**
   * <pre>
   * The MediaFile resource name of the product image. Valid image types are
   * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
   * must be 1:1 (+-1%).
   * </pre>
   *
   * <code>optional string product_image = 4;</code>
   * @return Whether the productImage field is set.
   */
  @java.lang.Override
  public boolean hasProductImage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The MediaFile resource name of the product image. Valid image types are
   * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
   * must be 1:1 (+-1%).
   * </pre>
   *
   * <code>optional string product_image = 4;</code>
   * @return The productImage.
   */
  @java.lang.Override
  public java.lang.String getProductImage() {
    java.lang.Object ref = productImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productImage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The MediaFile resource name of the product image. Valid image types are
   * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
   * must be 1:1 (+-1%).
   * </pre>
   *
   * <code>optional string product_image = 4;</code>
   * @return The bytes for productImage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProductImageBytes() {
    java.lang.Object ref = productImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productImage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * Description of the product.
   * </pre>
   *
   * <code>optional string description = 5;</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Description of the product.
   * </pre>
   *
   * <code>optional string description = 5;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Description of the product.
   * </pre>
   *
   * <code>optional string description = 5;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_CALL_TO_ACTION_FIELD_NUMBER = 3;
  private com.google.ads.googleads.v11.common.DisplayCallToAction displayCallToAction_;
  /**
   * <pre>
   * Display-call-to-action of the product image.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
   * @return Whether the displayCallToAction field is set.
   */
  @java.lang.Override
  public boolean hasDisplayCallToAction() {
    return displayCallToAction_ != null;
  }
  /**
   * <pre>
   * Display-call-to-action of the product image.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
   * @return The displayCallToAction.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.DisplayCallToAction getDisplayCallToAction() {
    return displayCallToAction_ == null ? com.google.ads.googleads.v11.common.DisplayCallToAction.getDefaultInstance() : displayCallToAction_;
  }
  /**
   * <pre>
   * Display-call-to-action of the product image.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.DisplayCallToActionOrBuilder getDisplayCallToActionOrBuilder() {
    return displayCallToAction_ == null ? com.google.ads.googleads.v11.common.DisplayCallToAction.getDefaultInstance() : displayCallToAction_;
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
    if (displayCallToAction_ != null) {
      output.writeMessage(3, getDisplayCallToAction());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, productImage_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, description_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (displayCallToAction_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDisplayCallToAction());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, productImage_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, description_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.ProductImage)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.ProductImage other = (com.google.ads.googleads.v11.common.ProductImage) obj;

    if (hasProductImage() != other.hasProductImage()) return false;
    if (hasProductImage()) {
      if (!getProductImage()
          .equals(other.getProductImage())) return false;
    }
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
    }
    if (hasDisplayCallToAction() != other.hasDisplayCallToAction()) return false;
    if (hasDisplayCallToAction()) {
      if (!getDisplayCallToAction()
          .equals(other.getDisplayCallToAction())) return false;
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
    if (hasProductImage()) {
      hash = (37 * hash) + PRODUCT_IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getProductImage().hashCode();
    }
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    if (hasDisplayCallToAction()) {
      hash = (37 * hash) + DISPLAY_CALL_TO_ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayCallToAction().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ProductImage parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.ProductImage prototype) {
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
   * Product image specific data.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.ProductImage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.ProductImage)
      com.google.ads.googleads.v11.common.ProductImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.AdTypeInfosProto.internal_static_google_ads_googleads_v11_common_ProductImage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.AdTypeInfosProto.internal_static_google_ads_googleads_v11_common_ProductImage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.ProductImage.class, com.google.ads.googleads.v11.common.ProductImage.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.ProductImage.newBuilder()
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
      productImage_ = "";
      description_ = "";
      displayCallToAction_ = null;
      if (displayCallToActionBuilder_ != null) {
        displayCallToActionBuilder_.dispose();
        displayCallToActionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.AdTypeInfosProto.internal_static_google_ads_googleads_v11_common_ProductImage_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ProductImage getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.ProductImage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ProductImage build() {
      com.google.ads.googleads.v11.common.ProductImage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ProductImage buildPartial() {
      com.google.ads.googleads.v11.common.ProductImage result = new com.google.ads.googleads.v11.common.ProductImage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.common.ProductImage result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.productImage_ = productImage_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.displayCallToAction_ = displayCallToActionBuilder_ == null
            ? displayCallToAction_
            : displayCallToActionBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v11.common.ProductImage) {
        return mergeFrom((com.google.ads.googleads.v11.common.ProductImage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.ProductImage other) {
      if (other == com.google.ads.googleads.v11.common.ProductImage.getDefaultInstance()) return this;
      if (other.hasProductImage()) {
        productImage_ = other.productImage_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDescription()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasDisplayCallToAction()) {
        mergeDisplayCallToAction(other.getDisplayCallToAction());
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
            case 26: {
              input.readMessage(
                  getDisplayCallToActionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              productImage_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 34
            case 42: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 42
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

    private java.lang.Object productImage_ = "";
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>optional string product_image = 4;</code>
     * @return Whether the productImage field is set.
     */
    public boolean hasProductImage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>optional string product_image = 4;</code>
     * @return The productImage.
     */
    public java.lang.String getProductImage() {
      java.lang.Object ref = productImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>optional string product_image = 4;</code>
     * @return The bytes for productImage.
     */
    public com.google.protobuf.ByteString
        getProductImageBytes() {
      java.lang.Object ref = productImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>optional string product_image = 4;</code>
     * @param value The productImage to set.
     * @return This builder for chaining.
     */
    public Builder setProductImage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      productImage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>optional string product_image = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductImage() {
      productImage_ = getDefaultInstance().getProductImage();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The MediaFile resource name of the product image. Valid image types are
     * GIF, JPEG and PNG. The minimum size is 300x300 pixels and the aspect ratio
     * must be 1:1 (+-1%).
     * </pre>
     *
     * <code>optional string product_image = 4;</code>
     * @param value The bytes for productImage to set.
     * @return This builder for chaining.
     */
    public Builder setProductImageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      productImage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the product.
     * </pre>
     *
     * <code>optional string description = 5;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v11.common.DisplayCallToAction displayCallToAction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.DisplayCallToAction, com.google.ads.googleads.v11.common.DisplayCallToAction.Builder, com.google.ads.googleads.v11.common.DisplayCallToActionOrBuilder> displayCallToActionBuilder_;
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
     * @return Whether the displayCallToAction field is set.
     */
    public boolean hasDisplayCallToAction() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
     * @return The displayCallToAction.
     */
    public com.google.ads.googleads.v11.common.DisplayCallToAction getDisplayCallToAction() {
      if (displayCallToActionBuilder_ == null) {
        return displayCallToAction_ == null ? com.google.ads.googleads.v11.common.DisplayCallToAction.getDefaultInstance() : displayCallToAction_;
      } else {
        return displayCallToActionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public Builder setDisplayCallToAction(com.google.ads.googleads.v11.common.DisplayCallToAction value) {
      if (displayCallToActionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        displayCallToAction_ = value;
      } else {
        displayCallToActionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public Builder setDisplayCallToAction(
        com.google.ads.googleads.v11.common.DisplayCallToAction.Builder builderForValue) {
      if (displayCallToActionBuilder_ == null) {
        displayCallToAction_ = builderForValue.build();
      } else {
        displayCallToActionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public Builder mergeDisplayCallToAction(com.google.ads.googleads.v11.common.DisplayCallToAction value) {
      if (displayCallToActionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          displayCallToAction_ != null &&
          displayCallToAction_ != com.google.ads.googleads.v11.common.DisplayCallToAction.getDefaultInstance()) {
          getDisplayCallToActionBuilder().mergeFrom(value);
        } else {
          displayCallToAction_ = value;
        }
      } else {
        displayCallToActionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public Builder clearDisplayCallToAction() {
      bitField0_ = (bitField0_ & ~0x00000004);
      displayCallToAction_ = null;
      if (displayCallToActionBuilder_ != null) {
        displayCallToActionBuilder_.dispose();
        displayCallToActionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public com.google.ads.googleads.v11.common.DisplayCallToAction.Builder getDisplayCallToActionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDisplayCallToActionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    public com.google.ads.googleads.v11.common.DisplayCallToActionOrBuilder getDisplayCallToActionOrBuilder() {
      if (displayCallToActionBuilder_ != null) {
        return displayCallToActionBuilder_.getMessageOrBuilder();
      } else {
        return displayCallToAction_ == null ?
            com.google.ads.googleads.v11.common.DisplayCallToAction.getDefaultInstance() : displayCallToAction_;
      }
    }
    /**
     * <pre>
     * Display-call-to-action of the product image.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.DisplayCallToAction display_call_to_action = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.DisplayCallToAction, com.google.ads.googleads.v11.common.DisplayCallToAction.Builder, com.google.ads.googleads.v11.common.DisplayCallToActionOrBuilder> 
        getDisplayCallToActionFieldBuilder() {
      if (displayCallToActionBuilder_ == null) {
        displayCallToActionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.common.DisplayCallToAction, com.google.ads.googleads.v11.common.DisplayCallToAction.Builder, com.google.ads.googleads.v11.common.DisplayCallToActionOrBuilder>(
                getDisplayCallToAction(),
                getParentForChildren(),
                isClean());
        displayCallToAction_ = null;
      }
      return displayCallToActionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.ProductImage)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.ProductImage)
  private static final com.google.ads.googleads.v11.common.ProductImage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.ProductImage();
  }

  public static com.google.ads.googleads.v11.common.ProductImage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductImage>
      PARSER = new com.google.protobuf.AbstractParser<ProductImage>() {
    @java.lang.Override
    public ProductImage parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProductImage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductImage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.ProductImage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

