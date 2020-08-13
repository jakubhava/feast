// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/statistics.proto

package org.tensorflow.metadata.v0;

/**
 * Protobuf type {@code tensorflow.metadata.v0.NumericCrossStatistics}
 */
public final class NumericCrossStatistics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.metadata.v0.NumericCrossStatistics)
    NumericCrossStatisticsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NumericCrossStatistics.newBuilder() to construct.
  private NumericCrossStatistics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NumericCrossStatistics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NumericCrossStatistics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NumericCrossStatistics(
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
          case 13: {

            correlation_ = input.readFloat();
            break;
          }
          case 21: {

            covariance_ = input.readFloat();
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
    return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_NumericCrossStatistics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_NumericCrossStatistics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.metadata.v0.NumericCrossStatistics.class, org.tensorflow.metadata.v0.NumericCrossStatistics.Builder.class);
  }

  public static final int CORRELATION_FIELD_NUMBER = 1;
  private float correlation_;
  /**
   * <pre>
   * Pearson product-moment correlation coefficient.
   * </pre>
   *
   * <code>float correlation = 1;</code>
   * @return The correlation.
   */
  @java.lang.Override
  public float getCorrelation() {
    return correlation_;
  }

  public static final int COVARIANCE_FIELD_NUMBER = 2;
  private float covariance_;
  /**
   * <pre>
   * Standard covariance. E[(X-E[X])*(Y-E[Y])]
   * </pre>
   *
   * <code>float covariance = 2;</code>
   * @return The covariance.
   */
  @java.lang.Override
  public float getCovariance() {
    return covariance_;
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
    if (correlation_ != 0F) {
      output.writeFloat(1, correlation_);
    }
    if (covariance_ != 0F) {
      output.writeFloat(2, covariance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (correlation_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, correlation_);
    }
    if (covariance_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, covariance_);
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
    if (!(obj instanceof org.tensorflow.metadata.v0.NumericCrossStatistics)) {
      return super.equals(obj);
    }
    org.tensorflow.metadata.v0.NumericCrossStatistics other = (org.tensorflow.metadata.v0.NumericCrossStatistics) obj;

    if (java.lang.Float.floatToIntBits(getCorrelation())
        != java.lang.Float.floatToIntBits(
            other.getCorrelation())) return false;
    if (java.lang.Float.floatToIntBits(getCovariance())
        != java.lang.Float.floatToIntBits(
            other.getCovariance())) return false;
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
    hash = (37 * hash) + CORRELATION_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCorrelation());
    hash = (37 * hash) + COVARIANCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCovariance());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.NumericCrossStatistics parseFrom(
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
  public static Builder newBuilder(org.tensorflow.metadata.v0.NumericCrossStatistics prototype) {
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
   * Protobuf type {@code tensorflow.metadata.v0.NumericCrossStatistics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.metadata.v0.NumericCrossStatistics)
      org.tensorflow.metadata.v0.NumericCrossStatisticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_NumericCrossStatistics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_NumericCrossStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.metadata.v0.NumericCrossStatistics.class, org.tensorflow.metadata.v0.NumericCrossStatistics.Builder.class);
    }

    // Construct using org.tensorflow.metadata.v0.NumericCrossStatistics.newBuilder()
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
      correlation_ = 0F;

      covariance_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_NumericCrossStatistics_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.NumericCrossStatistics getDefaultInstanceForType() {
      return org.tensorflow.metadata.v0.NumericCrossStatistics.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.NumericCrossStatistics build() {
      org.tensorflow.metadata.v0.NumericCrossStatistics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.NumericCrossStatistics buildPartial() {
      org.tensorflow.metadata.v0.NumericCrossStatistics result = new org.tensorflow.metadata.v0.NumericCrossStatistics(this);
      result.correlation_ = correlation_;
      result.covariance_ = covariance_;
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
      if (other instanceof org.tensorflow.metadata.v0.NumericCrossStatistics) {
        return mergeFrom((org.tensorflow.metadata.v0.NumericCrossStatistics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.metadata.v0.NumericCrossStatistics other) {
      if (other == org.tensorflow.metadata.v0.NumericCrossStatistics.getDefaultInstance()) return this;
      if (other.getCorrelation() != 0F) {
        setCorrelation(other.getCorrelation());
      }
      if (other.getCovariance() != 0F) {
        setCovariance(other.getCovariance());
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
      org.tensorflow.metadata.v0.NumericCrossStatistics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.metadata.v0.NumericCrossStatistics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float correlation_ ;
    /**
     * <pre>
     * Pearson product-moment correlation coefficient.
     * </pre>
     *
     * <code>float correlation = 1;</code>
     * @return The correlation.
     */
    @java.lang.Override
    public float getCorrelation() {
      return correlation_;
    }
    /**
     * <pre>
     * Pearson product-moment correlation coefficient.
     * </pre>
     *
     * <code>float correlation = 1;</code>
     * @param value The correlation to set.
     * @return This builder for chaining.
     */
    public Builder setCorrelation(float value) {
      
      correlation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pearson product-moment correlation coefficient.
     * </pre>
     *
     * <code>float correlation = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCorrelation() {
      
      correlation_ = 0F;
      onChanged();
      return this;
    }

    private float covariance_ ;
    /**
     * <pre>
     * Standard covariance. E[(X-E[X])*(Y-E[Y])]
     * </pre>
     *
     * <code>float covariance = 2;</code>
     * @return The covariance.
     */
    @java.lang.Override
    public float getCovariance() {
      return covariance_;
    }
    /**
     * <pre>
     * Standard covariance. E[(X-E[X])*(Y-E[Y])]
     * </pre>
     *
     * <code>float covariance = 2;</code>
     * @param value The covariance to set.
     * @return This builder for chaining.
     */
    public Builder setCovariance(float value) {
      
      covariance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Standard covariance. E[(X-E[X])*(Y-E[Y])]
     * </pre>
     *
     * <code>float covariance = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCovariance() {
      
      covariance_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.metadata.v0.NumericCrossStatistics)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.metadata.v0.NumericCrossStatistics)
  private static final org.tensorflow.metadata.v0.NumericCrossStatistics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.metadata.v0.NumericCrossStatistics();
  }

  public static org.tensorflow.metadata.v0.NumericCrossStatistics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NumericCrossStatistics>
      PARSER = new com.google.protobuf.AbstractParser<NumericCrossStatistics>() {
    @java.lang.Override
    public NumericCrossStatistics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NumericCrossStatistics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NumericCrossStatistics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NumericCrossStatistics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.metadata.v0.NumericCrossStatistics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

