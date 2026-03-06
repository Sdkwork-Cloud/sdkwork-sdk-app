using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DriveItemDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ItemId { get; set; }
        public string? ItemUuid { get; set; }
        public string? ItemName { get; set; }
        public string? FileType { get; set; }
        public bool? Directory { get; set; }
        public string? AssetType { get; set; }
        public string? MimeType { get; set; }
        public string? Extension { get; set; }
        public int? Size { get; set; }
        public string? ParentId { get; set; }
        public string? Path { get; set; }
        public string? ObjectKey { get; set; }
        public string? Status { get; set; }
        public bool? Favorited { get; set; }
        public FileMediaResource? Resource { get; set; }
        public ImageMediaResource? CoverImage { get; set; }
        public string? DiskId { get; set; }
        public string? UploadStatus { get; set; }
        public string? Description { get; set; }
        public string? Author { get; set; }
        public string? VersionId { get; set; }
        public string? ReferenceFileId { get; set; }
        public string? WorkspaceId { get; set; }
        public string? ProjectId { get; set; }
        public string? Etag { get; set; }
    }
}
