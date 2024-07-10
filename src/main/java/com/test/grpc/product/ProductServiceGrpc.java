package com.test.grpc.product;

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
    comments = "Source: product/product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "product.ProductService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.product.CreateProductRequest,
      com.test.grpc.product.ProductResponse> METHOD_CREATE_PRODUCT =
      io.grpc.MethodDescriptor.<com.test.grpc.product.CreateProductRequest, com.test.grpc.product.ProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "product.ProductService", "CreateProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.product.CreateProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.product.ProductResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.google.protobuf.Empty> METHOD_DELETE_PRODUCT =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "product.ProductService", "DeleteProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.test.grpc.product.ProductResponse> METHOD_GET_PRODUCT_BY_PID =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.test.grpc.product.ProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "product.ProductService", "GetProductByPid"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.product.ProductResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.product.StringsRequest,
      com.test.grpc.product.ProductsResponse> METHOD_GET_PRODUCTS_BY_PIDS =
      io.grpc.MethodDescriptor.<com.test.grpc.product.StringsRequest, com.test.grpc.product.ProductsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "product.ProductService", "GetProductsByPids"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.product.StringsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.product.ProductsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.product.ProductSearchFilter,
      com.test.grpc.product.ProductsResponse> METHOD_SEARCH =
      io.grpc.MethodDescriptor.<com.test.grpc.product.ProductSearchFilter, com.test.grpc.product.ProductsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "product.ProductService", "Search"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.product.ProductSearchFilter.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.product.ProductsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.product.ProductUpdateRequest,
      com.test.grpc.product.ProductResponse> METHOD_UPDATE_PRODUCT =
      io.grpc.MethodDescriptor.<com.test.grpc.product.ProductUpdateRequest, com.test.grpc.product.ProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "product.ProductService", "UpdateProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.product.ProductUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.product.ProductResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProduct(com.test.grpc.product.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PRODUCT, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_PRODUCT, responseObserver);
    }

    /**
     */
    public void getProductByPid(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_BY_PID, responseObserver);
    }

    /**
     */
    public void getProductsByPids(com.test.grpc.product.StringsRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCTS_BY_PIDS, responseObserver);
    }

    /**
     */
    public void search(com.test.grpc.product.ProductSearchFilter request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH, responseObserver);
    }

    /**
     */
    public void updateProduct(com.test.grpc.product.ProductUpdateRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PRODUCT, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.product.CreateProductRequest,
                com.test.grpc.product.ProductResponse>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            METHOD_DELETE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PRODUCT)))
          .addMethod(
            METHOD_GET_PRODUCT_BY_PID,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.test.grpc.product.ProductResponse>(
                  this, METHODID_GET_PRODUCT_BY_PID)))
          .addMethod(
            METHOD_GET_PRODUCTS_BY_PIDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.product.StringsRequest,
                com.test.grpc.product.ProductsResponse>(
                  this, METHODID_GET_PRODUCTS_BY_PIDS)))
          .addMethod(
            METHOD_SEARCH,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.product.ProductSearchFilter,
                com.test.grpc.product.ProductsResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            METHOD_UPDATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.product.ProductUpdateRequest,
                com.test.grpc.product.ProductResponse>(
                  this, METHODID_UPDATE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProduct(com.test.grpc.product.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductByPid(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_BY_PID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsByPids(com.test.grpc.product.StringsRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_BY_PIDS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(com.test.grpc.product.ProductSearchFilter request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.test.grpc.product.ProductUpdateRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.product.ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.test.grpc.product.ProductResponse createProduct(com.test.grpc.product.CreateProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteProduct(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.product.ProductResponse getProductByPid(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_BY_PID, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.product.ProductsResponse getProductsByPids(com.test.grpc.product.StringsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCTS_BY_PIDS, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.product.ProductsResponse search(com.test.grpc.product.ProductSearchFilter request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.product.ProductResponse updateProduct(com.test.grpc.product.ProductUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PRODUCT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.product.ProductResponse> createProduct(
        com.test.grpc.product.CreateProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteProduct(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.product.ProductResponse> getProductByPid(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_BY_PID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.product.ProductsResponse> getProductsByPids(
        com.test.grpc.product.StringsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_BY_PIDS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.product.ProductsResponse> search(
        com.test.grpc.product.ProductSearchFilter request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.product.ProductResponse> updateProduct(
        com.test.grpc.product.ProductUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_DELETE_PRODUCT = 1;
  private static final int METHODID_GET_PRODUCT_BY_PID = 2;
  private static final int METHODID_GET_PRODUCTS_BY_PIDS = 3;
  private static final int METHODID_SEARCH = 4;
  private static final int METHODID_UPDATE_PRODUCT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((com.test.grpc.product.CreateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.product.ProductResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_PID:
          serviceImpl.getProductByPid((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.product.ProductResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_BY_PIDS:
          serviceImpl.getProductsByPids((com.test.grpc.product.StringsRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.product.ProductsResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.test.grpc.product.ProductSearchFilter) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.product.ProductsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.test.grpc.product.ProductUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.product.ProductResponse>) responseObserver);
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

  private static final class ProductServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.grpc.product.Product.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_PRODUCT)
              .addMethod(METHOD_DELETE_PRODUCT)
              .addMethod(METHOD_GET_PRODUCT_BY_PID)
              .addMethod(METHOD_GET_PRODUCTS_BY_PIDS)
              .addMethod(METHOD_SEARCH)
              .addMethod(METHOD_UPDATE_PRODUCT)
              .build();
        }
      }
    }
    return result;
  }
}
