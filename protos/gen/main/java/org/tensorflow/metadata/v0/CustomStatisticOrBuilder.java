// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/statistics.proto

package org.tensorflow.metadata.v0;

public interface CustomStatisticOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.CustomStatistic)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double num = 2;</code>
   * @return The num.
   */
  double getNum();

  /**
   * <code>string str = 3;</code>
   * @return The str.
   */
  java.lang.String getStr();
  /**
   * <code>string str = 3;</code>
   * @return The bytes for str.
   */
  com.google.protobuf.ByteString
      getStrBytes();

  /**
   * <code>.tensorflow.metadata.v0.Histogram histogram = 4;</code>
   * @return Whether the histogram field is set.
   */
  boolean hasHistogram();
  /**
   * <code>.tensorflow.metadata.v0.Histogram histogram = 4;</code>
   * @return The histogram.
   */
  org.tensorflow.metadata.v0.Histogram getHistogram();
  /**
   * <code>.tensorflow.metadata.v0.Histogram histogram = 4;</code>
   */
  org.tensorflow.metadata.v0.HistogramOrBuilder getHistogramOrBuilder();

  /**
   * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 5;</code>
   * @return Whether the rankHistogram field is set.
   */
  boolean hasRankHistogram();
  /**
   * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 5;</code>
   * @return The rankHistogram.
   */
  org.tensorflow.metadata.v0.RankHistogram getRankHistogram();
  /**
   * <code>.tensorflow.metadata.v0.RankHistogram rank_histogram = 5;</code>
   */
  org.tensorflow.metadata.v0.RankHistogramOrBuilder getRankHistogramOrBuilder();

  public org.tensorflow.metadata.v0.CustomStatistic.ValCase getValCase();
}
