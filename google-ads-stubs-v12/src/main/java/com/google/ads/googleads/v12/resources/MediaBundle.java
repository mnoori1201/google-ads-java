// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/media_file.proto

package com.google.ads.googleads.v12.resources;

/**
 * <pre>
 * Represents a ZIP archive media the content of which contains HTML5 assets.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.resources.MediaBundle}
 */
public final class MediaBundle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.resources.MediaBundle)
    MediaBundleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaBundle.newBuilder() to construct.
  private MediaBundle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaBundle() {
    data_ = com.google.protobuf.ByteString.EMPTY;
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MediaBundle();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.resources.MediaFileProto.internal_static_google_ads_googleads_v12_resources_MediaBundle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.resources.MediaFileProto.internal_static_google_ads_googleads_v12_resources_MediaBundle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.resources.MediaBundle.class, com.google.ads.googleads.v12.resources.MediaBundle.Builder.class);
  }

  private int bitField0_;
  public static final int DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Immutable. Raw zipped data.
   * </pre>
   *
   * <code>optional bytes data = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Immutable. Raw zipped data.
   * </pre>
   *
   * <code>optional bytes data = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int URL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   * <pre>
   * Output only. The url to access the uploaded zipped data.
   * For example, https://tpc.googlesyndication.com/simgad/123
   * This field is read-only.
   * </pre>
   *
   * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. The url to access the uploaded zipped data.
   * For example, https://tpc.googlesyndication.com/simgad/123
   * This field is read-only.
   * </pre>
   *
   * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The url to access the uploaded zipped data.
   * For example, https://tpc.googlesyndication.com/simgad/123
   * This field is read-only.
   * </pre>
   *
   * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, url_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBytes(3, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, url_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, data_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.resources.MediaBundle)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.resources.MediaBundle other = (com.google.ads.googleads.v12.resources.MediaBundle) obj;

    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
    }
    if (hasUrl() != other.hasUrl()) return false;
    if (hasUrl()) {
      if (!getUrl()
          .equals(other.getUrl())) return false;
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.MediaBundle parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.resources.MediaBundle prototype) {
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
   * Represents a ZIP archive media the content of which contains HTML5 assets.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.resources.MediaBundle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.resources.MediaBundle)
      com.google.ads.googleads.v12.resources.MediaBundleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.resources.MediaFileProto.internal_static_google_ads_googleads_v12_resources_MediaBundle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.resources.MediaFileProto.internal_static_google_ads_googleads_v12_resources_MediaBundle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.resources.MediaBundle.class, com.google.ads.googleads.v12.resources.MediaBundle.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.resources.MediaBundle.newBuilder()
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
      data_ = com.google.protobuf.ByteString.EMPTY;
      url_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.resources.MediaFileProto.internal_static_google_ads_googleads_v12_resources_MediaBundle_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.MediaBundle getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.resources.MediaBundle.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.MediaBundle build() {
      com.google.ads.googleads.v12.resources.MediaBundle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.MediaBundle buildPartial() {
      com.google.ads.googleads.v12.resources.MediaBundle result = new com.google.ads.googleads.v12.resources.MediaBundle(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.resources.MediaBundle result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.data_ = data_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.url_ = url_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v12.resources.MediaBundle) {
        return mergeFrom((com.google.ads.googleads.v12.resources.MediaBundle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.resources.MediaBundle other) {
      if (other == com.google.ads.googleads.v12.resources.MediaBundle.getDefaultInstance()) return this;
      if (other.hasData()) {
        setData(other.getData());
      }
      if (other.hasUrl()) {
        url_ = other.url_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              url_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              data_ = input.readBytes();
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

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Immutable. Raw zipped data.
     * </pre>
     *
     * <code>optional bytes data = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return Whether the data field is set.
     */
    @java.lang.Override
    public boolean hasData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Immutable. Raw zipped data.
     * </pre>
     *
     * <code>optional bytes data = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * Immutable. Raw zipped data.
     * </pre>
     *
     * <code>optional bytes data = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. Raw zipped data.
     * </pre>
     *
     * <code>optional bytes data = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * Output only. The url to access the uploaded zipped data.
     * For example, https://tpc.googlesyndication.com/simgad/123
     * This field is read-only.
     * </pre>
     *
     * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. The url to access the uploaded zipped data.
     * For example, https://tpc.googlesyndication.com/simgad/123
     * This field is read-only.
     * </pre>
     *
     * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The url to access the uploaded zipped data.
     * For example, https://tpc.googlesyndication.com/simgad/123
     * This field is read-only.
     * </pre>
     *
     * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The url to access the uploaded zipped data.
     * For example, https://tpc.googlesyndication.com/simgad/123
     * This field is read-only.
     * </pre>
     *
     * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      url_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The url to access the uploaded zipped data.
     * For example, https://tpc.googlesyndication.com/simgad/123
     * This field is read-only.
     * </pre>
     *
     * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The url to access the uploaded zipped data.
     * For example, https://tpc.googlesyndication.com/simgad/123
     * This field is read-only.
     * </pre>
     *
     * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.resources.MediaBundle)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.resources.MediaBundle)
  private static final com.google.ads.googleads.v12.resources.MediaBundle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.resources.MediaBundle();
  }

  public static com.google.ads.googleads.v12.resources.MediaBundle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaBundle>
      PARSER = new com.google.protobuf.AbstractParser<MediaBundle>() {
    @java.lang.Override
    public MediaBundle parsePartialFrom(
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

  public static com.google.protobuf.Parser<MediaBundle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaBundle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.resources.MediaBundle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

