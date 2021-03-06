// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_metadata/proto/v0/schema.proto

package org.tensorflow.metadata.v0;

public interface DistributionConstraintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.metadata.v0.DistributionConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The minimum fraction (in [0,1]) of values across all examples that
   * should come from the feature's domain, e.g.:
   *   1.0  =&gt; All values must come from the domain.
   *    .9  =&gt; At least 90% of the values must come from the domain.
   * </pre>
   *
   * <code>optional double min_domain_mass = 1 [default = 1];</code>
   * @return Whether the minDomainMass field is set.
   */
  boolean hasMinDomainMass();
  /**
   * <pre>
   * The minimum fraction (in [0,1]) of values across all examples that
   * should come from the feature's domain, e.g.:
   *   1.0  =&gt; All values must come from the domain.
   *    .9  =&gt; At least 90% of the values must come from the domain.
   * </pre>
   *
   * <code>optional double min_domain_mass = 1 [default = 1];</code>
   * @return The minDomainMass.
   */
  double getMinDomainMass();
}
