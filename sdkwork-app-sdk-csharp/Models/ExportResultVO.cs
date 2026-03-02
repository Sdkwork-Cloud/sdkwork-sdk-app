using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExportResultVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ExportId { get; set; }
        public string? ReportType { get; set; }
        public string? Status { get; set; }
        public string? DownloadUrl { get; set; }
        public int? FileSize { get; set; }
        public string? CompletedAt { get; set; }
        public string? ErrorMessage { get; set; }
    }
}
