using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DataExportVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? Status { get; set; }
        public string? DownloadUrl { get; set; }
        public string? FileSize { get; set; }
        public string? EstimatedCompletionTime { get; set; }
        public int? Progress { get; set; }
        public string? ErrorMessage { get; set; }
    }
}
