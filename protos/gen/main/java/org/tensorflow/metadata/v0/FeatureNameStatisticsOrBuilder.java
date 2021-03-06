// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/statistics.proto

package org.tensorflow.metadata.v0;

public interface FeatureNameStatisticsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.FeatureNameStatistics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The feature name
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The feature name
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The path of the feature.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.Path path = 8;</code>
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   * <pre>
   * The path of the feature.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.Path path = 8;</code>
   * @return The path.
   */
  org.tensorflow.metadata.v0.Path getPath();
  /**
   * <pre>
   * The path of the feature.
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.Path path = 8;</code>
   */
  org.tensorflow.metadata.v0.PathOrBuilder getPathOrBuilder();

  /**
   * <pre>
   * The data type of the feature
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.FeatureNameStatistics.Type type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The data type of the feature
   * </pre>
   *
   * <code>.tensorflow.metadata.v0.FeatureNameStatistics.Type type = 2;</code>
   * @return The type.
   */
  org.tensorflow.metadata.v0.FeatureNameStatistics.Type getType();

  /**
   * <code>.tensorflow.metadata.v0.NumericStatistics num_stats = 3;</code>
   * @return Whether the numStats field is set.
   */
  boolean hasNumStats();
  /**
   * <code>.tensorflow.metadata.v0.NumericStatistics num_stats = 3;</code>
   * @return The numStats.
   */
  org.tensorflow.metadata.v0.NumericStatistics getNumStats();
  /**
   * <code>.tensorflow.metadata.v0.NumericStatistics num_stats = 3;</code>
   */
  org.tensorflow.metadata.v0.NumericStatisticsOrBuilder getNumStatsOrBuilder();

  /**
   * <code>.tensorflow.metadata.v0.StringStatistics string_stats = 4;</code>
   * @return Whether the stringStats field is set.
   */
  boolean hasStringStats();
  /**
   * <code>.tensorflow.metadata.v0.StringStatistics string_stats = 4;</code>
   * @return The stringStats.
   */
  org.tensorflow.metadata.v0.StringStatistics getStringStats();
  /**
   * <code>.tensorflow.metadata.v0.StringStatistics string_stats = 4;</code>
   */
  org.tensorflow.metadata.v0.StringStatisticsOrBuilder getStringStatsOrBuilder();

  /**
   * <code>.tensorflow.metadata.v0.BytesStatistics bytes_stats = 5;</code>
   * @return Whether the bytesStats field is set.
   */
  boolean hasBytesStats();
  /**
   * <code>.tensorflow.metadata.v0.BytesStatistics bytes_stats = 5;</code>
   * @return The bytesStats.
   */
  org.tensorflow.metadata.v0.BytesStatistics getBytesStats();
  /**
   * <code>.tensorflow.metadata.v0.BytesStatistics bytes_stats = 5;</code>
   */
  org.tensorflow.metadata.v0.BytesStatisticsOrBuilder getBytesStatsOrBuilder();

  /**
   * <code>.tensorflow.metadata.v0.StructStatistics struct_stats = 7;</code>
   * @return Whether the structStats field is set.
   */
  boolean hasStructStats();
  /**
   * <code>.tensorflow.metadata.v0.StructStatistics struct_stats = 7;</code>
   * @return The structStats.
   */
  org.tensorflow.metadata.v0.StructStatistics getStructStats();
  /**
   * <code>.tensorflow.metadata.v0.StructStatistics struct_stats = 7;</code>
   */
  org.tensorflow.metadata.v0.StructStatisticsOrBuilder getStructStatsOrBuilder();

  /**
   * <pre>
   * Any custom statistics can be stored in this list.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CustomStatistic custom_stats = 6;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.CustomStatistic> 
      getCustomStatsList();
  /**
   * <pre>
   * Any custom statistics can be stored in this list.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CustomStatistic custom_stats = 6;</code>
   */
  org.tensorflow.metadata.v0.CustomStatistic getCustomStats(int index);
  /**
   * <pre>
   * Any custom statistics can be stored in this list.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CustomStatistic custom_stats = 6;</code>
   */
  int getCustomStatsCount();
  /**
   * <pre>
   * Any custom statistics can be stored in this list.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CustomStatistic custom_stats = 6;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.CustomStatisticOrBuilder> 
      getCustomStatsOrBuilderList();
  /**
   * <pre>
   * Any custom statistics can be stored in this list.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.CustomStatistic custom_stats = 6;</code>
   */
  org.tensorflow.metadata.v0.CustomStatisticOrBuilder getCustomStatsOrBuilder(
      int index);

  public org.tensorflow.metadata.v0.FeatureNameStatistics.FieldIdCase getFieldIdCase();

  public org.tensorflow.metadata.v0.FeatureNameStatistics.StatsCase getStatsCase();
}
