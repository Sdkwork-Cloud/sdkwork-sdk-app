using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TextAuditVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? Result { get; set; }
        public string? RiskLevel { get; set; }
        public double? Confidence { get; set; }
        public List<DetectionDetail>? Details { get; set; }
        public List<string>? SensitiveWords { get; set; }
        public string? Suggestion { get; set; }
        public string? ProcessedText { get; set; }
    }
}
