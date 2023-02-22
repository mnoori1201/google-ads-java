// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/reach_plan_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * Advanced targeting settings for products.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.AdvancedProductTargeting}
 */
public final class AdvancedProductTargeting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.AdvancedProductTargeting)
    AdvancedProductTargetingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdvancedProductTargeting.newBuilder() to construct.
  private AdvancedProductTargeting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdvancedProductTargeting() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdvancedProductTargeting();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_AdvancedProductTargeting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_AdvancedProductTargeting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.AdvancedProductTargeting.class, com.google.ads.googleads.v12.services.AdvancedProductTargeting.Builder.class);
  }

  private int advancedTargetingCase_ = 0;
  private java.lang.Object advancedTargeting_;
  public enum AdvancedTargetingCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    YOUTUBE_SELECT_SETTINGS(1),
    ADVANCEDTARGETING_NOT_SET(0);
    private final int value;
    private AdvancedTargetingCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AdvancedTargetingCase valueOf(int value) {
      return forNumber(value);
    }

    public static AdvancedTargetingCase forNumber(int value) {
      switch (value) {
        case 1: return YOUTUBE_SELECT_SETTINGS;
        case 0: return ADVANCEDTARGETING_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AdvancedTargetingCase
  getAdvancedTargetingCase() {
    return AdvancedTargetingCase.forNumber(
        advancedTargetingCase_);
  }

  public static final int YOUTUBE_SELECT_SETTINGS_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Settings for YouTube Select targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
   * @return Whether the youtubeSelectSettings field is set.
   */
  @java.lang.Override
  public boolean hasYoutubeSelectSettings() {
    return advancedTargetingCase_ == 1;
  }
  /**
   * <pre>
   * Settings for YouTube Select targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
   * @return The youtubeSelectSettings.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.YouTubeSelectSettings getYoutubeSelectSettings() {
    if (advancedTargetingCase_ == 1) {
       return (com.google.ads.googleads.v12.services.YouTubeSelectSettings) advancedTargeting_;
    }
    return com.google.ads.googleads.v12.services.YouTubeSelectSettings.getDefaultInstance();
  }
  /**
   * <pre>
   * Settings for YouTube Select targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.YouTubeSelectSettingsOrBuilder getYoutubeSelectSettingsOrBuilder() {
    if (advancedTargetingCase_ == 1) {
       return (com.google.ads.googleads.v12.services.YouTubeSelectSettings) advancedTargeting_;
    }
    return com.google.ads.googleads.v12.services.YouTubeSelectSettings.getDefaultInstance();
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
    if (advancedTargetingCase_ == 1) {
      output.writeMessage(1, (com.google.ads.googleads.v12.services.YouTubeSelectSettings) advancedTargeting_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (advancedTargetingCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.ads.googleads.v12.services.YouTubeSelectSettings) advancedTargeting_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.AdvancedProductTargeting)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.AdvancedProductTargeting other = (com.google.ads.googleads.v12.services.AdvancedProductTargeting) obj;

    if (!getAdvancedTargetingCase().equals(other.getAdvancedTargetingCase())) return false;
    switch (advancedTargetingCase_) {
      case 1:
        if (!getYoutubeSelectSettings()
            .equals(other.getYoutubeSelectSettings())) return false;
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
    switch (advancedTargetingCase_) {
      case 1:
        hash = (37 * hash) + YOUTUBE_SELECT_SETTINGS_FIELD_NUMBER;
        hash = (53 * hash) + getYoutubeSelectSettings().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.AdvancedProductTargeting prototype) {
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
   * Advanced targeting settings for products.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.AdvancedProductTargeting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.AdvancedProductTargeting)
      com.google.ads.googleads.v12.services.AdvancedProductTargetingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_AdvancedProductTargeting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_AdvancedProductTargeting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.AdvancedProductTargeting.class, com.google.ads.googleads.v12.services.AdvancedProductTargeting.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.AdvancedProductTargeting.newBuilder()
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
      if (youtubeSelectSettingsBuilder_ != null) {
        youtubeSelectSettingsBuilder_.clear();
      }
      advancedTargetingCase_ = 0;
      advancedTargeting_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_AdvancedProductTargeting_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.AdvancedProductTargeting getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.AdvancedProductTargeting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.AdvancedProductTargeting build() {
      com.google.ads.googleads.v12.services.AdvancedProductTargeting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.AdvancedProductTargeting buildPartial() {
      com.google.ads.googleads.v12.services.AdvancedProductTargeting result = new com.google.ads.googleads.v12.services.AdvancedProductTargeting(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.AdvancedProductTargeting result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.ads.googleads.v12.services.AdvancedProductTargeting result) {
      result.advancedTargetingCase_ = advancedTargetingCase_;
      result.advancedTargeting_ = this.advancedTargeting_;
      if (advancedTargetingCase_ == 1 &&
          youtubeSelectSettingsBuilder_ != null) {
        result.advancedTargeting_ = youtubeSelectSettingsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.AdvancedProductTargeting) {
        return mergeFrom((com.google.ads.googleads.v12.services.AdvancedProductTargeting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.AdvancedProductTargeting other) {
      if (other == com.google.ads.googleads.v12.services.AdvancedProductTargeting.getDefaultInstance()) return this;
      switch (other.getAdvancedTargetingCase()) {
        case YOUTUBE_SELECT_SETTINGS: {
          mergeYoutubeSelectSettings(other.getYoutubeSelectSettings());
          break;
        }
        case ADVANCEDTARGETING_NOT_SET: {
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
            case 10: {
              input.readMessage(
                  getYoutubeSelectSettingsFieldBuilder().getBuilder(),
                  extensionRegistry);
              advancedTargetingCase_ = 1;
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
    private int advancedTargetingCase_ = 0;
    private java.lang.Object advancedTargeting_;
    public AdvancedTargetingCase
        getAdvancedTargetingCase() {
      return AdvancedTargetingCase.forNumber(
          advancedTargetingCase_);
    }

    public Builder clearAdvancedTargeting() {
      advancedTargetingCase_ = 0;
      advancedTargeting_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.YouTubeSelectSettings, com.google.ads.googleads.v12.services.YouTubeSelectSettings.Builder, com.google.ads.googleads.v12.services.YouTubeSelectSettingsOrBuilder> youtubeSelectSettingsBuilder_;
    /**
     * <pre>
     * Settings for YouTube Select targeting.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
     * @return Whether the youtubeSelectSettings field is set.
     */
    @java.lang.Override
    public boolean hasYoutubeSelectSettings() {
      return advancedTargetingCase_ == 1;
    }
    /**
     * <pre>
     * Settings for YouTube Select targeting.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
     * @return The youtubeSelectSettings.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.services.YouTubeSelectSettings getYoutubeSelectSettings() {
      if (youtubeSelectSettingsBuilder_ == null) {
        if (advancedTargetingCase_ == 1) {
          return (com.google.ads.googleads.v12.services.YouTubeSelectSettings) advancedTargeting_;
        }
        return com.google.ads.googleads.v12.services.YouTubeSelectSettings.getDefaultInstance();
      } else {
        if (advancedTargetingCase_ == 1) {
          return youtubeSelectSettingsBuilder_.getMessage();
        }
        return com.google.ads.googleads.v12.services.YouTubeSelectSettings.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Settings for YouTube Select targeting.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
     */
    public Builder setYoutubeSelectSettings(com.google.ads.googleads.v12.services.YouTubeSelectSettings value) {
      if (youtubeSelectSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        advancedTargeting_ = value;
        onChanged();
      } else {
        youtubeSelectSettingsBuilder_.setMessage(value);
      }
      advancedTargetingCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Settings for YouTube Select targeting.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
     */
    public Builder setYoutubeSelectSettings(
        com.google.ads.googleads.v12.services.YouTubeSelectSettings.Builder builderForValue) {
      if (youtubeSelectSettingsBuilder_ == null) {
        advancedTargeting_ = builderForValue.build();
        onChanged();
      } else {
        youtubeSelectSettingsBuilder_.setMessage(builderForValue.build());
      }
      advancedTargetingCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Settings for YouTube Select targeting.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
     */
    public Builder mergeYoutubeSelectSettings(com.google.ads.googleads.v12.services.YouTubeSelectSettings value) {
      if (youtubeSelectSettingsBuilder_ == null) {
        if (advancedTargetingCase_ == 1 &&
            advancedTargeting_ != com.google.ads.googleads.v12.services.YouTubeSelectSettings.getDefaultInstance()) {
          advancedTargeting_ = com.google.ads.googleads.v12.services.YouTubeSelectSettings.newBuilder((com.google.ads.googleads.v12.services.YouTubeSelectSettings) advancedTargeting_)
              .mergeFrom(value).buildPartial();
        } else {
          advancedTargeting_ = value;
        }
        onChanged();
      } else {
        if (advancedTargetingCase_ == 1) {
          youtubeSelectSettingsBuilder_.mergeFrom(value);
        } else {
          youtubeSelectSettingsBuilder_.setMessage(value);
        }
      }
      advancedTargetingCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Settings for YouTube Select targeting.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
     */
    public Builder clearYoutubeSelectSettings() {
      if (youtubeSelectSettingsBuilder_ == null) {
        if (advancedTargetingCase_ == 1) {
          advancedTargetingCase_ = 0;
          advancedTargeting_ = null;
          onChanged();
        }
      } else {
        if (advancedTargetingCase_ == 1) {
          advancedTargetingCase_ = 0;
          advancedTargeting_ = null;
        }
        youtubeSelectSettingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Settings for YouTube Select targeting.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
     */
    public com.google.ads.googleads.v12.services.YouTubeSelectSettings.Builder getYoutubeSelectSettingsBuilder() {
      return getYoutubeSelectSettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Settings for YouTube Select targeting.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.services.YouTubeSelectSettingsOrBuilder getYoutubeSelectSettingsOrBuilder() {
      if ((advancedTargetingCase_ == 1) && (youtubeSelectSettingsBuilder_ != null)) {
        return youtubeSelectSettingsBuilder_.getMessageOrBuilder();
      } else {
        if (advancedTargetingCase_ == 1) {
          return (com.google.ads.googleads.v12.services.YouTubeSelectSettings) advancedTargeting_;
        }
        return com.google.ads.googleads.v12.services.YouTubeSelectSettings.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Settings for YouTube Select targeting.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.YouTubeSelectSettings, com.google.ads.googleads.v12.services.YouTubeSelectSettings.Builder, com.google.ads.googleads.v12.services.YouTubeSelectSettingsOrBuilder> 
        getYoutubeSelectSettingsFieldBuilder() {
      if (youtubeSelectSettingsBuilder_ == null) {
        if (!(advancedTargetingCase_ == 1)) {
          advancedTargeting_ = com.google.ads.googleads.v12.services.YouTubeSelectSettings.getDefaultInstance();
        }
        youtubeSelectSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.services.YouTubeSelectSettings, com.google.ads.googleads.v12.services.YouTubeSelectSettings.Builder, com.google.ads.googleads.v12.services.YouTubeSelectSettingsOrBuilder>(
                (com.google.ads.googleads.v12.services.YouTubeSelectSettings) advancedTargeting_,
                getParentForChildren(),
                isClean());
        advancedTargeting_ = null;
      }
      advancedTargetingCase_ = 1;
      onChanged();
      return youtubeSelectSettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.AdvancedProductTargeting)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.AdvancedProductTargeting)
  private static final com.google.ads.googleads.v12.services.AdvancedProductTargeting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.AdvancedProductTargeting();
  }

  public static com.google.ads.googleads.v12.services.AdvancedProductTargeting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvancedProductTargeting>
      PARSER = new com.google.protobuf.AbstractParser<AdvancedProductTargeting>() {
    @java.lang.Override
    public AdvancedProductTargeting parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdvancedProductTargeting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvancedProductTargeting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.AdvancedProductTargeting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

