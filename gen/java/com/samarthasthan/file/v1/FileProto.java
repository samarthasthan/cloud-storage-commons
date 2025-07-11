// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: file/v1/file.proto
// Protobuf Java Version: 4.29.3

package com.samarthasthan.file.v1;

public final class FileProto {
  private FileProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      FileProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_PathSegment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_PathSegment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_ListFilesByParentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_ListFilesByParentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_ListFilesByParentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_ListFilesByParentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_CreateFolderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_CreateFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_CreateFolderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_CreateFolderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_InitiateMultipartUploadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_InitiateMultipartUploadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_InitiateMultipartUploadResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_InitiateMultipartUploadResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_GetPresignedUploadPartURLRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_GetPresignedUploadPartURLRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_GetPresignedUploadPartURLResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_GetPresignedUploadPartURLResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_CompleteMultipartUploadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_CompleteMultipartUploadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_CompletedPart_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_CompletedPart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_CompleteMultipartUploadResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_CompleteMultipartUploadResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_AbortMultipartUploadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_AbortMultipartUploadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_AbortMultipartUploadResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_AbortMultipartUploadResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_file_v1_FileMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_file_v1_FileMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022file/v1/file.proto\022\007file.v1\032\037google/pr" +
      "otobuf/timestamp.proto\032\033buf/validate/val" +
      "idate.proto\"1\n\013PathSegment\022\016\n\002id\030\001 \001(\tR\002" +
      "id\022\022\n\004name\030\002 \001(\tR\004name\"s\n\030ListFilesByPar" +
      "entRequest\022\033\n\tparent_id\030\001 \001(\tR\010parentId\022" +
      "\033\n\tpage_size\030\002 \001(\005R\010pageSize\022\035\n\npage_tok" +
      "en\030\003 \001(\tR\tpageToken\"\232\001\n\031ListFilesByParen" +
      "tResponse\022(\n\004path\030\001 \003(\0132\024.file.v1.PathSe" +
      "gmentR\004path\022+\n\005files\030\002 \003(\0132\025.file.v1.Fil" +
      "eMetadataR\005files\022&\n\017next_page_token\030\003 \001(" +
      "\tR\rnextPageToken\"O\n\023CreateFolderRequest\022" +
      "\033\n\004name\030\001 \001(\tB\007\272H\004r\002\020\001R\004name\022\033\n\tparent_i" +
      "d\030\002 \001(\tR\010parentId\"E\n\024CreateFolderRespons" +
      "e\022-\n\006folder\030\001 \001(\0132\025.file.v1.FileMetadata" +
      "R\006folder\"\232\001\n\036InitiateMultipartUploadRequ" +
      "est\022\033\n\004name\030\001 \001(\tB\007\272H\004r\002\020\001R\004name\022!\n\014cont" +
      "ent_type\030\002 \001(\tR\013contentType\022\033\n\004size\030\003 \001(" +
      "\003B\007\272H\004\"\002 \000R\004size\022\033\n\tparent_id\030\004 \001(\tR\010par" +
      "entId\"i\n\037InitiateMultipartUploadResponse" +
      "\022\027\n\007file_id\030\001 \001(\tR\006fileId\022\033\n\tupload_id\030\002" +
      " \001(\tR\010uploadId\022\020\n\003key\030\003 \001(\tR\003key\"\236\001\n Get" +
      "PresignedUploadPartURLRequest\022$\n\tupload_" +
      "id\030\001 \001(\tB\007\272H\004r\002\020\001R\010uploadId\022(\n\013part_numb" +
      "er\030\002 \001(\005B\007\272H\004\032\002 \000R\npartNumber\022*\n\014expires" +
      "_secs\030\003 \001(\005B\007\272H\004\032\002 \000R\013expiresSecs\"H\n!Get" +
      "PresignedUploadPartURLResponse\022#\n\rpresig" +
      "ned_url\030\001 \001(\tR\014presignedUrl\"~\n\036CompleteM" +
      "ultipartUploadRequest\022$\n\tupload_id\030\001 \001(\t" +
      "B\007\272H\004r\002\020\001R\010uploadId\0226\n\005parts\030\002 \003(\0132\026.fil" +
      "e.v1.CompletedPartB\010\272H\005\222\001\002\010\001R\005parts\"V\n\rC" +
      "ompletedPart\022(\n\013part_number\030\001 \001(\005B\007\272H\004\032\002" +
      " \000R\npartNumber\022\033\n\004etag\030\002 \001(\tB\007\272H\004r\002\020\001R\004e" +
      "tag\"L\n\037CompleteMultipartUploadResponse\022)" +
      "\n\004file\030\001 \001(\0132\025.file.v1.FileMetadataR\004fil" +
      "e\"C\n\033AbortMultipartUploadRequest\022$\n\tuplo" +
      "ad_id\030\001 \001(\tB\007\272H\004r\002\020\001R\010uploadId\"\036\n\034AbortM" +
      "ultipartUploadResponse\"\236\003\n\014FileMetadata\022" +
      "\016\n\002id\030\001 \001(\tR\002id\022\031\n\010owner_id\030\002 \001(\tR\007owner" +
      "Id\022\022\n\004name\030\003 \001(\tR\004name\022!\n\014content_type\030\004" +
      " \001(\tR\013contentType\022\022\n\004size\030\005 \001(\003R\004size\022\033\n" +
      "\tis_public\030\006 \001(\010R\010isPublic\022\031\n\010share_id\030\007" +
      " \001(\tR\007shareId\0229\n\ncreated_at\030\010 \001(\0132\032.goog" +
      "le.protobuf.TimestampR\tcreatedAt\0229\n\nupda" +
      "ted_at\030\t \001(\0132\032.google.protobuf.Timestamp" +
      "R\tupdatedAt\0229\n\ndeleted_at\030\n \001(\0132\032.google" +
      ".protobuf.TimestampR\tdeletedAt\022\022\n\004type\030\013" +
      " \001(\tR\004type\022\033\n\tparent_id\030\014 \001(\tR\010parentId2" +
      "\353\004\n\013FileService\022l\n\027InitiateMultipartUplo" +
      "ad\022\'.file.v1.InitiateMultipartUploadRequ" +
      "est\032(.file.v1.InitiateMultipartUploadRes" +
      "ponse\022r\n\031GetPresignedUploadPartURL\022).fil" +
      "e.v1.GetPresignedUploadPartURLRequest\032*." +
      "file.v1.GetPresignedUploadPartURLRespons" +
      "e\022l\n\027CompleteMultipartUpload\022\'.file.v1.C" +
      "ompleteMultipartUploadRequest\032(.file.v1." +
      "CompleteMultipartUploadResponse\022c\n\024Abort" +
      "MultipartUpload\022$.file.v1.AbortMultipart" +
      "UploadRequest\032%.file.v1.AbortMultipartUp" +
      "loadResponse\022K\n\014CreateFolder\022\034.file.v1.C" +
      "reateFolderRequest\032\035.file.v1.CreateFolde" +
      "rResponse\022Z\n\021ListFilesByParent\022!.file.v1" +
      ".ListFilesByParentRequest\032\".file.v1.List" +
      "FilesByParentResponseB\251\001\n\031com.samarthast" +
      "han.file.v1B\tFileProtoP\001ZDgithub.com/sam" +
      "arthasthan/cloud-storage-commons/gen/go/" +
      "file/v1;filev1\242\002\003FXX\252\002\007File.V1\312\002\007File\\V1" +
      "\342\002\023File\\V1\\GPBMetadata\352\002\010File::V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_file_v1_PathSegment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_file_v1_PathSegment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_PathSegment_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_file_v1_ListFilesByParentRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_file_v1_ListFilesByParentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_ListFilesByParentRequest_descriptor,
        new java.lang.String[] { "ParentId", "PageSize", "PageToken", });
    internal_static_file_v1_ListFilesByParentResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_file_v1_ListFilesByParentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_ListFilesByParentResponse_descriptor,
        new java.lang.String[] { "Path", "Files", "NextPageToken", });
    internal_static_file_v1_CreateFolderRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_file_v1_CreateFolderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_CreateFolderRequest_descriptor,
        new java.lang.String[] { "Name", "ParentId", });
    internal_static_file_v1_CreateFolderResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_file_v1_CreateFolderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_CreateFolderResponse_descriptor,
        new java.lang.String[] { "Folder", });
    internal_static_file_v1_InitiateMultipartUploadRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_file_v1_InitiateMultipartUploadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_InitiateMultipartUploadRequest_descriptor,
        new java.lang.String[] { "Name", "ContentType", "Size", "ParentId", });
    internal_static_file_v1_InitiateMultipartUploadResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_file_v1_InitiateMultipartUploadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_InitiateMultipartUploadResponse_descriptor,
        new java.lang.String[] { "FileId", "UploadId", "Key", });
    internal_static_file_v1_GetPresignedUploadPartURLRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_file_v1_GetPresignedUploadPartURLRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_GetPresignedUploadPartURLRequest_descriptor,
        new java.lang.String[] { "UploadId", "PartNumber", "ExpiresSecs", });
    internal_static_file_v1_GetPresignedUploadPartURLResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_file_v1_GetPresignedUploadPartURLResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_GetPresignedUploadPartURLResponse_descriptor,
        new java.lang.String[] { "PresignedUrl", });
    internal_static_file_v1_CompleteMultipartUploadRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_file_v1_CompleteMultipartUploadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_CompleteMultipartUploadRequest_descriptor,
        new java.lang.String[] { "UploadId", "Parts", });
    internal_static_file_v1_CompletedPart_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_file_v1_CompletedPart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_CompletedPart_descriptor,
        new java.lang.String[] { "PartNumber", "Etag", });
    internal_static_file_v1_CompleteMultipartUploadResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_file_v1_CompleteMultipartUploadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_CompleteMultipartUploadResponse_descriptor,
        new java.lang.String[] { "File", });
    internal_static_file_v1_AbortMultipartUploadRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_file_v1_AbortMultipartUploadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_AbortMultipartUploadRequest_descriptor,
        new java.lang.String[] { "UploadId", });
    internal_static_file_v1_AbortMultipartUploadResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_file_v1_AbortMultipartUploadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_AbortMultipartUploadResponse_descriptor,
        new java.lang.String[] { });
    internal_static_file_v1_FileMetadata_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_file_v1_FileMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_file_v1_FileMetadata_descriptor,
        new java.lang.String[] { "Id", "OwnerId", "Name", "ContentType", "Size", "IsPublic", "ShareId", "CreatedAt", "UpdatedAt", "DeletedAt", "Type", "ParentId", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.TimestampProto.getDescriptor();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
