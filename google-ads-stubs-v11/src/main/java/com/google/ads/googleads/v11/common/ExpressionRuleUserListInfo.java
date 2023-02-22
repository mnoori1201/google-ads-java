// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/user_lists.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Visitors of a page. The page visit is defined by one boolean rule expression.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.ExpressionRuleUserListInfo}
 */
public final class ExpressionRuleUserListInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.ExpressionRuleUserListInfo)
    ExpressionRuleUserListInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExpressionRuleUserListInfo.newBuilder() to construct.
  private ExpressionRuleUserListInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExpressionRuleUserListInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExpressionRuleUserListInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_ExpressionRuleUserListInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_ExpressionRuleUserListInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo.class, com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo.Builder.class);
  }

  public static final int RULE_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v11.common.UserListRuleInfo rule_;
  /**
   * <pre>
   * Boolean rule that defines this user list. The rule consists of a list of
   * rule item groups and each rule item group consists of a list of rule items.
   * All the rule item groups are ORed or ANDed together for evaluation based on
   * rule.rule_type.
   * Required for creating an expression rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
   * @return Whether the rule field is set.
   */
  @java.lang.Override
  public boolean hasRule() {
    return rule_ != null;
  }
  /**
   * <pre>
   * Boolean rule that defines this user list. The rule consists of a list of
   * rule item groups and each rule item group consists of a list of rule items.
   * All the rule item groups are ORed or ANDed together for evaluation based on
   * rule.rule_type.
   * Required for creating an expression rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
   * @return The rule.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.UserListRuleInfo getRule() {
    return rule_ == null ? com.google.ads.googleads.v11.common.UserListRuleInfo.getDefaultInstance() : rule_;
  }
  /**
   * <pre>
   * Boolean rule that defines this user list. The rule consists of a list of
   * rule item groups and each rule item group consists of a list of rule items.
   * All the rule item groups are ORed or ANDed together for evaluation based on
   * rule.rule_type.
   * Required for creating an expression rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder getRuleOrBuilder() {
    return rule_ == null ? com.google.ads.googleads.v11.common.UserListRuleInfo.getDefaultInstance() : rule_;
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
    if (rule_ != null) {
      output.writeMessage(1, getRule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRule());
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo other = (com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo) obj;

    if (hasRule() != other.hasRule()) return false;
    if (hasRule()) {
      if (!getRule()
          .equals(other.getRule())) return false;
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
    if (hasRule()) {
      hash = (37 * hash) + RULE_FIELD_NUMBER;
      hash = (53 * hash) + getRule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo prototype) {
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
   * Visitors of a page. The page visit is defined by one boolean rule expression.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.ExpressionRuleUserListInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.ExpressionRuleUserListInfo)
      com.google.ads.googleads.v11.common.ExpressionRuleUserListInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_ExpressionRuleUserListInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_ExpressionRuleUserListInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo.class, com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo.newBuilder()
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
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_ExpressionRuleUserListInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo build() {
      com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo buildPartial() {
      com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo result = new com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rule_ = ruleBuilder_ == null
            ? rule_
            : ruleBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo) {
        return mergeFrom((com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo other) {
      if (other == com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo.getDefaultInstance()) return this;
      if (other.hasRule()) {
        mergeRule(other.getRule());
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
                  getRuleFieldBuilder().getBuilder(),
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

    private com.google.ads.googleads.v11.common.UserListRuleInfo rule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.UserListRuleInfo, com.google.ads.googleads.v11.common.UserListRuleInfo.Builder, com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder> ruleBuilder_;
    /**
     * <pre>
     * Boolean rule that defines this user list. The rule consists of a list of
     * rule item groups and each rule item group consists of a list of rule items.
     * All the rule item groups are ORed or ANDed together for evaluation based on
     * rule.rule_type.
     * Required for creating an expression rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     * @return Whether the rule field is set.
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Boolean rule that defines this user list. The rule consists of a list of
     * rule item groups and each rule item group consists of a list of rule items.
     * All the rule item groups are ORed or ANDed together for evaluation based on
     * rule.rule_type.
     * Required for creating an expression rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     * @return The rule.
     */
    public com.google.ads.googleads.v11.common.UserListRuleInfo getRule() {
      if (ruleBuilder_ == null) {
        return rule_ == null ? com.google.ads.googleads.v11.common.UserListRuleInfo.getDefaultInstance() : rule_;
      } else {
        return ruleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Boolean rule that defines this user list. The rule consists of a list of
     * rule item groups and each rule item group consists of a list of rule items.
     * All the rule item groups are ORed or ANDed together for evaluation based on
     * rule.rule_type.
     * Required for creating an expression rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder setRule(com.google.ads.googleads.v11.common.UserListRuleInfo value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
      } else {
        ruleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Boolean rule that defines this user list. The rule consists of a list of
     * rule item groups and each rule item group consists of a list of rule items.
     * All the rule item groups are ORed or ANDed together for evaluation based on
     * rule.rule_type.
     * Required for creating an expression rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder setRule(
        com.google.ads.googleads.v11.common.UserListRuleInfo.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        rule_ = builderForValue.build();
      } else {
        ruleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Boolean rule that defines this user list. The rule consists of a list of
     * rule item groups and each rule item group consists of a list of rule items.
     * All the rule item groups are ORed or ANDed together for evaluation based on
     * rule.rule_type.
     * Required for creating an expression rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder mergeRule(com.google.ads.googleads.v11.common.UserListRuleInfo value) {
      if (ruleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          rule_ != null &&
          rule_ != com.google.ads.googleads.v11.common.UserListRuleInfo.getDefaultInstance()) {
          getRuleBuilder().mergeFrom(value);
        } else {
          rule_ = value;
        }
      } else {
        ruleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Boolean rule that defines this user list. The rule consists of a list of
     * rule item groups and each rule item group consists of a list of rule items.
     * All the rule item groups are ORed or ANDed together for evaluation based on
     * rule.rule_type.
     * Required for creating an expression rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder clearRule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Boolean rule that defines this user list. The rule consists of a list of
     * rule item groups and each rule item group consists of a list of rule items.
     * All the rule item groups are ORed or ANDed together for evaluation based on
     * rule.rule_type.
     * Required for creating an expression rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public com.google.ads.googleads.v11.common.UserListRuleInfo.Builder getRuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Boolean rule that defines this user list. The rule consists of a list of
     * rule item groups and each rule item group consists of a list of rule items.
     * All the rule item groups are ORed or ANDed together for evaluation based on
     * rule.rule_type.
     * Required for creating an expression rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder getRuleOrBuilder() {
      if (ruleBuilder_ != null) {
        return ruleBuilder_.getMessageOrBuilder();
      } else {
        return rule_ == null ?
            com.google.ads.googleads.v11.common.UserListRuleInfo.getDefaultInstance() : rule_;
      }
    }
    /**
     * <pre>
     * Boolean rule that defines this user list. The rule consists of a list of
     * rule item groups and each rule item group consists of a list of rule items.
     * All the rule item groups are ORed or ANDed together for evaluation based on
     * rule.rule_type.
     * Required for creating an expression rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.UserListRuleInfo, com.google.ads.googleads.v11.common.UserListRuleInfo.Builder, com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder> 
        getRuleFieldBuilder() {
      if (ruleBuilder_ == null) {
        ruleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.common.UserListRuleInfo, com.google.ads.googleads.v11.common.UserListRuleInfo.Builder, com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder>(
                getRule(),
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      return ruleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.ExpressionRuleUserListInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.ExpressionRuleUserListInfo)
  private static final com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo();
  }

  public static com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpressionRuleUserListInfo>
      PARSER = new com.google.protobuf.AbstractParser<ExpressionRuleUserListInfo>() {
    @java.lang.Override
    public ExpressionRuleUserListInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExpressionRuleUserListInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpressionRuleUserListInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.ExpressionRuleUserListInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

