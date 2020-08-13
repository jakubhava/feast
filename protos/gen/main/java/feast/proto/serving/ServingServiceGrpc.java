package feast.proto.serving;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.0)",
    comments = "Source: feast/serving/ServingService.proto")
public final class ServingServiceGrpc {

  private ServingServiceGrpc() {}

  public static final String SERVICE_NAME = "feast.serving.ServingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest,
      feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse> getGetFeastServingInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeastServingInfo",
      requestType = feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest.class,
      responseType = feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest,
      feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse> getGetFeastServingInfoMethod() {
    io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest, feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse> getGetFeastServingInfoMethod;
    if ((getGetFeastServingInfoMethod = ServingServiceGrpc.getGetFeastServingInfoMethod) == null) {
      synchronized (ServingServiceGrpc.class) {
        if ((getGetFeastServingInfoMethod = ServingServiceGrpc.getGetFeastServingInfoMethod) == null) {
          ServingServiceGrpc.getGetFeastServingInfoMethod = getGetFeastServingInfoMethod =
              io.grpc.MethodDescriptor.<feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest, feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeastServingInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServingServiceMethodDescriptorSupplier("GetFeastServingInfo"))
              .build();
        }
      }
    }
    return getGetFeastServingInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest,
      feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse> getGetOnlineFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOnlineFeatures",
      requestType = feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest.class,
      responseType = feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest,
      feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse> getGetOnlineFeaturesMethod() {
    io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest, feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse> getGetOnlineFeaturesMethod;
    if ((getGetOnlineFeaturesMethod = ServingServiceGrpc.getGetOnlineFeaturesMethod) == null) {
      synchronized (ServingServiceGrpc.class) {
        if ((getGetOnlineFeaturesMethod = ServingServiceGrpc.getGetOnlineFeaturesMethod) == null) {
          ServingServiceGrpc.getGetOnlineFeaturesMethod = getGetOnlineFeaturesMethod =
              io.grpc.MethodDescriptor.<feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest, feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOnlineFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServingServiceMethodDescriptorSupplier("GetOnlineFeatures"))
              .build();
        }
      }
    }
    return getGetOnlineFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest,
      feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse> getGetBatchFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBatchFeatures",
      requestType = feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest.class,
      responseType = feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest,
      feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse> getGetBatchFeaturesMethod() {
    io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest, feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse> getGetBatchFeaturesMethod;
    if ((getGetBatchFeaturesMethod = ServingServiceGrpc.getGetBatchFeaturesMethod) == null) {
      synchronized (ServingServiceGrpc.class) {
        if ((getGetBatchFeaturesMethod = ServingServiceGrpc.getGetBatchFeaturesMethod) == null) {
          ServingServiceGrpc.getGetBatchFeaturesMethod = getGetBatchFeaturesMethod =
              io.grpc.MethodDescriptor.<feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest, feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBatchFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServingServiceMethodDescriptorSupplier("GetBatchFeatures"))
              .build();
        }
      }
    }
    return getGetBatchFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetJobRequest,
      feast.proto.serving.ServingAPIProto.GetJobResponse> getGetJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJob",
      requestType = feast.proto.serving.ServingAPIProto.GetJobRequest.class,
      responseType = feast.proto.serving.ServingAPIProto.GetJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetJobRequest,
      feast.proto.serving.ServingAPIProto.GetJobResponse> getGetJobMethod() {
    io.grpc.MethodDescriptor<feast.proto.serving.ServingAPIProto.GetJobRequest, feast.proto.serving.ServingAPIProto.GetJobResponse> getGetJobMethod;
    if ((getGetJobMethod = ServingServiceGrpc.getGetJobMethod) == null) {
      synchronized (ServingServiceGrpc.class) {
        if ((getGetJobMethod = ServingServiceGrpc.getGetJobMethod) == null) {
          ServingServiceGrpc.getGetJobMethod = getGetJobMethod =
              io.grpc.MethodDescriptor.<feast.proto.serving.ServingAPIProto.GetJobRequest, feast.proto.serving.ServingAPIProto.GetJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.serving.ServingAPIProto.GetJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.serving.ServingAPIProto.GetJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServingServiceMethodDescriptorSupplier("GetJob"))
              .build();
        }
      }
    }
    return getGetJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServingServiceStub>() {
        @java.lang.Override
        public ServingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServingServiceStub(channel, callOptions);
        }
      };
    return ServingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServingServiceBlockingStub>() {
        @java.lang.Override
        public ServingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServingServiceBlockingStub(channel, callOptions);
        }
      };
    return ServingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServingServiceFutureStub>() {
        @java.lang.Override
        public ServingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServingServiceFutureStub(channel, callOptions);
        }
      };
    return ServingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ServingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get information about this Feast serving.
     * </pre>
     */
    public void getFeastServingInfo(feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest request,
        io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeastServingInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get online features synchronously.
     * </pre>
     */
    public void getOnlineFeatures(feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest request,
        io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOnlineFeaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get batch features asynchronously.
     * The client should check the status of the returned job periodically by
     * calling ReloadJob to determine if the job has completed successfully
     * or with an error. If the job completes successfully i.e.
     * status = JOB_STATUS_DONE with no error, then the client can check
     * the file_uris for the location to download feature values data.
     * The client is assumed to have access to these file URIs.
     * </pre>
     */
    public void getBatchFeatures(feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest request,
        io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBatchFeaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the latest job status for batch feature retrieval.
     * </pre>
     */
    public void getJob(feast.proto.serving.ServingAPIProto.GetJobRequest request,
        io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeastServingInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest,
                feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse>(
                  this, METHODID_GET_FEAST_SERVING_INFO)))
          .addMethod(
            getGetOnlineFeaturesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest,
                feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse>(
                  this, METHODID_GET_ONLINE_FEATURES)))
          .addMethod(
            getGetBatchFeaturesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest,
                feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse>(
                  this, METHODID_GET_BATCH_FEATURES)))
          .addMethod(
            getGetJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.serving.ServingAPIProto.GetJobRequest,
                feast.proto.serving.ServingAPIProto.GetJobResponse>(
                  this, METHODID_GET_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class ServingServiceStub extends io.grpc.stub.AbstractAsyncStub<ServingServiceStub> {
    private ServingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get information about this Feast serving.
     * </pre>
     */
    public void getFeastServingInfo(feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest request,
        io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeastServingInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get online features synchronously.
     * </pre>
     */
    public void getOnlineFeatures(feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest request,
        io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOnlineFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get batch features asynchronously.
     * The client should check the status of the returned job periodically by
     * calling ReloadJob to determine if the job has completed successfully
     * or with an error. If the job completes successfully i.e.
     * status = JOB_STATUS_DONE with no error, then the client can check
     * the file_uris for the location to download feature values data.
     * The client is assumed to have access to these file URIs.
     * </pre>
     */
    public void getBatchFeatures(feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest request,
        io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBatchFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the latest job status for batch feature retrieval.
     * </pre>
     */
    public void getJob(feast.proto.serving.ServingAPIProto.GetJobRequest request,
        io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServingServiceBlockingStub> {
    private ServingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get information about this Feast serving.
     * </pre>
     */
    public feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse getFeastServingInfo(feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeastServingInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get online features synchronously.
     * </pre>
     */
    public feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse getOnlineFeatures(feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOnlineFeaturesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get batch features asynchronously.
     * The client should check the status of the returned job periodically by
     * calling ReloadJob to determine if the job has completed successfully
     * or with an error. If the job completes successfully i.e.
     * status = JOB_STATUS_DONE with no error, then the client can check
     * the file_uris for the location to download feature values data.
     * The client is assumed to have access to these file URIs.
     * </pre>
     */
    public feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse getBatchFeatures(feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBatchFeaturesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the latest job status for batch feature retrieval.
     * </pre>
     */
    public feast.proto.serving.ServingAPIProto.GetJobResponse getJob(feast.proto.serving.ServingAPIProto.GetJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetJobMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServingServiceFutureStub> {
    private ServingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get information about this Feast serving.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse> getFeastServingInfo(
        feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeastServingInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get online features synchronously.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse> getOnlineFeatures(
        feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOnlineFeaturesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get batch features asynchronously.
     * The client should check the status of the returned job periodically by
     * calling ReloadJob to determine if the job has completed successfully
     * or with an error. If the job completes successfully i.e.
     * status = JOB_STATUS_DONE with no error, then the client can check
     * the file_uris for the location to download feature values data.
     * The client is assumed to have access to these file URIs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse> getBatchFeatures(
        feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBatchFeaturesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the latest job status for batch feature retrieval.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.serving.ServingAPIProto.GetJobResponse> getJob(
        feast.proto.serving.ServingAPIProto.GetJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEAST_SERVING_INFO = 0;
  private static final int METHODID_GET_ONLINE_FEATURES = 1;
  private static final int METHODID_GET_BATCH_FEATURES = 2;
  private static final int METHODID_GET_JOB = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEAST_SERVING_INFO:
          serviceImpl.getFeastServingInfo((feast.proto.serving.ServingAPIProto.GetFeastServingInfoRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetFeastServingInfoResponse>) responseObserver);
          break;
        case METHODID_GET_ONLINE_FEATURES:
          serviceImpl.getOnlineFeatures((feast.proto.serving.ServingAPIProto.GetOnlineFeaturesRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetOnlineFeaturesResponse>) responseObserver);
          break;
        case METHODID_GET_BATCH_FEATURES:
          serviceImpl.getBatchFeatures((feast.proto.serving.ServingAPIProto.GetBatchFeaturesRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetBatchFeaturesResponse>) responseObserver);
          break;
        case METHODID_GET_JOB:
          serviceImpl.getJob((feast.proto.serving.ServingAPIProto.GetJobRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.serving.ServingAPIProto.GetJobResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return feast.proto.serving.ServingAPIProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServingService");
    }
  }

  private static final class ServingServiceFileDescriptorSupplier
      extends ServingServiceBaseDescriptorSupplier {
    ServingServiceFileDescriptorSupplier() {}
  }

  private static final class ServingServiceMethodDescriptorSupplier
      extends ServingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServingServiceFileDescriptorSupplier())
              .addMethod(getGetFeastServingInfoMethod())
              .addMethod(getGetOnlineFeaturesMethod())
              .addMethod(getGetBatchFeaturesMethod())
              .addMethod(getGetJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
