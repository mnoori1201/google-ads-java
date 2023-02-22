// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/user_data_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * Response message for
 * [UserDataService.UploadUserData][google.ads.googleads.v11.services.UserDataService.UploadUserData]
 * Uploads made through this service will not be visible under the 'Segment
 * members' section for the Customer Match List in the Google Ads UI.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.UploadUserDataResponse}
 */
public final class UploadUserDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.UploadUserDataResponse)
    UploadUserDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UploadUserDataResponse.newBuilder() to construct.
  private UploadUserDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UploadUserDataResponse() {
    uploadDateTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UploadUserDataResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.UserDataServiceProto.internal_static_google_ads_googleads_v11_services_UploadUserDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.UserDataServiceProto.internal_static_google_ads_googleads_v11_services_UploadUserDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.UploadUserDataResponse.class, com.google.ads.googleads.v11.services.UploadUserDataResponse.Builder.class);
  }

  private int bitField0_;
  public static final int UPLOAD_DATE_TIME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uploadDateTime_ = "";
  /**
   * <pre>
   * The date time at which the request was received by API, formatted as
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string upload_date_time = 3;</code>
   * @return Whether the uploadDateTime field is set.
   */
  @java.lang.Override
  public boolean hasUploadDateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The date time at which the request was received by API, formatted as
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string upload_date_time = 3;</code>
   * @return The uploadDateTime.
   */
  @java.lang.Override
  public java.lang.String getUploadDateTime() {
    java.lang.Object ref = uploadDateTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uploadDateTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The date time at which the request was received by API, formatted as
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string upload_date_time = 3;</code>
   * @return The bytes for uploadDateTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUploadDateTimeBytes() {
    java.lang.Object ref = uploadDateTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uploadDateTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIVED_OPERATIONS_COUNT_FIELD_NUMBER = 4;
  private int receivedOperationsCount_ = 0;
  /**
   * <pre>
   * Number of upload data operations received by API.
   * </pre>
   *
   * <code>optional int32 received_operations_count = 4;</code>
   * @return Whether the receivedOperationsCount field is set.
   */
  @java.lang.Override
  public boolean hasReceivedOperationsCount() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Number of upload data operations received by API.
   * </pre>
   *
   * <code>optional int32 received_operations_count = 4;</code>
   * @return The receivedOperationsCount.
   */
  @java.lang.Override
  public int getReceivedOperationsCount() {
    return receivedOperationsCount_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uploadDateTime_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(4, receivedOperationsCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uploadDateTime_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, receivedOperationsCount_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.UploadUserDataResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.UploadUserDataResponse other = (com.google.ads.googleads.v11.services.UploadUserDataResponse) obj;

    if (hasUploadDateTime() != other.hasUploadDateTime()) return false;
    if (hasUploadDateTime()) {
      if (!getUploadDateTime()
          .equals(other.getUploadDateTime())) return false;
    }
    if (hasReceivedOperationsCount() != other.hasReceivedOperationsCount()) return false;
    if (hasReceivedOperationsCount()) {
      if (getReceivedOperationsCount()
          != other.getReceivedOperationsCount()) return false;
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
    if (hasUploadDateTime()) {
      hash = (37 * hash) + UPLOAD_DATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUploadDateTime().hashCode();
    }
    if (hasReceivedOperationsCount()) {
      hash = (37 * hash) + RECEIVED_OPERATIONS_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getReceivedOperationsCount();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.UploadUserDataResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.UploadUserDataResponse prototype) {
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
   * Response message for
   * [UserDataService.UploadUserData][google.ads.googleads.v11.services.UserDataService.UploadUserData]
   * Uploads made through this service will not be visible under the 'Segment
   * members' section for the Customer Match List in the Google Ads UI.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.UploadUserDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.UploadUserDataResponse)
      com.google.ads.googleads.v11.services.UploadUserDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.UserDataServiceProto.internal_static_google_ads_googleads_v11_services_UploadUserDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.UserDataServiceProto.internal_static_google_ads_googleads_v11_services_UploadUserDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.UploadUserDataResponse.class, com.google.ads.googleads.v11.services.UploadUserDataResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.UploadUserDataResponse.newBuilder()
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
      uploadDateTime_ = "";
      receivedOperationsCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.UserDataServiceProto.internal_static_google_ads_googleads_v11_services_UploadUserDataResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.UploadUserDataResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.UploadUserDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.UploadUserDataResponse build() {
      com.google.ads.googleads.v11.services.UploadUserDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.UploadUserDataResponse buildPartial() {
      com.google.ads.googleads.v11.services.UploadUserDataResponse result = new com.google.ads.googleads.v11.services.UploadUserDataResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.services.UploadUserDataResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uploadDateTime_ = uploadDateTime_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.receivedOperationsCount_ = receivedOperationsCount_;
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
      if (other instanceof com.google.ads.googleads.v11.services.UploadUserDataResponse) {
        return mergeFrom((com.google.ads.googleads.v11.services.UploadUserDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.UploadUserDataResponse other) {
      if (other == com.google.ads.googleads.v11.services.UploadUserDataResponse.getDefaultInstance()) return this;
      if (other.hasUploadDateTime()) {
        uploadDateTime_ = other.uploadDateTime_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReceivedOperationsCount()) {
        setReceivedOperationsCount(other.getReceivedOperationsCount());
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
              uploadDateTime_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 32: {
              receivedOperationsCount_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
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

    private java.lang.Object uploadDateTime_ = "";
    /**
     * <pre>
     * The date time at which the request was received by API, formatted as
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string upload_date_time = 3;</code>
     * @return Whether the uploadDateTime field is set.
     */
    public boolean hasUploadDateTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The date time at which the request was received by API, formatted as
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string upload_date_time = 3;</code>
     * @return The uploadDateTime.
     */
    public java.lang.String getUploadDateTime() {
      java.lang.Object ref = uploadDateTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uploadDateTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The date time at which the request was received by API, formatted as
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string upload_date_time = 3;</code>
     * @return The bytes for uploadDateTime.
     */
    public com.google.protobuf.ByteString
        getUploadDateTimeBytes() {
      java.lang.Object ref = uploadDateTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uploadDateTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The date time at which the request was received by API, formatted as
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string upload_date_time = 3;</code>
     * @param value The uploadDateTime to set.
     * @return This builder for chaining.
     */
    public Builder setUploadDateTime(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uploadDateTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The date time at which the request was received by API, formatted as
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string upload_date_time = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadDateTime() {
      uploadDateTime_ = getDefaultInstance().getUploadDateTime();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The date time at which the request was received by API, formatted as
     * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string upload_date_time = 3;</code>
     * @param value The bytes for uploadDateTime to set.
     * @return This builder for chaining.
     */
    public Builder setUploadDateTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uploadDateTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int receivedOperationsCount_ ;
    /**
     * <pre>
     * Number of upload data operations received by API.
     * </pre>
     *
     * <code>optional int32 received_operations_count = 4;</code>
     * @return Whether the receivedOperationsCount field is set.
     */
    @java.lang.Override
    public boolean hasReceivedOperationsCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Number of upload data operations received by API.
     * </pre>
     *
     * <code>optional int32 received_operations_count = 4;</code>
     * @return The receivedOperationsCount.
     */
    @java.lang.Override
    public int getReceivedOperationsCount() {
      return receivedOperationsCount_;
    }
    /**
     * <pre>
     * Number of upload data operations received by API.
     * </pre>
     *
     * <code>optional int32 received_operations_count = 4;</code>
     * @param value The receivedOperationsCount to set.
     * @return This builder for chaining.
     */
    public Builder setReceivedOperationsCount(int value) {
      
      receivedOperationsCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of upload data operations received by API.
     * </pre>
     *
     * <code>optional int32 received_operations_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceivedOperationsCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      receivedOperationsCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.UploadUserDataResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.UploadUserDataResponse)
  private static final com.google.ads.googleads.v11.services.UploadUserDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.UploadUserDataResponse();
  }

  public static com.google.ads.googleads.v11.services.UploadUserDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadUserDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<UploadUserDataResponse>() {
    @java.lang.Override
    public UploadUserDataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UploadUserDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadUserDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.UploadUserDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

