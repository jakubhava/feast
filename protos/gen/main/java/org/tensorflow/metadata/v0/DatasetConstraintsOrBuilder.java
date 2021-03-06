// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

public interface DatasetConstraintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.DatasetConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tests differences in number of examples between the current data and the
   * previous span.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.NumericValueComparator num_examples_drift_comparator = 1;</code>
   * @return Whether the numExamplesDriftComparator field is set.
   */
  boolean hasNumExamplesDriftComparator();
  /**
   * <pre>
   * Tests differences in number of examples between the current data and the
   * previous span.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.NumericValueComparator num_examples_drift_comparator = 1;</code>
   * @return The numExamplesDriftComparator.
   */
  org.tensorflow.metadata.v0.NumericValueComparator getNumExamplesDriftComparator();
  /**
   * <pre>
   * Tests differences in number of examples between the current data and the
   * previous span.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.NumericValueComparator num_examples_drift_comparator = 1;</code>
   */
  org.tensorflow.metadata.v0.NumericValueComparatorOrBuilder getNumExamplesDriftComparatorOrBuilder();

  /**
   * <pre>
   * Tests comparisions in number of examples between the current data and the
   * previous version of that data.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.NumericValueComparator num_examples_version_comparator = 2;</code>
   * @return Whether the numExamplesVersionComparator field is set.
   */
  boolean hasNumExamplesVersionComparator();
  /**
   * <pre>
   * Tests comparisions in number of examples between the current data and the
   * previous version of that data.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.NumericValueComparator num_examples_version_comparator = 2;</code>
   * @return The numExamplesVersionComparator.
   */
  org.tensorflow.metadata.v0.NumericValueComparator getNumExamplesVersionComparator();
  /**
   * <pre>
   * Tests comparisions in number of examples between the current data and the
   * previous version of that data.
   * </pre>
   *
   * <code>optional .tensorflow.metadata.v0.NumericValueComparator num_examples_version_comparator = 2;</code>
   */
  org.tensorflow.metadata.v0.NumericValueComparatorOrBuilder getNumExamplesVersionComparatorOrBuilder();

  /**
   * <pre>
   * Minimum number of examples in the dataset.
   * </pre>
   *
   * <code>optional int64 min_examples_count = 3;</code>
   * @return Whether the minExamplesCount field is set.
   */
  boolean hasMinExamplesCount();
  /**
   * <pre>
   * Minimum number of examples in the dataset.
   * </pre>
   *
   * <code>optional int64 min_examples_count = 3;</code>
   * @return The minExamplesCount.
   */
  long getMinExamplesCount();
}
