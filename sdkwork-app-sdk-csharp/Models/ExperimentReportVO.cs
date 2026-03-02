using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExperimentReportVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ExperimentKey { get; set; }
        public string? ReportType { get; set; }
        public Dictionary<string, object>? ReportData { get; set; }
        public string? GeneratedAt { get; set; }
        public string? Version { get; set; }
    }
}
