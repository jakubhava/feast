// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/statistics.proto

package org.tensorflow.metadata.v0;

/**
 * Protobuf type {@code tensorflow.metadata.v0.StructStatistics}
 */
public final class StructStatistics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.metadata.v0.StructStatistics)
    StructStatisticsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StructStatistics.newBuilder() to construct.
  private StructStatistics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StructStatistics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StructStatistics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StructStatistics(
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
          case 10: {
            org.tensorflow.metadata.v0.CommonStatistics.Builder subBuilder = null;
            if (commonStats_ != null) {
              subBuilder = commonStats_.toBuilder();
            }
            commonStats_ = input.readMessage(org.tensorflow.metadata.v0.CommonStatistics.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commonStats_);
              commonStats_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_StructStatistics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_StructStatistics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.metadata.v0.StructStatistics.class, org.tensorflow.metadata.v0.StructStatistics.Builder.class);
  }

  public static final int COMMON_STATS_FIELD_NUMBER = 1;
  private org.tensorflow.metadata.v0.CommonStatistics commonStats_;
  /**
   * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
   * @return Whether the commonStats field is set.
   */
  @java.lang.Override
  public boolean hasCommonStats() {
    return commonStats_ != null;
  }
  /**
   * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
   * @return The commonStats.
   */
  @java.lang.Override
  public org.tensorflow.metadata.v0.CommonStatistics getCommonStats() {
    return commonStats_ == null ? org.tensorflow.metadata.v0.CommonStatistics.getDefaultInstance() : commonStats_;
  }
  /**
   * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
   */
  @java.lang.Override
  public org.tensorflow.metadata.v0.CommonStatisticsOrBuilder getCommonStatsOrBuilder() {
    return getCommonStats();
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
    if (commonStats_ != null) {
      output.writeMessage(1, getCommonStats());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commonStats_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommonStats());
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
    if (!(obj instanceof org.tensorflow.metadata.v0.StructStatistics)) {
      return super.equals(obj);
    }
    org.tensorflow.metadata.v0.StructStatistics other = (org.tensorflow.metadata.v0.StructStatistics) obj;

    if (hasCommonStats() != other.hasCommonStats()) return false;
    if (hasCommonStats()) {
      if (!getCommonStats()
          .equals(other.getCommonStats())) return false;
    }
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
    if (hasCommonStats()) {
      hash = (37 * hash) + COMMON_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getCommonStats().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.StructStatistics parseFrom(
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
  public static Builder newBuilder(org.tensorflow.metadata.v0.StructStatistics prototype) {
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
   * Protobuf type {@code tensorflow.metadata.v0.StructStatistics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.metadata.v0.StructStatistics)
      org.tensorflow.metadata.v0.StructStatisticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_StructStatistics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_StructStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.metadata.v0.StructStatistics.class, org.tensorflow.metadata.v0.StructStatistics.Builder.class);
    }

    // Construct using org.tensorflow.metadata.v0.StructStatistics.newBuilder()
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
      if (commonStatsBuilder_ == null) {
        commonStats_ = null;
      } else {
        commonStats_ = null;
        commonStatsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_StructStatistics_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.StructStatistics getDefaultInstanceForType() {
      return org.tensorflow.metadata.v0.StructStatistics.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.StructStatistics build() {
      org.tensorflow.metadata.v0.StructStatistics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.StructStatistics buildPartial() {
      org.tensorflow.metadata.v0.StructStatistics result = new org.tensorflow.metadata.v0.StructStatistics(this);
      if (commonStatsBuilder_ == null) {
        result.commonStats_ = commonStats_;
      } else {
        result.commonStats_ = commonStatsBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.metadata.v0.StructStatistics) {
        return mergeFrom((org.tensorflow.metadata.v0.StructStatistics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.metadata.v0.StructStatistics other) {
      if (other == org.tensorflow.metadata.v0.StructStatistics.getDefaultInstance()) return this;
      if (other.hasCommonStats()) {
        mergeCommonStats(other.getCommonStats());
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
      org.tensorflow.metadata.v0.StructStatistics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.metadata.v0.StructStatistics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.tensorflow.metadata.v0.CommonStatistics commonStats_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.metadata.v0.CommonStatistics, org.tensorflow.metadata.v0.CommonStatistics.Builder, org.tensorflow.metadata.v0.CommonStatisticsOrBuilder> commonStatsBuilder_;
    /**
     * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
     * @return Whether the commonStats field is set.
     */
    public boolean hasCommonStats() {
      return commonStatsBuilder_ != null || commonStats_ != null;
    }
    /**
     * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
     * @return The commonStats.
     */
    public org.tensorflow.metadata.v0.CommonStatistics getCommonStats() {
      if (commonStatsBuilder_ == null) {
        return commonStats_ == null ? org.tensorflow.metadata.v0.CommonStatistics.getDefaultInstance() : commonStats_;
      } else {
        return commonStatsBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
     */
    public Builder setCommonStats(org.tensorflow.metadata.v0.CommonStatistics value) {
      if (commonStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonStats_ = value;
        onChanged();
      } else {
        commonStatsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
     */
    public Builder setCommonStats(
        org.tensorflow.metadata.v0.CommonStatistics.Builder builderForValue) {
      if (commonStatsBuilder_ == null) {
        commonStats_ = builderForValue.build();
        onChanged();
      } else {
        commonStatsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
     */
    public Builder mergeCommonStats(org.tensorflow.metadata.v0.CommonStatistics value) {
      if (commonStatsBuilder_ == null) {
        if (commonStats_ != null) {
          commonStats_ =
            org.tensorflow.metadata.v0.CommonStatistics.newBuilder(commonStats_).mergeFrom(value).buildPartial();
        } else {
          commonStats_ = value;
        }
        onChanged();
      } else {
        commonStatsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
     */
    public Builder clearCommonStats() {
      if (commonStatsBuilder_ == null) {
        commonStats_ = null;
        onChanged();
      } else {
        commonStats_ = null;
        commonStatsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
     */
    public org.tensorflow.metadata.v0.CommonStatistics.Builder getCommonStatsBuilder() {
      
      onChanged();
      return getCommonStatsFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
     */
    public org.tensorflow.metadata.v0.CommonStatisticsOrBuilder getCommonStatsOrBuilder() {
      if (commonStatsBuilder_ != null) {
        return commonStatsBuilder_.getMessageOrBuilder();
      } else {
        return commonStats_ == null ?
            org.tensorflow.metadata.v0.CommonStatistics.getDefaultInstance() : commonStats_;
      }
    }
    /**
     * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.metadata.v0.CommonStatistics, org.tensorflow.metadata.v0.CommonStatistics.Builder, org.tensorflow.metadata.v0.CommonStatisticsOrBuilder> 
        getCommonStatsFieldBuilder() {
      if (commonStatsBuilder_ == null) {
        commonStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.metadata.v0.CommonStatistics, org.tensorflow.metadata.v0.CommonStatistics.Builder, org.tensorflow.metadata.v0.CommonStatisticsOrBuilder>(
                getCommonStats(),
                getParentForChildren(),
                isClean());
        commonStats_ = null;
      }
      return commonStatsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.metadata.v0.StructStatistics)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.metadata.v0.StructStatistics)
  private static final org.tensorflow.metadata.v0.StructStatistics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.metadata.v0.StructStatistics();
  }

  public static org.tensorflow.metadata.v0.StructStatistics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StructStatistics>
      PARSER = new com.google.protobuf.AbstractParser<StructStatistics>() {
    @java.lang.Override
    public StructStatistics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StructStatistics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StructStatistics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StructStatistics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.metadata.v0.StructStatistics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

