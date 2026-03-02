using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExportVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? FileUrl { get; set; }
        public string? FileName { get; set; }
        public int? FileSize { get; set; }
        public string? Status { get; set; }
        public string? Format { get; set; }
        public int? ExportCount { get; set; }
        public string? ExpireTime { get; set; }
    }
}
