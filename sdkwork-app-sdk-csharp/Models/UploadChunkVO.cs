using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UploadChunkVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? UploadId { get; set; }
        public int? ChunkIndex { get; set; }
        public int? ChunkSize { get; set; }
        public string? Status { get; set; }
        public bool? Success { get; set; }
        public string? ErrorMsg { get; set; }
        public string? ChunkMd5 { get; set; }
        public int? UploadedSize { get; set; }
        public int? RemainingChunks { get; set; }
        public int? Progress { get; set; }
    }
}
