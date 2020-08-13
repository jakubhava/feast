// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/statistics.proto

package org.tensorflow.metadata.v0;

public interface BytesStatisticsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.BytesStatistics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
   * @return Whether the commonStats field is set.
   */
  boolean hasCommonStats();
  /**
   * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
   * @return The commonStats.
   */
  org.tensorflow.metadata.v0.CommonStatistics getCommonStats();
  /**
   * <code>.tensorflow.metadata.v0.CommonStatistics common_stats = 1;</code>
   */
  org.tensorflow.metadata.v0.CommonStatisticsOrBuilder getCommonStatsOrBuilder();

  /**
   * <pre>
   * The number of unique values
   * </pre>
   *
   * <code>uint64 unique = 2;</code>
   * @return The unique.
   */
  long getUnique();

  /**
   * <pre>
   * The average number of bytes in a value
   * </pre>
   *
   * <code>float avg_num_bytes = 3;</code>
   * @return The avgNumBytes.
   */
  float getAvgNumBytes();

  /**
   * <pre>
   * The minimum number of bytes in a value
   * </pre>
   *
   * <code>float min_num_bytes = 4;</code>
   * @return The minNumBytes.
   */
  float getMinNumBytes();

  /**
   * <pre>
   * The maximum number of bytes in a value
   * </pre>
   *
   * <code>float max_num_bytes = 5;</code>
   * @return The maxNumBytes.
   */
  float getMaxNumBytes();
}
