// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

/**
 * <pre>
 * Time of day, without a particular date.
 * </pre>
 *
 * Protobuf type {@code tensorflow.metadata.v0.TimeOfDayDomain}
 */
public final class TimeOfDayDomain extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.metadata.v0.TimeOfDayDomain)
    TimeOfDayDomainOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimeOfDayDomain.newBuilder() to construct.
  private TimeOfDayDomain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimeOfDayDomain() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimeOfDayDomain();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TimeOfDayDomain(
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
            formatCase_ = 1;
            format_ = bs;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            @SuppressWarnings("deprecation")
            org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat value = org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              formatCase_ = 2;
              format_ = rawValue;
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
    return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_TimeOfDayDomain_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_TimeOfDayDomain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.metadata.v0.TimeOfDayDomain.class, org.tensorflow.metadata.v0.TimeOfDayDomain.Builder.class);
  }

  /**
   * Protobuf enum {@code tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat}
   */
  public enum IntegerTimeOfDayFormat
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FORMAT_UNKNOWN = 0;</code>
     */
    FORMAT_UNKNOWN(0),
    /**
     * <pre>
     * Time values, containing hour/minute/second/nanos, encoded into 8-byte
     * bit fields following the ZetaSQL convention:
     *        6         5         4         3         2         1
     * MSB 3210987654321098765432109876543210987654321098765432109876543210 LSB
     *                      | H ||  M ||  S ||---------- nanos -----------|
     * </pre>
     *
     * <code>PACKED_64_NANOS = 1;</code>
     */
    PACKED_64_NANOS(1),
    ;

    /**
     * <code>FORMAT_UNKNOWN = 0;</code>
     */
    public static final int FORMAT_UNKNOWN_VALUE = 0;
    /**
     * <pre>
     * Time values, containing hour/minute/second/nanos, encoded into 8-byte
     * bit fields following the ZetaSQL convention:
     *        6         5         4         3         2         1
     * MSB 3210987654321098765432109876543210987654321098765432109876543210 LSB
     *                      | H ||  M ||  S ||---------- nanos -----------|
     * </pre>
     *
     * <code>PACKED_64_NANOS = 1;</code>
     */
    public static final int PACKED_64_NANOS_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IntegerTimeOfDayFormat valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IntegerTimeOfDayFormat forNumber(int value) {
      switch (value) {
        case 0: return FORMAT_UNKNOWN;
        case 1: return PACKED_64_NANOS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IntegerTimeOfDayFormat>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IntegerTimeOfDayFormat> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IntegerTimeOfDayFormat>() {
            public IntegerTimeOfDayFormat findValueByNumber(int number) {
              return IntegerTimeOfDayFormat.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.tensorflow.metadata.v0.TimeOfDayDomain.getDescriptor().getEnumTypes().get(0);
    }

    private static final IntegerTimeOfDayFormat[] VALUES = values();

    public static IntegerTimeOfDayFormat valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private IntegerTimeOfDayFormat(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat)
  }

  private int bitField0_;
  private int formatCase_ = 0;
  private java.lang.Object format_;
  public enum FormatCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STRING_FORMAT(1),
    INTEGER_FORMAT(2),
    FORMAT_NOT_SET(0);
    private final int value;
    private FormatCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FormatCase valueOf(int value) {
      return forNumber(value);
    }

    public static FormatCase forNumber(int value) {
      switch (value) {
        case 1: return STRING_FORMAT;
        case 2: return INTEGER_FORMAT;
        case 0: return FORMAT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FormatCase
  getFormatCase() {
    return FormatCase.forNumber(
        formatCase_);
  }

  public static final int STRING_FORMAT_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Expected format that contains a combination of regular characters and
   * special format specifiers. Format specifiers are a subset of the
   * strptime standard.
   * </pre>
   *
   * <code>string string_format = 1;</code>
   * @return Whether the stringFormat field is set.
   */
  public boolean hasStringFormat() {
    return formatCase_ == 1;
  }
  /**
   * <pre>
   * Expected format that contains a combination of regular characters and
   * special format specifiers. Format specifiers are a subset of the
   * strptime standard.
   * </pre>
   *
   * <code>string string_format = 1;</code>
   * @return The stringFormat.
   */
  public java.lang.String getStringFormat() {
    java.lang.Object ref = "";
    if (formatCase_ == 1) {
      ref = format_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8() && (formatCase_ == 1)) {
        format_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Expected format that contains a combination of regular characters and
   * special format specifiers. Format specifiers are a subset of the
   * strptime standard.
   * </pre>
   *
   * <code>string string_format = 1;</code>
   * @return The bytes for stringFormat.
   */
  public com.google.protobuf.ByteString
      getStringFormatBytes() {
    java.lang.Object ref = "";
    if (formatCase_ == 1) {
      ref = format_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (formatCase_ == 1) {
        format_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTEGER_FORMAT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Expected format of integer times.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat integer_format = 2;</code>
   * @return Whether the integerFormat field is set.
   */
  public boolean hasIntegerFormat() {
    return formatCase_ == 2;
  }
  /**
   * <pre>
   * Expected format of integer times.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat integer_format = 2;</code>
   * @return The integerFormat.
   */
  public org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat getIntegerFormat() {
    if (formatCase_ == 2) {
      @SuppressWarnings("deprecation")
      org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat result = org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat.valueOf(
          (java.lang.Integer) format_);
      return result == null ? org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat.FORMAT_UNKNOWN : result;
    }
    return org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat.FORMAT_UNKNOWN;
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
    if (formatCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, format_);
    }
    if (formatCase_ == 2) {
      output.writeEnum(2, ((java.lang.Integer) format_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (formatCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, format_);
    }
    if (formatCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ((java.lang.Integer) format_));
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
    if (!(obj instanceof org.tensorflow.metadata.v0.TimeOfDayDomain)) {
      return super.equals(obj);
    }
    org.tensorflow.metadata.v0.TimeOfDayDomain other = (org.tensorflow.metadata.v0.TimeOfDayDomain) obj;

    if (!getFormatCase().equals(other.getFormatCase())) return false;
    switch (formatCase_) {
      case 1:
        if (!getStringFormat()
            .equals(other.getStringFormat())) return false;
        break;
      case 2:
        if (!getIntegerFormat()
            .equals(other.getIntegerFormat())) return false;
        break;
      case 0:
      default:
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
    switch (formatCase_) {
      case 1:
        hash = (37 * hash) + STRING_FORMAT_FIELD_NUMBER;
        hash = (53 * hash) + getStringFormat().hashCode();
        break;
      case 2:
        hash = (37 * hash) + INTEGER_FORMAT_FIELD_NUMBER;
        hash = (53 * hash) + getIntegerFormat().getNumber();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.metadata.v0.TimeOfDayDomain parseFrom(
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
  public static Builder newBuilder(org.tensorflow.metadata.v0.TimeOfDayDomain prototype) {
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
   * Time of day, without a particular date.
   * </pre>
   *
   * Protobuf type {@code tensorflow.metadata.v0.TimeOfDayDomain}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.metadata.v0.TimeOfDayDomain)
      org.tensorflow.metadata.v0.TimeOfDayDomainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_TimeOfDayDomain_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_TimeOfDayDomain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.metadata.v0.TimeOfDayDomain.class, org.tensorflow.metadata.v0.TimeOfDayDomain.Builder.class);
    }

    // Construct using org.tensorflow.metadata.v0.TimeOfDayDomain.newBuilder()
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
      formatCase_ = 0;
      format_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.metadata.v0.SchemaOuterClass.internal_static_tensorflow_metadata_v0_TimeOfDayDomain_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.TimeOfDayDomain getDefaultInstanceForType() {
      return org.tensorflow.metadata.v0.TimeOfDayDomain.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.TimeOfDayDomain build() {
      org.tensorflow.metadata.v0.TimeOfDayDomain result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.metadata.v0.TimeOfDayDomain buildPartial() {
      org.tensorflow.metadata.v0.TimeOfDayDomain result = new org.tensorflow.metadata.v0.TimeOfDayDomain(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (formatCase_ == 1) {
        result.format_ = format_;
      }
      if (formatCase_ == 2) {
        result.format_ = format_;
      }
      result.bitField0_ = to_bitField0_;
      result.formatCase_ = formatCase_;
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
      if (other instanceof org.tensorflow.metadata.v0.TimeOfDayDomain) {
        return mergeFrom((org.tensorflow.metadata.v0.TimeOfDayDomain)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.metadata.v0.TimeOfDayDomain other) {
      if (other == org.tensorflow.metadata.v0.TimeOfDayDomain.getDefaultInstance()) return this;
      switch (other.getFormatCase()) {
        case STRING_FORMAT: {
          formatCase_ = 1;
          format_ = other.format_;
          onChanged();
          break;
        }
        case INTEGER_FORMAT: {
          setIntegerFormat(other.getIntegerFormat());
          break;
        }
        case FORMAT_NOT_SET: {
          break;
        }
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
      org.tensorflow.metadata.v0.TimeOfDayDomain parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.metadata.v0.TimeOfDayDomain) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int formatCase_ = 0;
    private java.lang.Object format_;
    public FormatCase
        getFormatCase() {
      return FormatCase.forNumber(
          formatCase_);
    }

    public Builder clearFormat() {
      formatCase_ = 0;
      format_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * Expected format that contains a combination of regular characters and
     * special format specifiers. Format specifiers are a subset of the
     * strptime standard.
     * </pre>
     *
     * <code>string string_format = 1;</code>
     * @return Whether the stringFormat field is set.
     */
    @java.lang.Override
    public boolean hasStringFormat() {
      return formatCase_ == 1;
    }
    /**
     * <pre>
     * Expected format that contains a combination of regular characters and
     * special format specifiers. Format specifiers are a subset of the
     * strptime standard.
     * </pre>
     *
     * <code>string string_format = 1;</code>
     * @return The stringFormat.
     */
    @java.lang.Override
    public java.lang.String getStringFormat() {
      java.lang.Object ref = "";
      if (formatCase_ == 1) {
        ref = format_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (formatCase_ == 1) {
          if (bs.isValidUtf8()) {
            format_ = s;
          }
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Expected format that contains a combination of regular characters and
     * special format specifiers. Format specifiers are a subset of the
     * strptime standard.
     * </pre>
     *
     * <code>string string_format = 1;</code>
     * @return The bytes for stringFormat.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStringFormatBytes() {
      java.lang.Object ref = "";
      if (formatCase_ == 1) {
        ref = format_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (formatCase_ == 1) {
          format_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Expected format that contains a combination of regular characters and
     * special format specifiers. Format specifiers are a subset of the
     * strptime standard.
     * </pre>
     *
     * <code>string string_format = 1;</code>
     * @param value The stringFormat to set.
     * @return This builder for chaining.
     */
    public Builder setStringFormat(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  formatCase_ = 1;
      format_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Expected format that contains a combination of regular characters and
     * special format specifiers. Format specifiers are a subset of the
     * strptime standard.
     * </pre>
     *
     * <code>string string_format = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStringFormat() {
      if (formatCase_ == 1) {
        formatCase_ = 0;
        format_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Expected format that contains a combination of regular characters and
     * special format specifiers. Format specifiers are a subset of the
     * strptime standard.
     * </pre>
     *
     * <code>string string_format = 1;</code>
     * @param value The bytes for stringFormat to set.
     * @return This builder for chaining.
     */
    public Builder setStringFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  formatCase_ = 1;
      format_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Expected format of integer times.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat integer_format = 2;</code>
     * @return Whether the integerFormat field is set.
     */
    @java.lang.Override
    public boolean hasIntegerFormat() {
      return formatCase_ == 2;
    }
    /**
     * <pre>
     * Expected format of integer times.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat integer_format = 2;</code>
     * @return The integerFormat.
     */
    @java.lang.Override
    public org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat getIntegerFormat() {
      if (formatCase_ == 2) {
        @SuppressWarnings("deprecation")
        org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat result = org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat.valueOf(
            (java.lang.Integer) format_);
        return result == null ? org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat.FORMAT_UNKNOWN : result;
      }
      return org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat.FORMAT_UNKNOWN;
    }
    /**
     * <pre>
     * Expected format of integer times.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat integer_format = 2;</code>
     * @param value The integerFormat to set.
     * @return This builder for chaining.
     */
    public Builder setIntegerFormat(org.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      formatCase_ = 2;
      format_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Expected format of integer times.
     * </pre>
     *
     * <code>.tensorflow.metadata.v0.TimeOfDayDomain.IntegerTimeOfDayFormat integer_format = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntegerFormat() {
      if (formatCase_ == 2) {
        formatCase_ = 0;
        format_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:tensorflow.metadata.v0.TimeOfDayDomain)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.metadata.v0.TimeOfDayDomain)
  private static final org.tensorflow.metadata.v0.TimeOfDayDomain DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.metadata.v0.TimeOfDayDomain();
  }

  public static org.tensorflow.metadata.v0.TimeOfDayDomain getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TimeOfDayDomain>
      PARSER = new com.google.protobuf.AbstractParser<TimeOfDayDomain>() {
    @java.lang.Override
    public TimeOfDayDomain parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TimeOfDayDomain(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TimeOfDayDomain> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeOfDayDomain> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.metadata.v0.TimeOfDayDomain getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

