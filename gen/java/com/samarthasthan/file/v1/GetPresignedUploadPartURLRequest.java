// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: file/v1/file.proto
// Protobuf Java Version: 4.29.3

package com.samarthasthan.file.v1;

/**
 * Protobuf type {@code file.v1.GetPresignedUploadPartURLRequest}
 */
public final class GetPresignedUploadPartURLRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:file.v1.GetPresignedUploadPartURLRequest)
    GetPresignedUploadPartURLRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      GetPresignedUploadPartURLRequest.class.getName());
  }
  // Use GetPresignedUploadPartURLRequest.newBuilder() to construct.
  private GetPresignedUploadPartURLRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetPresignedUploadPartURLRequest() {
    uploadId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_GetPresignedUploadPartURLRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_GetPresignedUploadPartURLRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest.class, com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest.Builder.class);
  }

  public static final int UPLOAD_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uploadId_ = "";
  /**
   * <code>string upload_id = 1 [json_name = "uploadId", (.buf.validate.field) = { ... }</code>
   * @return The uploadId.
   */
  @java.lang.Override
  public java.lang.String getUploadId() {
    java.lang.Object ref = uploadId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uploadId_ = s;
      return s;
    }
  }
  /**
   * <code>string upload_id = 1 [json_name = "uploadId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for uploadId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUploadIdBytes() {
    java.lang.Object ref = uploadId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uploadId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PART_NUMBER_FIELD_NUMBER = 2;
  private int partNumber_ = 0;
  /**
   * <code>int32 part_number = 2 [json_name = "partNumber", (.buf.validate.field) = { ... }</code>
   * @return The partNumber.
   */
  @java.lang.Override
  public int getPartNumber() {
    return partNumber_;
  }

  public static final int EXPIRES_SECS_FIELD_NUMBER = 3;
  private int expiresSecs_ = 0;
  /**
   * <code>int32 expires_secs = 3 [json_name = "expiresSecs", (.buf.validate.field) = { ... }</code>
   * @return The expiresSecs.
   */
  @java.lang.Override
  public int getExpiresSecs() {
    return expiresSecs_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(uploadId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, uploadId_);
    }
    if (partNumber_ != 0) {
      output.writeInt32(2, partNumber_);
    }
    if (expiresSecs_ != 0) {
      output.writeInt32(3, expiresSecs_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(uploadId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, uploadId_);
    }
    if (partNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, partNumber_);
    }
    if (expiresSecs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, expiresSecs_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest)) {
      return super.equals(obj);
    }
    com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest other = (com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest) obj;

    if (!getUploadId()
        .equals(other.getUploadId())) return false;
    if (getPartNumber()
        != other.getPartNumber()) return false;
    if (getExpiresSecs()
        != other.getExpiresSecs()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UPLOAD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUploadId().hashCode();
    hash = (37 * hash) + PART_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPartNumber();
    hash = (37 * hash) + EXPIRES_SECS_FIELD_NUMBER;
    hash = (53 * hash) + getExpiresSecs();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code file.v1.GetPresignedUploadPartURLRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:file.v1.GetPresignedUploadPartURLRequest)
      com.samarthasthan.file.v1.GetPresignedUploadPartURLRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_GetPresignedUploadPartURLRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_GetPresignedUploadPartURLRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest.class, com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest.Builder.class);
    }

    // Construct using com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uploadId_ = "";
      partNumber_ = 0;
      expiresSecs_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_GetPresignedUploadPartURLRequest_descriptor;
    }

    @java.lang.Override
    public com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest getDefaultInstanceForType() {
      return com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest build() {
      com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest buildPartial() {
      com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest result = new com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uploadId_ = uploadId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.partNumber_ = partNumber_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.expiresSecs_ = expiresSecs_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest) {
        return mergeFrom((com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest other) {
      if (other == com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest.getDefaultInstance()) return this;
      if (!other.getUploadId().isEmpty()) {
        uploadId_ = other.uploadId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPartNumber() != 0) {
        setPartNumber(other.getPartNumber());
      }
      if (other.getExpiresSecs() != 0) {
        setExpiresSecs(other.getExpiresSecs());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              uploadId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              partNumber_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              expiresSecs_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object uploadId_ = "";
    /**
     * <code>string upload_id = 1 [json_name = "uploadId", (.buf.validate.field) = { ... }</code>
     * @return The uploadId.
     */
    public java.lang.String getUploadId() {
      java.lang.Object ref = uploadId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uploadId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string upload_id = 1 [json_name = "uploadId", (.buf.validate.field) = { ... }</code>
     * @return The bytes for uploadId.
     */
    public com.google.protobuf.ByteString
        getUploadIdBytes() {
      java.lang.Object ref = uploadId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uploadId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string upload_id = 1 [json_name = "uploadId", (.buf.validate.field) = { ... }</code>
     * @param value The uploadId to set.
     * @return This builder for chaining.
     */
    public Builder setUploadId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uploadId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string upload_id = 1 [json_name = "uploadId", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadId() {
      uploadId_ = getDefaultInstance().getUploadId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string upload_id = 1 [json_name = "uploadId", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for uploadId to set.
     * @return This builder for chaining.
     */
    public Builder setUploadIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uploadId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int partNumber_ ;
    /**
     * <code>int32 part_number = 2 [json_name = "partNumber", (.buf.validate.field) = { ... }</code>
     * @return The partNumber.
     */
    @java.lang.Override
    public int getPartNumber() {
      return partNumber_;
    }
    /**
     * <code>int32 part_number = 2 [json_name = "partNumber", (.buf.validate.field) = { ... }</code>
     * @param value The partNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPartNumber(int value) {

      partNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 part_number = 2 [json_name = "partNumber", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPartNumber() {
      bitField0_ = (bitField0_ & ~0x00000002);
      partNumber_ = 0;
      onChanged();
      return this;
    }

    private int expiresSecs_ ;
    /**
     * <code>int32 expires_secs = 3 [json_name = "expiresSecs", (.buf.validate.field) = { ... }</code>
     * @return The expiresSecs.
     */
    @java.lang.Override
    public int getExpiresSecs() {
      return expiresSecs_;
    }
    /**
     * <code>int32 expires_secs = 3 [json_name = "expiresSecs", (.buf.validate.field) = { ... }</code>
     * @param value The expiresSecs to set.
     * @return This builder for chaining.
     */
    public Builder setExpiresSecs(int value) {

      expiresSecs_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 expires_secs = 3 [json_name = "expiresSecs", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearExpiresSecs() {
      bitField0_ = (bitField0_ & ~0x00000004);
      expiresSecs_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:file.v1.GetPresignedUploadPartURLRequest)
  }

  // @@protoc_insertion_point(class_scope:file.v1.GetPresignedUploadPartURLRequest)
  private static final com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest();
  }

  public static com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPresignedUploadPartURLRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPresignedUploadPartURLRequest>() {
    @java.lang.Override
    public GetPresignedUploadPartURLRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetPresignedUploadPartURLRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPresignedUploadPartURLRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.samarthasthan.file.v1.GetPresignedUploadPartURLRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

