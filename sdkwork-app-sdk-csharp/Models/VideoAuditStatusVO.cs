using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VideoAuditStatusVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? Status { get; set; }
        public int? Progress { get; set; }
        public int? ProcessedDuration { get; set; }
        public int? TotalDuration { get; set; }
        public List<FrameDetection>? Detections { get; set; }
        public string? EstimatedCompleteTime { get; set; }
    }
}
