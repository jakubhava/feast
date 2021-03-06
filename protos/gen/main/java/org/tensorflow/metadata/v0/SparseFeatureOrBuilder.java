// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

public interface SparseFeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.SparseFeature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name for the sparse feature. This should not clash with other features in
   * the same schema.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name for the sparse feature. This should not clash with other features in
   * the same schema.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name for the sparse feature. This should not clash with other features in
   * the same schema.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * This field is no longer supported. Instead, use:
   * lifecycle_stage: DEPRECATED
   * TODO(b/111450258): remove this.
   * </pre>
   *
   * <code>optional bool deprecated = 2 [deprecated = true];</code>
   * @return Whether the deprecated field is set.
   */
  @java.lang.Deprecated boolean hasDeprecated();
  /**
   * <pre>
   * This field is no longer supported. Instead, use:
   * lifecycle_stage: DEPRECATED
   * TODO(b/111450258): remove this.
   * </pre>
   *
   * <code>optional bool deprecated = 2 [deprecated = true];</code>
   * @return The deprecated.
   */
  @java.lang.Deprecated boolean getDeprecated();

  /**
   * <pre>
   * The lifecycle_stage determines where a feature is expected to be used,
   * and therefore how important issues with it are.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.LifecycleStage lifecycle_stage = 7;</code>
   * @return Whether the lifecycleStage field is set.
   */
  boolean hasLifecycleStage();
  /**
   * <pre>
   * The lifecycle_stage determines where a feature is expected to be used,
   * and therefore how important issues with it are.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.LifecycleStage lifecycle_stage = 7;</code>
   * @return The lifecycleStage.
   */
  org.tensorflow.metadata.v0.LifecycleStage getLifecycleStage();

  /**
   * <pre>
   * Constraints on the presence of this feature in examples.
   * Deprecated, this is inferred by the referred features.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.FeaturePresence presence = 4 [deprecated = true];</code>
   * @return Whether the presence field is set.
   */
  @java.lang.Deprecated boolean hasPresence();
  /**
   * <pre>
   * Constraints on the presence of this feature in examples.
   * Deprecated, this is inferred by the referred features.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.FeaturePresence presence = 4 [deprecated = true];</code>
   * @return The presence.
   */
  @java.lang.Deprecated org.tensorflow.metadata.v0.FeaturePresence getPresence();
  /**
   * <pre>
   * Constraints on the presence of this feature in examples.
   * Deprecated, this is inferred by the referred features.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.FeaturePresence presence = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated org.tensorflow.metadata.v0.FeaturePresenceOrBuilder getPresenceOrBuilder();

  /**
   * <pre>
   * Shape of the sparse tensor that this SparseFeature represents.
   * Currently not supported.
   * TODO(b/109669962): Consider deriving this from the referred features.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.FixedShape dense_shape = 5;</code>
   * @return Whether the denseShape field is set.
   */
  boolean hasDenseShape();
  /**
   * <pre>
   * Shape of the sparse tensor that this SparseFeature represents.
   * Currently not supported.
   * TODO(b/109669962): Consider deriving this from the referred features.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.FixedShape dense_shape = 5;</code>
   * @return The denseShape.
   */
  org.tensorflow.metadata.v0.FixedShape getDenseShape();
  /**
   * <pre>
   * Shape of the sparse tensor that this SparseFeature represents.
   * Currently not supported.
   * TODO(b/109669962): Consider deriving this from the referred features.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.FixedShape dense_shape = 5;</code>
   */
  org.tensorflow.metadata.v0.FixedShapeOrBuilder getDenseShapeOrBuilder();

  /**
   * <pre>
   * Features that represent indexes. Should be integers &gt;= 0.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature.IndexFeature index_feature = 6;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.SparseFeature.IndexFeature> 
      getIndexFeatureList();
  /**
   * <pre>
   * Features that represent indexes. Should be integers &gt;= 0.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature.IndexFeature index_feature = 6;</code>
   */
  org.tensorflow.metadata.v0.SparseFeature.IndexFeature getIndexFeature(int index);
  /**
   * <pre>
   * Features that represent indexes. Should be integers &gt;= 0.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature.IndexFeature index_feature = 6;</code>
   */
  int getIndexFeatureCount();
  /**
   * <pre>
   * Features that represent indexes. Should be integers &gt;= 0.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature.IndexFeature index_feature = 6;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.SparseFeature.IndexFeatureOrBuilder> 
      getIndexFeatureOrBuilderList();
  /**
   * <pre>
   * Features that represent indexes. Should be integers &gt;= 0.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature.IndexFeature index_feature = 6;</code>
   */
  org.tensorflow.metadata.v0.SparseFeature.IndexFeatureOrBuilder getIndexFeatureOrBuilder(
      int index);

  /**
   * <pre>
   * If true then the index values are already sorted lexicographically.
   * </pre>
   *
   * <code>optional bool is_sorted = 8;</code>
   * @return Whether the isSorted field is set.
   */
  boolean hasIsSorted();
  /**
   * <pre>
   * If true then the index values are already sorted lexicographically.
   * </pre>
   *
   * <code>optional bool is_sorted = 8;</code>
   * @return The isSorted.
   */
  boolean getIsSorted();

  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.SparseFeature.ValueFeature value_feature = 9;</code>
   * @return Whether the valueFeature field is set.
   */
  boolean hasValueFeature();
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.SparseFeature.ValueFeature value_feature = 9;</code>
   * @return The valueFeature.
   */
  org.tensorflow.metadata.v0.SparseFeature.ValueFeature getValueFeature();
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.SparseFeature.ValueFeature value_feature = 9;</code>
   */
  org.tensorflow.metadata.v0.SparseFeature.ValueFeatureOrBuilder getValueFeatureOrBuilder();

  /**
   * <pre>
   * Type of value feature.
   * Deprecated, this is inferred by the referred features.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.FeatureType type = 10 [deprecated = true];</code>
   * @return Whether the type field is set.
   */
  @java.lang.Deprecated boolean hasType();
  /**
   * <pre>
   * Type of value feature.
   * Deprecated, this is inferred by the referred features.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.FeatureType type = 10 [deprecated = true];</code>
   * @return The type.
   */
  @java.lang.Deprecated org.tensorflow.metadata.v0.FeatureType getType();
}
