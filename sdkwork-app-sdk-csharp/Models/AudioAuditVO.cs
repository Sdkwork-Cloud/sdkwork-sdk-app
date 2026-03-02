using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AudioAuditVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? Result { get; set; }
        public string? RiskLevel { get; set; }
        public int? Duration { get; set; }
        public string? Transcript { get; set; }
        public List<ViolationSegment>? ViolationSegments { get; set; }
        public string? Suggestion { get; set; }
    }
}
