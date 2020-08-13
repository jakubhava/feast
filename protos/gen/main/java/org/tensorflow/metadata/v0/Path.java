// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/path.proto

package org.tensorflow.metadata.v0;

/**
 * <pre>
 * A path is a more general substitute for the name of a field or feature that
 * can be used for flat examples as well as structured data. For example, if
 * we had data in a protocol buffer:
 * message Person {
 *   int age = 1;
 *   optional string gender = 2;
 *   repeated Person parent = 3;
 * }
 * Thus, here the path {step:["parent", "age"]} in statistics would refer to the
 * age of a parent, and {step:["parent", "parent", "age"]} would refer to the
 * age of a grandparent. This allows us to distinguish between the statistics
 * of parents' ages and grandparents' ages. In general, repeated messages are
 * to be preferred to linked lists of arbitrary length.
 * For SequenceExample, if we have a feature list "foo", this is represented
 * by {step:["##SEQUENCE##", "foo"]}.
 * </pre>
 *
 * Protobuf type {@code tensorflow.metadata.v0.Path}
 */
public final class Path extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.metadata.v0.Path)
    PathOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Path.newBuilder() to construct.
  private Path(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Path() {
    step_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Path();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Path(
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
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              step_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            step_.add(bs);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        step_ = step_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.metadata.v0.PathOuterClass.internal_static_tensorflow_metadata_v0_Path_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.metadata.v0.PathOuterClass.internal_static_tensorflow_metadata_v0_Path_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.metadata.v0.Path.class, org.tensorflow.metadata.v0.Path.Builder.class);
  }

  public static final int STEP_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList step_;
  /**
   * <pre>
   * Any string is a valid step.
   * However, whenever possible have a step be [A-Za-z0-9_]+.
   * </pre>
   *
   * <code>repeated string step = 1;</code>
   * @return A list containing the step.
   */
  public com.google.protobuf.ProtocolStringList
      getStepList() {
    return step_;
  }
  /**
   * <pre>
   * Any string is a valid step.
   * However, whenever possible have a step be [A-Za-z0-9_]+.
   * </pre>
   *
   * <code>repeated string step = 1;</code>
   * @return The count of step.
   */
  public int getStepCount() {
    return step_.size();
  }
  /**
   * <pre>
   * Any string is a valid step.
   * However, whenever possible have a step be [A-Za-z0-9_]+.
   * </pre>
   *
   * <code>repeated string step = 1;</code>
   * @param index The index of the element to return.
   * @return The step at the given index.
   */
  public java.lang.String getStep(int index) {
    return step_.get(index);
  }
  /**
   * <pre>
   * Any string is a valid step.
   * However, whenever possible have a step be [A-Za-z0-9_]+.
   * </pre>
   *
   * <code>repeated string step = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the step at the given index.
   */
  public com.google.protobuf.ByteString
      getStepBytes(int index) {
    return step_.getByteString(index);
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
    for (int i = 0; i < step_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, step_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < step_.size(); i++) {
        dataSize += computeStringSizeNoTag(step_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStepList().size();
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
    if (!(obj instanceof org.tensorflow.metadata.v0.Path)) {
      return super.equals(obj);
    }
    org.tensorflow.metadata.v0.Path other = (org.tensorflow.metadata.v0.Path) obj;

    if (!getStepList()
        .equals(other.getStepList())) return false;
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
    if (getStepCount() > 0) {
      hash = (37 * hash) + STEP_FIELD_NUMBER;
      hash = (53 * hash) + getStepList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.metadata.v0.Path parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.Path parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.Path parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.Path parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.Path parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.Path parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.Path parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.Path parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.Path parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.Path parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.Path parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.Path parseFrom(
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
  public static Builder newBuilder(org.tensorflow.metadata.v0.Path prototype) {
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
   * A path is a more general substitute for the name of a field or feature that
   * can be used for flat examples as well as structured data. For example, if
   * we had data in a protocol buffer:
   * message Person {
   *   int age = 1;
   *   optional string gender = 2;
   *   repeated Person parent = 3;
   * }
   * Thus, here the path {step:["parent", "age"]} in statistics would refer to the
   * age of a parent, and {step:["parent", "parent", "age"]} would refer to the
   * age of a grandparent. This allows us to distinguish between the statistics
   * of parents' ages and grandparents' ages. In general, repeated messages are
   * to be preferred to linked lists of arbitrary length.
   * For SequenceExample, if we have a feature list "foo", this is represented
   * by {step:["##SEQUENCE##", "foo"]}.
   * </pre>
   *
   * Protobuf type {@code tensorflow.metadata.v0.Path}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.metadata.v0.Path)
      org.tensorflow.metadata.v0.PathOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.metadata.v0.PathOuterClass.internal_static_tensorflow_metadata_v0_Path_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.metadata.v0.PathOuterClass.internal_static_tensorflow_metadata_v0_Path_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.metadata.v0.Path.class, org.tensorflow.metadata.v0.Path.Builder.class);
    }

    // Construct using org.tensorflow.metadata.v0.Path.newBuilder()
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
      step_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.metadata.v0.PathOuterClass.internal_static_tensorflow_metadata_v0_Path_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.Path getDefaultInstanceForType() {
      return org.tensorflow.metadata.v0.Path.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.Path build() {
      org.tensorflow.metadata.v0.Path result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.Path buildPartial() {
      org.tensorflow.metadata.v0.Path result = new org.tensorflow.metadata.v0.Path(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        step_ = step_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.step_ = step_;
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
      if (other instanceof org.tensorflow.metadata.v0.Path) {
        return mergeFrom((org.tensorflow.metadata.v0.Path)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.metadata.v0.Path other) {
      if (other == org.tensorflow.metadata.v0.Path.getDefaultInstance()) return this;
      if (!other.step_.isEmpty()) {
        if (step_.isEmpty()) {
          step_ = other.step_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStepIsMutable();
          step_.addAll(other.step_);
        }
        onChanged();
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
      org.tensorflow.metadata.v0.Path parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.metadata.v0.Path) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList step_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStepIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        step_ = new com.google.protobuf.LazyStringArrayList(step_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Any string is a valid step.
     * However, whenever possible have a step be [A-Za-z0-9_]+.
     * </pre>
     *
     * <code>repeated string step = 1;</code>
     * @return A list containing the step.
     */
    public com.google.protobuf.ProtocolStringList
        getStepList() {
      return step_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Any string is a valid step.
     * However, whenever possible have a step be [A-Za-z0-9_]+.
     * </pre>
     *
     * <code>repeated string step = 1;</code>
     * @return The count of step.
     */
    public int getStepCount() {
      return step_.size();
    }
    /**
     * <pre>
     * Any string is a valid step.
     * However, whenever possible have a step be [A-Za-z0-9_]+.
     * </pre>
     *
     * <code>repeated string step = 1;</code>
     * @param index The index of the element to return.
     * @return The step at the given index.
     */
    public java.lang.String getStep(int index) {
      return step_.get(index);
    }
    /**
     * <pre>
     * Any string is a valid step.
     * However, whenever possible have a step be [A-Za-z0-9_]+.
     * </pre>
     *
     * <code>repeated string step = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the step at the given index.
     */
    public com.google.protobuf.ByteString
        getStepBytes(int index) {
      return step_.getByteString(index);
    }
    /**
     * <pre>
     * Any string is a valid step.
     * However, whenever possible have a step be [A-Za-z0-9_]+.
     * </pre>
     *
     * <code>repeated string step = 1;</code>
     * @param index The index to set the value at.
     * @param value The step to set.
     * @return This builder for chaining.
     */
    public Builder setStep(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStepIsMutable();
      step_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any string is a valid step.
     * However, whenever possible have a step be [A-Za-z0-9_]+.
     * </pre>
     *
     * <code>repeated string step = 1;</code>
     * @param value The step to add.
     * @return This builder for chaining.
     */
    public Builder addStep(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStepIsMutable();
      step_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any string is a valid step.
     * However, whenever possible have a step be [A-Za-z0-9_]+.
     * </pre>
     *
     * <code>repeated string step = 1;</code>
     * @param values The step to add.
     * @return This builder for chaining.
     */
    public Builder addAllStep(
        java.lang.Iterable<java.lang.String> values) {
      ensureStepIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, step_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any string is a valid step.
     * However, whenever possible have a step be [A-Za-z0-9_]+.
     * </pre>
     *
     * <code>repeated string step = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStep() {
      step_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any string is a valid step.
     * However, whenever possible have a step be [A-Za-z0-9_]+.
     * </pre>
     *
     * <code>repeated string step = 1;</code>
     * @param value The bytes of the step to add.
     * @return This builder for chaining.
     */
    public Builder addStepBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStepIsMutable();
      step_.add(value);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.metadata.v0.Path)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.metadata.v0.Path)
  private static final org.tensorflow.metadata.v0.Path DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.metadata.v0.Path();
  }

  public static org.tensorflow.metadata.v0.Path getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Path>
      PARSER = new com.google.protobuf.AbstractParser<Path>() {
    @java.lang.Override
    public Path parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Path(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Path> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Path> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.metadata.v0.Path getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

