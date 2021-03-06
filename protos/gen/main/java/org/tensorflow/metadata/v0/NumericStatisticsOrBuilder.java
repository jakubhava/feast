// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/statistics.proto

package org.tensorflow.metadata.v0;

public interface NumericStatisticsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.NumericStatistics)
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
   * The mean of the values
   * </pre>
   *
   * <code>double mean = 2;</code>
   * @return The mean.
   */
  double getMean();

  /**
   * <pre>
   * The standard deviation of the values
   * </pre>
   *
   * <code>double std_dev = 3;</code>
   * @return The stdDev.
   */
  double getStdDev();

  /**
   * <pre>
   * The number of values that equal 0
   * </pre>
   *
   * <code>uint64 num_zeros = 4;</code>
   * @return The numZeros.
   */
  long getNumZeros();

  /**
   * <pre>
   * The minimum value
   * </pre>
   *
   * <code>double min = 5;</code>
   * @return The min.
   */
  double getMin();

  /**
   * <pre>
   * The median value
   * </pre>
   *
   * <code>double median = 6;</code>
   * @return The median.
   */
  double getMedian();

  /**
   * <pre>
   * The maximum value
   * </pre>
   *
   * <code>double max = 7;</code>
   * @return The max.
   */
  double getMax();

  /**
   * <pre>
   * The histogram(s) of the feature values.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Histogram histograms = 8;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.Histogram> 
      getHistogramsList();
  /**
   * <pre>
   * The histogram(s) of the feature values.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Histogram histograms = 8;</code>
   */
  org.tensorflow.metadata.v0.Histogram getHistograms(int index);
  /**
   * <pre>
   * The histogram(s) of the feature values.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Histogram histograms = 8;</code>
   */
  int getHistogramsCount();
  /**
   * <pre>
   * The histogram(s) of the feature values.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Histogram histograms = 8;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.HistogramOrBuilder> 
      getHistogramsOrBuilderList();
  /**
   * <pre>
   * The histogram(s) of the feature values.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Histogram histograms = 8;</code>
   */
  org.tensorflow.metadata.v0.HistogramOrBuilder getHistogramsOrBuilder(
      int index);

  /**
   * <pre>
   * Weighted statistics for the feature, if the values have weights.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.WeightedNumericStatistics weighted_numeric_stats = 9;</code>
   * @return Whether the weightedNumericStats field is set.
   */
  boolean hasWeightedNumericStats();
  /**
   * <pre>
   * Weighted statistics for the feature, if the values have weights.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.WeightedNumericStatistics weighted_numeric_stats = 9;</code>
   * @return The weightedNumericStats.
   */
  org.tensorflow.metadata.v0.WeightedNumericStatistics getWeightedNumericStats();
  /**
   * <pre>
   * Weighted statistics for the feature, if the values have weights.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.WeightedNumericStatistics weighted_numeric_stats = 9;</code>
   */
  org.tensorflow.metadata.v0.WeightedNumericStatisticsOrBuilder getWeightedNumericStatsOrBuilder();
}
