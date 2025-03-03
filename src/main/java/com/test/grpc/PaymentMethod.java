// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.test.grpc;

/**
 * Protobuf type {@code user.PaymentMethod}
 */
public  final class PaymentMethod extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user.PaymentMethod)
    PaymentMethodOrBuilder {
  // Use PaymentMethod.newBuilder() to construct.
  private PaymentMethod(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaymentMethod() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PaymentMethod(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (creditCardNumber_ != null) {
              subBuilder = creditCardNumber_.toBuilder();
            }
            creditCardNumber_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(creditCardNumber_);
              creditCardNumber_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (creditCardType_ != null) {
              subBuilder = creditCardType_.toBuilder();
            }
            creditCardType_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(creditCardType_);
              creditCardType_ = subBuilder.buildPartial();
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
    return com.test.grpc.User.internal_static_user_PaymentMethod_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.test.grpc.User.internal_static_user_PaymentMethod_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.test.grpc.PaymentMethod.class, com.test.grpc.PaymentMethod.Builder.class);
  }

  public static final int CREDITCARDNUMBER_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue creditCardNumber_;
  /**
   * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
   */
  public boolean hasCreditCardNumber() {
    return creditCardNumber_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
   */
  public com.google.protobuf.StringValue getCreditCardNumber() {
    return creditCardNumber_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : creditCardNumber_;
  }
  /**
   * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getCreditCardNumberOrBuilder() {
    return getCreditCardNumber();
  }

  public static final int CREDITCARDTYPE_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue creditCardType_;
  /**
   * <code>.google.protobuf.StringValue creditCardType = 2;</code>
   */
  public boolean hasCreditCardType() {
    return creditCardType_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue creditCardType = 2;</code>
   */
  public com.google.protobuf.StringValue getCreditCardType() {
    return creditCardType_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : creditCardType_;
  }
  /**
   * <code>.google.protobuf.StringValue creditCardType = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getCreditCardTypeOrBuilder() {
    return getCreditCardType();
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
    if (creditCardNumber_ != null) {
      output.writeMessage(1, getCreditCardNumber());
    }
    if (creditCardType_ != null) {
      output.writeMessage(2, getCreditCardType());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (creditCardNumber_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCreditCardNumber());
    }
    if (creditCardType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreditCardType());
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
    if (!(obj instanceof com.test.grpc.PaymentMethod)) {
      return super.equals(obj);
    }
    com.test.grpc.PaymentMethod other = (com.test.grpc.PaymentMethod) obj;

    boolean result = true;
    result = result && (hasCreditCardNumber() == other.hasCreditCardNumber());
    if (hasCreditCardNumber()) {
      result = result && getCreditCardNumber()
          .equals(other.getCreditCardNumber());
    }
    result = result && (hasCreditCardType() == other.hasCreditCardType());
    if (hasCreditCardType()) {
      result = result && getCreditCardType()
          .equals(other.getCreditCardType());
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
    if (hasCreditCardNumber()) {
      hash = (37 * hash) + CREDITCARDNUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getCreditCardNumber().hashCode();
    }
    if (hasCreditCardType()) {
      hash = (37 * hash) + CREDITCARDTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCreditCardType().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.test.grpc.PaymentMethod parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.grpc.PaymentMethod parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.grpc.PaymentMethod parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.grpc.PaymentMethod parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.grpc.PaymentMethod parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.grpc.PaymentMethod parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.grpc.PaymentMethod parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.test.grpc.PaymentMethod parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.test.grpc.PaymentMethod parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.test.grpc.PaymentMethod parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.test.grpc.PaymentMethod parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.test.grpc.PaymentMethod parseFrom(
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
  public static Builder newBuilder(com.test.grpc.PaymentMethod prototype) {
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
   * Protobuf type {@code user.PaymentMethod}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.PaymentMethod)
      com.test.grpc.PaymentMethodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.test.grpc.User.internal_static_user_PaymentMethod_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.test.grpc.User.internal_static_user_PaymentMethod_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.test.grpc.PaymentMethod.class, com.test.grpc.PaymentMethod.Builder.class);
    }

    // Construct using com.test.grpc.PaymentMethod.newBuilder()
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
      if (creditCardNumberBuilder_ == null) {
        creditCardNumber_ = null;
      } else {
        creditCardNumber_ = null;
        creditCardNumberBuilder_ = null;
      }
      if (creditCardTypeBuilder_ == null) {
        creditCardType_ = null;
      } else {
        creditCardType_ = null;
        creditCardTypeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.test.grpc.User.internal_static_user_PaymentMethod_descriptor;
    }

    public com.test.grpc.PaymentMethod getDefaultInstanceForType() {
      return com.test.grpc.PaymentMethod.getDefaultInstance();
    }

    public com.test.grpc.PaymentMethod build() {
      com.test.grpc.PaymentMethod result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.test.grpc.PaymentMethod buildPartial() {
      com.test.grpc.PaymentMethod result = new com.test.grpc.PaymentMethod(this);
      if (creditCardNumberBuilder_ == null) {
        result.creditCardNumber_ = creditCardNumber_;
      } else {
        result.creditCardNumber_ = creditCardNumberBuilder_.build();
      }
      if (creditCardTypeBuilder_ == null) {
        result.creditCardType_ = creditCardType_;
      } else {
        result.creditCardType_ = creditCardTypeBuilder_.build();
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
      if (other instanceof com.test.grpc.PaymentMethod) {
        return mergeFrom((com.test.grpc.PaymentMethod)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.test.grpc.PaymentMethod other) {
      if (other == com.test.grpc.PaymentMethod.getDefaultInstance()) return this;
      if (other.hasCreditCardNumber()) {
        mergeCreditCardNumber(other.getCreditCardNumber());
      }
      if (other.hasCreditCardType()) {
        mergeCreditCardType(other.getCreditCardType());
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
      com.test.grpc.PaymentMethod parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.test.grpc.PaymentMethod) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue creditCardNumber_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> creditCardNumberBuilder_;
    /**
     * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
     */
    public boolean hasCreditCardNumber() {
      return creditCardNumberBuilder_ != null || creditCardNumber_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
     */
    public com.google.protobuf.StringValue getCreditCardNumber() {
      if (creditCardNumberBuilder_ == null) {
        return creditCardNumber_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : creditCardNumber_;
      } else {
        return creditCardNumberBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
     */
    public Builder setCreditCardNumber(com.google.protobuf.StringValue value) {
      if (creditCardNumberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        creditCardNumber_ = value;
        onChanged();
      } else {
        creditCardNumberBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
     */
    public Builder setCreditCardNumber(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (creditCardNumberBuilder_ == null) {
        creditCardNumber_ = builderForValue.build();
        onChanged();
      } else {
        creditCardNumberBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
     */
    public Builder mergeCreditCardNumber(com.google.protobuf.StringValue value) {
      if (creditCardNumberBuilder_ == null) {
        if (creditCardNumber_ != null) {
          creditCardNumber_ =
            com.google.protobuf.StringValue.newBuilder(creditCardNumber_).mergeFrom(value).buildPartial();
        } else {
          creditCardNumber_ = value;
        }
        onChanged();
      } else {
        creditCardNumberBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
     */
    public Builder clearCreditCardNumber() {
      if (creditCardNumberBuilder_ == null) {
        creditCardNumber_ = null;
        onChanged();
      } else {
        creditCardNumber_ = null;
        creditCardNumberBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getCreditCardNumberBuilder() {
      
      onChanged();
      return getCreditCardNumberFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getCreditCardNumberOrBuilder() {
      if (creditCardNumberBuilder_ != null) {
        return creditCardNumberBuilder_.getMessageOrBuilder();
      } else {
        return creditCardNumber_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : creditCardNumber_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue creditCardNumber = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getCreditCardNumberFieldBuilder() {
      if (creditCardNumberBuilder_ == null) {
        creditCardNumberBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getCreditCardNumber(),
                getParentForChildren(),
                isClean());
        creditCardNumber_ = null;
      }
      return creditCardNumberBuilder_;
    }

    private com.google.protobuf.StringValue creditCardType_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> creditCardTypeBuilder_;
    /**
     * <code>.google.protobuf.StringValue creditCardType = 2;</code>
     */
    public boolean hasCreditCardType() {
      return creditCardTypeBuilder_ != null || creditCardType_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardType = 2;</code>
     */
    public com.google.protobuf.StringValue getCreditCardType() {
      if (creditCardTypeBuilder_ == null) {
        return creditCardType_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : creditCardType_;
      } else {
        return creditCardTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue creditCardType = 2;</code>
     */
    public Builder setCreditCardType(com.google.protobuf.StringValue value) {
      if (creditCardTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        creditCardType_ = value;
        onChanged();
      } else {
        creditCardTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardType = 2;</code>
     */
    public Builder setCreditCardType(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (creditCardTypeBuilder_ == null) {
        creditCardType_ = builderForValue.build();
        onChanged();
      } else {
        creditCardTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardType = 2;</code>
     */
    public Builder mergeCreditCardType(com.google.protobuf.StringValue value) {
      if (creditCardTypeBuilder_ == null) {
        if (creditCardType_ != null) {
          creditCardType_ =
            com.google.protobuf.StringValue.newBuilder(creditCardType_).mergeFrom(value).buildPartial();
        } else {
          creditCardType_ = value;
        }
        onChanged();
      } else {
        creditCardTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardType = 2;</code>
     */
    public Builder clearCreditCardType() {
      if (creditCardTypeBuilder_ == null) {
        creditCardType_ = null;
        onChanged();
      } else {
        creditCardType_ = null;
        creditCardTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue creditCardType = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getCreditCardTypeBuilder() {
      
      onChanged();
      return getCreditCardTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue creditCardType = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getCreditCardTypeOrBuilder() {
      if (creditCardTypeBuilder_ != null) {
        return creditCardTypeBuilder_.getMessageOrBuilder();
      } else {
        return creditCardType_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : creditCardType_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue creditCardType = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getCreditCardTypeFieldBuilder() {
      if (creditCardTypeBuilder_ == null) {
        creditCardTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getCreditCardType(),
                getParentForChildren(),
                isClean());
        creditCardType_ = null;
      }
      return creditCardTypeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:user.PaymentMethod)
  }

  // @@protoc_insertion_point(class_scope:user.PaymentMethod)
  private static final com.test.grpc.PaymentMethod DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.test.grpc.PaymentMethod();
  }

  public static com.test.grpc.PaymentMethod getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaymentMethod>
      PARSER = new com.google.protobuf.AbstractParser<PaymentMethod>() {
    public PaymentMethod parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PaymentMethod(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaymentMethod> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaymentMethod> getParserForType() {
    return PARSER;
  }

  public com.test.grpc.PaymentMethod getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

