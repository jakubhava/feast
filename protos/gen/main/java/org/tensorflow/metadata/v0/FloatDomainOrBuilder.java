// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

public interface FloatDomainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.FloatDomain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the domain. Required if the domain is defined at the schema level. If
   * so, then the name must be unique within the schema.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Id of the domain. Required if the domain is defined at the schema level. If
   * so, then the name must be unique within the schema.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Id of the domain. Required if the domain is defined at the schema level. If
   * so, then the name must be unique within the schema.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Min and max values of the domain.
   * </pre>
   *
   * <code>optional float min = 3;</code>
   * @return Whether the min field is set.
   */
  boolean hasMin();
  /**
   * <pre>
   * Min and max values of the domain.
   * </pre>
   *
   * <code>optional float min = 3;</code>
   * @return The min.
   */
  float getMin();

  /**
   * <code>optional float max = 4;</code>
   * @return Whether the max field is set.
   */
  boolean hasMax();
  /**
   * <code>optional float max = 4;</code>
   * @return The max.
   */
  float getMax();
}