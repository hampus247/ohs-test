package com.test.grpc;

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
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.CreateUserRequest,
      com.test.grpc.UserResponse> METHOD_CREATE_USER =
      io.grpc.MethodDescriptor.<com.test.grpc.CreateUserRequest, com.test.grpc.UserResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "user.UserService", "CreateUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.CreateUserRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.UserResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.google.protobuf.Empty> METHOD_DELETE_USER =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "user.UserService", "DeleteUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.test.grpc.UserResponse> METHOD_GET_USER_BY_PID =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.test.grpc.UserResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "user.UserService", "GetUserByPid"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.UserResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.StringsRequest,
      com.test.grpc.UsersResponse> METHOD_GET_USERS_BY_PIDS =
      io.grpc.MethodDescriptor.<com.test.grpc.StringsRequest, com.test.grpc.UsersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "user.UserService", "GetUsersByPids"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.StringsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.UsersResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.UserSearchFilter,
      com.test.grpc.UsersResponse> METHOD_SEARCH =
      io.grpc.MethodDescriptor.<com.test.grpc.UserSearchFilter, com.test.grpc.UsersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "user.UserService", "Search"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.UserSearchFilter.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.UsersResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.UserUpdateRequest,
      com.test.grpc.UserResponse> METHOD_UPDATE_USER =
      io.grpc.MethodDescriptor.<com.test.grpc.UserUpdateRequest, com.test.grpc.UserResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "user.UserService", "UpdateUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.UserUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.UserResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.AddPaymentMethodRequest,
      com.google.protobuf.Empty> METHOD_ADD_PAYMENT_METHOD =
      io.grpc.MethodDescriptor.<com.test.grpc.AddPaymentMethodRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "user.UserService", "AddPaymentMethod"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.AddPaymentMethodRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.grpc.RemovePaymentMethodRequest,
      com.google.protobuf.Empty> METHOD_REMOVE_PAYMENT_METHOD =
      io.grpc.MethodDescriptor.<com.test.grpc.RemovePaymentMethodRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "user.UserService", "RemovePaymentMethod"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.grpc.RemovePaymentMethodRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(com.test.grpc.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_USER, responseObserver);
    }

    /**
     */
    public void deleteUser(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_USER, responseObserver);
    }

    /**
     */
    public void getUserByPid(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.test.grpc.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_BY_PID, responseObserver);
    }

    /**
     */
    public void getUsersByPids(com.test.grpc.StringsRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.UsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USERS_BY_PIDS, responseObserver);
    }

    /**
     */
    public void search(com.test.grpc.UserSearchFilter request,
        io.grpc.stub.StreamObserver<com.test.grpc.UsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH, responseObserver);
    }

    /**
     */
    public void updateUser(com.test.grpc.UserUpdateRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_USER, responseObserver);
    }

    /**
     */
    public void addPaymentMethod(com.test.grpc.AddPaymentMethodRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_PAYMENT_METHOD, responseObserver);
    }

    /**
     */
    public void removePaymentMethod(com.test.grpc.RemovePaymentMethodRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_PAYMENT_METHOD, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.CreateUserRequest,
                com.test.grpc.UserResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            METHOD_DELETE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            METHOD_GET_USER_BY_PID,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.test.grpc.UserResponse>(
                  this, METHODID_GET_USER_BY_PID)))
          .addMethod(
            METHOD_GET_USERS_BY_PIDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.StringsRequest,
                com.test.grpc.UsersResponse>(
                  this, METHODID_GET_USERS_BY_PIDS)))
          .addMethod(
            METHOD_SEARCH,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.UserSearchFilter,
                com.test.grpc.UsersResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            METHOD_UPDATE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.UserUpdateRequest,
                com.test.grpc.UserResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            METHOD_ADD_PAYMENT_METHOD,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.AddPaymentMethodRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_PAYMENT_METHOD)))
          .addMethod(
            METHOD_REMOVE_PAYMENT_METHOD,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.RemovePaymentMethodRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_PAYMENT_METHOD)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(com.test.grpc.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByPid(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.test.grpc.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_BY_PID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersByPids(com.test.grpc.StringsRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.UsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USERS_BY_PIDS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(com.test.grpc.UserSearchFilter request,
        io.grpc.stub.StreamObserver<com.test.grpc.UsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.test.grpc.UserUpdateRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPaymentMethod(com.test.grpc.AddPaymentMethodRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_PAYMENT_METHOD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removePaymentMethod(com.test.grpc.RemovePaymentMethodRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_PAYMENT_METHOD, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.test.grpc.UserResponse createUser(com.test.grpc.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_USER, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteUser(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_USER, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.UserResponse getUserByPid(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_BY_PID, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.UsersResponse getUsersByPids(com.test.grpc.StringsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USERS_BY_PIDS, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.UsersResponse search(com.test.grpc.UserSearchFilter request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH, getCallOptions(), request);
    }

    /**
     */
    public com.test.grpc.UserResponse updateUser(com.test.grpc.UserUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_USER, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addPaymentMethod(com.test.grpc.AddPaymentMethodRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_PAYMENT_METHOD, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removePaymentMethod(com.test.grpc.RemovePaymentMethodRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_PAYMENT_METHOD, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.UserResponse> createUser(
        com.test.grpc.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUser(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.UserResponse> getUserByPid(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_BY_PID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.UsersResponse> getUsersByPids(
        com.test.grpc.StringsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USERS_BY_PIDS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.UsersResponse> search(
        com.test.grpc.UserSearchFilter request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.UserResponse> updateUser(
        com.test.grpc.UserUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addPaymentMethod(
        com.test.grpc.AddPaymentMethodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_PAYMENT_METHOD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removePaymentMethod(
        com.test.grpc.RemovePaymentMethodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_PAYMENT_METHOD, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_DELETE_USER = 1;
  private static final int METHODID_GET_USER_BY_PID = 2;
  private static final int METHODID_GET_USERS_BY_PIDS = 3;
  private static final int METHODID_SEARCH = 4;
  private static final int METHODID_UPDATE_USER = 5;
  private static final int METHODID_ADD_PAYMENT_METHOD = 6;
  private static final int METHODID_REMOVE_PAYMENT_METHOD = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.test.grpc.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.UserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_USER_BY_PID:
          serviceImpl.getUserByPid((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.UserResponse>) responseObserver);
          break;
        case METHODID_GET_USERS_BY_PIDS:
          serviceImpl.getUsersByPids((com.test.grpc.StringsRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.UsersResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.test.grpc.UserSearchFilter) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.UsersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.test.grpc.UserUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.UserResponse>) responseObserver);
          break;
        case METHODID_ADD_PAYMENT_METHOD:
          serviceImpl.addPaymentMethod((com.test.grpc.AddPaymentMethodRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_PAYMENT_METHOD:
          serviceImpl.removePaymentMethod((com.test.grpc.RemovePaymentMethodRequest) request,
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

  private static final class UserServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.grpc.User.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_USER)
              .addMethod(METHOD_DELETE_USER)
              .addMethod(METHOD_GET_USER_BY_PID)
              .addMethod(METHOD_GET_USERS_BY_PIDS)
              .addMethod(METHOD_SEARCH)
              .addMethod(METHOD_UPDATE_USER)
              .addMethod(METHOD_ADD_PAYMENT_METHOD)
              .addMethod(METHOD_REMOVE_PAYMENT_METHOD)
              .build();
        }
      }
    }
    return result;
  }
}
