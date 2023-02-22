// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/asset_policy.proto

package com.google.ads.googleads.v13.common;

/**
 * <pre>
 * Provides the detail of a PrimaryStatus.
 * Each asset link has a PrimaryStatus value (e.g. NOT_ELIGIBLE, meaning not
 * serving), and list of corroborating PrimaryStatusReasons (e.g.
 * [ASSET_DISAPPROVED]). Each reason may have some additional details
 * annotated with it.  For instance, when the reason is ASSET_DISAPPROVED, the
 * details field will contain additional information about the offline
 * evaluation errors which led to the asset being disapproved.
 * Next Id: 4
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails}
 */
public final class AssetLinkPrimaryStatusDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails)
    AssetLinkPrimaryStatusDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetLinkPrimaryStatusDetails.newBuilder() to construct.
  private AssetLinkPrimaryStatusDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetLinkPrimaryStatusDetails() {
    reason_ = 0;
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetLinkPrimaryStatusDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.common.AssetPolicyProto.internal_static_google_ads_googleads_v13_common_AssetLinkPrimaryStatusDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.common.AssetPolicyProto.internal_static_google_ads_googleads_v13_common_AssetLinkPrimaryStatusDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails.class, com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails.Builder.class);
  }

  private int bitField0_;
  private int detailsCase_ = 0;
  private java.lang.Object details_;
  public enum DetailsCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ASSET_DISAPPROVED(3),
    DETAILS_NOT_SET(0);
    private final int value;
    private DetailsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DetailsCase valueOf(int value) {
      return forNumber(value);
    }

    public static DetailsCase forNumber(int value) {
      switch (value) {
        case 3: return ASSET_DISAPPROVED;
        case 0: return DETAILS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DetailsCase
  getDetailsCase() {
    return DetailsCase.forNumber(
        detailsCase_);
  }

  public static final int REASON_FIELD_NUMBER = 1;
  private int reason_ = 0;
  /**
   * <pre>
   * Provides the reason of this PrimaryStatus.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason reason = 1;</code>
   * @return Whether the reason field is set.
   */
  @java.lang.Override public boolean hasReason() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Provides the reason of this PrimaryStatus.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason reason = 1;</code>
   * @return The enum numeric value on the wire for reason.
   */
  @java.lang.Override public int getReasonValue() {
    return reason_;
  }
  /**
   * <pre>
   * Provides the reason of this PrimaryStatus.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason reason = 1;</code>
   * @return The reason.
   */
  @java.lang.Override public com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason getReason() {
    com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason result = com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason.forNumber(reason_);
    return result == null ? com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason.UNRECOGNIZED : result;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_ = 0;
  /**
   * <pre>
   * Provides the PrimaryStatus of this status detail.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override public boolean hasStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Provides the PrimaryStatus of this status detail.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Provides the PrimaryStatus of this status detail.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus status = 2;</code>
   * @return The status.
   */
  @java.lang.Override public com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus getStatus() {
    com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus result = com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus.forNumber(status_);
    return result == null ? com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus.UNRECOGNIZED : result;
  }

  public static final int ASSET_DISAPPROVED_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
   * @return Whether the assetDisapproved field is set.
   */
  @java.lang.Override
  public boolean hasAssetDisapproved() {
    return detailsCase_ == 3;
  }
  /**
   * <pre>
   * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
   * @return The assetDisapproved.
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.AssetDisapproved getAssetDisapproved() {
    if (detailsCase_ == 3) {
       return (com.google.ads.googleads.v13.common.AssetDisapproved) details_;
    }
    return com.google.ads.googleads.v13.common.AssetDisapproved.getDefaultInstance();
  }
  /**
   * <pre>
   * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.AssetDisapprovedOrBuilder getAssetDisapprovedOrBuilder() {
    if (detailsCase_ == 3) {
       return (com.google.ads.googleads.v13.common.AssetDisapproved) details_;
    }
    return com.google.ads.googleads.v13.common.AssetDisapproved.getDefaultInstance();
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
      output.writeEnum(1, reason_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, status_);
    }
    if (detailsCase_ == 3) {
      output.writeMessage(3, (com.google.ads.googleads.v13.common.AssetDisapproved) details_);
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
        .computeEnumSize(1, reason_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
    }
    if (detailsCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.ads.googleads.v13.common.AssetDisapproved) details_);
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
    if (!(obj instanceof com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails other = (com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails) obj;

    if (hasReason() != other.hasReason()) return false;
    if (hasReason()) {
      if (reason_ != other.reason_) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (status_ != other.status_) return false;
    }
    if (!getDetailsCase().equals(other.getDetailsCase())) return false;
    switch (detailsCase_) {
      case 3:
        if (!getAssetDisapproved()
            .equals(other.getAssetDisapproved())) return false;
        break;
      case 0:
      default:
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
    if (hasReason()) {
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
    }
    switch (detailsCase_) {
      case 3:
        hash = (37 * hash) + ASSET_DISAPPROVED_FIELD_NUMBER;
        hash = (53 * hash) + getAssetDisapproved().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails prototype) {
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
   * Provides the detail of a PrimaryStatus.
   * Each asset link has a PrimaryStatus value (e.g. NOT_ELIGIBLE, meaning not
   * serving), and list of corroborating PrimaryStatusReasons (e.g.
   * [ASSET_DISAPPROVED]). Each reason may have some additional details
   * annotated with it.  For instance, when the reason is ASSET_DISAPPROVED, the
   * details field will contain additional information about the offline
   * evaluation errors which led to the asset being disapproved.
   * Next Id: 4
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails)
      com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.common.AssetPolicyProto.internal_static_google_ads_googleads_v13_common_AssetLinkPrimaryStatusDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.common.AssetPolicyProto.internal_static_google_ads_googleads_v13_common_AssetLinkPrimaryStatusDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails.class, com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails.newBuilder()
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
      reason_ = 0;
      status_ = 0;
      if (assetDisapprovedBuilder_ != null) {
        assetDisapprovedBuilder_.clear();
      }
      detailsCase_ = 0;
      details_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.common.AssetPolicyProto.internal_static_google_ads_googleads_v13_common_AssetLinkPrimaryStatusDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails build() {
      com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails buildPartial() {
      com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails result = new com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reason_ = reason_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = status_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private void buildPartialOneofs(com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails result) {
      result.detailsCase_ = detailsCase_;
      result.details_ = this.details_;
      if (detailsCase_ == 3 &&
          assetDisapprovedBuilder_ != null) {
        result.details_ = assetDisapprovedBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails) {
        return mergeFrom((com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails other) {
      if (other == com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails.getDefaultInstance()) return this;
      if (other.hasReason()) {
        setReason(other.getReason());
      }
      if (other.hasStatus()) {
        setStatus(other.getStatus());
      }
      switch (other.getDetailsCase()) {
        case ASSET_DISAPPROVED: {
          mergeAssetDisapproved(other.getAssetDisapproved());
          break;
        }
        case DETAILS_NOT_SET: {
          break;
        }
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
              reason_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getAssetDisapprovedFieldBuilder().getBuilder(),
                  extensionRegistry);
              detailsCase_ = 3;
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
    private int detailsCase_ = 0;
    private java.lang.Object details_;
    public DetailsCase
        getDetailsCase() {
      return DetailsCase.forNumber(
          detailsCase_);
    }

    public Builder clearDetails() {
      detailsCase_ = 0;
      details_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int reason_ = 0;
    /**
     * <pre>
     * Provides the reason of this PrimaryStatus.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason reason = 1;</code>
     * @return Whether the reason field is set.
     */
    @java.lang.Override public boolean hasReason() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Provides the reason of this PrimaryStatus.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <pre>
     * Provides the reason of this PrimaryStatus.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason reason = 1;</code>
     * @param value The enum numeric value on the wire for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonValue(int value) {
      reason_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the reason of this PrimaryStatus.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason reason = 1;</code>
     * @return The reason.
     */
    @java.lang.Override
    public com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason getReason() {
      com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason result = com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason.forNumber(reason_);
      return result == null ? com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Provides the reason of this PrimaryStatus.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason reason = 1;</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      reason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the reason of this PrimaryStatus.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason reason = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reason_ = 0;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Provides the PrimaryStatus of this status detail.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus status = 2;</code>
     * @return Whether the status field is set.
     */
    @java.lang.Override public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Provides the PrimaryStatus of this status detail.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus status = 2;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Provides the PrimaryStatus of this status detail.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus status = 2;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the PrimaryStatus of this status detail.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus status = 2;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus getStatus() {
      com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus result = com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus.forNumber(status_);
      return result == null ? com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Provides the PrimaryStatus of this status detail.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provides the PrimaryStatus of this status detail.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v13.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v13.common.AssetDisapproved, com.google.ads.googleads.v13.common.AssetDisapproved.Builder, com.google.ads.googleads.v13.common.AssetDisapprovedOrBuilder> assetDisapprovedBuilder_;
    /**
     * <pre>
     * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
     * @return Whether the assetDisapproved field is set.
     */
    @java.lang.Override
    public boolean hasAssetDisapproved() {
      return detailsCase_ == 3;
    }
    /**
     * <pre>
     * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
     * @return The assetDisapproved.
     */
    @java.lang.Override
    public com.google.ads.googleads.v13.common.AssetDisapproved getAssetDisapproved() {
      if (assetDisapprovedBuilder_ == null) {
        if (detailsCase_ == 3) {
          return (com.google.ads.googleads.v13.common.AssetDisapproved) details_;
        }
        return com.google.ads.googleads.v13.common.AssetDisapproved.getDefaultInstance();
      } else {
        if (detailsCase_ == 3) {
          return assetDisapprovedBuilder_.getMessage();
        }
        return com.google.ads.googleads.v13.common.AssetDisapproved.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
     */
    public Builder setAssetDisapproved(com.google.ads.googleads.v13.common.AssetDisapproved value) {
      if (assetDisapprovedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        details_ = value;
        onChanged();
      } else {
        assetDisapprovedBuilder_.setMessage(value);
      }
      detailsCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
     */
    public Builder setAssetDisapproved(
        com.google.ads.googleads.v13.common.AssetDisapproved.Builder builderForValue) {
      if (assetDisapprovedBuilder_ == null) {
        details_ = builderForValue.build();
        onChanged();
      } else {
        assetDisapprovedBuilder_.setMessage(builderForValue.build());
      }
      detailsCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
     */
    public Builder mergeAssetDisapproved(com.google.ads.googleads.v13.common.AssetDisapproved value) {
      if (assetDisapprovedBuilder_ == null) {
        if (detailsCase_ == 3 &&
            details_ != com.google.ads.googleads.v13.common.AssetDisapproved.getDefaultInstance()) {
          details_ = com.google.ads.googleads.v13.common.AssetDisapproved.newBuilder((com.google.ads.googleads.v13.common.AssetDisapproved) details_)
              .mergeFrom(value).buildPartial();
        } else {
          details_ = value;
        }
        onChanged();
      } else {
        if (detailsCase_ == 3) {
          assetDisapprovedBuilder_.mergeFrom(value);
        } else {
          assetDisapprovedBuilder_.setMessage(value);
        }
      }
      detailsCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
     */
    public Builder clearAssetDisapproved() {
      if (assetDisapprovedBuilder_ == null) {
        if (detailsCase_ == 3) {
          detailsCase_ = 0;
          details_ = null;
          onChanged();
        }
      } else {
        if (detailsCase_ == 3) {
          detailsCase_ = 0;
          details_ = null;
        }
        assetDisapprovedBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
     */
    public com.google.ads.googleads.v13.common.AssetDisapproved.Builder getAssetDisapprovedBuilder() {
      return getAssetDisapprovedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v13.common.AssetDisapprovedOrBuilder getAssetDisapprovedOrBuilder() {
      if ((detailsCase_ == 3) && (assetDisapprovedBuilder_ != null)) {
        return assetDisapprovedBuilder_.getMessageOrBuilder();
      } else {
        if (detailsCase_ == 3) {
          return (com.google.ads.googleads.v13.common.AssetDisapproved) details_;
        }
        return com.google.ads.googleads.v13.common.AssetDisapproved.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Provides the details for AssetLinkPrimaryStatusReason.ASSET_DISAPPROVED
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AssetDisapproved asset_disapproved = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v13.common.AssetDisapproved, com.google.ads.googleads.v13.common.AssetDisapproved.Builder, com.google.ads.googleads.v13.common.AssetDisapprovedOrBuilder> 
        getAssetDisapprovedFieldBuilder() {
      if (assetDisapprovedBuilder_ == null) {
        if (!(detailsCase_ == 3)) {
          details_ = com.google.ads.googleads.v13.common.AssetDisapproved.getDefaultInstance();
        }
        assetDisapprovedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v13.common.AssetDisapproved, com.google.ads.googleads.v13.common.AssetDisapproved.Builder, com.google.ads.googleads.v13.common.AssetDisapprovedOrBuilder>(
                (com.google.ads.googleads.v13.common.AssetDisapproved) details_,
                getParentForChildren(),
                isClean());
        details_ = null;
      }
      detailsCase_ = 3;
      onChanged();
      return assetDisapprovedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails)
  private static final com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails();
  }

  public static com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetLinkPrimaryStatusDetails>
      PARSER = new com.google.protobuf.AbstractParser<AssetLinkPrimaryStatusDetails>() {
    @java.lang.Override
    public AssetLinkPrimaryStatusDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetLinkPrimaryStatusDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetLinkPrimaryStatusDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.common.AssetLinkPrimaryStatusDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

