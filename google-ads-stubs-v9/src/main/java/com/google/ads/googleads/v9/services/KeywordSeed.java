// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v9.services;

/**
 * <pre>
 * Keyword Seed
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v9.services.KeywordSeed}
 */
public final class KeywordSeed extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v9.services.KeywordSeed)
    KeywordSeedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordSeed.newBuilder() to construct.
  private KeywordSeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordSeed() {
    keywords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordSeed();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordSeed(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              keywords_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            keywords_.add(s);
            break;
          }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        keywords_ = keywords_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v9.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v9_services_KeywordSeed_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v9.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v9_services_KeywordSeed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v9.services.KeywordSeed.class, com.google.ads.googleads.v9.services.KeywordSeed.Builder.class);
  }

  public static final int KEYWORDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList keywords_;
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @return A list containing the keywords.
   */
  public com.google.protobuf.ProtocolStringList
      getKeywordsList() {
    return keywords_;
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @return The count of keywords.
   */
  public int getKeywordsCount() {
    return keywords_.size();
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @param index The index of the element to return.
   * @return The keywords at the given index.
   */
  public java.lang.String getKeywords(int index) {
    return keywords_.get(index);
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keywords at the given index.
   */
  public com.google.protobuf.ByteString
      getKeywordsBytes(int index) {
    return keywords_.getByteString(index);
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
    for (int i = 0; i < keywords_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keywords_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < keywords_.size(); i++) {
        dataSize += computeStringSizeNoTag(keywords_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeywordsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v9.services.KeywordSeed)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v9.services.KeywordSeed other = (com.google.ads.googleads.v9.services.KeywordSeed) obj;

    if (!getKeywordsList()
        .equals(other.getKeywordsList())) return false;
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
    if (getKeywordsCount() > 0) {
      hash = (37 * hash) + KEYWORDS_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v9.services.KeywordSeed parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v9.services.KeywordSeed prototype) {
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
   * Keyword Seed
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v9.services.KeywordSeed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v9.services.KeywordSeed)
      com.google.ads.googleads.v9.services.KeywordSeedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v9.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v9_services_KeywordSeed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v9.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v9_services_KeywordSeed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v9.services.KeywordSeed.class, com.google.ads.googleads.v9.services.KeywordSeed.Builder.class);
    }

    // Construct using com.google.ads.googleads.v9.services.KeywordSeed.newBuilder()
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
      keywords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v9.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v9_services_KeywordSeed_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.services.KeywordSeed getDefaultInstanceForType() {
      return com.google.ads.googleads.v9.services.KeywordSeed.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.services.KeywordSeed build() {
      com.google.ads.googleads.v9.services.KeywordSeed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v9.services.KeywordSeed buildPartial() {
      com.google.ads.googleads.v9.services.KeywordSeed result = new com.google.ads.googleads.v9.services.KeywordSeed(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        keywords_ = keywords_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.keywords_ = keywords_;
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
      if (other instanceof com.google.ads.googleads.v9.services.KeywordSeed) {
        return mergeFrom((com.google.ads.googleads.v9.services.KeywordSeed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v9.services.KeywordSeed other) {
      if (other == com.google.ads.googleads.v9.services.KeywordSeed.getDefaultInstance()) return this;
      if (!other.keywords_.isEmpty()) {
        if (keywords_.isEmpty()) {
          keywords_ = other.keywords_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKeywordsIsMutable();
          keywords_.addAll(other.keywords_);
        }
        onChanged();
      }
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
      com.google.ads.googleads.v9.services.KeywordSeed parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v9.services.KeywordSeed) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList keywords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureKeywordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keywords_ = new com.google.protobuf.LazyStringArrayList(keywords_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 2;</code>
     * @return A list containing the keywords.
     */
    public com.google.protobuf.ProtocolStringList
        getKeywordsList() {
      return keywords_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 2;</code>
     * @return The count of keywords.
     */
    public int getKeywordsCount() {
      return keywords_.size();
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 2;</code>
     * @param index The index of the element to return.
     * @return The keywords at the given index.
     */
    public java.lang.String getKeywords(int index) {
      return keywords_.get(index);
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the keywords at the given index.
     */
    public com.google.protobuf.ByteString
        getKeywordsBytes(int index) {
      return keywords_.getByteString(index);
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 2;</code>
     * @param index The index to set the value at.
     * @param value The keywords to set.
     * @return This builder for chaining.
     */
    public Builder setKeywords(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeywordsIsMutable();
      keywords_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 2;</code>
     * @param value The keywords to add.
     * @return This builder for chaining.
     */
    public Builder addKeywords(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeywordsIsMutable();
      keywords_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 2;</code>
     * @param values The keywords to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeywords(
        java.lang.Iterable<java.lang.String> values) {
      ensureKeywordsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keywords_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywords() {
      keywords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 2;</code>
     * @param value The bytes of the keywords to add.
     * @return This builder for chaining.
     */
    public Builder addKeywordsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureKeywordsIsMutable();
      keywords_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v9.services.KeywordSeed)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v9.services.KeywordSeed)
  private static final com.google.ads.googleads.v9.services.KeywordSeed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v9.services.KeywordSeed();
  }

  public static com.google.ads.googleads.v9.services.KeywordSeed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordSeed>
      PARSER = new com.google.protobuf.AbstractParser<KeywordSeed>() {
    @java.lang.Override
    public KeywordSeed parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordSeed(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordSeed> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordSeed> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v9.services.KeywordSeed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
