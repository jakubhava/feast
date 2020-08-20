package feast.proto.core;

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
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: feast/core/CoreService.proto")
public final class CoreServiceGrpc {

  private CoreServiceGrpc() {}

  public static final String SERVICE_NAME = "feast.core.CoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest,
      feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse> getGetFeastCoreVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeastCoreVersion",
      requestType = feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest.class,
      responseType = feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest,
      feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse> getGetFeastCoreVersionMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest, feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse> getGetFeastCoreVersionMethod;
    if ((getGetFeastCoreVersionMethod = CoreServiceGrpc.getGetFeastCoreVersionMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetFeastCoreVersionMethod = CoreServiceGrpc.getGetFeastCoreVersionMethod) == null) {
          CoreServiceGrpc.getGetFeastCoreVersionMethod = getGetFeastCoreVersionMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest, feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeastCoreVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetFeastCoreVersion"))
              .build();
        }
      }
    }
    return getGetFeastCoreVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.GetFeatureSetRequest,
      feast.proto.core.CoreServiceProto.GetFeatureSetResponse> getGetFeatureSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeatureSet",
      requestType = feast.proto.core.CoreServiceProto.GetFeatureSetRequest.class,
      responseType = feast.proto.core.CoreServiceProto.GetFeatureSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.GetFeatureSetRequest,
      feast.proto.core.CoreServiceProto.GetFeatureSetResponse> getGetFeatureSetMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.GetFeatureSetRequest, feast.proto.core.CoreServiceProto.GetFeatureSetResponse> getGetFeatureSetMethod;
    if ((getGetFeatureSetMethod = CoreServiceGrpc.getGetFeatureSetMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetFeatureSetMethod = CoreServiceGrpc.getGetFeatureSetMethod) == null) {
          CoreServiceGrpc.getGetFeatureSetMethod = getGetFeatureSetMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.GetFeatureSetRequest, feast.proto.core.CoreServiceProto.GetFeatureSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeatureSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.GetFeatureSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.GetFeatureSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetFeatureSet"))
              .build();
        }
      }
    }
    return getGetFeatureSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListFeatureSetsRequest,
      feast.proto.core.CoreServiceProto.ListFeatureSetsResponse> getListFeatureSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFeatureSets",
      requestType = feast.proto.core.CoreServiceProto.ListFeatureSetsRequest.class,
      responseType = feast.proto.core.CoreServiceProto.ListFeatureSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListFeatureSetsRequest,
      feast.proto.core.CoreServiceProto.ListFeatureSetsResponse> getListFeatureSetsMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListFeatureSetsRequest, feast.proto.core.CoreServiceProto.ListFeatureSetsResponse> getListFeatureSetsMethod;
    if ((getListFeatureSetsMethod = CoreServiceGrpc.getListFeatureSetsMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getListFeatureSetsMethod = CoreServiceGrpc.getListFeatureSetsMethod) == null) {
          CoreServiceGrpc.getListFeatureSetsMethod = getListFeatureSetsMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.ListFeatureSetsRequest, feast.proto.core.CoreServiceProto.ListFeatureSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFeatureSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListFeatureSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListFeatureSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("ListFeatureSets"))
              .build();
        }
      }
    }
    return getListFeatureSetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListFeaturesRequest,
      feast.proto.core.CoreServiceProto.ListFeaturesResponse> getListFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFeatures",
      requestType = feast.proto.core.CoreServiceProto.ListFeaturesRequest.class,
      responseType = feast.proto.core.CoreServiceProto.ListFeaturesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListFeaturesRequest,
      feast.proto.core.CoreServiceProto.ListFeaturesResponse> getListFeaturesMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListFeaturesRequest, feast.proto.core.CoreServiceProto.ListFeaturesResponse> getListFeaturesMethod;
    if ((getListFeaturesMethod = CoreServiceGrpc.getListFeaturesMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getListFeaturesMethod = CoreServiceGrpc.getListFeaturesMethod) == null) {
          CoreServiceGrpc.getListFeaturesMethod = getListFeaturesMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.ListFeaturesRequest, feast.proto.core.CoreServiceProto.ListFeaturesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListFeaturesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("ListFeatures"))
              .build();
        }
      }
    }
    return getListFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest,
      feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse> getGetFeatureStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeatureStatistics",
      requestType = feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest.class,
      responseType = feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest,
      feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse> getGetFeatureStatisticsMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest, feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse> getGetFeatureStatisticsMethod;
    if ((getGetFeatureStatisticsMethod = CoreServiceGrpc.getGetFeatureStatisticsMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getGetFeatureStatisticsMethod = CoreServiceGrpc.getGetFeatureStatisticsMethod) == null) {
          CoreServiceGrpc.getGetFeatureStatisticsMethod = getGetFeatureStatisticsMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest, feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeatureStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("GetFeatureStatistics"))
              .build();
        }
      }
    }
    return getGetFeatureStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListStoresRequest,
      feast.proto.core.CoreServiceProto.ListStoresResponse> getListStoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStores",
      requestType = feast.proto.core.CoreServiceProto.ListStoresRequest.class,
      responseType = feast.proto.core.CoreServiceProto.ListStoresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListStoresRequest,
      feast.proto.core.CoreServiceProto.ListStoresResponse> getListStoresMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListStoresRequest, feast.proto.core.CoreServiceProto.ListStoresResponse> getListStoresMethod;
    if ((getListStoresMethod = CoreServiceGrpc.getListStoresMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getListStoresMethod = CoreServiceGrpc.getListStoresMethod) == null) {
          CoreServiceGrpc.getListStoresMethod = getListStoresMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.ListStoresRequest, feast.proto.core.CoreServiceProto.ListStoresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListStoresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListStoresResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("ListStores"))
              .build();
        }
      }
    }
    return getListStoresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest,
      feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse> getApplyFeatureSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyFeatureSet",
      requestType = feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest.class,
      responseType = feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest,
      feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse> getApplyFeatureSetMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest, feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse> getApplyFeatureSetMethod;
    if ((getApplyFeatureSetMethod = CoreServiceGrpc.getApplyFeatureSetMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getApplyFeatureSetMethod = CoreServiceGrpc.getApplyFeatureSetMethod) == null) {
          CoreServiceGrpc.getApplyFeatureSetMethod = getApplyFeatureSetMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest, feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyFeatureSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("ApplyFeatureSet"))
              .build();
        }
      }
    }
    return getApplyFeatureSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.UpdateStoreRequest,
      feast.proto.core.CoreServiceProto.UpdateStoreResponse> getUpdateStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStore",
      requestType = feast.proto.core.CoreServiceProto.UpdateStoreRequest.class,
      responseType = feast.proto.core.CoreServiceProto.UpdateStoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.UpdateStoreRequest,
      feast.proto.core.CoreServiceProto.UpdateStoreResponse> getUpdateStoreMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.UpdateStoreRequest, feast.proto.core.CoreServiceProto.UpdateStoreResponse> getUpdateStoreMethod;
    if ((getUpdateStoreMethod = CoreServiceGrpc.getUpdateStoreMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateStoreMethod = CoreServiceGrpc.getUpdateStoreMethod) == null) {
          CoreServiceGrpc.getUpdateStoreMethod = getUpdateStoreMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.UpdateStoreRequest, feast.proto.core.CoreServiceProto.UpdateStoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.UpdateStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.UpdateStoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("UpdateStore"))
              .build();
        }
      }
    }
    return getUpdateStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.CreateProjectRequest,
      feast.proto.core.CoreServiceProto.CreateProjectResponse> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = feast.proto.core.CoreServiceProto.CreateProjectRequest.class,
      responseType = feast.proto.core.CoreServiceProto.CreateProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.CreateProjectRequest,
      feast.proto.core.CoreServiceProto.CreateProjectResponse> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.CreateProjectRequest, feast.proto.core.CoreServiceProto.CreateProjectResponse> getCreateProjectMethod;
    if ((getCreateProjectMethod = CoreServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getCreateProjectMethod = CoreServiceGrpc.getCreateProjectMethod) == null) {
          CoreServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.CreateProjectRequest, feast.proto.core.CoreServiceProto.CreateProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.CreateProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.CreateProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ArchiveProjectRequest,
      feast.proto.core.CoreServiceProto.ArchiveProjectResponse> getArchiveProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArchiveProject",
      requestType = feast.proto.core.CoreServiceProto.ArchiveProjectRequest.class,
      responseType = feast.proto.core.CoreServiceProto.ArchiveProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ArchiveProjectRequest,
      feast.proto.core.CoreServiceProto.ArchiveProjectResponse> getArchiveProjectMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ArchiveProjectRequest, feast.proto.core.CoreServiceProto.ArchiveProjectResponse> getArchiveProjectMethod;
    if ((getArchiveProjectMethod = CoreServiceGrpc.getArchiveProjectMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getArchiveProjectMethod = CoreServiceGrpc.getArchiveProjectMethod) == null) {
          CoreServiceGrpc.getArchiveProjectMethod = getArchiveProjectMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.ArchiveProjectRequest, feast.proto.core.CoreServiceProto.ArchiveProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArchiveProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ArchiveProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ArchiveProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("ArchiveProject"))
              .build();
        }
      }
    }
    return getArchiveProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListProjectsRequest,
      feast.proto.core.CoreServiceProto.ListProjectsResponse> getListProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjects",
      requestType = feast.proto.core.CoreServiceProto.ListProjectsRequest.class,
      responseType = feast.proto.core.CoreServiceProto.ListProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListProjectsRequest,
      feast.proto.core.CoreServiceProto.ListProjectsResponse> getListProjectsMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListProjectsRequest, feast.proto.core.CoreServiceProto.ListProjectsResponse> getListProjectsMethod;
    if ((getListProjectsMethod = CoreServiceGrpc.getListProjectsMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getListProjectsMethod = CoreServiceGrpc.getListProjectsMethod) == null) {
          CoreServiceGrpc.getListProjectsMethod = getListProjectsMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.ListProjectsRequest, feast.proto.core.CoreServiceProto.ListProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("ListProjects"))
              .build();
        }
      }
    }
    return getListProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListIngestionJobsRequest,
      feast.proto.core.CoreServiceProto.ListIngestionJobsResponse> getListIngestionJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIngestionJobs",
      requestType = feast.proto.core.CoreServiceProto.ListIngestionJobsRequest.class,
      responseType = feast.proto.core.CoreServiceProto.ListIngestionJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListIngestionJobsRequest,
      feast.proto.core.CoreServiceProto.ListIngestionJobsResponse> getListIngestionJobsMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.ListIngestionJobsRequest, feast.proto.core.CoreServiceProto.ListIngestionJobsResponse> getListIngestionJobsMethod;
    if ((getListIngestionJobsMethod = CoreServiceGrpc.getListIngestionJobsMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getListIngestionJobsMethod = CoreServiceGrpc.getListIngestionJobsMethod) == null) {
          CoreServiceGrpc.getListIngestionJobsMethod = getListIngestionJobsMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.ListIngestionJobsRequest, feast.proto.core.CoreServiceProto.ListIngestionJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIngestionJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListIngestionJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.ListIngestionJobsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("ListIngestionJobs"))
              .build();
        }
      }
    }
    return getListIngestionJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.RestartIngestionJobRequest,
      feast.proto.core.CoreServiceProto.RestartIngestionJobResponse> getRestartIngestionJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestartIngestionJob",
      requestType = feast.proto.core.CoreServiceProto.RestartIngestionJobRequest.class,
      responseType = feast.proto.core.CoreServiceProto.RestartIngestionJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.RestartIngestionJobRequest,
      feast.proto.core.CoreServiceProto.RestartIngestionJobResponse> getRestartIngestionJobMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.RestartIngestionJobRequest, feast.proto.core.CoreServiceProto.RestartIngestionJobResponse> getRestartIngestionJobMethod;
    if ((getRestartIngestionJobMethod = CoreServiceGrpc.getRestartIngestionJobMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getRestartIngestionJobMethod = CoreServiceGrpc.getRestartIngestionJobMethod) == null) {
          CoreServiceGrpc.getRestartIngestionJobMethod = getRestartIngestionJobMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.RestartIngestionJobRequest, feast.proto.core.CoreServiceProto.RestartIngestionJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestartIngestionJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.RestartIngestionJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.RestartIngestionJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("RestartIngestionJob"))
              .build();
        }
      }
    }
    return getRestartIngestionJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.StopIngestionJobRequest,
      feast.proto.core.CoreServiceProto.StopIngestionJobResponse> getStopIngestionJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopIngestionJob",
      requestType = feast.proto.core.CoreServiceProto.StopIngestionJobRequest.class,
      responseType = feast.proto.core.CoreServiceProto.StopIngestionJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.StopIngestionJobRequest,
      feast.proto.core.CoreServiceProto.StopIngestionJobResponse> getStopIngestionJobMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.StopIngestionJobRequest, feast.proto.core.CoreServiceProto.StopIngestionJobResponse> getStopIngestionJobMethod;
    if ((getStopIngestionJobMethod = CoreServiceGrpc.getStopIngestionJobMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getStopIngestionJobMethod = CoreServiceGrpc.getStopIngestionJobMethod) == null) {
          CoreServiceGrpc.getStopIngestionJobMethod = getStopIngestionJobMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.StopIngestionJobRequest, feast.proto.core.CoreServiceProto.StopIngestionJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopIngestionJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.StopIngestionJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.StopIngestionJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("StopIngestionJob"))
              .build();
        }
      }
    }
    return getStopIngestionJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest,
      feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse> getUpdateFeatureSetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFeatureSetStatus",
      requestType = feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest.class,
      responseType = feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest,
      feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse> getUpdateFeatureSetStatusMethod() {
    io.grpc.MethodDescriptor<feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest, feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse> getUpdateFeatureSetStatusMethod;
    if ((getUpdateFeatureSetStatusMethod = CoreServiceGrpc.getUpdateFeatureSetStatusMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getUpdateFeatureSetStatusMethod = CoreServiceGrpc.getUpdateFeatureSetStatusMethod) == null) {
          CoreServiceGrpc.getUpdateFeatureSetStatusMethod = getUpdateFeatureSetStatusMethod =
              io.grpc.MethodDescriptor.<feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest, feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFeatureSetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServiceMethodDescriptorSupplier("UpdateFeatureSetStatus"))
              .build();
        }
      }
    }
    return getUpdateFeatureSetStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServiceStub>() {
        @java.lang.Override
        public CoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServiceStub(channel, callOptions);
        }
      };
    return CoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServiceBlockingStub>() {
        @java.lang.Override
        public CoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServiceBlockingStub(channel, callOptions);
        }
      };
    return CoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServiceFutureStub>() {
        @java.lang.Override
        public CoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServiceFutureStub(channel, callOptions);
        }
      };
    return CoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CoreServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieve version information about this Feast deployment
     * </pre>
     */
    public void getFeastCoreVersion(feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeastCoreVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a specific feature set
     * </pre>
     */
    public void getFeatureSet(feast.proto.core.CoreServiceProto.GetFeatureSetRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.GetFeatureSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeatureSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve feature set details given a filter.
     * Returns all feature sets matching that filter. If none are found,
     * an empty list will be returned.
     * If no filter is provided in the request, the response will contain all the feature
     * sets currently stored in the registry.
     * </pre>
     */
    public void listFeatureSets(feast.proto.core.CoreServiceProto.ListFeatureSetsRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListFeatureSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFeatureSetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all feature references and respective features matching that filter. If none are found
     * an empty map will be returned
     * If no filter is provided in the request, the response will contain all the features
     * currently stored in the default project.
     * </pre>
     */
    public void listFeatures(feast.proto.core.CoreServiceProto.ListFeaturesRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListFeaturesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFeaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get feature statistics computed over the data in the batch stores.
     * Returns a dataset containing TFDV statistics mapped to each valid historical store.
     * </pre>
     */
    public void getFeatureStatistics(feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeatureStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve store details given a filter.
     * Returns all stores matching that filter. If none are found, an empty list will be returned.
     * If no filter is provided in the request, the response will contain all the stores currently
     * stored in the registry.
     * </pre>
     */
    public void listStores(feast.proto.core.CoreServiceProto.ListStoresRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListStoresResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListStoresMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create or update and existing feature set.
     * This function is idempotent - it will not create a new feature set if schema does not change.
     * Schema changes will update the feature set if the changes are valid.
     * All changes except the following are valid:
     * - Changes to feature set id (name, project)
     * - Changes to entities
     * - Changes to feature name and type
     * </pre>
     */
    public void applyFeatureSet(feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getApplyFeatureSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates core with the configuration of the store.
     * If the changes are valid, core will return the given store configuration in response, and
     * start or update the necessary feature population jobs for the updated store.
     * </pre>
     */
    public void updateStore(feast.proto.core.CoreServiceProto.UpdateStoreRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.UpdateStoreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a project. Projects serve as namespaces within which resources like features will be
     * created. Feature set names as must be unique within a project while field (Feature/Entity) names
     * must be unique within a Feature Set. Project names themselves must be globally unique.
     * </pre>
     */
    public void createProject(feast.proto.core.CoreServiceProto.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.CreateProjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Archives a project. Archived projects will continue to exist and function, but won't be visible
     * through the Core API. Any existing ingestion or serving requests will continue to function,
     * but will result in warning messages being logged. It is not possible to unarchive a project
     * through the Core API
     * </pre>
     */
    public void archiveProject(feast.proto.core.CoreServiceProto.ArchiveProjectRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ArchiveProjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getArchiveProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all projects active projects.
     * </pre>
     */
    public void listProjects(feast.proto.core.CoreServiceProto.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListProjectsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Ingestion Jobs given an optional filter.
     * Returns allow ingestions matching the given request filter. 
     * Returns all ingestion jobs if no filter is provided.
     * Returns an empty list if no ingestion jobs match the filter.
     * </pre>
     */
    public void listIngestionJobs(feast.proto.core.CoreServiceProto.ListIngestionJobsRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListIngestionJobsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListIngestionJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Restart an Ingestion Job.  Restarts the ingestion job with the given job id.
     * NOTE: Data might be lost during the restart for some job runners.
     * Does not support stopping a job in a transitional (ie pending, suspending, aborting), 
     * terminal state (ie suspended or aborted) or unknown status
     * </pre>
     */
    public void restartIngestionJob(feast.proto.core.CoreServiceProto.RestartIngestionJobRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.RestartIngestionJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRestartIngestionJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop an Ingestion Job.  Stop (Aborts) the ingestion job with the given job id.
     * Does nothing if the target job if already in a terminal state (ie suspended or aborted).
     * Does not support stopping a job in a transitional (ie pending, suspending, aborting) or unknown status
     * </pre>
     */
    public void stopIngestionJob(feast.proto.core.CoreServiceProto.StopIngestionJobRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.StopIngestionJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopIngestionJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Internal API for Job Coordinator to update featureSet's status once responsible ingestion job is running
     * </pre>
     */
    public void updateFeatureSetStatus(feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFeatureSetStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeastCoreVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest,
                feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse>(
                  this, METHODID_GET_FEAST_CORE_VERSION)))
          .addMethod(
            getGetFeatureSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.GetFeatureSetRequest,
                feast.proto.core.CoreServiceProto.GetFeatureSetResponse>(
                  this, METHODID_GET_FEATURE_SET)))
          .addMethod(
            getListFeatureSetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.ListFeatureSetsRequest,
                feast.proto.core.CoreServiceProto.ListFeatureSetsResponse>(
                  this, METHODID_LIST_FEATURE_SETS)))
          .addMethod(
            getListFeaturesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.ListFeaturesRequest,
                feast.proto.core.CoreServiceProto.ListFeaturesResponse>(
                  this, METHODID_LIST_FEATURES)))
          .addMethod(
            getGetFeatureStatisticsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest,
                feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse>(
                  this, METHODID_GET_FEATURE_STATISTICS)))
          .addMethod(
            getListStoresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.ListStoresRequest,
                feast.proto.core.CoreServiceProto.ListStoresResponse>(
                  this, METHODID_LIST_STORES)))
          .addMethod(
            getApplyFeatureSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest,
                feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse>(
                  this, METHODID_APPLY_FEATURE_SET)))
          .addMethod(
            getUpdateStoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.UpdateStoreRequest,
                feast.proto.core.CoreServiceProto.UpdateStoreResponse>(
                  this, METHODID_UPDATE_STORE)))
          .addMethod(
            getCreateProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.CreateProjectRequest,
                feast.proto.core.CoreServiceProto.CreateProjectResponse>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getArchiveProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.ArchiveProjectRequest,
                feast.proto.core.CoreServiceProto.ArchiveProjectResponse>(
                  this, METHODID_ARCHIVE_PROJECT)))
          .addMethod(
            getListProjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.ListProjectsRequest,
                feast.proto.core.CoreServiceProto.ListProjectsResponse>(
                  this, METHODID_LIST_PROJECTS)))
          .addMethod(
            getListIngestionJobsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.ListIngestionJobsRequest,
                feast.proto.core.CoreServiceProto.ListIngestionJobsResponse>(
                  this, METHODID_LIST_INGESTION_JOBS)))
          .addMethod(
            getRestartIngestionJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.RestartIngestionJobRequest,
                feast.proto.core.CoreServiceProto.RestartIngestionJobResponse>(
                  this, METHODID_RESTART_INGESTION_JOB)))
          .addMethod(
            getStopIngestionJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.StopIngestionJobRequest,
                feast.proto.core.CoreServiceProto.StopIngestionJobResponse>(
                  this, METHODID_STOP_INGESTION_JOB)))
          .addMethod(
            getUpdateFeatureSetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest,
                feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse>(
                  this, METHODID_UPDATE_FEATURE_SET_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class CoreServiceStub extends io.grpc.stub.AbstractAsyncStub<CoreServiceStub> {
    private CoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve version information about this Feast deployment
     * </pre>
     */
    public void getFeastCoreVersion(feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeastCoreVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a specific feature set
     * </pre>
     */
    public void getFeatureSet(feast.proto.core.CoreServiceProto.GetFeatureSetRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.GetFeatureSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeatureSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve feature set details given a filter.
     * Returns all feature sets matching that filter. If none are found,
     * an empty list will be returned.
     * If no filter is provided in the request, the response will contain all the feature
     * sets currently stored in the registry.
     * </pre>
     */
    public void listFeatureSets(feast.proto.core.CoreServiceProto.ListFeatureSetsRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListFeatureSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFeatureSetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all feature references and respective features matching that filter. If none are found
     * an empty map will be returned
     * If no filter is provided in the request, the response will contain all the features
     * currently stored in the default project.
     * </pre>
     */
    public void listFeatures(feast.proto.core.CoreServiceProto.ListFeaturesRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListFeaturesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get feature statistics computed over the data in the batch stores.
     * Returns a dataset containing TFDV statistics mapped to each valid historical store.
     * </pre>
     */
    public void getFeatureStatistics(feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeatureStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve store details given a filter.
     * Returns all stores matching that filter. If none are found, an empty list will be returned.
     * If no filter is provided in the request, the response will contain all the stores currently
     * stored in the registry.
     * </pre>
     */
    public void listStores(feast.proto.core.CoreServiceProto.ListStoresRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListStoresResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListStoresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create or update and existing feature set.
     * This function is idempotent - it will not create a new feature set if schema does not change.
     * Schema changes will update the feature set if the changes are valid.
     * All changes except the following are valid:
     * - Changes to feature set id (name, project)
     * - Changes to entities
     * - Changes to feature name and type
     * </pre>
     */
    public void applyFeatureSet(feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplyFeatureSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates core with the configuration of the store.
     * If the changes are valid, core will return the given store configuration in response, and
     * start or update the necessary feature population jobs for the updated store.
     * </pre>
     */
    public void updateStore(feast.proto.core.CoreServiceProto.UpdateStoreRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.UpdateStoreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a project. Projects serve as namespaces within which resources like features will be
     * created. Feature set names as must be unique within a project while field (Feature/Entity) names
     * must be unique within a Feature Set. Project names themselves must be globally unique.
     * </pre>
     */
    public void createProject(feast.proto.core.CoreServiceProto.CreateProjectRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.CreateProjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Archives a project. Archived projects will continue to exist and function, but won't be visible
     * through the Core API. Any existing ingestion or serving requests will continue to function,
     * but will result in warning messages being logged. It is not possible to unarchive a project
     * through the Core API
     * </pre>
     */
    public void archiveProject(feast.proto.core.CoreServiceProto.ArchiveProjectRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ArchiveProjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getArchiveProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all projects active projects.
     * </pre>
     */
    public void listProjects(feast.proto.core.CoreServiceProto.ListProjectsRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListProjectsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Ingestion Jobs given an optional filter.
     * Returns allow ingestions matching the given request filter. 
     * Returns all ingestion jobs if no filter is provided.
     * Returns an empty list if no ingestion jobs match the filter.
     * </pre>
     */
    public void listIngestionJobs(feast.proto.core.CoreServiceProto.ListIngestionJobsRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListIngestionJobsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListIngestionJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Restart an Ingestion Job.  Restarts the ingestion job with the given job id.
     * NOTE: Data might be lost during the restart for some job runners.
     * Does not support stopping a job in a transitional (ie pending, suspending, aborting), 
     * terminal state (ie suspended or aborted) or unknown status
     * </pre>
     */
    public void restartIngestionJob(feast.proto.core.CoreServiceProto.RestartIngestionJobRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.RestartIngestionJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestartIngestionJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop an Ingestion Job.  Stop (Aborts) the ingestion job with the given job id.
     * Does nothing if the target job if already in a terminal state (ie suspended or aborted).
     * Does not support stopping a job in a transitional (ie pending, suspending, aborting) or unknown status
     * </pre>
     */
    public void stopIngestionJob(feast.proto.core.CoreServiceProto.StopIngestionJobRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.StopIngestionJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopIngestionJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Internal API for Job Coordinator to update featureSet's status once responsible ingestion job is running
     * </pre>
     */
    public void updateFeatureSetStatus(feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest request,
        io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFeatureSetStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CoreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CoreServiceBlockingStub> {
    private CoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve version information about this Feast deployment
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse getFeastCoreVersion(feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeastCoreVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a specific feature set
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.GetFeatureSetResponse getFeatureSet(feast.proto.core.CoreServiceProto.GetFeatureSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeatureSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve feature set details given a filter.
     * Returns all feature sets matching that filter. If none are found,
     * an empty list will be returned.
     * If no filter is provided in the request, the response will contain all the feature
     * sets currently stored in the registry.
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.ListFeatureSetsResponse listFeatureSets(feast.proto.core.CoreServiceProto.ListFeatureSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFeatureSetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all feature references and respective features matching that filter. If none are found
     * an empty map will be returned
     * If no filter is provided in the request, the response will contain all the features
     * currently stored in the default project.
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.ListFeaturesResponse listFeatures(feast.proto.core.CoreServiceProto.ListFeaturesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFeaturesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get feature statistics computed over the data in the batch stores.
     * Returns a dataset containing TFDV statistics mapped to each valid historical store.
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse getFeatureStatistics(feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFeatureStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve store details given a filter.
     * Returns all stores matching that filter. If none are found, an empty list will be returned.
     * If no filter is provided in the request, the response will contain all the stores currently
     * stored in the registry.
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.ListStoresResponse listStores(feast.proto.core.CoreServiceProto.ListStoresRequest request) {
      return blockingUnaryCall(
          getChannel(), getListStoresMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create or update and existing feature set.
     * This function is idempotent - it will not create a new feature set if schema does not change.
     * Schema changes will update the feature set if the changes are valid.
     * All changes except the following are valid:
     * - Changes to feature set id (name, project)
     * - Changes to entities
     * - Changes to feature name and type
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse applyFeatureSet(feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getApplyFeatureSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates core with the configuration of the store.
     * If the changes are valid, core will return the given store configuration in response, and
     * start or update the necessary feature population jobs for the updated store.
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.UpdateStoreResponse updateStore(feast.proto.core.CoreServiceProto.UpdateStoreRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a project. Projects serve as namespaces within which resources like features will be
     * created. Feature set names as must be unique within a project while field (Feature/Entity) names
     * must be unique within a Feature Set. Project names themselves must be globally unique.
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.CreateProjectResponse createProject(feast.proto.core.CoreServiceProto.CreateProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Archives a project. Archived projects will continue to exist and function, but won't be visible
     * through the Core API. Any existing ingestion or serving requests will continue to function,
     * but will result in warning messages being logged. It is not possible to unarchive a project
     * through the Core API
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.ArchiveProjectResponse archiveProject(feast.proto.core.CoreServiceProto.ArchiveProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getArchiveProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all projects active projects.
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.ListProjectsResponse listProjects(feast.proto.core.CoreServiceProto.ListProjectsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Ingestion Jobs given an optional filter.
     * Returns allow ingestions matching the given request filter. 
     * Returns all ingestion jobs if no filter is provided.
     * Returns an empty list if no ingestion jobs match the filter.
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.ListIngestionJobsResponse listIngestionJobs(feast.proto.core.CoreServiceProto.ListIngestionJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListIngestionJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Restart an Ingestion Job.  Restarts the ingestion job with the given job id.
     * NOTE: Data might be lost during the restart for some job runners.
     * Does not support stopping a job in a transitional (ie pending, suspending, aborting), 
     * terminal state (ie suspended or aborted) or unknown status
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.RestartIngestionJobResponse restartIngestionJob(feast.proto.core.CoreServiceProto.RestartIngestionJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getRestartIngestionJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop an Ingestion Job.  Stop (Aborts) the ingestion job with the given job id.
     * Does nothing if the target job if already in a terminal state (ie suspended or aborted).
     * Does not support stopping a job in a transitional (ie pending, suspending, aborting) or unknown status
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.StopIngestionJobResponse stopIngestionJob(feast.proto.core.CoreServiceProto.StopIngestionJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopIngestionJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Internal API for Job Coordinator to update featureSet's status once responsible ingestion job is running
     * </pre>
     */
    public feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse updateFeatureSetStatus(feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFeatureSetStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CoreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CoreServiceFutureStub> {
    private CoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve version information about this Feast deployment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse> getFeastCoreVersion(
        feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeastCoreVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a specific feature set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.GetFeatureSetResponse> getFeatureSet(
        feast.proto.core.CoreServiceProto.GetFeatureSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeatureSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve feature set details given a filter.
     * Returns all feature sets matching that filter. If none are found,
     * an empty list will be returned.
     * If no filter is provided in the request, the response will contain all the feature
     * sets currently stored in the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.ListFeatureSetsResponse> listFeatureSets(
        feast.proto.core.CoreServiceProto.ListFeatureSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFeatureSetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all feature references and respective features matching that filter. If none are found
     * an empty map will be returned
     * If no filter is provided in the request, the response will contain all the features
     * currently stored in the default project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.ListFeaturesResponse> listFeatures(
        feast.proto.core.CoreServiceProto.ListFeaturesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFeaturesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get feature statistics computed over the data in the batch stores.
     * Returns a dataset containing TFDV statistics mapped to each valid historical store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse> getFeatureStatistics(
        feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeatureStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve store details given a filter.
     * Returns all stores matching that filter. If none are found, an empty list will be returned.
     * If no filter is provided in the request, the response will contain all the stores currently
     * stored in the registry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.ListStoresResponse> listStores(
        feast.proto.core.CoreServiceProto.ListStoresRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListStoresMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create or update and existing feature set.
     * This function is idempotent - it will not create a new feature set if schema does not change.
     * Schema changes will update the feature set if the changes are valid.
     * All changes except the following are valid:
     * - Changes to feature set id (name, project)
     * - Changes to entities
     * - Changes to feature name and type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse> applyFeatureSet(
        feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getApplyFeatureSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates core with the configuration of the store.
     * If the changes are valid, core will return the given store configuration in response, and
     * start or update the necessary feature population jobs for the updated store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.UpdateStoreResponse> updateStore(
        feast.proto.core.CoreServiceProto.UpdateStoreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a project. Projects serve as namespaces within which resources like features will be
     * created. Feature set names as must be unique within a project while field (Feature/Entity) names
     * must be unique within a Feature Set. Project names themselves must be globally unique.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.CreateProjectResponse> createProject(
        feast.proto.core.CoreServiceProto.CreateProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Archives a project. Archived projects will continue to exist and function, but won't be visible
     * through the Core API. Any existing ingestion or serving requests will continue to function,
     * but will result in warning messages being logged. It is not possible to unarchive a project
     * through the Core API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.ArchiveProjectResponse> archiveProject(
        feast.proto.core.CoreServiceProto.ArchiveProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getArchiveProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all projects active projects.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.ListProjectsResponse> listProjects(
        feast.proto.core.CoreServiceProto.ListProjectsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Ingestion Jobs given an optional filter.
     * Returns allow ingestions matching the given request filter. 
     * Returns all ingestion jobs if no filter is provided.
     * Returns an empty list if no ingestion jobs match the filter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.ListIngestionJobsResponse> listIngestionJobs(
        feast.proto.core.CoreServiceProto.ListIngestionJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListIngestionJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Restart an Ingestion Job.  Restarts the ingestion job with the given job id.
     * NOTE: Data might be lost during the restart for some job runners.
     * Does not support stopping a job in a transitional (ie pending, suspending, aborting), 
     * terminal state (ie suspended or aborted) or unknown status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.RestartIngestionJobResponse> restartIngestionJob(
        feast.proto.core.CoreServiceProto.RestartIngestionJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRestartIngestionJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop an Ingestion Job.  Stop (Aborts) the ingestion job with the given job id.
     * Does nothing if the target job if already in a terminal state (ie suspended or aborted).
     * Does not support stopping a job in a transitional (ie pending, suspending, aborting) or unknown status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.StopIngestionJobResponse> stopIngestionJob(
        feast.proto.core.CoreServiceProto.StopIngestionJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopIngestionJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Internal API for Job Coordinator to update featureSet's status once responsible ingestion job is running
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse> updateFeatureSetStatus(
        feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFeatureSetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEAST_CORE_VERSION = 0;
  private static final int METHODID_GET_FEATURE_SET = 1;
  private static final int METHODID_LIST_FEATURE_SETS = 2;
  private static final int METHODID_LIST_FEATURES = 3;
  private static final int METHODID_GET_FEATURE_STATISTICS = 4;
  private static final int METHODID_LIST_STORES = 5;
  private static final int METHODID_APPLY_FEATURE_SET = 6;
  private static final int METHODID_UPDATE_STORE = 7;
  private static final int METHODID_CREATE_PROJECT = 8;
  private static final int METHODID_ARCHIVE_PROJECT = 9;
  private static final int METHODID_LIST_PROJECTS = 10;
  private static final int METHODID_LIST_INGESTION_JOBS = 11;
  private static final int METHODID_RESTART_INGESTION_JOB = 12;
  private static final int METHODID_STOP_INGESTION_JOB = 13;
  private static final int METHODID_UPDATE_FEATURE_SET_STATUS = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEAST_CORE_VERSION:
          serviceImpl.getFeastCoreVersion((feast.proto.core.CoreServiceProto.GetFeastCoreVersionRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.GetFeastCoreVersionResponse>) responseObserver);
          break;
        case METHODID_GET_FEATURE_SET:
          serviceImpl.getFeatureSet((feast.proto.core.CoreServiceProto.GetFeatureSetRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.GetFeatureSetResponse>) responseObserver);
          break;
        case METHODID_LIST_FEATURE_SETS:
          serviceImpl.listFeatureSets((feast.proto.core.CoreServiceProto.ListFeatureSetsRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListFeatureSetsResponse>) responseObserver);
          break;
        case METHODID_LIST_FEATURES:
          serviceImpl.listFeatures((feast.proto.core.CoreServiceProto.ListFeaturesRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListFeaturesResponse>) responseObserver);
          break;
        case METHODID_GET_FEATURE_STATISTICS:
          serviceImpl.getFeatureStatistics((feast.proto.core.CoreServiceProto.GetFeatureStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.GetFeatureStatisticsResponse>) responseObserver);
          break;
        case METHODID_LIST_STORES:
          serviceImpl.listStores((feast.proto.core.CoreServiceProto.ListStoresRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListStoresResponse>) responseObserver);
          break;
        case METHODID_APPLY_FEATURE_SET:
          serviceImpl.applyFeatureSet((feast.proto.core.CoreServiceProto.ApplyFeatureSetRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ApplyFeatureSetResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STORE:
          serviceImpl.updateStore((feast.proto.core.CoreServiceProto.UpdateStoreRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.UpdateStoreResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((feast.proto.core.CoreServiceProto.CreateProjectRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.CreateProjectResponse>) responseObserver);
          break;
        case METHODID_ARCHIVE_PROJECT:
          serviceImpl.archiveProject((feast.proto.core.CoreServiceProto.ArchiveProjectRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ArchiveProjectResponse>) responseObserver);
          break;
        case METHODID_LIST_PROJECTS:
          serviceImpl.listProjects((feast.proto.core.CoreServiceProto.ListProjectsRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListProjectsResponse>) responseObserver);
          break;
        case METHODID_LIST_INGESTION_JOBS:
          serviceImpl.listIngestionJobs((feast.proto.core.CoreServiceProto.ListIngestionJobsRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.ListIngestionJobsResponse>) responseObserver);
          break;
        case METHODID_RESTART_INGESTION_JOB:
          serviceImpl.restartIngestionJob((feast.proto.core.CoreServiceProto.RestartIngestionJobRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.RestartIngestionJobResponse>) responseObserver);
          break;
        case METHODID_STOP_INGESTION_JOB:
          serviceImpl.stopIngestionJob((feast.proto.core.CoreServiceProto.StopIngestionJobRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.StopIngestionJobResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FEATURE_SET_STATUS:
          serviceImpl.updateFeatureSetStatus((feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusRequest) request,
              (io.grpc.stub.StreamObserver<feast.proto.core.CoreServiceProto.UpdateFeatureSetStatusResponse>) responseObserver);
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

  private static abstract class CoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return feast.proto.core.CoreServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CoreService");
    }
  }

  private static final class CoreServiceFileDescriptorSupplier
      extends CoreServiceBaseDescriptorSupplier {
    CoreServiceFileDescriptorSupplier() {}
  }

  private static final class CoreServiceMethodDescriptorSupplier
      extends CoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoreServiceFileDescriptorSupplier())
              .addMethod(getGetFeastCoreVersionMethod())
              .addMethod(getGetFeatureSetMethod())
              .addMethod(getListFeatureSetsMethod())
              .addMethod(getListFeaturesMethod())
              .addMethod(getGetFeatureStatisticsMethod())
              .addMethod(getListStoresMethod())
              .addMethod(getApplyFeatureSetMethod())
              .addMethod(getUpdateStoreMethod())
              .addMethod(getCreateProjectMethod())
              .addMethod(getArchiveProjectMethod())
              .addMethod(getListProjectsMethod())
              .addMethod(getListIngestionJobsMethod())
              .addMethod(getRestartIngestionJobMethod())
              .addMethod(getStopIngestionJobMethod())
              .addMethod(getUpdateFeatureSetStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
