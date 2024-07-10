// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.test.grpc;

/**
 * Protobuf type {@code user.AddPaymentMethodRequest}
 */
public  final class AddPaymentMethodRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user.AddPaymentMethodRequest)
    AddPaymentMethodRequestOrBuilder {
  // Use AddPaymentMethodRequest.newBuilder() to construct.
  private AddPaymentMethodRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddPaymentMethodRequest() {
    userPid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AddPaymentMethodRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            userPid_ = s;
            break;
          }
          case 18: {
            com.test.grpc.PaymentMethod.Builder subBuilder = null;
            if (paymentMethod_ != null) {
              subBuilder = paymentMethod_.toBuilder();
            }
            paymentMethod_ = input.readMessage(com.test.grpc.PaymentMethod.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(paymentMethod_);
              paymentMethod_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.test.grpc.User.internal_static_user_AddPaymentMethodRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.test.grpc.User.internal_static_user_AddPaymentMethodRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.test.grpc.AddPaymentMethodRequest.class, com.test.grpc.AddPaymentMethodRequest.Builder.class);
  }

  public static final int USERPID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userPid_;
  /**
   * <code>string userPid = 1;</code>
   */
  public java.lang.String getUserPid() {
    java.lang.Object ref = userPid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userPid_ = s;
      return s;
    }
  }
  /**
   * <code>string userPid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserPidBytes() {
    java.lang.Object ref = userPid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userPid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYMENTMETHOD_FIELD_NUMBER = 2;
  private com.test.grpc.PaymentMethod paymentMethod_;
  /**
   * <code>.user.PaymentMethod paymentMethod = 2;</code>
   */
  public boolean hasPaymentMethod() {
    return paymentMethod_ != null;
  }
  /**
   * <code>.user.PaymentMethod paymentMethod = 2;</code>
   */
  public com.test.grpc.PaymentMethod getPaymentMethod() {
    return paymentMethod_ == null ? com.test.grpc.PaymentMethod.getDefaultInstance() : paymentMethod_;
  }
  /**
   * <code>.user.PaymentMethod paymentMethod = 2;</code>
   */
  public com.test.grpc.PaymentMethodOrBuilder getPaymentMethodOrBuilder() {
    return getPaymentMethod();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserPidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userPid_);
    }
    if (paymentMethod_ != null) {
      output.writeMessage(2, getPaymentMethod());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserPidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userPid_);
    }
    if (paymentMethod_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPaymentMethod());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.test.grpc.AddPaymentMethodRequest)) {
      return super.equals(obj);
    }
    com.test.grpc.AddPaymentMethodRequest other = (com.test.grpc.AddPaymentMethodRequest) obj;

    boolean result = true;
    result = result && getUserPid()
        .equals(other.getUserPid());
    result = result && (hasPaymentMethod() == other.hasPaymentMethod());
    if (hasPaymentMethod()) {
      result = result && getPaymentMethod()
          .equals(other.getPaymentMethod());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERPID_FIELD_NUMBER;
    hash = (53 * hash) + getUserPid().hashCode();
    if (hasPaymentMethod()) {
      hash = (37 * hash) + PAYMENTMETHOD_FIELD_NUMBER;
      hash = (53 * hash) + getPaymentMethod().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.test.grpc.AddPaymentMethodRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.test.grpc.AddPaymentMethodRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.test.grpc.AddPaymentMethodRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code user.AddPaymentMethodRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.AddPaymentMethodRequest)
      com.test.grpc.AddPaymentMethodRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.test.grpc.User.internal_static_user_AddPaymentMethodRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.test.grpc.User.internal_static_user_AddPaymentMethodRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.test.grpc.AddPaymentMethodRequest.class, com.test.grpc.AddPaymentMethodRequest.Builder.class);
    }

    // Construct using com.test.grpc.AddPaymentMethodRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      userPid_ = "";

      if (paymentMethodBuilder_ == null) {
        paymentMethod_ = null;
      } else {
        paymentMethod_ = null;
        paymentMethodBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.test.grpc.User.internal_static_user_AddPaymentMethodRequest_descriptor;
    }

    public com.test.grpc.AddPaymentMethodRequest getDefaultInstanceForType() {
      return com.test.grpc.AddPaymentMethodRequest.getDefaultInstance();
    }

    public com.test.grpc.AddPaymentMethodRequest build() {
      com.test.grpc.AddPaymentMethodRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.test.grpc.AddPaymentMethodRequest buildPartial() {
      com.test.grpc.AddPaymentMethodRequest result = new com.test.grpc.AddPaymentMethodRequest(this);
      result.userPid_ = userPid_;
      if (paymentMethodBuilder_ == null) {
        result.paymentMethod_ = paymentMethod_;
      } else {
        result.paymentMethod_ = paymentMethodBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.test.grpc.AddPaymentMethodRequest) {
        return mergeFrom((com.test.grpc.AddPaymentMethodRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.test.grpc.AddPaymentMethodRequest other) {
      if (other == com.test.grpc.AddPaymentMethodRequest.getDefaultInstance()) return this;
      if (!other.getUserPid().isEmpty()) {
        userPid_ = other.userPid_;
        onChanged();
      }
      if (other.hasPaymentMethod()) {
        mergePaymentMethod(other.getPaymentMethod());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.test.grpc.AddPaymentMethodRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.test.grpc.AddPaymentMethodRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userPid_ = "";
    /**
     * <code>string userPid = 1;</code>
     */
    public java.lang.String getUserPid() {
      java.lang.Object ref = userPid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userPid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userPid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserPidBytes() {
      java.lang.Object ref = userPid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userPid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userPid = 1;</code>
     */
    public Builder setUserPid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userPid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userPid = 1;</code>
     */
    public Builder clearUserPid() {
      
      userPid_ = getDefaultInstance().getUserPid();
      onChanged();
      return this;
    }
    /**
     * <code>string userPid = 1;</code>
     */
    public Builder setUserPidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userPid_ = value;
      onChanged();
      return this;
    }

    private com.test.grpc.PaymentMethod paymentMethod_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.test.grpc.PaymentMethod, com.test.grpc.PaymentMethod.Builder, com.test.grpc.PaymentMethodOrBuilder> paymentMethodBuilder_;
    /**
     * <code>.user.PaymentMethod paymentMethod = 2;</code>
     */
    public boolean hasPaymentMethod() {
      return paymentMethodBuilder_ != null || paymentMethod_ != null;
    }
    /**
     * <code>.user.PaymentMethod paymentMethod = 2;</code>
     */
    public com.test.grpc.PaymentMethod getPaymentMethod() {
      if (paymentMethodBuilder_ == null) {
        return paymentMethod_ == null ? com.test.grpc.PaymentMethod.getDefaultInstance() : paymentMethod_;
      } else {
        return paymentMethodBuilder_.getMessage();
      }
    }
    /**
     * <code>.user.PaymentMethod paymentMethod = 2;</code>
     */
    public Builder setPaymentMethod(com.test.grpc.PaymentMethod value) {
      if (paymentMethodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        paymentMethod_ = value;
        onChanged();
      } else {
        paymentMethodBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.user.PaymentMethod paymentMethod = 2;</code>
     */
    public Builder setPaymentMethod(
        com.test.grpc.PaymentMethod.Builder builderForValue) {
      if (paymentMethodBuilder_ == null) {
        paymentMethod_ = builderForValue.build();
        onChanged();
      } else {
        paymentMethodBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.user.PaymentMethod paymentMethod = 2;</code>
     */
    public Builder mergePaymentMethod(com.test.grpc.PaymentMethod value) {
      if (paymentMethodBuilder_ == null) {
        if (paymentMethod_ != null) {
          paymentMethod_ =
            com.test.grpc.PaymentMethod.newBuilder(paymentMethod_).mergeFrom(value).buildPartial();
        } else {
          paymentMethod_ = value;
        }
        onChanged();
      } else {
        paymentMethodBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.user.PaymentMethod paymentMethod = 2;</code>
     */
    public Builder clearPaymentMethod() {
      if (paymentMethodBuilder_ == null) {
        paymentMethod_ = null;
        onChanged();
      } else {
        paymentMethod_ = null;
        paymentMethodBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.user.PaymentMethod paymentMethod = 2;</code>
     */
    public com.test.grpc.PaymentMethod.Builder getPaymentMethodBuilder() {
      
      onChanged();
      return getPaymentMethodFieldBuilder().getBuilder();
    }
    /**
     * <code>.user.PaymentMethod paymentMethod = 2;</code>
     */
    public com.test.grpc.PaymentMethodOrBuilder getPaymentMethodOrBuilder() {
      if (paymentMethodBuilder_ != null) {
        return paymentMethodBuilder_.getMessageOrBuilder();
      } else {
        return paymentMethod_ == null ?
            com.test.grpc.PaymentMethod.getDefaultInstance() : paymentMethod_;
      }
    }
    /**
     * <code>.user.PaymentMethod paymentMethod = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.test.grpc.PaymentMethod, com.test.grpc.PaymentMethod.Builder, com.test.grpc.PaymentMethodOrBuilder> 
        getPaymentMethodFieldBuilder() {
      if (paymentMethodBuilder_ == null) {
        paymentMethodBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.test.grpc.PaymentMethod, com.test.grpc.PaymentMethod.Builder, com.test.grpc.PaymentMethodOrBuilder>(
                getPaymentMethod(),
                getParentForChildren(),
                isClean());
        paymentMethod_ = null;
      }
      return paymentMethodBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:user.AddPaymentMethodRequest)
  }

  // @@protoc_insertion_point(class_scope:user.AddPaymentMethodRequest)
  private static final com.test.grpc.AddPaymentMethodRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.test.grpc.AddPaymentMethodRequest();
  }

  public static com.test.grpc.AddPaymentMethodRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddPaymentMethodRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddPaymentMethodRequest>() {
    public AddPaymentMethodRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddPaymentMethodRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddPaymentMethodRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddPaymentMethodRequest> getParserForType() {
    return PARSER;
  }

  public com.test.grpc.AddPaymentMethodRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

