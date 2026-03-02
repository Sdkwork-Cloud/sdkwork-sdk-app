using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UploadInitVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? UploadId { get; set; }
        public string? FileName { get; set; }
        public int? FileSize { get; set; }
        public int? ChunkSize { get; set; }
        public int? TotalChunks { get; set; }
        public string? StoragePath { get; set; }
        public string? UploadUrl { get; set; }
        public object? UploadParams { get; set; }
        public List<int>? UploadedChunks { get; set; }
        public int? ExpireTime { get; set; }
        public bool? SupportResume { get; set; }
        public string? UploadType { get; set; }
    }
}
