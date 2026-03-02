using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UploadInitForm
    {
        public string? FileName { get; set; }
        public int? FileSize { get; set; }
        public string? FileMd5 { get; set; }
        public string? FileType { get; set; }
        public string? UploadType { get; set; }
        public int? ChunkSize { get; set; }
        public int? TotalChunks { get; set; }
        public string? StoragePath { get; set; }
        public string? BusinessType { get; set; }
        public string? BusinessId { get; set; }
    }
}
