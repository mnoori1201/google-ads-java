// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/audience_insights_service.proto

package com.google.ads.googleads.v13.services;

/**
 * <pre>
 * Response message for
 * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse}
 */
public final class GenerateAudienceCompositionInsightsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse)
    GenerateAudienceCompositionInsightsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateAudienceCompositionInsightsResponse.newBuilder() to construct.
  private GenerateAudienceCompositionInsightsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateAudienceCompositionInsightsResponse() {
    sections_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateAudienceCompositionInsightsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_GenerateAudienceCompositionInsightsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_GenerateAudienceCompositionInsightsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse.class, com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse.Builder.class);
  }

  public static final int SECTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v13.services.AudienceCompositionSection> sections_;
  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v13.services.AudienceCompositionSection> getSectionsList() {
    return sections_;
  }
  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v13.services.AudienceCompositionSectionOrBuilder> 
      getSectionsOrBuilderList() {
    return sections_;
  }
  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
   */
  @java.lang.Override
  public int getSectionsCount() {
    return sections_.size();
  }
  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.services.AudienceCompositionSection getSections(int index) {
    return sections_.get(index);
  }
  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.services.AudienceCompositionSectionOrBuilder getSectionsOrBuilder(
      int index) {
    return sections_.get(index);
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
    for (int i = 0; i < sections_.size(); i++) {
      output.writeMessage(1, sections_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sections_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse other = (com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse) obj;

    if (!getSectionsList()
        .equals(other.getSectionsList())) return false;
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
    if (getSectionsCount() > 0) {
      hash = (37 * hash) + SECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSectionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse prototype) {
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
   * [AudienceInsightsService.GenerateAudienceCompositionInsights][google.ads.googleads.v13.services.AudienceInsightsService.GenerateAudienceCompositionInsights].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse)
      com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_GenerateAudienceCompositionInsightsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_GenerateAudienceCompositionInsightsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse.class, com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse.newBuilder()
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
      if (sectionsBuilder_ == null) {
        sections_ = java.util.Collections.emptyList();
      } else {
        sections_ = null;
        sectionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v13_services_GenerateAudienceCompositionInsightsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse build() {
      com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse buildPartial() {
      com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse result = new com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse result) {
      if (sectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sections_ = java.util.Collections.unmodifiableList(sections_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sections_ = sections_;
      } else {
        result.sections_ = sectionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse) {
        return mergeFrom((com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse other) {
      if (other == com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse.getDefaultInstance()) return this;
      if (sectionsBuilder_ == null) {
        if (!other.sections_.isEmpty()) {
          if (sections_.isEmpty()) {
            sections_ = other.sections_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSectionsIsMutable();
            sections_.addAll(other.sections_);
          }
          onChanged();
        }
      } else {
        if (!other.sections_.isEmpty()) {
          if (sectionsBuilder_.isEmpty()) {
            sectionsBuilder_.dispose();
            sectionsBuilder_ = null;
            sections_ = other.sections_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sectionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSectionsFieldBuilder() : null;
          } else {
            sectionsBuilder_.addAllMessages(other.sections_);
          }
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
              com.google.ads.googleads.v13.services.AudienceCompositionSection m =
                  input.readMessage(
                      com.google.ads.googleads.v13.services.AudienceCompositionSection.parser(),
                      extensionRegistry);
              if (sectionsBuilder_ == null) {
                ensureSectionsIsMutable();
                sections_.add(m);
              } else {
                sectionsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.ads.googleads.v13.services.AudienceCompositionSection> sections_ =
      java.util.Collections.emptyList();
    private void ensureSectionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sections_ = new java.util.ArrayList<com.google.ads.googleads.v13.services.AudienceCompositionSection>(sections_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v13.services.AudienceCompositionSection, com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder, com.google.ads.googleads.v13.services.AudienceCompositionSectionOrBuilder> sectionsBuilder_;

    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v13.services.AudienceCompositionSection> getSectionsList() {
      if (sectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sections_);
      } else {
        return sectionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public int getSectionsCount() {
      if (sectionsBuilder_ == null) {
        return sections_.size();
      } else {
        return sectionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public com.google.ads.googleads.v13.services.AudienceCompositionSection getSections(int index) {
      if (sectionsBuilder_ == null) {
        return sections_.get(index);
      } else {
        return sectionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public Builder setSections(
        int index, com.google.ads.googleads.v13.services.AudienceCompositionSection value) {
      if (sectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSectionsIsMutable();
        sections_.set(index, value);
        onChanged();
      } else {
        sectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public Builder setSections(
        int index, com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder builderForValue) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.set(index, builderForValue.build());
        onChanged();
      } else {
        sectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public Builder addSections(com.google.ads.googleads.v13.services.AudienceCompositionSection value) {
      if (sectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSectionsIsMutable();
        sections_.add(value);
        onChanged();
      } else {
        sectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public Builder addSections(
        int index, com.google.ads.googleads.v13.services.AudienceCompositionSection value) {
      if (sectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSectionsIsMutable();
        sections_.add(index, value);
        onChanged();
      } else {
        sectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public Builder addSections(
        com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder builderForValue) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.add(builderForValue.build());
        onChanged();
      } else {
        sectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public Builder addSections(
        int index, com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder builderForValue) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.add(index, builderForValue.build());
        onChanged();
      } else {
        sectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public Builder addAllSections(
        java.lang.Iterable<? extends com.google.ads.googleads.v13.services.AudienceCompositionSection> values) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sections_);
        onChanged();
      } else {
        sectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public Builder clearSections() {
      if (sectionsBuilder_ == null) {
        sections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sectionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public Builder removeSections(int index) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.remove(index);
        onChanged();
      } else {
        sectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder getSectionsBuilder(
        int index) {
      return getSectionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public com.google.ads.googleads.v13.services.AudienceCompositionSectionOrBuilder getSectionsOrBuilder(
        int index) {
      if (sectionsBuilder_ == null) {
        return sections_.get(index);  } else {
        return sectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v13.services.AudienceCompositionSectionOrBuilder> 
         getSectionsOrBuilderList() {
      if (sectionsBuilder_ != null) {
        return sectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sections_);
      }
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder addSectionsBuilder() {
      return getSectionsFieldBuilder().addBuilder(
          com.google.ads.googleads.v13.services.AudienceCompositionSection.getDefaultInstance());
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder addSectionsBuilder(
        int index) {
      return getSectionsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v13.services.AudienceCompositionSection.getDefaultInstance());
    }
    /**
     * <pre>
     * The contents of the insights report, organized into sections.
     * Each section is associated with one of the AudienceInsightsDimension values
     * in the request. There may be more than one section per dimension.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.AudienceCompositionSection sections = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder> 
         getSectionsBuilderList() {
      return getSectionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v13.services.AudienceCompositionSection, com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder, com.google.ads.googleads.v13.services.AudienceCompositionSectionOrBuilder> 
        getSectionsFieldBuilder() {
      if (sectionsBuilder_ == null) {
        sectionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v13.services.AudienceCompositionSection, com.google.ads.googleads.v13.services.AudienceCompositionSection.Builder, com.google.ads.googleads.v13.services.AudienceCompositionSectionOrBuilder>(
                sections_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        sections_ = null;
      }
      return sectionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse)
  private static final com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse();
  }

  public static com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateAudienceCompositionInsightsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateAudienceCompositionInsightsResponse>() {
    @java.lang.Override
    public GenerateAudienceCompositionInsightsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateAudienceCompositionInsightsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateAudienceCompositionInsightsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.services.GenerateAudienceCompositionInsightsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

