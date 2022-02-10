// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/errors/keyword_plan_campaign_error.proto

package com.google.ads.googleads.v8.errors;

/**
 * <pre>
 * Container for enum describing possible errors from applying a keyword plan
 * campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum}
 */
public final class KeywordPlanCampaignErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum)
    KeywordPlanCampaignErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanCampaignErrorEnum.newBuilder() to construct.
  private KeywordPlanCampaignErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanCampaignErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanCampaignErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanCampaignErrorEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorProto.internal_static_google_ads_googleads_v8_errors_KeywordPlanCampaignErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorProto.internal_static_google_ads_googleads_v8_errors_KeywordPlanCampaignErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.class, com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible errors from applying a keyword plan campaign.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.KeywordPlanCampaignError}
   */
  public enum KeywordPlanCampaignError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * A keyword plan campaign name is missing, empty, longer than allowed limit
     * or contains invalid chars.
     * </pre>
     *
     * <code>INVALID_NAME = 2;</code>
     */
    INVALID_NAME(2),
    /**
     * <pre>
     * A keyword plan campaign contains one or more untargetable languages.
     * </pre>
     *
     * <code>INVALID_LANGUAGES = 3;</code>
     */
    INVALID_LANGUAGES(3),
    /**
     * <pre>
     * A keyword plan campaign contains one or more invalid geo targets.
     * </pre>
     *
     * <code>INVALID_GEOS = 4;</code>
     */
    INVALID_GEOS(4),
    /**
     * <pre>
     * The keyword plan campaign name is duplicate to an existing keyword plan
     * campaign name or other keyword plan campaign name in the request.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 5;</code>
     */
    DUPLICATE_NAME(5),
    /**
     * <pre>
     * The number of geo targets in the keyword plan campaign exceeds limits.
     * </pre>
     *
     * <code>MAX_GEOS_EXCEEDED = 6;</code>
     */
    MAX_GEOS_EXCEEDED(6),
    /**
     * <pre>
     * The number of languages in the keyword plan campaign exceeds limits.
     * </pre>
     *
     * <code>MAX_LANGUAGES_EXCEEDED = 7;</code>
     */
    MAX_LANGUAGES_EXCEEDED(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * A keyword plan campaign name is missing, empty, longer than allowed limit
     * or contains invalid chars.
     * </pre>
     *
     * <code>INVALID_NAME = 2;</code>
     */
    public static final int INVALID_NAME_VALUE = 2;
    /**
     * <pre>
     * A keyword plan campaign contains one or more untargetable languages.
     * </pre>
     *
     * <code>INVALID_LANGUAGES = 3;</code>
     */
    public static final int INVALID_LANGUAGES_VALUE = 3;
    /**
     * <pre>
     * A keyword plan campaign contains one or more invalid geo targets.
     * </pre>
     *
     * <code>INVALID_GEOS = 4;</code>
     */
    public static final int INVALID_GEOS_VALUE = 4;
    /**
     * <pre>
     * The keyword plan campaign name is duplicate to an existing keyword plan
     * campaign name or other keyword plan campaign name in the request.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 5;</code>
     */
    public static final int DUPLICATE_NAME_VALUE = 5;
    /**
     * <pre>
     * The number of geo targets in the keyword plan campaign exceeds limits.
     * </pre>
     *
     * <code>MAX_GEOS_EXCEEDED = 6;</code>
     */
    public static final int MAX_GEOS_EXCEEDED_VALUE = 6;
    /**
     * <pre>
     * The number of languages in the keyword plan campaign exceeds limits.
     * </pre>
     *
     * <code>MAX_LANGUAGES_EXCEEDED = 7;</code>
     */
    public static final int MAX_LANGUAGES_EXCEEDED_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KeywordPlanCampaignError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KeywordPlanCampaignError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_NAME;
        case 3: return INVALID_LANGUAGES;
        case 4: return INVALID_GEOS;
        case 5: return DUPLICATE_NAME;
        case 6: return MAX_GEOS_EXCEEDED;
        case 7: return MAX_LANGUAGES_EXCEEDED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KeywordPlanCampaignError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KeywordPlanCampaignError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KeywordPlanCampaignError>() {
            public KeywordPlanCampaignError findValueByNumber(int number) {
              return KeywordPlanCampaignError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final KeywordPlanCampaignError[] VALUES = values();

    public static KeywordPlanCampaignError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private KeywordPlanCampaignError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.KeywordPlanCampaignError)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum other = (com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum prototype) {
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
   * Container for enum describing possible errors from applying a keyword plan
   * campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum)
      com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorProto.internal_static_google_ads_googleads_v8_errors_KeywordPlanCampaignErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorProto.internal_static_google_ads_googleads_v8_errors_KeywordPlanCampaignErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.class, com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorProto.internal_static_google_ads_googleads_v8_errors_KeywordPlanCampaignErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum build() {
      com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum buildPartial() {
      com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum result = new com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum(this);
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum other) {
      if (other == com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum)
  private static final com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum();
  }

  public static com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanCampaignErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanCampaignErrorEnum>() {
    @java.lang.Override
    public KeywordPlanCampaignErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanCampaignErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanCampaignErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanCampaignErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.errors.KeywordPlanCampaignErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
