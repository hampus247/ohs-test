// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order/order.proto

package com.test.grpc.order;

public interface ProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:order.Product)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string pid = 1;</code>
   */
  java.lang.String getPid();
  /**
   * <code>string pid = 1;</code>
   */
  com.google.protobuf.ByteString
      getPidBytes();

  /**
   * <code>int32 quantity = 2;</code>
   */
  int getQuantity();

  /**
   * <code>double pricePerUnit = 3;</code>
   */
  double getPricePerUnit();
}
