package com.test.grpc.supplier;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: supplier/supplier.proto")
public final class SupplierServiceGrpc {

  private SupplierServiceGrpc() {}

  public static final String SERVICE_NAME = "supplier.SupplierService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.supplier.CreateSupplierRequest,
      com.test.grpc.supplier.SupplierResponse> METHOD_CREATE_SUPPLIER =
      io.grpc.MethodDescriptor.<com.test.grpc.supplier.CreateSupplierRequest, com.test.grpc.supplier.SupplierResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "supplier.SupplierService", "CreateSupplier"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.supplier.CreateSupplierRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.supplier.SupplierResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.google.protobuf.Empty> METHOD_DELETE_SUPPLIER =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "supplier.SupplierService", "DeleteSupplier"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.test.grpc.supplier.SupplierResponse> METHOD_GET_SUPPLIER_BY_PID =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.test.grpc.supplier.SupplierResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "supplier.SupplierService", "GetSupplierByPid"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.supplier.SupplierResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.supplier.StringsRequest,
      com.test.grpc.supplier.SuppliersResponse> METHOD_GET_SUPPLIERS_BY_PIDS =
      io.grpc.MethodDescriptor.<com.test.grpc.supplier.StringsRequest, com.test.grpc.supplier.SuppliersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "supplier.SupplierService", "GetSuppliersByPids"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.supplier.StringsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.supplier.SuppliersResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.supplier.SupplierSearchFilter,
      com.test.grpc.supplier.SuppliersResponse> METHOD_SEARCH =
      io.grpc.MethodDescriptor.<com.test.grpc.supplier.SupplierSearchFilter, com.test.grpc.supplier.SuppliersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "supplier.SupplierService", "Search"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.supplier.SupplierSearchFilter.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.supplier.SuppliersResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.supplier.SupplierUpdateRequest,
      com.test.grpc.supplier.SupplierResponse> METHOD_UPDATE_SUPPLIER_CONTACT =
      io.grpc.MethodDescriptor.<com.test.grpc.supplier.SupplierUpdateRequest, com.test.grpc.supplier.SupplierResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "supplier.SupplierService", "UpdateSupplierContact"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.supplier.SupplierUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.supplier.SupplierResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SupplierServiceStub newStub(io.grpc.Channel channel) {
    return new SupplierServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SupplierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SupplierServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SupplierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SupplierServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SupplierServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSupplier(com.test.grpc.supplier.CreateSupplierRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SupplierResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SUPPLIER, responseObserver);
    }

