// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

/**
 * <pre>
 * Encodes information for domains of string values.
 * </pre>
 *
 * Protobuf type {@code tensorflow.metadata.v0.StringDomain}
 */
public final class StringDomain extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.metadata.v0.StringDomain)
    StringDomainOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StringDomain.newBuilder() to construct.
  private StringDomain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StringDomain() {
    name_ = "";
    value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StringDomain();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StringDomain(
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
            bitField0_ |= 0x00000001;
            name_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              value_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            value_.add(bs);
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        value_ = value_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_StringDomain_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_StringDomain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.metadata.v0.StringDomain.class, org.tensorflow.metadata.v0.StringDomain.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Id of the domain. Required if the domain is defined at the schema level. If
   * so, then the name must be unique within the schema.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Id of the domain. Required if the domain is defined at the schema level. If
   * so, then the name must be unique within the schema.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Id of the domain. Required if the domain is defined at the schema level. If
   * so, then the name must be unique within the schema.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList value_;
  /**
   * <pre>
   * The values appearing in the domain.
   * </pre>
   *
   * <code>repeated string value = 2;</code>
   * @return A list containing the value.
   */
  public com.google.protobuf.ProtocolStringList
      getValueList() {
    return value_;
  }
  /**
   * <pre>
   * The values appearing in the domain.
   * </pre>
   *
   * <code>repeated string value = 2;</code>
   * @return The count of value.
   */
  public int getValueCount() {
    return value_.size();
  }
  /**
   * <pre>
   * The values appearing in the domain.
   * </pre>
   *
   * <code>repeated string value = 2;</code>
   * @param index The index of the element to return.
   * @return The value at the given index.
   */
  public java.lang.String getValue(int index) {
    return value_.get(index);
  }
  /**
   * <pre>
   * The values appearing in the domain.
   * </pre>
   *
   * <code>repeated string value = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the value at the given index.
   */
  public com.google.protobuf.ByteString
      getValueBytes(int index) {
    return value_.getByteString(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < value_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < value_.size(); i++) {
        dataSize += computeStringSizeNoTag(value_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValueList().size();
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
    if (!(obj instanceof org.tensorflow.metadata.v0.StringDomain)) {
      return super.equals(obj);
    }
    org.tensorflow.metadata.v0.StringDomain other = (org.tensorflow.metadata.v0.StringDomain) obj;

    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (!getValueList()
        .equals(other.getValueList())) return false;
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
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (getValueCount() > 0) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValueList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.metadata.v0.StringDomain parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.StringDomain parseFrom(
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
  public static Builder newBuilder(org.tensorflow.metadata.v0.StringDomain prototype) {
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
   * Encodes information for domains of string values.
   * </pre>
   *
   * Protobuf type {@code tensorflow.metadata.v0.StringDomain}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.metadata.v0.StringDomain)
      org.tensorflow.metadata.v0.StringDomainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_StringDomain_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_StringDomain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.metadata.v0.StringDomain.class, org.tensorflow.metadata.v0.StringDomain.Builder.class);
    }

    // Construct using org.tensorflow.metadata.v0.StringDomain.newBuilder()
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
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_StringDomain_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.StringDomain getDefaultInstanceForType() {
      return org.tensorflow.metadata.v0.StringDomain.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.StringDomain build() {
      org.tensorflow.metadata.v0.StringDomain result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.StringDomain buildPartial() {
      org.tensorflow.metadata.v0.StringDomain result = new org.tensorflow.metadata.v0.StringDomain(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      if (((bitField0_ & 0x00000002) != 0)) {
        value_ = value_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.value_ = value_;
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
      if (other instanceof org.tensorflow.metadata.v0.StringDomain) {
        return mergeFrom((org.tensorflow.metadata.v0.StringDomain)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.metadata.v0.StringDomain other) {
      if (other == org.tensorflow.metadata.v0.StringDomain.getDefaultInstance()) return this;
      if (other.hasName()) {
        bitField0_ |= 0x00000001;
        name_ = other.name_;
        onChanged();
      }
      if (!other.value_.isEmpty()) {
        if (value_.isEmpty()) {
          value_ = other.value_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureValueIsMutable();
          value_.addAll(other.value_);
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
      org.tensorflow.metadata.v0.StringDomain parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.metadata.v0.StringDomain) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Id of the domain. Required if the domain is defined at the schema level. If
     * so, then the name must be unique within the schema.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Id of the domain. Required if the domain is defined at the schema level. If
     * so, then the name must be unique within the schema.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Id of the domain. Required if the domain is defined at the schema level. If
     * so, then the name must be unique within the schema.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Id of the domain. Required if the domain is defined at the schema level. If
     * so, then the name must be unique within the schema.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the domain. Required if the domain is defined at the schema level. If
     * so, then the name must be unique within the schema.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the domain. Required if the domain is defined at the schema level. If
     * so, then the name must be unique within the schema.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureValueIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        value_ = new com.google.protobuf.LazyStringArrayList(value_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * The values appearing in the domain.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     * @return A list containing the value.
     */
    public com.google.protobuf.ProtocolStringList
        getValueList() {
      return value_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The values appearing in the domain.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     * @return The count of value.
     */
    public int getValueCount() {
      return value_.size();
    }
    /**
     * <pre>
     * The values appearing in the domain.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     * @param index The index of the element to return.
     * @return The value at the given index.
     */
    public java.lang.String getValue(int index) {
      return value_.get(index);
    }
    /**
     * <pre>
     * The values appearing in the domain.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the value at the given index.
     */
    public com.google.protobuf.ByteString
        getValueBytes(int index) {
      return value_.getByteString(index);
    }
    /**
     * <pre>
     * The values appearing in the domain.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     * @param index The index to set the value at.
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValueIsMutable();
      value_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The values appearing in the domain.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     * @param value The value to add.
     * @return This builder for chaining.
     */
    public Builder addValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValueIsMutable();
      value_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The values appearing in the domain.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     * @param values The value to add.
     * @return This builder for chaining.
     */
    public Builder addAllValue(
        java.lang.Iterable<java.lang.String> values) {
      ensureValueIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, value_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The values appearing in the domain.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The values appearing in the domain.
     * </pre>
     *
     * <code>repeated string value = 2;</code>
     * @param value The bytes of the value to add.
     * @return This builder for chaining.
     */
    public Builder addValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValueIsMutable();
      value_.add(value);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.metadata.v0.StringDomain)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.metadata.v0.StringDomain)
  private static final org.tensorflow.metadata.v0.StringDomain DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.metadata.v0.StringDomain();
  }

  public static org.tensorflow.metadata.v0.StringDomain getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<StringDomain>
      PARSER = new com.google.protobuf.AbstractParser<StringDomain>() {
    @java.lang.Override
    public StringDomain parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StringDomain(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StringDomain> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StringDomain> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.metadata.v0.StringDomain getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

