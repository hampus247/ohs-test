// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.test.grpc;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_StringsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_StringsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_UserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_UsersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_UsersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_CreateUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_CreateUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_UserUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_UserUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_RemovePaymentMethodRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_RemovePaymentMethodRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_AddPaymentMethodRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_AddPaymentMethodRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_UserSearchFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_UserSearchFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_ShippingAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_ShippingAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_PaymentMethod_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_PaymentMethod_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\004user\032\033google/protobuf/empt" +
      "y.proto\032\036google/protobuf/wrappers.proto\"" +
      "!\n\016StringsRequest\022\017\n\007request\030\001 \003(\t\"\221\001\n\014U" +
      "serResponse\022\013\n\003pid\030\001 \001(\t\022\020\n\010fullName\030\002 \001" +
      "(\t\022\r\n\005email\030\004 \001(\t\022&\n\007address\030\003 \001(\0132\025.use" +
      "r.ShippingAddress\022+\n\016paymentMethods\030\005 \003(" +
      "\0132\023.user.PaymentMethod\"2\n\rUsersResponse\022" +
      "!\n\005users\030\001 \003(\0132\022.user.UserResponse\"\327\001\n\021C" +
      "reateUserRequest\022.\n\010fullName\030\001 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022\r\n\005email\030\002 \001(\t\022",
      "&\n\007address\030\003 \001(\0132\025.user.ShippingAddress\022" +
      "+\n\016paymentMethods\030\004 \003(\0132\023.user.PaymentMe" +
      "thod\022.\n\010password\030\005 \001(\0132\034.google.protobuf" +
      ".StringValue\"\245\001\n\021UserUpdateRequest\022.\n\010fu" +
      "llName\030\001 \001(\0132\034.google.protobuf.StringVal" +
      "ue\022+\n\005email\030\002 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022&\n\007address\030\003 \001(\0132\025.user.Shipping" +
      "Address\022\013\n\003pid\030\005 \001(\t\"G\n\032RemovePaymentMet" +
      "hodRequest\022\017\n\007userPid\030\001 \001(\t\022\030\n\020creditCar" +
      "dNumber\030\002 \001(\t\"V\n\027AddPaymentMethodRequest",
      "\022\017\n\007userPid\030\001 \001(\t\022*\n\rpaymentMethod\030\002 \001(\013" +
      "2\023.user.PaymentMethod\"\346\002\n\020UserSearchFilt" +
      "er\022.\n\010fullName\030\001 \001(\0132\034.google.protobuf.S" +
      "tringValue\022+\n\005email\030\002 \001(\0132\034.google.proto" +
      "buf.StringValue\022-\n\007address\030\003 \001(\0132\034.googl" +
      "e.protobuf.StringValue\022-\n\007country\030\004 \001(\0132" +
      "\034.google.protobuf.StringValue\022)\n\003pid\030\005 \001" +
      "(\0132\034.google.protobuf.StringValue\0226\n\020cred" +
      "itCardNumber\030\006 \001(\0132\034.google.protobuf.Str" +
      "ingValue\0224\n\016creditCardType\030\007 \001(\0132\034.googl",
      "e.protobuf.StringValue\"o\n\017ShippingAddres" +
      "s\022-\n\007address\030\001 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022-\n\007country\030\002 \001(\0132\034.google.proto" +
      "buf.StringValue\"}\n\rPaymentMethod\0226\n\020cred" +
      "itCardNumber\030\001 \001(\0132\034.google.protobuf.Str" +
      "ingValue\0224\n\016creditCardType\030\002 \001(\0132\034.googl" +
      "e.protobuf.StringValue2\231\004\n\013UserService\0229" +
      "\n\nCreateUser\022\027.user.CreateUserRequest\032\022." +
      "user.UserResponse\022B\n\nDeleteUser\022\034.google" +
      ".protobuf.StringValue\032\026.google.protobuf.",
      "Empty\022@\n\014GetUserByPid\022\034.google.protobuf." +
      "StringValue\032\022.user.UserResponse\022;\n\016GetUs" +
      "ersByPids\022\024.user.StringsRequest\032\023.user.U" +
      "sersResponse\0225\n\006Search\022\026.user.UserSearch" +
      "Filter\032\023.user.UsersResponse\0229\n\nUpdateUse" +
      "r\022\027.user.UserUpdateRequest\032\022.user.UserRe" +
      "sponse\022I\n\020AddPaymentMethod\022\035.user.AddPay" +
      "mentMethodRequest\032\026.google.protobuf.Empt" +
      "y\022O\n\023RemovePaymentMethod\022 .user.RemovePa" +
      "ymentMethodRequest\032\026.google.protobuf.Emp",
      "tyB\021\n\rcom.test.grpcP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_user_StringsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_StringsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_StringsRequest_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_user_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_user_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_UserResponse_descriptor,
        new java.lang.String[] { "Pid", "FullName", "Email", "Address", "PaymentMethods", });
    internal_static_user_UsersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_user_UsersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_UsersResponse_descriptor,
        new java.lang.String[] { "Users", });
    internal_static_user_CreateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_user_CreateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_CreateUserRequest_descriptor,
        new java.lang.String[] { "FullName", "Email", "Address", "PaymentMethods", "Password", });
    internal_static_user_UserUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_user_UserUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_UserUpdateRequest_descriptor,
        new java.lang.String[] { "FullName", "Email", "Address", "Pid", });
    internal_static_user_RemovePaymentMethodRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_user_RemovePaymentMethodRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_RemovePaymentMethodRequest_descriptor,
        new java.lang.String[] { "UserPid", "CreditCardNumber", });
    internal_static_user_AddPaymentMethodRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_user_AddPaymentMethodRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_AddPaymentMethodRequest_descriptor,
        new java.lang.String[] { "UserPid", "PaymentMethod", });
    internal_static_user_UserSearchFilter_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_user_UserSearchFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_UserSearchFilter_descriptor,
        new java.lang.String[] { "FullName", "Email", "Address", "Country", "Pid", "CreditCardNumber", "CreditCardType", });
    internal_static_user_ShippingAddress_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_user_ShippingAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_ShippingAddress_descriptor,
        new java.lang.String[] { "Address", "Country", });
    internal_static_user_PaymentMethod_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_user_PaymentMethod_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_PaymentMethod_descriptor,
        new java.lang.String[] { "CreditCardNumber", "CreditCardType", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
