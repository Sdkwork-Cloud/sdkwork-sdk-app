using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AuditRecordDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RecordId { get; set; }
        public string? ContentId { get; set; }
        public string? ContentType { get; set; }
        public string? OriginalContent { get; set; }
        public string? ProcessedContent { get; set; }
        public string? UserId { get; set; }
        public string? Result { get; set; }
        public string? RiskLevel { get; set; }
        public double? Confidence { get; set; }
        public List<DetectionResult>? DetectionResults { get; set; }
        public List<string>? CheckTypes { get; set; }
        public string? Scene { get; set; }
        public Dictionary<string, object>? DeviceInfo { get; set; }
        public string? IpAddress { get; set; }
        public string? Location { get; set; }
        public string? AuditTime { get; set; }
        public int? ProcessTime { get; set; }
        public bool? HasAppeal { get; set; }
    }
}
