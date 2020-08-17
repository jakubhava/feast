// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/statistics.proto

package org.tensorflow.metadata.v0;

/**
 * Protobuf type {@code tensorflow.metadata.v0.CategoricalCrossStatistics}
 */
public final class CategoricalCrossStatistics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.metadata.v0.CategoricalCrossStatistics)
    CategoricalCrossStatisticsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CategoricalCrossStatistics.newBuilder() to construct.
  private CategoricalCrossStatistics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CategoricalCrossStatistics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CategoricalCrossStatistics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CategoricalCrossStatistics(
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
            org.tensorflow.metadata.v0.LiftStatistics.Builder subBuilder = null;
            if (lift_ != null) {
              subBuilder = lift_.toBuilder();
            }
            lift_ = input.readMessage(org.tensorflow.metadata.v0.LiftStatistics.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lift_);
              lift_ = subBuilder.buildPartial();
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
    return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_CategoricalCrossStatistics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_CategoricalCrossStatistics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.metadata.v0.CategoricalCrossStatistics.class, org.tensorflow.metadata.v0.CategoricalCrossStatistics.Builder.class);
  }

  public static final int LIFT_FIELD_NUMBER = 1;
  private org.tensorflow.metadata.v0.LiftStatistics lift_;
  /**
   * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
   * @return Whether the lift field is set.
   */
  @java.lang.Override
  public boolean hasLift() {
    return lift_ != null;
  }
  /**
   * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
   * @return The lift.
   */
  @java.lang.Override
  public org.tensorflow.metadata.v0.LiftStatistics getLift() {
    return lift_ == null ? org.tensorflow.metadata.v0.LiftStatistics.getDefaultInstance() : lift_;
  }
  /**
   * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
   */
  @java.lang.Override
  public org.tensorflow.metadata.v0.LiftStatisticsOrBuilder getLiftOrBuilder() {
    return getLift();
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
    if (lift_ != null) {
      output.writeMessage(1, getLift());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lift_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLift());
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
    if (!(obj instanceof org.tensorflow.metadata.v0.CategoricalCrossStatistics)) {
      return super.equals(obj);
    }
    org.tensorflow.metadata.v0.CategoricalCrossStatistics other = (org.tensorflow.metadata.v0.CategoricalCrossStatistics) obj;

    if (hasLift() != other.hasLift()) return false;
    if (hasLift()) {
      if (!getLift()
          .equals(other.getLift())) return false;
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
    if (hasLift()) {
      hash = (37 * hash) + LIFT_FIELD_NUMBER;
      hash = (53 * hash) + getLift().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics parseFrom(
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
  public static Builder newBuilder(org.tensorflow.metadata.v0.CategoricalCrossStatistics prototype) {
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
   * Protobuf type {@code tensorflow.metadata.v0.CategoricalCrossStatistics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.metadata.v0.CategoricalCrossStatistics)
      org.tensorflow.metadata.v0.CategoricalCrossStatisticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_CategoricalCrossStatistics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_CategoricalCrossStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.metadata.v0.CategoricalCrossStatistics.class, org.tensorflow.metadata.v0.CategoricalCrossStatistics.Builder.class);
    }

    // Construct using org.tensorflow.metadata.v0.CategoricalCrossStatistics.newBuilder()
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
      if (liftBuilder_ == null) {
        lift_ = null;
      } else {
        lift_ = null;
        liftBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.metadata.v0.Statistics.internal_static_tensorflow_metadata_v0_CategoricalCrossStatistics_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.CategoricalCrossStatistics getDefaultInstanceForType() {
      return org.tensorflow.metadata.v0.CategoricalCrossStatistics.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.CategoricalCrossStatistics build() {
      org.tensorflow.metadata.v0.CategoricalCrossStatistics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.CategoricalCrossStatistics buildPartial() {
      org.tensorflow.metadata.v0.CategoricalCrossStatistics result = new org.tensorflow.metadata.v0.CategoricalCrossStatistics(this);
      if (liftBuilder_ == null) {
        result.lift_ = lift_;
      } else {
        result.lift_ = liftBuilder_.build();
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
      if (other instanceof org.tensorflow.metadata.v0.CategoricalCrossStatistics) {
        return mergeFrom((org.tensorflow.metadata.v0.CategoricalCrossStatistics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.metadata.v0.CategoricalCrossStatistics other) {
      if (other == org.tensorflow.metadata.v0.CategoricalCrossStatistics.getDefaultInstance()) return this;
      if (other.hasLift()) {
        mergeLift(other.getLift());
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
      org.tensorflow.metadata.v0.CategoricalCrossStatistics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.metadata.v0.CategoricalCrossStatistics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.tensorflow.metadata.v0.LiftStatistics lift_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.metadata.v0.LiftStatistics, org.tensorflow.metadata.v0.LiftStatistics.Builder, org.tensorflow.metadata.v0.LiftStatisticsOrBuilder> liftBuilder_;
    /**
     * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
     * @return Whether the lift field is set.
     */
    public boolean hasLift() {
      return liftBuilder_ != null || lift_ != null;
    }
    /**
     * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
     * @return The lift.
     */
    public org.tensorflow.metadata.v0.LiftStatistics getLift() {
      if (liftBuilder_ == null) {
        return lift_ == null ? org.tensorflow.metadata.v0.LiftStatistics.getDefaultInstance() : lift_;
      } else {
        return liftBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
     */
    public Builder setLift(org.tensorflow.metadata.v0.LiftStatistics value) {
      if (liftBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lift_ = value;
        onChanged();
      } else {
        liftBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
     */
    public Builder setLift(
        org.tensorflow.metadata.v0.LiftStatistics.Builder builderForValue) {
      if (liftBuilder_ == null) {
        lift_ = builderForValue.build();
        onChanged();
      } else {
        liftBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
     */
    public Builder mergeLift(org.tensorflow.metadata.v0.LiftStatistics value) {
      if (liftBuilder_ == null) {
        if (lift_ != null) {
          lift_ =
            org.tensorflow.metadata.v0.LiftStatistics.newBuilder(lift_).mergeFrom(value).buildPartial();
        } else {
          lift_ = value;
        }
        onChanged();
      } else {
        liftBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
     */
    public Builder clearLift() {
      if (liftBuilder_ == null) {
        lift_ = null;
        onChanged();
      } else {
        lift_ = null;
        liftBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
     */
    public org.tensorflow.metadata.v0.LiftStatistics.Builder getLiftBuilder() {
      
      onChanged();
      return getLiftFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
     */
    public org.tensorflow.metadata.v0.LiftStatisticsOrBuilder getLiftOrBuilder() {
      if (liftBuilder_ != null) {
        return liftBuilder_.getMessageOrBuilder();
      } else {
        return lift_ == null ?
            org.tensorflow.metadata.v0.LiftStatistics.getDefaultInstance() : lift_;
      }
    }
    /**
     * <code>.tensorflow.metadata.v0.LiftStatistics lift = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.metadata.v0.LiftStatistics, org.tensorflow.metadata.v0.LiftStatistics.Builder, org.tensorflow.metadata.v0.LiftStatisticsOrBuilder> 
        getLiftFieldBuilder() {
      if (liftBuilder_ == null) {
        liftBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.metadata.v0.LiftStatistics, org.tensorflow.metadata.v0.LiftStatistics.Builder, org.tensorflow.metadata.v0.LiftStatisticsOrBuilder>(
                getLift(),
                getParentForChildren(),
                isClean());
        lift_ = null;
      }
      return liftBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.metadata.v0.CategoricalCrossStatistics)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.metadata.v0.CategoricalCrossStatistics)
  private static final org.tensorflow.metadata.v0.CategoricalCrossStatistics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.metadata.v0.CategoricalCrossStatistics();
  }

  public static org.tensorflow.metadata.v0.CategoricalCrossStatistics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CategoricalCrossStatistics>
      PARSER = new com.google.protobuf.AbstractParser<CategoricalCrossStatistics>() {
    @java.lang.Override
    public CategoricalCrossStatistics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CategoricalCrossStatistics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CategoricalCrossStatistics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CategoricalCrossStatistics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.metadata.v0.CategoricalCrossStatistics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
