using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FileVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? FileId { get; set; }
        public string? FileName { get; set; }
        public int? FileSize { get; set; }
        public string? FileType { get; set; }
        public string? Extension { get; set; }
        public string? ObjectKey { get; set; }
        public string? Path { get; set; }
        public string? DiskId { get; set; }
        public string? Status { get; set; }
        public string? UploadStatus { get; set; }
        public string? ContentType { get; set; }
        public string? FileCategory { get; set; }
        public string? AssetType { get; set; }
        public string? AccessUrl { get; set; }
        public string? UploadTime { get; set; }
    }
}
