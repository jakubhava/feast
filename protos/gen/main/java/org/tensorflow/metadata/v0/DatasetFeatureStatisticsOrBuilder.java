// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/statistics.proto

package org.tensorflow.metadata.v0;

public interface DatasetFeatureStatisticsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.DatasetFeatureStatistics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the dataset.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the dataset.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The number of examples in the dataset.
   * </pre>
   *
   * <code>uint64 num_examples = 2;</code>
   * @return The numExamples.
   */
  long getNumExamples();

  /**
   * <pre>
   * Only valid if the weight feature was specified.
   * Treats a missing weighted feature as zero.
   * </pre>
   *
   * <code>double weighted_num_examples = 4;</code>
   * @return The weightedNumExamples.
   */
  double getWeightedNumExamples();

  /**
   * <pre>
   * The feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FeatureNameStatistics features = 3;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.FeatureNameStatistics> 
      getFeaturesList();
  /**
   * <pre>
   * The feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FeatureNameStatistics features = 3;</code>
   */
  org.tensorflow.metadata.v0.FeatureNameStatistics getFeatures(int index);
  /**
   * <pre>
   * The feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FeatureNameStatistics features = 3;</code>
   */
  int getFeaturesCount();
  /**
   * <pre>
   * The feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FeatureNameStatistics features = 3;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.FeatureNameStatisticsOrBuilder> 
      getFeaturesOrBuilderList();
  /**
   * <pre>
   * The feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FeatureNameStatistics features = 3;</code>
   */
  org.tensorflow.metadata.v0.FeatureNameStatisticsOrBuilder getFeaturesOrBuilder(
      int index);

  /**
   * <pre>
   * Cross feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CrossFeatureStatistics cross_features = 5;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.CrossFeatureStatistics> 
      getCrossFeaturesList();
  /**
   * <pre>
   * Cross feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CrossFeatureStatistics cross_features = 5;</code>
   */
  org.tensorflow.metadata.v0.CrossFeatureStatistics getCrossFeatures(int index);
  /**
   * <pre>
   * Cross feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CrossFeatureStatistics cross_features = 5;</code>
   */
  int getCrossFeaturesCount();
  /**
   * <pre>
   * Cross feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CrossFeatureStatistics cross_features = 5;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.CrossFeatureStatisticsOrBuilder> 
      getCrossFeaturesOrBuilderList();
  /**
   * <pre>
   * Cross feature statistics for the dataset.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CrossFeatureStatistics cross_features = 5;</code>
   */
  org.tensorflow.metadata.v0.CrossFeatureStatisticsOrBuilder getCrossFeaturesOrBuilder(
      int index);
}