using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VideoAuditVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? Status { get; set; }
        public string? VideoUrl { get; set; }
        public int? Duration { get; set; }
        public string? Result { get; set; }
        public string? RiskLevel { get; set; }
        public List<KeyFrameResult>? KeyFrameResults { get; set; }
        public AudioAuditVO? AudioResult { get; set; }
        public string? Suggestion { get; set; }
    }
}
