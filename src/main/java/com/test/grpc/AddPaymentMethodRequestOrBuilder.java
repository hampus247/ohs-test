// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.test.grpc;

public interface AddPaymentMethodRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user.AddPaymentMethodRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string userPid = 1;</code>
   */
  java.lang.String getUserPid();
  /**
   * <code>string userPid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserPidBytes();

  /**
   * <code>.user.PaymentMethod paymentMethod = 2;</code>
   */
  boolean hasPaymentMethod();
  /**
   * <code>.user.PaymentMethod paymentMethod = 2;</code>
   */
  com.test.grpc.PaymentMethod getPaymentMethod();
  /**
   * <code>.user.PaymentMethod paymentMethod = 2;</code>
   */
  com.test.grpc.PaymentMethodOrBuilder getPaymentMethodOrBuilder();
}
