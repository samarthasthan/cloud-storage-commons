// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: file/v1/file.proto
// Protobuf Java Version: 4.29.3

package com.samarthasthan.file.v1;

public interface InitiateMultipartUploadResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:file.v1.InitiateMultipartUploadResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string file_id = 1 [json_name = "fileId"];</code>
   * @return The fileId.
   */
  java.lang.String getFileId();
  /**
   * <code>string file_id = 1 [json_name = "fileId"];</code>
   * @return The bytes for fileId.
   */
  com.google.protobuf.ByteString
      getFileIdBytes();

  /**
   * <code>string upload_id = 2 [json_name = "uploadId"];</code>
   * @return The uploadId.
   */
  java.lang.String getUploadId();
  /**
   * <code>string upload_id = 2 [json_name = "uploadId"];</code>
   * @return The bytes for uploadId.
   */
  com.google.protobuf.ByteString
      getUploadIdBytes();

  /**
   * <code>string key = 3 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 3 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();
}
