// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/criteria.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * A Proximity criterion. The geo point and radius determine what geographical
 * area is included. The address is a description of the geo point that does
 * not affect ad serving.
 * There are two ways to create a proximity. First, by setting an address
 * and radius. The geo point will be automatically computed. Second, by
 * setting a geo point and radius. The address is an optional label that won't
 * be validated.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.ProximityInfo}
 */
public final class ProximityInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.ProximityInfo)
    ProximityInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProximityInfo.newBuilder() to construct.
  private ProximityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProximityInfo() {
    radiusUnits_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProximityInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProximityInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProximityInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.ProximityInfo.class, com.google.ads.googleads.v11.common.ProximityInfo.Builder.class);
  }

  private int bitField0_;
  public static final int GEO_POINT_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v11.common.GeoPointInfo geoPoint_;
  /**
   * <pre>
   * Latitude and longitude.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
   * @return Whether the geoPoint field is set.
   */
  @java.lang.Override
  public boolean hasGeoPoint() {
    return geoPoint_ != null;
  }
  /**
   * <pre>
   * Latitude and longitude.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
   * @return The geoPoint.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.GeoPointInfo getGeoPoint() {
    return geoPoint_ == null ? com.google.ads.googleads.v11.common.GeoPointInfo.getDefaultInstance() : geoPoint_;
  }
  /**
   * <pre>
   * Latitude and longitude.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.GeoPointInfoOrBuilder getGeoPointOrBuilder() {
    return geoPoint_ == null ? com.google.ads.googleads.v11.common.GeoPointInfo.getDefaultInstance() : geoPoint_;
  }

  public static final int RADIUS_FIELD_NUMBER = 5;
  private double radius_ = 0D;
  /**
   * <pre>
   * The radius of the proximity.
   * </pre>
   *
   * <code>optional double radius = 5;</code>
   * @return Whether the radius field is set.
   */
  @java.lang.Override
  public boolean hasRadius() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The radius of the proximity.
   * </pre>
   *
   * <code>optional double radius = 5;</code>
   * @return The radius.
   */
  @java.lang.Override
  public double getRadius() {
    return radius_;
  }

  public static final int RADIUS_UNITS_FIELD_NUMBER = 3;
  private int radiusUnits_ = 0;
  /**
   * <pre>
   * The unit of measurement of the radius. Default is KILOMETERS.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits radius_units = 3;</code>
   * @return The enum numeric value on the wire for radiusUnits.
   */
  @java.lang.Override public int getRadiusUnitsValue() {
    return radiusUnits_;
  }
  /**
   * <pre>
   * The unit of measurement of the radius. Default is KILOMETERS.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits radius_units = 3;</code>
   * @return The radiusUnits.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits getRadiusUnits() {
    com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits result = com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits.forNumber(radiusUnits_);
    return result == null ? com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits.UNRECOGNIZED : result;
  }

  public static final int ADDRESS_FIELD_NUMBER = 4;
  private com.google.ads.googleads.v11.common.AddressInfo address_;
  /**
   * <pre>
   * Full address.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
   * @return Whether the address field is set.
   */
  @java.lang.Override
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <pre>
   * Full address.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
   * @return The address.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.AddressInfo getAddress() {
    return address_ == null ? com.google.ads.googleads.v11.common.AddressInfo.getDefaultInstance() : address_;
  }
  /**
   * <pre>
   * Full address.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.AddressInfoOrBuilder getAddressOrBuilder() {
    return address_ == null ? com.google.ads.googleads.v11.common.AddressInfo.getDefaultInstance() : address_;
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
    if (geoPoint_ != null) {
      output.writeMessage(1, getGeoPoint());
    }
    if (radiusUnits_ != com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, radiusUnits_);
    }
    if (address_ != null) {
      output.writeMessage(4, getAddress());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(5, radius_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (geoPoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGeoPoint());
    }
    if (radiusUnits_ != com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, radiusUnits_);
    }
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAddress());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, radius_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.ProximityInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.ProximityInfo other = (com.google.ads.googleads.v11.common.ProximityInfo) obj;

    if (hasGeoPoint() != other.hasGeoPoint()) return false;
    if (hasGeoPoint()) {
      if (!getGeoPoint()
          .equals(other.getGeoPoint())) return false;
    }
    if (hasRadius() != other.hasRadius()) return false;
    if (hasRadius()) {
      if (java.lang.Double.doubleToLongBits(getRadius())
          != java.lang.Double.doubleToLongBits(
              other.getRadius())) return false;
    }
    if (radiusUnits_ != other.radiusUnits_) return false;
    if (hasAddress() != other.hasAddress()) return false;
    if (hasAddress()) {
      if (!getAddress()
          .equals(other.getAddress())) return false;
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
    if (hasGeoPoint()) {
      hash = (37 * hash) + GEO_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getGeoPoint().hashCode();
    }
    if (hasRadius()) {
      hash = (37 * hash) + RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getRadius()));
    }
    hash = (37 * hash) + RADIUS_UNITS_FIELD_NUMBER;
    hash = (53 * hash) + radiusUnits_;
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ProximityInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.ProximityInfo prototype) {
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
   * A Proximity criterion. The geo point and radius determine what geographical
   * area is included. The address is a description of the geo point that does
   * not affect ad serving.
   * There are two ways to create a proximity. First, by setting an address
   * and radius. The geo point will be automatically computed. Second, by
   * setting a geo point and radius. The address is an optional label that won't
   * be validated.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.ProximityInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.ProximityInfo)
      com.google.ads.googleads.v11.common.ProximityInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProximityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProximityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.ProximityInfo.class, com.google.ads.googleads.v11.common.ProximityInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.ProximityInfo.newBuilder()
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
      geoPoint_ = null;
      if (geoPointBuilder_ != null) {
        geoPointBuilder_.dispose();
        geoPointBuilder_ = null;
      }
      radius_ = 0D;
      radiusUnits_ = 0;
      address_ = null;
      if (addressBuilder_ != null) {
        addressBuilder_.dispose();
        addressBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_ProximityInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ProximityInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.ProximityInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ProximityInfo build() {
      com.google.ads.googleads.v11.common.ProximityInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ProximityInfo buildPartial() {
      com.google.ads.googleads.v11.common.ProximityInfo result = new com.google.ads.googleads.v11.common.ProximityInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.common.ProximityInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.geoPoint_ = geoPointBuilder_ == null
            ? geoPoint_
            : geoPointBuilder_.build();
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.radius_ = radius_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.radiusUnits_ = radiusUnits_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.address_ = addressBuilder_ == null
            ? address_
            : addressBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v11.common.ProximityInfo) {
        return mergeFrom((com.google.ads.googleads.v11.common.ProximityInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.ProximityInfo other) {
      if (other == com.google.ads.googleads.v11.common.ProximityInfo.getDefaultInstance()) return this;
      if (other.hasGeoPoint()) {
        mergeGeoPoint(other.getGeoPoint());
      }
      if (other.hasRadius()) {
        setRadius(other.getRadius());
      }
      if (other.radiusUnits_ != 0) {
        setRadiusUnitsValue(other.getRadiusUnitsValue());
      }
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
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
                  getGeoPointFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 24: {
              radiusUnits_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getAddressFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 41: {
              radius_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 41
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

    private com.google.ads.googleads.v11.common.GeoPointInfo geoPoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.GeoPointInfo, com.google.ads.googleads.v11.common.GeoPointInfo.Builder, com.google.ads.googleads.v11.common.GeoPointInfoOrBuilder> geoPointBuilder_;
    /**
     * <pre>
     * Latitude and longitude.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
     * @return Whether the geoPoint field is set.
     */
    public boolean hasGeoPoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Latitude and longitude.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
     * @return The geoPoint.
     */
    public com.google.ads.googleads.v11.common.GeoPointInfo getGeoPoint() {
      if (geoPointBuilder_ == null) {
        return geoPoint_ == null ? com.google.ads.googleads.v11.common.GeoPointInfo.getDefaultInstance() : geoPoint_;
      } else {
        return geoPointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Latitude and longitude.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
     */
    public Builder setGeoPoint(com.google.ads.googleads.v11.common.GeoPointInfo value) {
      if (geoPointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        geoPoint_ = value;
      } else {
        geoPointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Latitude and longitude.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
     */
    public Builder setGeoPoint(
        com.google.ads.googleads.v11.common.GeoPointInfo.Builder builderForValue) {
      if (geoPointBuilder_ == null) {
        geoPoint_ = builderForValue.build();
      } else {
        geoPointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Latitude and longitude.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
     */
    public Builder mergeGeoPoint(com.google.ads.googleads.v11.common.GeoPointInfo value) {
      if (geoPointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          geoPoint_ != null &&
          geoPoint_ != com.google.ads.googleads.v11.common.GeoPointInfo.getDefaultInstance()) {
          getGeoPointBuilder().mergeFrom(value);
        } else {
          geoPoint_ = value;
        }
      } else {
        geoPointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Latitude and longitude.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
     */
    public Builder clearGeoPoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      geoPoint_ = null;
      if (geoPointBuilder_ != null) {
        geoPointBuilder_.dispose();
        geoPointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Latitude and longitude.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
     */
    public com.google.ads.googleads.v11.common.GeoPointInfo.Builder getGeoPointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGeoPointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Latitude and longitude.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
     */
    public com.google.ads.googleads.v11.common.GeoPointInfoOrBuilder getGeoPointOrBuilder() {
      if (geoPointBuilder_ != null) {
        return geoPointBuilder_.getMessageOrBuilder();
      } else {
        return geoPoint_ == null ?
            com.google.ads.googleads.v11.common.GeoPointInfo.getDefaultInstance() : geoPoint_;
      }
    }
    /**
     * <pre>
     * Latitude and longitude.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.GeoPointInfo geo_point = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.GeoPointInfo, com.google.ads.googleads.v11.common.GeoPointInfo.Builder, com.google.ads.googleads.v11.common.GeoPointInfoOrBuilder> 
        getGeoPointFieldBuilder() {
      if (geoPointBuilder_ == null) {
        geoPointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.common.GeoPointInfo, com.google.ads.googleads.v11.common.GeoPointInfo.Builder, com.google.ads.googleads.v11.common.GeoPointInfoOrBuilder>(
                getGeoPoint(),
                getParentForChildren(),
                isClean());
        geoPoint_ = null;
      }
      return geoPointBuilder_;
    }

    private double radius_ ;
    /**
     * <pre>
     * The radius of the proximity.
     * </pre>
     *
     * <code>optional double radius = 5;</code>
     * @return Whether the radius field is set.
     */
    @java.lang.Override
    public boolean hasRadius() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The radius of the proximity.
     * </pre>
     *
     * <code>optional double radius = 5;</code>
     * @return The radius.
     */
    @java.lang.Override
    public double getRadius() {
      return radius_;
    }
    /**
     * <pre>
     * The radius of the proximity.
     * </pre>
     *
     * <code>optional double radius = 5;</code>
     * @param value The radius to set.
     * @return This builder for chaining.
     */
    public Builder setRadius(double value) {
      
      radius_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The radius of the proximity.
     * </pre>
     *
     * <code>optional double radius = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearRadius() {
      bitField0_ = (bitField0_ & ~0x00000002);
      radius_ = 0D;
      onChanged();
      return this;
    }

    private int radiusUnits_ = 0;
    /**
     * <pre>
     * The unit of measurement of the radius. Default is KILOMETERS.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits radius_units = 3;</code>
     * @return The enum numeric value on the wire for radiusUnits.
     */
    @java.lang.Override public int getRadiusUnitsValue() {
      return radiusUnits_;
    }
    /**
     * <pre>
     * The unit of measurement of the radius. Default is KILOMETERS.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits radius_units = 3;</code>
     * @param value The enum numeric value on the wire for radiusUnits to set.
     * @return This builder for chaining.
     */
    public Builder setRadiusUnitsValue(int value) {
      radiusUnits_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unit of measurement of the radius. Default is KILOMETERS.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits radius_units = 3;</code>
     * @return The radiusUnits.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits getRadiusUnits() {
      com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits result = com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits.forNumber(radiusUnits_);
      return result == null ? com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The unit of measurement of the radius. Default is KILOMETERS.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits radius_units = 3;</code>
     * @param value The radiusUnits to set.
     * @return This builder for chaining.
     */
    public Builder setRadiusUnits(com.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      radiusUnits_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unit of measurement of the radius. Default is KILOMETERS.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits radius_units = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRadiusUnits() {
      bitField0_ = (bitField0_ & ~0x00000004);
      radiusUnits_ = 0;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v11.common.AddressInfo address_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.AddressInfo, com.google.ads.googleads.v11.common.AddressInfo.Builder, com.google.ads.googleads.v11.common.AddressInfoOrBuilder> addressBuilder_;
    /**
     * <pre>
     * Full address.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
     * @return Whether the address field is set.
     */
    public boolean hasAddress() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Full address.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
     * @return The address.
     */
    public com.google.ads.googleads.v11.common.AddressInfo getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? com.google.ads.googleads.v11.common.AddressInfo.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Full address.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
     */
    public Builder setAddress(com.google.ads.googleads.v11.common.AddressInfo value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
      } else {
        addressBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full address.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
     */
    public Builder setAddress(
        com.google.ads.googleads.v11.common.AddressInfo.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full address.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
     */
    public Builder mergeAddress(com.google.ads.googleads.v11.common.AddressInfo value) {
      if (addressBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          address_ != null &&
          address_ != com.google.ads.googleads.v11.common.AddressInfo.getDefaultInstance()) {
          getAddressBuilder().mergeFrom(value);
        } else {
          address_ = value;
        }
      } else {
        addressBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full address.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
     */
    public Builder clearAddress() {
      bitField0_ = (bitField0_ & ~0x00000008);
      address_ = null;
      if (addressBuilder_ != null) {
        addressBuilder_.dispose();
        addressBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full address.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
     */
    public com.google.ads.googleads.v11.common.AddressInfo.Builder getAddressBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Full address.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
     */
    public com.google.ads.googleads.v11.common.AddressInfoOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            com.google.ads.googleads.v11.common.AddressInfo.getDefaultInstance() : address_;
      }
    }
    /**
     * <pre>
     * Full address.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.AddressInfo address = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.AddressInfo, com.google.ads.googleads.v11.common.AddressInfo.Builder, com.google.ads.googleads.v11.common.AddressInfoOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.common.AddressInfo, com.google.ads.googleads.v11.common.AddressInfo.Builder, com.google.ads.googleads.v11.common.AddressInfoOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.ProximityInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.ProximityInfo)
  private static final com.google.ads.googleads.v11.common.ProximityInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.ProximityInfo();
  }

  public static com.google.ads.googleads.v11.common.ProximityInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProximityInfo>
      PARSER = new com.google.protobuf.AbstractParser<ProximityInfo>() {
    @java.lang.Override
    public ProximityInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProximityInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProximityInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.ProximityInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

