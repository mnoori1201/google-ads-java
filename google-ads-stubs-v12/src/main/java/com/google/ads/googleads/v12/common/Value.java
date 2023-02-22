// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/value.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * A generic data container.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.Value}
 */
public final class Value extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.Value)
    ValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Value.newBuilder() to construct.
  private Value(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Value() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Value();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.ValueProto.internal_static_google_ads_googleads_v12_common_Value_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.ValueProto.internal_static_google_ads_googleads_v12_common_Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.Value.class, com.google.ads.googleads.v12.common.Value.Builder.class);
  }

  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BOOLEAN_VALUE(1),
    INT64_VALUE(2),
    FLOAT_VALUE(3),
    DOUBLE_VALUE(4),
    STRING_VALUE(5),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1: return BOOLEAN_VALUE;
        case 2: return INT64_VALUE;
        case 3: return FLOAT_VALUE;
        case 4: return DOUBLE_VALUE;
        case 5: return STRING_VALUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * A boolean.
   * </pre>
   *
   * <code>bool boolean_value = 1;</code>
   * @return Whether the booleanValue field is set.
   */
  @java.lang.Override
  public boolean hasBooleanValue() {
    return valueCase_ == 1;
  }
  /**
   * <pre>
   * A boolean.
   * </pre>
   *
   * <code>bool boolean_value = 1;</code>
   * @return The booleanValue.
   */
  @java.lang.Override
  public boolean getBooleanValue() {
    if (valueCase_ == 1) {
      return (java.lang.Boolean) value_;
    }
    return false;
  }

  public static final int INT64_VALUE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * An int64.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   * @return Whether the int64Value field is set.
   */
  @java.lang.Override
  public boolean hasInt64Value() {
    return valueCase_ == 2;
  }
  /**
   * <pre>
   * An int64.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   * @return The int64Value.
   */
  @java.lang.Override
  public long getInt64Value() {
    if (valueCase_ == 2) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int FLOAT_VALUE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * A float.
   * </pre>
   *
   * <code>float float_value = 3;</code>
   * @return Whether the floatValue field is set.
   */
  @java.lang.Override
  public boolean hasFloatValue() {
    return valueCase_ == 3;
  }
  /**
   * <pre>
   * A float.
   * </pre>
   *
   * <code>float float_value = 3;</code>
   * @return The floatValue.
   */
  @java.lang.Override
  public float getFloatValue() {
    if (valueCase_ == 3) {
      return (java.lang.Float) value_;
    }
    return 0F;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 4;
  /**
   * <pre>
   * A double.
   * </pre>
   *
   * <code>double double_value = 4;</code>
   * @return Whether the doubleValue field is set.
   */
  @java.lang.Override
  public boolean hasDoubleValue() {
    return valueCase_ == 4;
  }
  /**
   * <pre>
   * A double.
   * </pre>
   *
   * <code>double double_value = 4;</code>
   * @return The doubleValue.
   */
  @java.lang.Override
  public double getDoubleValue() {
    if (valueCase_ == 4) {
      return (java.lang.Double) value_;
    }
    return 0D;
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 5;
  /**
   * <pre>
   * A string.
   * </pre>
   *
   * <code>string string_value = 5;</code>
   * @return Whether the stringValue field is set.
   */
  public boolean hasStringValue() {
    return valueCase_ == 5;
  }
  /**
   * <pre>
   * A string.
   * </pre>
   *
   * <code>string string_value = 5;</code>
   * @return The stringValue.
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 5) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 5) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * A string.
   * </pre>
   *
   * <code>string string_value = 5;</code>
   * @return The bytes for stringValue.
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 5) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 5) {
        value_ = b;
      }
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
    if (valueCase_ == 1) {
      output.writeBool(
          1, (boolean)((java.lang.Boolean) value_));
    }
    if (valueCase_ == 2) {
      output.writeInt64(
          2, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 3) {
      output.writeFloat(
          3, (float)((java.lang.Float) value_));
    }
    if (valueCase_ == 4) {
      output.writeDouble(
          4, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 5) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            1, (boolean)((java.lang.Boolean) value_));
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            2, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(
            3, (float)((java.lang.Float) value_));
    }
    if (valueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            4, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 5) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, value_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.Value)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.Value other = (com.google.ads.googleads.v12.common.Value) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (getBooleanValue()
            != other.getBooleanValue()) return false;
        break;
      case 2:
        if (getInt64Value()
            != other.getInt64Value()) return false;
        break;
      case 3:
        if (java.lang.Float.floatToIntBits(getFloatValue())
            != java.lang.Float.floatToIntBits(
                other.getFloatValue())) return false;
        break;
      case 4:
        if (java.lang.Double.doubleToLongBits(getDoubleValue())
            != java.lang.Double.doubleToLongBits(
                other.getDoubleValue())) return false;
        break;
      case 5:
        if (!getStringValue()
            .equals(other.getStringValue())) return false;
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
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + BOOLEAN_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBooleanValue());
        break;
      case 2:
        hash = (37 * hash) + INT64_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getInt64Value());
        break;
      case 3:
        hash = (37 * hash) + FLOAT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getFloatValue());
        break;
      case 4:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 5:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.Value parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.Value parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.Value parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.Value prototype) {
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
   * A generic data container.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.Value)
      com.google.ads.googleads.v12.common.ValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.ValueProto.internal_static_google_ads_googleads_v12_common_Value_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.ValueProto.internal_static_google_ads_googleads_v12_common_Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.Value.class, com.google.ads.googleads.v12.common.Value.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.Value.newBuilder()
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
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.ValueProto.internal_static_google_ads_googleads_v12_common_Value_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.Value getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.Value.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.Value build() {
      com.google.ads.googleads.v12.common.Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.Value buildPartial() {
      com.google.ads.googleads.v12.common.Value result = new com.google.ads.googleads.v12.common.Value(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.Value result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.ads.googleads.v12.common.Value result) {
      result.valueCase_ = valueCase_;
      result.value_ = this.value_;
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
      if (other instanceof com.google.ads.googleads.v12.common.Value) {
        return mergeFrom((com.google.ads.googleads.v12.common.Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.Value other) {
      if (other == com.google.ads.googleads.v12.common.Value.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case BOOLEAN_VALUE: {
          setBooleanValue(other.getBooleanValue());
          break;
        }
        case INT64_VALUE: {
          setInt64Value(other.getInt64Value());
          break;
        }
        case FLOAT_VALUE: {
          setFloatValue(other.getFloatValue());
          break;
        }
        case DOUBLE_VALUE: {
          setDoubleValue(other.getDoubleValue());
          break;
        }
        case STRING_VALUE: {
          valueCase_ = 5;
          value_ = other.value_;
          onChanged();
          break;
        }
        case VALUE_NOT_SET: {
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
              value_ = input.readBool();
              valueCase_ = 1;
              break;
            } // case 8
            case 16: {
              value_ = input.readInt64();
              valueCase_ = 2;
              break;
            } // case 16
            case 29: {
              value_ = input.readFloat();
              valueCase_ = 3;
              break;
            } // case 29
            case 33: {
              value_ = input.readDouble();
              valueCase_ = 4;
              break;
            } // case 33
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              valueCase_ = 5;
              value_ = s;
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
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * A boolean.
     * </pre>
     *
     * <code>bool boolean_value = 1;</code>
     * @return Whether the booleanValue field is set.
     */
    public boolean hasBooleanValue() {
      return valueCase_ == 1;
    }
    /**
     * <pre>
     * A boolean.
     * </pre>
     *
     * <code>bool boolean_value = 1;</code>
     * @return The booleanValue.
     */
    public boolean getBooleanValue() {
      if (valueCase_ == 1) {
        return (java.lang.Boolean) value_;
      }
      return false;
    }
    /**
     * <pre>
     * A boolean.
     * </pre>
     *
     * <code>bool boolean_value = 1;</code>
     * @param value The booleanValue to set.
     * @return This builder for chaining.
     */
    public Builder setBooleanValue(boolean value) {
      
      valueCase_ = 1;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A boolean.
     * </pre>
     *
     * <code>bool boolean_value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBooleanValue() {
      if (valueCase_ == 1) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * An int64.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     * @return Whether the int64Value field is set.
     */
    public boolean hasInt64Value() {
      return valueCase_ == 2;
    }
    /**
     * <pre>
     * An int64.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     * @return The int64Value.
     */
    public long getInt64Value() {
      if (valueCase_ == 2) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }
    /**
     * <pre>
     * An int64.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     * @param value The int64Value to set.
     * @return This builder for chaining.
     */
    public Builder setInt64Value(long value) {
      
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An int64.
     * </pre>
     *
     * <code>int64 int64_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInt64Value() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * A float.
     * </pre>
     *
     * <code>float float_value = 3;</code>
     * @return Whether the floatValue field is set.
     */
    public boolean hasFloatValue() {
      return valueCase_ == 3;
    }
    /**
     * <pre>
     * A float.
     * </pre>
     *
     * <code>float float_value = 3;</code>
     * @return The floatValue.
     */
    public float getFloatValue() {
      if (valueCase_ == 3) {
        return (java.lang.Float) value_;
      }
      return 0F;
    }
    /**
     * <pre>
     * A float.
     * </pre>
     *
     * <code>float float_value = 3;</code>
     * @param value The floatValue to set.
     * @return This builder for chaining.
     */
    public Builder setFloatValue(float value) {
      
      valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A float.
     * </pre>
     *
     * <code>float float_value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFloatValue() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * A double.
     * </pre>
     *
     * <code>double double_value = 4;</code>
     * @return Whether the doubleValue field is set.
     */
    public boolean hasDoubleValue() {
      return valueCase_ == 4;
    }
    /**
     * <pre>
     * A double.
     * </pre>
     *
     * <code>double double_value = 4;</code>
     * @return The doubleValue.
     */
    public double getDoubleValue() {
      if (valueCase_ == 4) {
        return (java.lang.Double) value_;
      }
      return 0D;
    }
    /**
     * <pre>
     * A double.
     * </pre>
     *
     * <code>double double_value = 4;</code>
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {
      
      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A double.
     * </pre>
     *
     * <code>double double_value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      if (valueCase_ == 4) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * A string.
     * </pre>
     *
     * <code>string string_value = 5;</code>
     * @return Whether the stringValue field is set.
     */
    @java.lang.Override
    public boolean hasStringValue() {
      return valueCase_ == 5;
    }
    /**
     * <pre>
     * A string.
     * </pre>
     *
     * <code>string string_value = 5;</code>
     * @return The stringValue.
     */
    @java.lang.Override
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 5) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 5) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A string.
     * </pre>
     *
     * <code>string string_value = 5;</code>
     * @return The bytes for stringValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 5) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 5) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A string.
     * </pre>
     *
     * <code>string string_value = 5;</code>
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valueCase_ = 5;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A string.
     * </pre>
     *
     * <code>string string_value = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
      if (valueCase_ == 5) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * A string.
     * </pre>
     *
     * <code>string string_value = 5;</code>
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valueCase_ = 5;
      value_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.Value)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.Value)
  private static final com.google.ads.googleads.v12.common.Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.Value();
  }

  public static com.google.ads.googleads.v12.common.Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Value>
      PARSER = new com.google.protobuf.AbstractParser<Value>() {
    @java.lang.Override
    public Value parsePartialFrom(
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

  public static com.google.protobuf.Parser<Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Value> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

