using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FileSystemNodeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? NodeId { get; set; }
        public string? NodeUuid { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public bool? Directory { get; set; }
        public string? DiskId { get; set; }
        public string? ParentId { get; set; }
        public string? Path { get; set; }
        public string? RelativePath { get; set; }
        public string? ObjectKey { get; set; }
        public int? Size { get; set; }
        public string? MimeType { get; set; }
        public string? Extension { get; set; }
        public string? AssetType { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
        public List<string>? Tags { get; set; }
        public string? VersionId { get; set; }
        public string? UploadStatus { get; set; }
    }
}
