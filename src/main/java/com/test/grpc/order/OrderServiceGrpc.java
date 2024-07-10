package com.test.grpc.order;

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
    comments = "Source: order/order.proto")
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final String SERVICE_NAME = "order.OrderService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.order.CreateOrderRequest,
      com.test.grpc.order.OrderResponse> METHOD_CREATE_ORDER =
      io.grpc.MethodDescriptor.<com.test.grpc.order.CreateOrderRequest, com.test.grpc.order.OrderResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "CreateOrder"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.CreateOrderRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.OrderResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.google.protobuf.Empty> METHOD_DELETE_ORDER =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "DeleteOrder"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.test.grpc.order.OrderResponse> METHOD_GET_ORDER_BY_PID =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.test.grpc.order.OrderResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "GetOrderByPid"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.OrderResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.order.StringsRequest,
      com.test.grpc.order.OrdersResponse> METHOD_GET_ORDERS_BY_PIDS =
      io.grpc.MethodDescriptor.<com.test.grpc.order.StringsRequest, com.test.grpc.order.OrdersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "GetOrdersByPids"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.StringsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.OrdersResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.order.OrderSearchFilter,
      com.test.grpc.order.OrdersResponse> METHOD_SEARCH =
      io.grpc.MethodDescriptor.<com.test.grpc.order.OrderSearchFilter, com.test.grpc.order.OrdersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "Search"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.OrderSearchFilter.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.OrdersResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.order.OrderUpdateRequest,
      com.google.protobuf.Empty> METHOD_UPDATE_ORDER =
      io.grpc.MethodDescriptor.<com.test.grpc.order.OrderUpdateRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "UpdateOrder"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.OrderUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.order.PageableRequest,
      com.test.grpc.order.PageableResponse> METHOD_GET_ALL_ORDERS_PAGEABLE =
      io.grpc.MethodDescriptor.<com.test.grpc.order.PageableRequest, com.test.grpc.order.PageableResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "getAllOrdersPageable"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.PageableRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.PageableResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.order.RemoveProductRequest,
      com.google.protobuf.Empty> METHOD_REMOVE_PRODUCT =
      io.grpc.MethodDescriptor.<com.test.grpc.order.RemoveProductRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "RemoveProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.RemoveProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.order.AddProductRequest,
      com.google.protobuf.Empty> METHOD_ADD_PRODUCT =
      io.grpc.MethodDescriptor.<com.test.grpc.order.AddProductRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "AddProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.AddProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.order.UpdateProductRequest,
      com.google.protobuf.Empty> METHOD_UPDATE_PRODUCT =
      io.grpc.MethodDescriptor.<com.test.grpc.order.UpdateProductRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "order.OrderService", "UpdateProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.order.UpdateProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    return new OrderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OrderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createOrder(com.test.grpc.order.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ORDER, responseObserver);
    }

    /**
     */
    public void deleteOrder(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ORDER, responseObserver);
    }

    /**
     */
    public void getOrderByPid(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ORDER_BY_PID, responseObserver);
    }

    /**
     */
    public void getOrdersByPids(com.test.grpc.order.StringsRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.OrdersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ORDERS_BY_PIDS, responseObserver);
    }

    /**
     */
    public void search(com.test.grpc.order.OrderSearchFilter request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.OrdersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH, responseObserver);
    }

    /**
     */
    public void updateOrder(com.test.grpc.order.OrderUpdateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ORDER, responseObserver);
    }

    /**
     */
    public void getAllOrdersPageable(com.test.grpc.order.PageableRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.PageableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_ORDERS_PAGEABLE, responseObserver);
    }

    /**
     */
    public void removeProduct(com.test.grpc.order.RemoveProductRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_PRODUCT, responseObserver);
    }

    /**
     */
    public void addProduct(com.test.grpc.order.AddProductRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_PRODUCT, responseObserver);
    }

    /**
     */
    public void updateProduct(com.test.grpc.order.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PRODUCT, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.order.CreateOrderRequest,
                com.test.grpc.order.OrderResponse>(
                  this, METHODID_CREATE_ORDER)))
          .addMethod(
            METHOD_DELETE_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ORDER)))
          .addMethod(
            METHOD_GET_ORDER_BY_PID,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.test.grpc.order.OrderResponse>(
                  this, METHODID_GET_ORDER_BY_PID)))
          .addMethod(
            METHOD_GET_ORDERS_BY_PIDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.order.StringsRequest,
                com.test.grpc.order.OrdersResponse>(
                  this, METHODID_GET_ORDERS_BY_PIDS)))
          .addMethod(
            METHOD_SEARCH,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.order.OrderSearchFilter,
                com.test.grpc.order.OrdersResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            METHOD_UPDATE_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.order.OrderUpdateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ORDER)))
          .addMethod(
            METHOD_GET_ALL_ORDERS_PAGEABLE,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.order.PageableRequest,
                com.test.grpc.order.PageableResponse>(
                  this, METHODID_GET_ALL_ORDERS_PAGEABLE)))
          .addMethod(
            METHOD_REMOVE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.order.RemoveProductRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_PRODUCT)))
          .addMethod(
            METHOD_ADD_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.order.AddProductRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_PRODUCT)))
          .addMethod(
            METHOD_UPDATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.order.UpdateProductRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class OrderServiceStub extends io.grpc.stub.AbstractStub<OrderServiceStub> {
    private OrderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected OrderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void createOrder(com.test.grpc.order.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.OrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ORDER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOrder(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ORDER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrderByPid(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.OrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ORDER_BY_PID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrdersByPids(com.test.grpc.order.StringsRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.OrdersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ORDERS_BY_PIDS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(com.test.grpc.order.OrderSearchFilter request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.OrdersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrder(com.test.grpc.order.OrderUpdateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ORDER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllOrdersPageable(com.test.grpc.order.PageableRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.order.PageableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_ORDERS_PAGEABLE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeProduct(com.test.grpc.order.RemoveProductRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProduct(com.test.grpc.order.AddProductRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.test.grpc.order.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderServiceBlockingStub extends io.grpc.stub.AbstractStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected OrderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.test.grpc.order.OrderResponse createOrder(com.test.grpc.order.CreateOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ORDER, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteOrder(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ORDER, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.order.OrderResponse getOrderByPid(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ORDER_BY_PID, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.order.OrdersResponse getOrdersByPids(com.test.grpc.order.StringsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ORDERS_BY_PIDS, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.order.OrdersResponse search(com.test.grpc.order.OrderSearchFilter request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateOrder(com.test.grpc.order.OrderUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ORDER, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.order.PageableResponse getAllOrdersPageable(com.test.grpc.order.PageableRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_ORDERS_PAGEABLE, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeProduct(com.test.grpc.order.RemoveProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addProduct(com.test.grpc.order.AddProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateProduct(com.test.grpc.order.UpdateProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PRODUCT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderServiceFutureStub extends io.grpc.stub.AbstractStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected OrderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.order.OrderResponse> createOrder(
        com.test.grpc.order.CreateOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ORDER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteOrder(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ORDER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.order.OrderResponse> getOrderByPid(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ORDER_BY_PID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.order.OrdersResponse> getOrdersByPids(
        com.test.grpc.order.StringsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ORDERS_BY_PIDS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.order.OrdersResponse> search(
        com.test.grpc.order.OrderSearchFilter request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateOrder(
        com.test.grpc.order.OrderUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ORDER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.order.PageableResponse> getAllOrdersPageable(
        com.test.grpc.order.PageableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_ORDERS_PAGEABLE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeProduct(
        com.test.grpc.order.RemoveProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addProduct(
        com.test.grpc.order.AddProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateProduct(
        com.test.grpc.order.UpdateProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORDER = 0;
  private static final int METHODID_DELETE_ORDER = 1;
  private static final int METHODID_GET_ORDER_BY_PID = 2;
  private static final int METHODID_GET_ORDERS_BY_PIDS = 3;
  private static final int METHODID_SEARCH = 4;
  private static final int METHODID_UPDATE_ORDER = 5;
  private static final int METHODID_GET_ALL_ORDERS_PAGEABLE = 6;
  private static final int METHODID_REMOVE_PRODUCT = 7;
  private static final int METHODID_ADD_PRODUCT = 8;
  private static final int METHODID_UPDATE_PRODUCT = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((com.test.grpc.order.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.order.OrderResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORDER:
          serviceImpl.deleteOrder((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_ORDER_BY_PID:
          serviceImpl.getOrderByPid((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.order.OrderResponse>) responseObserver);
          break;
        case METHODID_GET_ORDERS_BY_PIDS:
          serviceImpl.getOrdersByPids((com.test.grpc.order.StringsRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.order.OrdersResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.test.grpc.order.OrderSearchFilter) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.order.OrdersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER:
          serviceImpl.updateOrder((com.test.grpc.order.OrderUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL_ORDERS_PAGEABLE:
          serviceImpl.getAllOrdersPageable((com.test.grpc.order.PageableRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.order.PageableResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PRODUCT:
          serviceImpl.removeProduct((com.test.grpc.order.RemoveProductRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((com.test.grpc.order.AddProductRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.test.grpc.order.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static final class OrderServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.grpc.order.Order.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_ORDER)
              .addMethod(METHOD_DELETE_ORDER)
              .addMethod(METHOD_GET_ORDER_BY_PID)
              .addMethod(METHOD_GET_ORDERS_BY_PIDS)
              .addMethod(METHOD_SEARCH)
              .addMethod(METHOD_UPDATE_ORDER)
              .addMethod(METHOD_GET_ALL_ORDERS_PAGEABLE)
              .addMethod(METHOD_REMOVE_PRODUCT)
              .addMethod(METHOD_ADD_PRODUCT)
              .addMethod(METHOD_UPDATE_PRODUCT)
              .build();
        }
      }
    }
    return result;
  }
}
