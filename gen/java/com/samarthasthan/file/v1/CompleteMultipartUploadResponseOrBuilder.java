// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: file/v1/file.proto
// Protobuf Java Version: 4.29.3

package com.samarthasthan.file.v1;

public interface CompleteMultipartUploadResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:file.v1.CompleteMultipartUploadResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.file.v1.FileMetadata file = 1 [json_name = "file"];</code>
   * @return Whether the file field is set.
   */
  boolean hasFile();
  /**
   * <code>.file.v1.FileMetadata file = 1 [json_name = "file"];</code>
   * @return The file.
   */
  com.samarthasthan.file.v1.FileMetadata getFile();
  /**
   * <code>.file.v1.FileMetadata file = 1 [json_name = "file"];</code>
   */
  com.samarthasthan.file.v1.FileMetadataOrBuilder getFileOrBuilder();
}