    /**
     */
    public void deleteSupplier(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SUPPLIER, responseObserver);
    }

    /**
     */
    public void getSupplierByPid(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SupplierResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUPPLIER_BY_PID, responseObserver);
    }

    /**
     */
    public void getSuppliersByPids(com.test.grpc.supplier.StringsRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SuppliersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUPPLIERS_BY_PIDS, responseObserver);
    }

    /**
     */
    public void search(com.test.grpc.supplier.SupplierSearchFilter request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SuppliersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH, responseObserver);
    }

    /**
     */
    public void updateSupplierContact(com.test.grpc.supplier.SupplierUpdateRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SupplierResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SUPPLIER_CONTACT, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_SUPPLIER,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.supplier.CreateSupplierRequest,
                com.test.grpc.supplier.SupplierResponse>(
                  this, METHODID_CREATE_SUPPLIER)))
          .addMethod(
            METHOD_DELETE_SUPPLIER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SUPPLIER)))
          .addMethod(
            METHOD_GET_SUPPLIER_BY_PID,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.test.grpc.supplier.SupplierResponse>(
                  this, METHODID_GET_SUPPLIER_BY_PID)))
          .addMethod(
            METHOD_GET_SUPPLIERS_BY_PIDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.supplier.StringsRequest,
                com.test.grpc.supplier.SuppliersResponse>(
                  this, METHODID_GET_SUPPLIERS_BY_PIDS)))
          .addMethod(
            METHOD_SEARCH,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.supplier.SupplierSearchFilter,
                com.test.grpc.supplier.SuppliersResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            METHOD_UPDATE_SUPPLIER_CONTACT,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.supplier.SupplierUpdateRequest,
                com.test.grpc.supplier.SupplierResponse>(
                  this, METHODID_UPDATE_SUPPLIER_CONTACT)))
          .build();
    }
  }

  /**
   */
  public static final class SupplierServiceStub extends io.grpc.stub.AbstractStub<SupplierServiceStub> {
    private SupplierServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SupplierServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SupplierServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SupplierServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSupplier(com.test.grpc.supplier.CreateSupplierRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SupplierResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SUPPLIER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSupplier(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SUPPLIER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSupplierByPid(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SupplierResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUPPLIER_BY_PID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSuppliersByPids(com.test.grpc.supplier.StringsRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SuppliersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUPPLIERS_BY_PIDS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(com.test.grpc.supplier.SupplierSearchFilter request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SuppliersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSupplierContact(com.test.grpc.supplier.SupplierUpdateRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.supplier.SupplierResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SUPPLIER_CONTACT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SupplierServiceBlockingStub extends io.grpc.stub.AbstractStub<SupplierServiceBlockingStub> {
    private SupplierServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SupplierServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SupplierServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SupplierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.test.grpc.supplier.SupplierResponse createSupplier(com.test.grpc.supplier.CreateSupplierRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SUPPLIER, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteSupplier(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SUPPLIER, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.supplier.SupplierResponse getSupplierByPid(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUPPLIER_BY_PID, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.supplier.SuppliersResponse getSuppliersByPids(com.test.grpc.supplier.StringsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUPPLIERS_BY_PIDS, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.supplier.SuppliersResponse search(com.test.grpc.supplier.SupplierSearchFilter request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.supplier.SupplierResponse updateSupplierContact(com.test.grpc.supplier.SupplierUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SUPPLIER_CONTACT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SupplierServiceFutureStub extends io.grpc.stub.AbstractStub<SupplierServiceFutureStub> {
    private SupplierServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SupplierServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SupplierServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SupplierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.supplier.SupplierResponse> createSupplier(
        com.test.grpc.supplier.CreateSupplierRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SUPPLIER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSupplier(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SUPPLIER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.supplier.SupplierResponse> getSupplierByPid(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUPPLIER_BY_PID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.supplier.SuppliersResponse> getSuppliersByPids(
        com.test.grpc.supplier.StringsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUPPLIERS_BY_PIDS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.supplier.SuppliersResponse> search(
        com.test.grpc.supplier.SupplierSearchFilter request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.supplier.SupplierResponse> updateSupplierContact(
        com.test.grpc.supplier.SupplierUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SUPPLIER_CONTACT, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SUPPLIER = 0;
  private static final int METHODID_DELETE_SUPPLIER = 1;
  private static final int METHODID_GET_SUPPLIER_BY_PID = 2;
  private static final int METHODID_GET_SUPPLIERS_BY_PIDS = 3;
  private static final int METHODID_SEARCH = 4;
  private static final int METHODID_UPDATE_SUPPLIER_CONTACT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SupplierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SupplierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SUPPLIER:
          serviceImpl.createSupplier((com.test.grpc.supplier.CreateSupplierRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.supplier.SupplierResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUPPLIER:
          serviceImpl.deleteSupplier((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_SUPPLIER_BY_PID:
          serviceImpl.getSupplierByPid((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.supplier.SupplierResponse>) responseObserver);
          break;
        case METHODID_GET_SUPPLIERS_BY_PIDS:
          serviceImpl.getSuppliersByPids((com.test.grpc.supplier.StringsRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.supplier.SuppliersResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.test.grpc.supplier.SupplierSearchFilter) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.supplier.SuppliersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SUPPLIER_CONTACT:
          serviceImpl.updateSupplierContact((com.test.grpc.supplier.SupplierUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.supplier.SupplierResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class SupplierServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.grpc.supplier.Supplier.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SupplierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SupplierServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_SUPPLIER)
              .addMethod(METHOD_DELETE_SUPPLIER)
              .addMethod(METHOD_GET_SUPPLIER_BY_PID)
              .addMethod(METHOD_GET_SUPPLIERS_BY_PIDS)
              .addMethod(METHOD_SEARCH)
              .addMethod(METHOD_UPDATE_SUPPLIER_CONTACT)
              .build();
        }
      }
    }
    return result;
  }
}
