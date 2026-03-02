using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageAuditVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? Result { get; set; }
        public string? RiskLevel { get; set; }
        public double? Confidence { get; set; }
        public List<ImageDetectionDetail>? Details { get; set; }
        public List<Region>? ViolationRegions { get; set; }
        public string? Suggestion { get; set; }
    }
}
