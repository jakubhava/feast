// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

public interface TimeDomainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.TimeDomain)
    com.google.protobuf.MessageOrBuilder {

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
  boolean hasStringFormat();
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
  java.lang.String getStringFormat();
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
  com.google.protobuf.ByteString
      getStringFormatBytes();

  /**
   * <pre>
   * Expected format of integer times.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.TimeDomain.IntegerTimeFormat integer_format = 2;</code>
   * @return Whether the integerFormat field is set.
   */
  boolean hasIntegerFormat();
  /**
   * <pre>
   * Expected format of integer times.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.TimeDomain.IntegerTimeFormat integer_format = 2;</code>
   * @return The integerFormat.
   */
  org.tensorflow.metadata.v0.TimeDomain.IntegerTimeFormat getIntegerFormat();

  public org.tensorflow.metadata.v0.TimeDomain.FormatCase getFormatCase();
}
