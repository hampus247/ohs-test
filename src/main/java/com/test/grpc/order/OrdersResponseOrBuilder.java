// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order/order.proto

package com.test.grpc.order;

public interface OrdersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:order.OrdersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .order.OrderResponse orders = 1;</code>
   */
  java.util.List<com.test.grpc.order.OrderResponse> 
      getOrdersList();
  /**
   * <code>repeated .order.OrderResponse orders = 1;</code>
   */
  com.test.grpc.order.OrderResponse getOrders(int index);
  /**
   * <code>repeated .order.OrderResponse orders = 1;</code>
   */
  int getOrdersCount();
  /**
   * <code>repeated .order.OrderResponse orders = 1;</code>
   */
  java.util.List<? extends com.test.grpc.order.OrderResponseOrBuilder> 
      getOrdersOrBuilderList();
  /**
   * <code>repeated .order.OrderResponse orders = 1;</code>
   */
  com.test.grpc.order.OrderResponseOrBuilder getOrdersOrBuilder(
      int index);
}
