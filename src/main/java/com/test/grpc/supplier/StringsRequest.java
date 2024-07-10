// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: supplier/supplier.proto

package com.test.grpc.supplier;

/**
 * Protobuf type {@code supplier.StringsRequest}
 */
public  final class StringsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:supplier.StringsRequest)
    StringsRequestOrBuilder {
  // Use StringsRequest.newBuilder() to construct.
  private StringsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StringsRequest() {
    request_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StringsRequest(
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
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              request_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            request_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        request_ = request_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Supplier.internal_static_supplier_StringsRequest_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Supplier.internal_static_supplier_StringsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            StringsRequest.class, Builder.class);
  }

  public static final int REQUEST_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList request_;
  /**
   * <code>repeated string request = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getRequestList() {
    return request_;
  }
  /**
   * <code>repeated string request = 1;</code>
   */
  public int getRequestCount() {
    return request_.size();
  }
  /**
   * <code>repeated string request = 1;</code>
   */
  public String getRequest(int index) {
    return request_.get(index);
  }
  /**
   * <code>repeated string request = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRequestBytes(int index) {
    return request_.getByteString(index);
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
    for (int i = 0; i < request_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, request_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < request_.size(); i++) {
        dataSize += computeStringSizeNoTag(request_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRequestList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof StringsRequest)) {
      return super.equals(obj);
    }
    StringsRequest other = (StringsRequest) obj;

    boolean result = true;
    result = result && getRequestList()
        .equals(other.getRequestList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRequestCount() > 0) {
      hash = (37 * hash) + REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getRequestList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static StringsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StringsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StringsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StringsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StringsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StringsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StringsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StringsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static StringsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static StringsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static StringsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StringsRequest parseFrom(
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
  public static Builder newBuilder(StringsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code supplier.StringsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:supplier.StringsRequest)
      StringsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Supplier.internal_static_supplier_StringsRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Supplier.internal_static_supplier_StringsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StringsRequest.class, Builder.class);
    }

    // Construct using com.test.grpc.supplier.StringsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      request_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Supplier.internal_static_supplier_StringsRequest_descriptor;
    }

    public StringsRequest getDefaultInstanceForType() {
      return StringsRequest.getDefaultInstance();
    }

    public StringsRequest build() {
      StringsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public StringsRequest buildPartial() {
      StringsRequest result = new StringsRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        request_ = request_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.request_ = request_;
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
      if (other instanceof StringsRequest) {
        return mergeFrom((StringsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(StringsRequest other) {
      if (other == StringsRequest.getDefaultInstance()) return this;
      if (!other.request_.isEmpty()) {
        if (request_.isEmpty()) {
          request_ = other.request_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureRequestIsMutable();
          request_.addAll(other.request_);
        }
        onChanged();
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
      StringsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (StringsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList request_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureRequestIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        request_ = new com.google.protobuf.LazyStringArrayList(request_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string request = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getRequestList() {
      return request_.getUnmodifiableView();
    }
    /**
     * <code>repeated string request = 1;</code>
     */
    public int getRequestCount() {
      return request_.size();
    }
    /**
     * <code>repeated string request = 1;</code>
     */
    public String getRequest(int index) {
      return request_.get(index);
    }
    /**
     * <code>repeated string request = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRequestBytes(int index) {
      return request_.getByteString(index);
    }
    /**
     * <code>repeated string request = 1;</code>
     */
    public Builder setRequest(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRequestIsMutable();
      request_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string request = 1;</code>
     */
    public Builder addRequest(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRequestIsMutable();
      request_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string request = 1;</code>
     */
    public Builder addAllRequest(
        Iterable<String> values) {
      ensureRequestIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, request_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string request = 1;</code>
     */
    public Builder clearRequest() {
      request_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string request = 1;</code>
     */
    public Builder addRequestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureRequestIsMutable();
      request_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:supplier.StringsRequest)
  }

  // @@protoc_insertion_point(class_scope:supplier.StringsRequest)
  private static final StringsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StringsRequest();
  }

  public static StringsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StringsRequest>
      PARSER = new com.google.protobuf.AbstractParser<StringsRequest>() {
    public StringsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StringsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StringsRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<StringsRequest> getParserForType() {
    return PARSER;
  }

  public StringsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

