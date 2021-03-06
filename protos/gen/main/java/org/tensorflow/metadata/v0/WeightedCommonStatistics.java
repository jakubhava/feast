// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/statistics.proto

package org.tensorflow.metadata.v0;

/**
 * <pre>
 * Common weighted statistics for all feature types. Statistics counting number
 * of values (i.e., avg_num_values and tot_num_values) include NaNs.
 * If the weighted column is missing, then this counts as a weight of 1
 * for that example.
 * </pre>
 *
 * Protobuf type {@code tensorflow.metadata.v0.WeightedCommonStatistics}
 */
public final class WeightedCommonStatistics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.metadata.v0.WeightedCommonStatistics)
    WeightedCommonStatisticsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeightedCommonStatistics.newBuilder() to construct.
  private WeightedCommonStatistics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeightedCommonStatistics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeightedCommonStatistics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeightedCommonStatistics(
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
          case 9: {

            numNonMissing_ = input.readDouble();
            break;
          }
          case 17: {

            numMissing_ = input.readDouble();
            break;
          }
          case 25: {

            avgNumValues_ = input.readDouble();
            break;
          }
          case 33: {

            totNumValues_ = input.readDouble();
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
    return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_WeightedCommonStatistics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_WeightedCommonStatistics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.metadata.v0.WeightedCommonStatistics.class, org.tensorflow.metadata.v0.WeightedCommonStatistics.Builder.class);
  }

  public static final int NUM_NON_MISSING_FIELD_NUMBER = 1;
  private double numNonMissing_;
  /**
   * <pre>
   * Weighted number of examples not missing.
   * </pre>
   *
   * <code>double num_non_missing = 1;</code>
   * @return The numNonMissing.
   */
  @java.lang.Override
  public double getNumNonMissing() {
    return numNonMissing_;
  }

  public static final int NUM_MISSING_FIELD_NUMBER = 2;
  private double numMissing_;
  /**
   * <pre>
   * Weighted number of examples missing.
   * Note that if the weighted column is zero, this does not count
   * as missing.
   * </pre>
   *
   * <code>double num_missing = 2;</code>
   * @return The numMissing.
   */
  @java.lang.Override
  public double getNumMissing() {
    return numMissing_;
  }

  public static final int AVG_NUM_VALUES_FIELD_NUMBER = 3;
  private double avgNumValues_;
  /**
   * <pre>
   * average number of values, weighted by the number of examples.
   * </pre>
   *
   * <code>double avg_num_values = 3;</code>
   * @return The avgNumValues.
   */
  @java.lang.Override
  public double getAvgNumValues() {
    return avgNumValues_;
  }

  public static final int TOT_NUM_VALUES_FIELD_NUMBER = 4;
  private double totNumValues_;
  /**
   * <pre>
   * tot_num_values = avg_num_values * num_non_missing.
   * This is calculated directly, so should have less numerical error.
   * </pre>
   *
   * <code>double tot_num_values = 4;</code>
   * @return The totNumValues.
   */
  @java.lang.Override
  public double getTotNumValues() {
    return totNumValues_;
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
    if (numNonMissing_ != 0D) {
      output.writeDouble(1, numNonMissing_);
    }
    if (numMissing_ != 0D) {
      output.writeDouble(2, numMissing_);
    }
    if (avgNumValues_ != 0D) {
      output.writeDouble(3, avgNumValues_);
    }
    if (totNumValues_ != 0D) {
      output.writeDouble(4, totNumValues_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numNonMissing_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, numNonMissing_);
    }
    if (numMissing_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, numMissing_);
    }
    if (avgNumValues_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, avgNumValues_);
    }
    if (totNumValues_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, totNumValues_);
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
    if (!(obj instanceof org.tensorflow.metadata.v0.WeightedCommonStatistics)) {
      return super.equals(obj);
    }
    org.tensorflow.metadata.v0.WeightedCommonStatistics other = (org.tensorflow.metadata.v0.WeightedCommonStatistics) obj;

    if (java.lang.Double.doubleToLongBits(getNumNonMissing())
        != java.lang.Double.doubleToLongBits(
            other.getNumNonMissing())) return false;
    if (java.lang.Double.doubleToLongBits(getNumMissing())
        != java.lang.Double.doubleToLongBits(
            other.getNumMissing())) return false;
    if (java.lang.Double.doubleToLongBits(getAvgNumValues())
        != java.lang.Double.doubleToLongBits(
            other.getAvgNumValues())) return false;
    if (java.lang.Double.doubleToLongBits(getTotNumValues())
        != java.lang.Double.doubleToLongBits(
            other.getTotNumValues())) return false;
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
    hash = (37 * hash) + NUM_NON_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNumNonMissing()));
    hash = (37 * hash) + NUM_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNumMissing()));
    hash = (37 * hash) + AVG_NUM_VALUES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAvgNumValues()));
    hash = (37 * hash) + TOT_NUM_VALUES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTotNumValues()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.WeightedCommonStatistics parseFrom(
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
  public static Builder newBuilder(org.tensorflow.metadata.v0.WeightedCommonStatistics prototype) {
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
   * Common weighted statistics for all feature types. Statistics counting number
   * of values (i.e., avg_num_values and tot_num_values) include NaNs.
   * If the weighted column is missing, then this counts as a weight of 1
   * for that example.
   * </pre>
   *
   * Protobuf type {@code tensorflow.metadata.v0.WeightedCommonStatistics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.metadata.v0.WeightedCommonStatistics)
      org.tensorflow.metadata.v0.WeightedCommonStatisticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_WeightedCommonStatistics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_WeightedCommonStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.metadata.v0.WeightedCommonStatistics.class, org.tensorflow.metadata.v0.WeightedCommonStatistics.Builder.class);
    }

    // Construct using org.tensorflow.metadata.v0.WeightedCommonStatistics.newBuilder()
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
      numNonMissing_ = 0D;

      numMissing_ = 0D;

      avgNumValues_ = 0D;

      totNumValues_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_WeightedCommonStatistics_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.WeightedCommonStatistics getDefaultInstanceForType() {
      return org.tensorflow.metadata.v0.WeightedCommonStatistics.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.WeightedCommonStatistics build() {
      org.tensorflow.metadata.v0.WeightedCommonStatistics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.WeightedCommonStatistics buildPartial() {
      org.tensorflow.metadata.v0.WeightedCommonStatistics result = new org.tensorflow.metadata.v0.WeightedCommonStatistics(this);
      result.numNonMissing_ = numNonMissing_;
      result.numMissing_ = numMissing_;
      result.avgNumValues_ = avgNumValues_;
      result.totNumValues_ = totNumValues_;
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
      if (other instanceof org.tensorflow.metadata.v0.WeightedCommonStatistics) {
        return mergeFrom((org.tensorflow.metadata.v0.WeightedCommonStatistics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.metadata.v0.WeightedCommonStatistics other) {
      if (other == org.tensorflow.metadata.v0.WeightedCommonStatistics.getDefaultInstance()) return this;
      if (other.getNumNonMissing() != 0D) {
        setNumNonMissing(other.getNumNonMissing());
      }
      if (other.getNumMissing() != 0D) {
        setNumMissing(other.getNumMissing());
      }
      if (other.getAvgNumValues() != 0D) {
        setAvgNumValues(other.getAvgNumValues());
      }
      if (other.getTotNumValues() != 0D) {
        setTotNumValues(other.getTotNumValues());
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
      org.tensorflow.metadata.v0.WeightedCommonStatistics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.metadata.v0.WeightedCommonStatistics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double numNonMissing_ ;
    /**
     * <pre>
     * Weighted number of examples not missing.
     * </pre>
     *
     * <code>double num_non_missing = 1;</code>
     * @return The numNonMissing.
     */
    @java.lang.Override
    public double getNumNonMissing() {
      return numNonMissing_;
    }
    /**
     * <pre>
     * Weighted number of examples not missing.
     * </pre>
     *
     * <code>double num_non_missing = 1;</code>
     * @param value The numNonMissing to set.
     * @return This builder for chaining.
     */
    public Builder setNumNonMissing(double value) {
      
      numNonMissing_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Weighted number of examples not missing.
     * </pre>
     *
     * <code>double num_non_missing = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumNonMissing() {
      
      numNonMissing_ = 0D;
      onChanged();
      return this;
    }

    private double numMissing_ ;
    /**
     * <pre>
     * Weighted number of examples missing.
     * Note that if the weighted column is zero, this does not count
     * as missing.
     * </pre>
     *
     * <code>double num_missing = 2;</code>
     * @return The numMissing.
     */
    @java.lang.Override
    public double getNumMissing() {
      return numMissing_;
    }
    /**
     * <pre>
     * Weighted number of examples missing.
     * Note that if the weighted column is zero, this does not count
     * as missing.
     * </pre>
     *
     * <code>double num_missing = 2;</code>
     * @param value The numMissing to set.
     * @return This builder for chaining.
     */
    public Builder setNumMissing(double value) {
      
      numMissing_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Weighted number of examples missing.
     * Note that if the weighted column is zero, this does not count
     * as missing.
     * </pre>
     *
     * <code>double num_missing = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumMissing() {
      
      numMissing_ = 0D;
      onChanged();
      return this;
    }

    private double avgNumValues_ ;
    /**
     * <pre>
     * average number of values, weighted by the number of examples.
     * </pre>
     *
     * <code>double avg_num_values = 3;</code>
     * @return The avgNumValues.
     */
    @java.lang.Override
    public double getAvgNumValues() {
      return avgNumValues_;
    }
    /**
     * <pre>
     * average number of values, weighted by the number of examples.
     * </pre>
     *
     * <code>double avg_num_values = 3;</code>
     * @param value The avgNumValues to set.
     * @return This builder for chaining.
     */
    public Builder setAvgNumValues(double value) {
      
      avgNumValues_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * average number of values, weighted by the number of examples.
     * </pre>
     *
     * <code>double avg_num_values = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvgNumValues() {
      
      avgNumValues_ = 0D;
      onChanged();
      return this;
    }

    private double totNumValues_ ;
    /**
     * <pre>
     * tot_num_values = avg_num_values * num_non_missing.
     * This is calculated directly, so should have less numerical error.
     * </pre>
     *
     * <code>double tot_num_values = 4;</code>
     * @return The totNumValues.
     */
    @java.lang.Override
    public double getTotNumValues() {
      return totNumValues_;
    }
    /**
     * <pre>
     * tot_num_values = avg_num_values * num_non_missing.
     * This is calculated directly, so should have less numerical error.
     * </pre>
     *
     * <code>double tot_num_values = 4;</code>
     * @param value The totNumValues to set.
     * @return This builder for chaining.
     */
    public Builder setTotNumValues(double value) {
      
      totNumValues_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tot_num_values = avg_num_values * num_non_missing.
     * This is calculated directly, so should have less numerical error.
     * </pre>
     *
     * <code>double tot_num_values = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotNumValues() {
      
      totNumValues_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.metadata.v0.WeightedCommonStatistics)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.metadata.v0.WeightedCommonStatistics)
  private static final org.tensorflow.metadata.v0.WeightedCommonStatistics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.metadata.v0.WeightedCommonStatistics();
  }

  public static org.tensorflow.metadata.v0.WeightedCommonStatistics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeightedCommonStatistics>
      PARSER = new com.google.protobuf.AbstractParser<WeightedCommonStatistics>() {
    @java.lang.Override
    public WeightedCommonStatistics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeightedCommonStatistics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeightedCommonStatistics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeightedCommonStatistics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.metadata.v0.WeightedCommonStatistics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

