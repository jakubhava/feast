// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

public interface FixedShapeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.FixedShape)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The dimensions that define the shape. The total number of values in each
   * example is the product of sizes of each dimension.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FixedShape.Dim dim = 2;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.FixedShape.Dim> 
      getDimList();
  /**
   * <pre>
   * The dimensions that define the shape. The total number of values in each
   * example is the product of sizes of each dimension.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FixedShape.Dim dim = 2;</code>
   */
  org.tensorflow.metadata.v0.FixedShape.Dim getDim(int index);
  /**
   * <pre>
   * The dimensions that define the shape. The total number of values in each
   * example is the product of sizes of each dimension.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FixedShape.Dim dim = 2;</code>
   */
  int getDimCount();
  /**
   * <pre>
   * The dimensions that define the shape. The total number of values in each
   * example is the product of sizes of each dimension.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FixedShape.Dim dim = 2;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.FixedShape.DimOrBuilder> 
      getDimOrBuilderList();
  /**
   * <pre>
   * The dimensions that define the shape. The total number of values in each
   * example is the product of sizes of each dimension.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FixedShape.Dim dim = 2;</code>
   */
  org.tensorflow.metadata.v0.FixedShape.DimOrBuilder getDimOrBuilder(
      int index);
}
