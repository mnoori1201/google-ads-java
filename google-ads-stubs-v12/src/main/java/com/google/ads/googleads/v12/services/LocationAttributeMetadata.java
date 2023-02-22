// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/audience_insights_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * Metadata associated with a Location attribute.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.LocationAttributeMetadata}
 */
public final class LocationAttributeMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.LocationAttributeMetadata)
    LocationAttributeMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocationAttributeMetadata.newBuilder() to construct.
  private LocationAttributeMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocationAttributeMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocationAttributeMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_LocationAttributeMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_LocationAttributeMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.LocationAttributeMetadata.class, com.google.ads.googleads.v12.services.LocationAttributeMetadata.Builder.class);
  }

  public static final int COUNTRY_LOCATION_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v12.common.LocationInfo countryLocation_;
  /**
   * <pre>
   * The country location of the sub country location.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
   * @return Whether the countryLocation field is set.
   */
  @java.lang.Override
  public boolean hasCountryLocation() {
    return countryLocation_ != null;
  }
  /**
   * <pre>
   * The country location of the sub country location.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
   * @return The countryLocation.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.LocationInfo getCountryLocation() {
    return countryLocation_ == null ? com.google.ads.googleads.v12.common.LocationInfo.getDefaultInstance() : countryLocation_;
  }
  /**
   * <pre>
   * The country location of the sub country location.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.LocationInfoOrBuilder getCountryLocationOrBuilder() {
    return countryLocation_ == null ? com.google.ads.googleads.v12.common.LocationInfo.getDefaultInstance() : countryLocation_;
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
    if (countryLocation_ != null) {
      output.writeMessage(1, getCountryLocation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (countryLocation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCountryLocation());
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.LocationAttributeMetadata)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.LocationAttributeMetadata other = (com.google.ads.googleads.v12.services.LocationAttributeMetadata) obj;

    if (hasCountryLocation() != other.hasCountryLocation()) return false;
    if (hasCountryLocation()) {
      if (!getCountryLocation()
          .equals(other.getCountryLocation())) return false;
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
    if (hasCountryLocation()) {
      hash = (37 * hash) + COUNTRY_LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getCountryLocation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.LocationAttributeMetadata prototype) {
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
   * Metadata associated with a Location attribute.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.LocationAttributeMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.LocationAttributeMetadata)
      com.google.ads.googleads.v12.services.LocationAttributeMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_LocationAttributeMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_LocationAttributeMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.LocationAttributeMetadata.class, com.google.ads.googleads.v12.services.LocationAttributeMetadata.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.LocationAttributeMetadata.newBuilder()
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
      countryLocation_ = null;
      if (countryLocationBuilder_ != null) {
        countryLocationBuilder_.dispose();
        countryLocationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_LocationAttributeMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.LocationAttributeMetadata getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.LocationAttributeMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.LocationAttributeMetadata build() {
      com.google.ads.googleads.v12.services.LocationAttributeMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.LocationAttributeMetadata buildPartial() {
      com.google.ads.googleads.v12.services.LocationAttributeMetadata result = new com.google.ads.googleads.v12.services.LocationAttributeMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.LocationAttributeMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.countryLocation_ = countryLocationBuilder_ == null
            ? countryLocation_
            : countryLocationBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.LocationAttributeMetadata) {
        return mergeFrom((com.google.ads.googleads.v12.services.LocationAttributeMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.LocationAttributeMetadata other) {
      if (other == com.google.ads.googleads.v12.services.LocationAttributeMetadata.getDefaultInstance()) return this;
      if (other.hasCountryLocation()) {
        mergeCountryLocation(other.getCountryLocation());
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
                  getCountryLocationFieldBuilder().getBuilder(),
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

    private com.google.ads.googleads.v12.common.LocationInfo countryLocation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.LocationInfo, com.google.ads.googleads.v12.common.LocationInfo.Builder, com.google.ads.googleads.v12.common.LocationInfoOrBuilder> countryLocationBuilder_;
    /**
     * <pre>
     * The country location of the sub country location.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
     * @return Whether the countryLocation field is set.
     */
    public boolean hasCountryLocation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The country location of the sub country location.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
     * @return The countryLocation.
     */
    public com.google.ads.googleads.v12.common.LocationInfo getCountryLocation() {
      if (countryLocationBuilder_ == null) {
        return countryLocation_ == null ? com.google.ads.googleads.v12.common.LocationInfo.getDefaultInstance() : countryLocation_;
      } else {
        return countryLocationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The country location of the sub country location.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
     */
    public Builder setCountryLocation(com.google.ads.googleads.v12.common.LocationInfo value) {
      if (countryLocationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        countryLocation_ = value;
      } else {
        countryLocationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The country location of the sub country location.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
     */
    public Builder setCountryLocation(
        com.google.ads.googleads.v12.common.LocationInfo.Builder builderForValue) {
      if (countryLocationBuilder_ == null) {
        countryLocation_ = builderForValue.build();
      } else {
        countryLocationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The country location of the sub country location.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
     */
    public Builder mergeCountryLocation(com.google.ads.googleads.v12.common.LocationInfo value) {
      if (countryLocationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          countryLocation_ != null &&
          countryLocation_ != com.google.ads.googleads.v12.common.LocationInfo.getDefaultInstance()) {
          getCountryLocationBuilder().mergeFrom(value);
        } else {
          countryLocation_ = value;
        }
      } else {
        countryLocationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The country location of the sub country location.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
     */
    public Builder clearCountryLocation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      countryLocation_ = null;
      if (countryLocationBuilder_ != null) {
        countryLocationBuilder_.dispose();
        countryLocationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The country location of the sub country location.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
     */
    public com.google.ads.googleads.v12.common.LocationInfo.Builder getCountryLocationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCountryLocationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The country location of the sub country location.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
     */
    public com.google.ads.googleads.v12.common.LocationInfoOrBuilder getCountryLocationOrBuilder() {
      if (countryLocationBuilder_ != null) {
        return countryLocationBuilder_.getMessageOrBuilder();
      } else {
        return countryLocation_ == null ?
            com.google.ads.googleads.v12.common.LocationInfo.getDefaultInstance() : countryLocation_;
      }
    }
    /**
     * <pre>
     * The country location of the sub country location.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LocationInfo country_location = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.LocationInfo, com.google.ads.googleads.v12.common.LocationInfo.Builder, com.google.ads.googleads.v12.common.LocationInfoOrBuilder> 
        getCountryLocationFieldBuilder() {
      if (countryLocationBuilder_ == null) {
        countryLocationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.common.LocationInfo, com.google.ads.googleads.v12.common.LocationInfo.Builder, com.google.ads.googleads.v12.common.LocationInfoOrBuilder>(
                getCountryLocation(),
                getParentForChildren(),
                isClean());
        countryLocation_ = null;
      }
      return countryLocationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.LocationAttributeMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.LocationAttributeMetadata)
  private static final com.google.ads.googleads.v12.services.LocationAttributeMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.LocationAttributeMetadata();
  }

  public static com.google.ads.googleads.v12.services.LocationAttributeMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationAttributeMetadata>
      PARSER = new com.google.protobuf.AbstractParser<LocationAttributeMetadata>() {
    @java.lang.Override
    public LocationAttributeMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocationAttributeMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationAttributeMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.LocationAttributeMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

