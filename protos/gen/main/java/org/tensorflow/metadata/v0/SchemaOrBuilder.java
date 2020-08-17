// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

public interface SchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Feature feature = 1;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.Feature> 
      getFeatureList();
  /**
   * <pre>
   * Features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Feature feature = 1;</code>
   */
  org.tensorflow.metadata.v0.Feature getFeature(int index);
  /**
   * <pre>
   * Features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Feature feature = 1;</code>
   */
  int getFeatureCount();
  /**
   * <pre>
   * Features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Feature feature = 1;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.FeatureOrBuilder> 
      getFeatureOrBuilderList();
  /**
   * <pre>
   * Features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.Feature feature = 1;</code>
   */
  org.tensorflow.metadata.v0.FeatureOrBuilder getFeatureOrBuilder(
      int index);

  /**
   * <pre>
   * Sparse features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature sparse_feature = 6;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.SparseFeature> 
      getSparseFeatureList();
  /**
   * <pre>
   * Sparse features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature sparse_feature = 6;</code>
   */
  org.tensorflow.metadata.v0.SparseFeature getSparseFeature(int index);
  /**
   * <pre>
   * Sparse features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature sparse_feature = 6;</code>
   */
  int getSparseFeatureCount();
  /**
   * <pre>
   * Sparse features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature sparse_feature = 6;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.SparseFeatureOrBuilder> 
      getSparseFeatureOrBuilderList();
  /**
   * <pre>
   * Sparse features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.SparseFeature sparse_feature = 6;</code>
   */
  org.tensorflow.metadata.v0.SparseFeatureOrBuilder getSparseFeatureOrBuilder(
      int index);

  /**
   * <pre>
   * Weighted features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.WeightedFeature weighted_feature = 12;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.WeightedFeature> 
      getWeightedFeatureList();
  /**
   * <pre>
   * Weighted features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.WeightedFeature weighted_feature = 12;</code>
   */
  org.tensorflow.metadata.v0.WeightedFeature getWeightedFeature(int index);
  /**
   * <pre>
   * Weighted features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.WeightedFeature weighted_feature = 12;</code>
   */
  int getWeightedFeatureCount();
  /**
   * <pre>
   * Weighted features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.WeightedFeature weighted_feature = 12;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.WeightedFeatureOrBuilder> 
      getWeightedFeatureOrBuilderList();
  /**
   * <pre>
   * Weighted features described in this schema.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.WeightedFeature weighted_feature = 12;</code>
   */
  org.tensorflow.metadata.v0.WeightedFeatureOrBuilder getWeightedFeatureOrBuilder(
      int index);

  /**
   * <pre>
   * declared as top-level features in &lt;feature&gt;.
   * String domains referenced in the features.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringDomain string_domain = 4;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.StringDomain> 
      getStringDomainList();
  /**
   * <pre>
   * declared as top-level features in &lt;feature&gt;.
   * String domains referenced in the features.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringDomain string_domain = 4;</code>
   */
  org.tensorflow.metadata.v0.StringDomain getStringDomain(int index);
  /**
   * <pre>
   * declared as top-level features in &lt;feature&gt;.
   * String domains referenced in the features.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringDomain string_domain = 4;</code>
   */
  int getStringDomainCount();
  /**
   * <pre>
   * declared as top-level features in &lt;feature&gt;.
   * String domains referenced in the features.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringDomain string_domain = 4;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.StringDomainOrBuilder> 
      getStringDomainOrBuilderList();
  /**
   * <pre>
   * declared as top-level features in &lt;feature&gt;.
   * String domains referenced in the features.
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.StringDomain string_domain = 4;</code>
   */
  org.tensorflow.metadata.v0.StringDomainOrBuilder getStringDomainOrBuilder(
      int index);

  /**
   * <pre>
   * top level float domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FloatDomain float_domain = 9;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.FloatDomain> 
      getFloatDomainList();
  /**
   * <pre>
   * top level float domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FloatDomain float_domain = 9;</code>
   */
  org.tensorflow.metadata.v0.FloatDomain getFloatDomain(int index);
  /**
   * <pre>
   * top level float domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FloatDomain float_domain = 9;</code>
   */
  int getFloatDomainCount();
  /**
   * <pre>
   * top level float domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FloatDomain float_domain = 9;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.FloatDomainOrBuilder> 
      getFloatDomainOrBuilderList();
  /**
   * <pre>
   * top level float domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.FloatDomain float_domain = 9;</code>
   */
  org.tensorflow.metadata.v0.FloatDomainOrBuilder getFloatDomainOrBuilder(
      int index);

  /**
   * <pre>
   * top level int domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.IntDomain int_domain = 10;</code>
   */
  java.util.List<org.tensorflow.metadata.v0.IntDomain> 
      getIntDomainList();
  /**
   * <pre>
   * top level int domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.IntDomain int_domain = 10;</code>
   */
  org.tensorflow.metadata.v0.IntDomain getIntDomain(int index);
  /**
   * <pre>
   * top level int domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.IntDomain int_domain = 10;</code>
   */
  int getIntDomainCount();
  /**
   * <pre>
   * top level int domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.IntDomain int_domain = 10;</code>
   */
  java.util.List<? extends org.tensorflow.metadata.v0.IntDomainOrBuilder> 
      getIntDomainOrBuilderList();
  /**
   * <pre>
   * top level int domains that can be reused by features
   * </pre>
   *
   * <code>repeated .tensorflow.metadata.v0.IntDomain int_domain = 10;</code>
   */
  org.tensorflow.metadata.v0.IntDomainOrBuilder getIntDomainOrBuilder(
      int index);

  /**
   * <pre>
   * Default environments for each feature.
   * An environment represents both a type of location (e.g. a server or phone)
   * and a time (e.g. right before model X is run). In the standard scenario,
   * 99% of the features should be in the default environments TRAINING,
   * SERVING, and the LABEL (or labels) AND WEIGHT is only available at TRAINING
   * (not at serving).
   * Other possible variations:
   * 1. There may be TRAINING_MOBILE, SERVING_MOBILE, TRAINING_SERVICE,
   *    and SERVING_SERVICE.
   * 2. If one is ensembling three models, where the predictions of the first
   *    three models are available for the ensemble model, there may be
   *    TRAINING, SERVING_INITIAL, SERVING_ENSEMBLE.
   * See FeatureProto::not_in_environment and FeatureProto::in_environment.
   * </pre>
   *
   * <code>repeated string default_environment = 5;</code>
   * @return A list containing the defaultEnvironment.
   */
  java.util.List<java.lang.String>
      getDefaultEnvironmentList();
  /**
   * <pre>
   * Default environments for each feature.
   * An environment represents both a type of location (e.g. a server or phone)
   * and a time (e.g. right before model X is run). In the standard scenario,
   * 99% of the features should be in the default environments TRAINING,
   * SERVING, and the LABEL (or labels) AND WEIGHT is only available at TRAINING
   * (not at serving).
   * Other possible variations:
   * 1. There may be TRAINING_MOBILE, SERVING_MOBILE, TRAINING_SERVICE,
   *    and SERVING_SERVICE.
   * 2. If one is ensembling three models, where the predictions of the first
   *    three models are available for the ensemble model, there may be
   *    TRAINING, SERVING_INITIAL, SERVING_ENSEMBLE.
   * See FeatureProto::not_in_environment and FeatureProto::in_environment.
   * </pre>
   *
   * <code>repeated string default_environment = 5;</code>
   * @return The count of defaultEnvironment.
   */
  int getDefaultEnvironmentCount();
  /**
   * <pre>
   * Default environments for each feature.
   * An environment represents both a type of location (e.g. a server or phone)
   * and a time (e.g. right before model X is run). In the standard scenario,
   * 99% of the features should be in the default environments TRAINING,
   * SERVING, and the LABEL (or labels) AND WEIGHT is only available at TRAINING
   * (not at serving).
   * Other possible variations:
   * 1. There may be TRAINING_MOBILE, SERVING_MOBILE, TRAINING_SERVICE,
   *    and SERVING_SERVICE.
   * 2. If one is ensembling three models, where the predictions of the first
   *    three models are available for the ensemble model, there may be
   *    TRAINING, SERVING_INITIAL, SERVING_ENSEMBLE.
   * See FeatureProto::not_in_environment and FeatureProto::in_environment.
   * </pre>
   *
   * <code>repeated string default_environment = 5;</code>
   * @param index The index of the element to return.
   * @return The defaultEnvironment at the given index.
   */
  java.lang.String getDefaultEnvironment(int index);
  /**
   * <pre>
   * Default environments for each feature.
   * An environment represents both a type of location (e.g. a server or phone)
   * and a time (e.g. right before model X is run). In the standard scenario,
   * 99% of the features should be in the default environments TRAINING,
   * SERVING, and the LABEL (or labels) AND WEIGHT is only available at TRAINING
   * (not at serving).
   * Other possible variations:
   * 1. There may be TRAINING_MOBILE, SERVING_MOBILE, TRAINING_SERVICE,
   *    and SERVING_SERVICE.
   * 2. If one is ensembling three models, where the predictions of the first
   *    three models are available for the ensemble model, there may be
   *    TRAINING, SERVING_INITIAL, SERVING_ENSEMBLE.
   * See FeatureProto::not_in_environment and FeatureProto::in_environment.
   * </pre>
   *
   * <code>repeated string default_environment = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the defaultEnvironment at the given index.
   */
  com.google.protobuf.ByteString
      getDefaultEnvironmentBytes(int index);

  /**
   * <pre>
   * Additional information about the schema as a whole. Features may also
   * be annotated individually.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.Annotation annotation = 8;</code>
   * @return Whether the annotation field is set.
   */
  boolean hasAnnotation();
  /**
   * <pre>
   * Additional information about the schema as a whole. Features may also
   * be annotated individually.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.Annotation annotation = 8;</code>
   * @return The annotation.
   */
  org.tensorflow.metadata.v0.Annotation getAnnotation();
  /**
   * <pre>
   * Additional information about the schema as a whole. Features may also
   * be annotated individually.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.Annotation annotation = 8;</code>
   */
  org.tensorflow.metadata.v0.AnnotationOrBuilder getAnnotationOrBuilder();

  /**
   * <pre>
   * Dataset-level constraints. This is currently used for specifying
   * information about changes in num_examples.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.DatasetConstraints dataset_constraints = 11;</code>
   * @return Whether the datasetConstraints field is set.
   */
  boolean hasDatasetConstraints();
  /**
   * <pre>
   * Dataset-level constraints. This is currently used for specifying
   * information about changes in num_examples.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.DatasetConstraints dataset_constraints = 11;</code>
   * @return The datasetConstraints.
   */
  org.tensorflow.metadata.v0.DatasetConstraints getDatasetConstraints();
  /**
   * <pre>
   * Dataset-level constraints. This is currently used for specifying
   * information about changes in num_examples.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.DatasetConstraints dataset_constraints = 11;</code>
   */
  org.tensorflow.metadata.v0.DatasetConstraintsOrBuilder getDatasetConstraintsOrBuilder();

  /**
   * <pre>
   * TensorRepresentation groups. The keys are the names of the groups.
   * Key "" (empty string) denotes the "default" group, which is what should
   * be used when a group name is not provided.
   * See the documentation at TensorRepresentationGroup for more info.
   * Under development. DO NOT USE.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.metadata.v0.TensorRepresentationGroup&gt; tensor_representation_group = 13;</code>
   */
  int getTensorRepresentationGroupCount();
  /**
   * <pre>
   * TensorRepresentation groups. The keys are the names of the groups.
   * Key "" (empty string) denotes the "default" group, which is what should
   * be used when a group name is not provided.
   * See the documentation at TensorRepresentationGroup for more info.
   * Under development. DO NOT USE.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.metadata.v0.TensorRepresentationGroup&gt; tensor_representation_group = 13;</code>
   */
  boolean containsTensorRepresentationGroup(
      java.lang.String key);
  /**
   * Use {@link #getTensorRepresentationGroupMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.metadata.v0.TensorRepresentationGroup>
  getTensorRepresentationGroup();
  /**
   * <pre>
   * TensorRepresentation groups. The keys are the names of the groups.
   * Key "" (empty string) denotes the "default" group, which is what should
   * be used when a group name is not provided.
   * See the documentation at TensorRepresentationGroup for more info.
   * Under development. DO NOT USE.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.metadata.v0.TensorRepresentationGroup&gt; tensor_representation_group = 13;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.metadata.v0.TensorRepresentationGroup>
  getTensorRepresentationGroupMap();
  /**
   * <pre>
   * TensorRepresentation groups. The keys are the names of the groups.
   * Key "" (empty string) denotes the "default" group, which is what should
   * be used when a group name is not provided.
   * See the documentation at TensorRepresentationGroup for more info.
   * Under development. DO NOT USE.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.metadata.v0.TensorRepresentationGroup&gt; tensor_representation_group = 13;</code>
   */

  org.tensorflow.metadata.v0.TensorRepresentationGroup getTensorRepresentationGroupOrDefault(
      java.lang.String key,
      org.tensorflow.metadata.v0.TensorRepresentationGroup defaultValue);
  /**
   * <pre>
   * TensorRepresentation groups. The keys are the names of the groups.
   * Key "" (empty string) denotes the "default" group, which is what should
   * be used when a group name is not provided.
   * See the documentation at TensorRepresentationGroup for more info.
   * Under development. DO NOT USE.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.metadata.v0.TensorRepresentationGroup&gt; tensor_representation_group = 13;</code>
   */

  org.tensorflow.metadata.v0.TensorRepresentationGroup getTensorRepresentationGroupOrThrow(
      java.lang.String key);
}