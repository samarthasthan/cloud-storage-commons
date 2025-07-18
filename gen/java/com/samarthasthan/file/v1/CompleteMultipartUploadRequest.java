// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: file/v1/file.proto
// Protobuf Java Version: 4.29.3

package com.samarthasthan.file.v1;

/**
 * Protobuf type {@code file.v1.CompleteMultipartUploadRequest}
 */
public final class CompleteMultipartUploadRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:file.v1.CompleteMultipartUploadRequest)
    CompleteMultipartUploadRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      CompleteMultipartUploadRequest.class.getName());
  }
  // Use CompleteMultipartUploadRequest.newBuilder() to construct.
  private CompleteMultipartUploadRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CompleteMultipartUploadRequest() {
    uploadId_ = "";
    parts_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_CompleteMultipartUploadRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_CompleteMultipartUploadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.samarthasthan.file.v1.CompleteMultipartUploadRequest.class, com.samarthasthan.file.v1.CompleteMultipartUploadRequest.Builder.class);
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

  public static final int PARTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.samarthasthan.file.v1.CompletedPart> parts_;
  /**
   * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<com.samarthasthan.file.v1.CompletedPart> getPartsList() {
    return parts_;
  }
  /**
   * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.samarthasthan.file.v1.CompletedPartOrBuilder> 
      getPartsOrBuilderList() {
    return parts_;
  }
  /**
   * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public int getPartsCount() {
    return parts_.size();
  }
  /**
   * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.samarthasthan.file.v1.CompletedPart getParts(int index) {
    return parts_.get(index);
  }
  /**
   * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.samarthasthan.file.v1.CompletedPartOrBuilder getPartsOrBuilder(
      int index) {
    return parts_.get(index);
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
    for (int i = 0; i < parts_.size(); i++) {
      output.writeMessage(2, parts_.get(i));
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
    for (int i = 0; i < parts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, parts_.get(i));
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
    if (!(obj instanceof com.samarthasthan.file.v1.CompleteMultipartUploadRequest)) {
      return super.equals(obj);
    }
    com.samarthasthan.file.v1.CompleteMultipartUploadRequest other = (com.samarthasthan.file.v1.CompleteMultipartUploadRequest) obj;

    if (!getUploadId()
        .equals(other.getUploadId())) return false;
    if (!getPartsList()
        .equals(other.getPartsList())) return false;
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
    if (getPartsCount() > 0) {
      hash = (37 * hash) + PARTS_FIELD_NUMBER;
      hash = (53 * hash) + getPartsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest parseFrom(
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
  public static Builder newBuilder(com.samarthasthan.file.v1.CompleteMultipartUploadRequest prototype) {
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
   * Protobuf type {@code file.v1.CompleteMultipartUploadRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:file.v1.CompleteMultipartUploadRequest)
      com.samarthasthan.file.v1.CompleteMultipartUploadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_CompleteMultipartUploadRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_CompleteMultipartUploadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.samarthasthan.file.v1.CompleteMultipartUploadRequest.class, com.samarthasthan.file.v1.CompleteMultipartUploadRequest.Builder.class);
    }

    // Construct using com.samarthasthan.file.v1.CompleteMultipartUploadRequest.newBuilder()
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
      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
      } else {
        parts_ = null;
        partsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.samarthasthan.file.v1.FileProto.internal_static_file_v1_CompleteMultipartUploadRequest_descriptor;
    }

    @java.lang.Override
    public com.samarthasthan.file.v1.CompleteMultipartUploadRequest getDefaultInstanceForType() {
      return com.samarthasthan.file.v1.CompleteMultipartUploadRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.samarthasthan.file.v1.CompleteMultipartUploadRequest build() {
      com.samarthasthan.file.v1.CompleteMultipartUploadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.samarthasthan.file.v1.CompleteMultipartUploadRequest buildPartial() {
      com.samarthasthan.file.v1.CompleteMultipartUploadRequest result = new com.samarthasthan.file.v1.CompleteMultipartUploadRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.samarthasthan.file.v1.CompleteMultipartUploadRequest result) {
      if (partsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          parts_ = java.util.Collections.unmodifiableList(parts_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.parts_ = parts_;
      } else {
        result.parts_ = partsBuilder_.build();
      }
    }

    private void buildPartial0(com.samarthasthan.file.v1.CompleteMultipartUploadRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uploadId_ = uploadId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.samarthasthan.file.v1.CompleteMultipartUploadRequest) {
        return mergeFrom((com.samarthasthan.file.v1.CompleteMultipartUploadRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.samarthasthan.file.v1.CompleteMultipartUploadRequest other) {
      if (other == com.samarthasthan.file.v1.CompleteMultipartUploadRequest.getDefaultInstance()) return this;
      if (!other.getUploadId().isEmpty()) {
        uploadId_ = other.uploadId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (partsBuilder_ == null) {
        if (!other.parts_.isEmpty()) {
          if (parts_.isEmpty()) {
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePartsIsMutable();
            parts_.addAll(other.parts_);
          }
          onChanged();
        }
      } else {
        if (!other.parts_.isEmpty()) {
          if (partsBuilder_.isEmpty()) {
            partsBuilder_.dispose();
            partsBuilder_ = null;
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000002);
            partsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPartsFieldBuilder() : null;
          } else {
            partsBuilder_.addAllMessages(other.parts_);
          }
        }
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
            case 18: {
              com.samarthasthan.file.v1.CompletedPart m =
                  input.readMessage(
                      com.samarthasthan.file.v1.CompletedPart.parser(),
                      extensionRegistry);
              if (partsBuilder_ == null) {
                ensurePartsIsMutable();
                parts_.add(m);
              } else {
                partsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private java.util.List<com.samarthasthan.file.v1.CompletedPart> parts_ =
      java.util.Collections.emptyList();
    private void ensurePartsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        parts_ = new java.util.ArrayList<com.samarthasthan.file.v1.CompletedPart>(parts_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.samarthasthan.file.v1.CompletedPart, com.samarthasthan.file.v1.CompletedPart.Builder, com.samarthasthan.file.v1.CompletedPartOrBuilder> partsBuilder_;

    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<com.samarthasthan.file.v1.CompletedPart> getPartsList() {
      if (partsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parts_);
      } else {
        return partsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public int getPartsCount() {
      if (partsBuilder_ == null) {
        return parts_.size();
      } else {
        return partsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public com.samarthasthan.file.v1.CompletedPart getParts(int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);
      } else {
        return partsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public Builder setParts(
        int index, com.samarthasthan.file.v1.CompletedPart value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.set(index, value);
        onChanged();
      } else {
        partsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public Builder setParts(
        int index, com.samarthasthan.file.v1.CompletedPart.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.set(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public Builder addParts(com.samarthasthan.file.v1.CompletedPart value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(value);
        onChanged();
      } else {
        partsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public Builder addParts(
        int index, com.samarthasthan.file.v1.CompletedPart value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(index, value);
        onChanged();
      } else {
        partsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public Builder addParts(
        com.samarthasthan.file.v1.CompletedPart.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public Builder addParts(
        int index, com.samarthasthan.file.v1.CompletedPart.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public Builder addAllParts(
        java.lang.Iterable<? extends com.samarthasthan.file.v1.CompletedPart> values) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parts_);
        onChanged();
      } else {
        partsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearParts() {
      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        partsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public Builder removeParts(int index) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.remove(index);
        onChanged();
      } else {
        partsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public com.samarthasthan.file.v1.CompletedPart.Builder getPartsBuilder(
        int index) {
      return getPartsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public com.samarthasthan.file.v1.CompletedPartOrBuilder getPartsOrBuilder(
        int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);  } else {
        return partsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<? extends com.samarthasthan.file.v1.CompletedPartOrBuilder> 
         getPartsOrBuilderList() {
      if (partsBuilder_ != null) {
        return partsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parts_);
      }
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public com.samarthasthan.file.v1.CompletedPart.Builder addPartsBuilder() {
      return getPartsFieldBuilder().addBuilder(
          com.samarthasthan.file.v1.CompletedPart.getDefaultInstance());
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public com.samarthasthan.file.v1.CompletedPart.Builder addPartsBuilder(
        int index) {
      return getPartsFieldBuilder().addBuilder(
          index, com.samarthasthan.file.v1.CompletedPart.getDefaultInstance());
    }
    /**
     * <code>repeated .file.v1.CompletedPart parts = 2 [json_name = "parts", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<com.samarthasthan.file.v1.CompletedPart.Builder> 
         getPartsBuilderList() {
      return getPartsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.samarthasthan.file.v1.CompletedPart, com.samarthasthan.file.v1.CompletedPart.Builder, com.samarthasthan.file.v1.CompletedPartOrBuilder> 
        getPartsFieldBuilder() {
      if (partsBuilder_ == null) {
        partsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.samarthasthan.file.v1.CompletedPart, com.samarthasthan.file.v1.CompletedPart.Builder, com.samarthasthan.file.v1.CompletedPartOrBuilder>(
                parts_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        parts_ = null;
      }
      return partsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:file.v1.CompleteMultipartUploadRequest)
  }

  // @@protoc_insertion_point(class_scope:file.v1.CompleteMultipartUploadRequest)
  private static final com.samarthasthan.file.v1.CompleteMultipartUploadRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.samarthasthan.file.v1.CompleteMultipartUploadRequest();
  }

  public static com.samarthasthan.file.v1.CompleteMultipartUploadRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteMultipartUploadRequest>
      PARSER = new com.google.protobuf.AbstractParser<CompleteMultipartUploadRequest>() {
    @java.lang.Override
    public CompleteMultipartUploadRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompleteMultipartUploadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteMultipartUploadRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.samarthasthan.file.v1.CompleteMultipartUploadRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

