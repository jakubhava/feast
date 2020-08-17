// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

/**
 * <pre>
 * Checks that the ratio of the current value to the previous value is not below
 * the min_fraction_threshold or above the max_fraction_threshold. That is,
 * previous value * min_fraction_threshold &lt;= current value &lt;=
 * previous value * max_fraction_threshold.
 * To specify that the value cannot change, set both min_fraction_threshold and
 * max_fraction_threshold to 1.0.
 * </pre>
 *
 * Protobuf type {@code tensorflow.metadata.v0.NumericValueComparator}
 */
public final class NumericValueComparator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.metadata.v0.NumericValueComparator)
    NumericValueComparatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NumericValueComparator.newBuilder() to construct.
  private NumericValueComparator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NumericValueComparator() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NumericValueComparator();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NumericValueComparator(
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
          case 9: {
            bitField0_ |= 0x00000001;
            minFractionThreshold_ = input.readDouble();
            break;
          }
          case 17: {
            bitField0_ |= 0x00000002;
            maxFractionThreshold_ = input.readDouble();
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
    return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_NumericValueComparator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_NumericValueComparator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.metadata.v0.NumericValueComparator.class, org.tensorflow.metadata.v0.NumericValueComparator.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_FRACTION_THRESHOLD_FIELD_NUMBER = 1;
  private double minFractionThreshold_;
  /**
   * <code>optional double min_fraction_threshold = 1;</code>
   * @return Whether the minFractionThreshold field is set.
   */
  @java.lang.Override
  public boolean hasMinFractionThreshold() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional double min_fraction_threshold = 1;</code>
   * @return The minFractionThreshold.
   */
  @java.lang.Override
  public double getMinFractionThreshold() {
    return minFractionThreshold_;
  }

  public static final int MAX_FRACTION_THRESHOLD_FIELD_NUMBER = 2;
  private double maxFractionThreshold_;
  /**
   * <code>optional double max_fraction_threshold = 2;</code>
   * @return Whether the maxFractionThreshold field is set.
   */
  @java.lang.Override
  public boolean hasMaxFractionThreshold() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional double max_fraction_threshold = 2;</code>
   * @return The maxFractionThreshold.
   */
  @java.lang.Override
  public double getMaxFractionThreshold() {
    return maxFractionThreshold_;
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
      output.writeDouble(1, minFractionThreshold_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(2, maxFractionThreshold_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, minFractionThreshold_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, maxFractionThreshold_);
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
    if (!(obj instanceof org.tensorflow.metadata.v0.NumericValueComparator)) {
      return super.equals(obj);
    }
    org.tensorflow.metadata.v0.NumericValueComparator other = (org.tensorflow.metadata.v0.NumericValueComparator) obj;

    if (hasMinFractionThreshold() != other.hasMinFractionThreshold()) return false;
    if (hasMinFractionThreshold()) {
      if (java.lang.Double.doubleToLongBits(getMinFractionThreshold())
          != java.lang.Double.doubleToLongBits(
              other.getMinFractionThreshold())) return false;
    }
    if (hasMaxFractionThreshold() != other.hasMaxFractionThreshold()) return false;
    if (hasMaxFractionThreshold()) {
      if (java.lang.Double.doubleToLongBits(getMaxFractionThreshold())
          != java.lang.Double.doubleToLongBits(
              other.getMaxFractionThreshold())) return false;
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
    if (hasMinFractionThreshold()) {
      hash = (37 * hash) + MIN_FRACTION_THRESHOLD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getMinFractionThreshold()));
    }
    if (hasMaxFractionThreshold()) {
      hash = (37 * hash) + MAX_FRACTION_THRESHOLD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getMaxFractionThreshold()));
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.NumericValueComparator parseFrom(
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
  public static Builder newBuilder(org.tensorflow.metadata.v0.NumericValueComparator prototype) {
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
   * Checks that the ratio of the current value to the previous value is not below
   * the min_fraction_threshold or above the max_fraction_threshold. That is,
   * previous value * min_fraction_threshold &lt;= current value &lt;=
   * previous value * max_fraction_threshold.
   * To specify that the value cannot change, set both min_fraction_threshold and
   * max_fraction_threshold to 1.0.
   * </pre>
   *
   * Protobuf type {@code tensorflow.metadata.v0.NumericValueComparator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.metadata.v0.NumericValueComparator)
      org.tensorflow.metadata.v0.NumericValueComparatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_NumericValueComparator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_NumericValueComparator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.metadata.v0.NumericValueComparator.class, org.tensorflow.metadata.v0.NumericValueComparator.Builder.class);
    }

    // Construct using org.tensorflow.metadata.v0.NumericValueComparator.newBuilder()
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
      minFractionThreshold_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000001);
      maxFractionThreshold_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_NumericValueComparator_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.NumericValueComparator getDefaultInstanceForType() {
      return org.tensorflow.metadata.v0.NumericValueComparator.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.NumericValueComparator build() {
      org.tensorflow.metadata.v0.NumericValueComparator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.NumericValueComparator buildPartial() {
      org.tensorflow.metadata.v0.NumericValueComparator result = new org.tensorflow.metadata.v0.NumericValueComparator(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minFractionThreshold_ = minFractionThreshold_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxFractionThreshold_ = maxFractionThreshold_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.tensorflow.metadata.v0.NumericValueComparator) {
        return mergeFrom((org.tensorflow.metadata.v0.NumericValueComparator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.metadata.v0.NumericValueComparator other) {
      if (other == org.tensorflow.metadata.v0.NumericValueComparator.getDefaultInstance()) return this;
      if (other.hasMinFractionThreshold()) {
        setMinFractionThreshold(other.getMinFractionThreshold());
      }
      if (other.hasMaxFractionThreshold()) {
        setMaxFractionThreshold(other.getMaxFractionThreshold());
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
      org.tensorflow.metadata.v0.NumericValueComparator parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.metadata.v0.NumericValueComparator) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private double minFractionThreshold_ ;
    /**
     * <code>optional double min_fraction_threshold = 1;</code>
     * @return Whether the minFractionThreshold field is set.
     */
    @java.lang.Override
    public boolean hasMinFractionThreshold() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional double min_fraction_threshold = 1;</code>
     * @return The minFractionThreshold.
     */
    @java.lang.Override
    public double getMinFractionThreshold() {
      return minFractionThreshold_;
    }
    /**
     * <code>optional double min_fraction_threshold = 1;</code>
     * @param value The minFractionThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setMinFractionThreshold(double value) {
      bitField0_ |= 0x00000001;
      minFractionThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double min_fraction_threshold = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinFractionThreshold() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minFractionThreshold_ = 0D;
      onChanged();
      return this;
    }

    private double maxFractionThreshold_ ;
    /**
     * <code>optional double max_fraction_threshold = 2;</code>
     * @return Whether the maxFractionThreshold field is set.
     */
    @java.lang.Override
    public boolean hasMaxFractionThreshold() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional double max_fraction_threshold = 2;</code>
     * @return The maxFractionThreshold.
     */
    @java.lang.Override
    public double getMaxFractionThreshold() {
      return maxFractionThreshold_;
    }
    /**
     * <code>optional double max_fraction_threshold = 2;</code>
     * @param value The maxFractionThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setMaxFractionThreshold(double value) {
      bitField0_ |= 0x00000002;
      maxFractionThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double max_fraction_threshold = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxFractionThreshold() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxFractionThreshold_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.metadata.v0.NumericValueComparator)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.metadata.v0.NumericValueComparator)
  private static final org.tensorflow.metadata.v0.NumericValueComparator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.metadata.v0.NumericValueComparator();
  }

  public static org.tensorflow.metadata.v0.NumericValueComparator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<NumericValueComparator>
      PARSER = new com.google.protobuf.AbstractParser<NumericValueComparator>() {
    @java.lang.Override
    public NumericValueComparator parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NumericValueComparator(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NumericValueComparator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NumericValueComparator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.metadata.v0.NumericValueComparator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
