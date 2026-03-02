using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ContentAuditVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? ContentId { get; set; }
        public string? OverallResult { get; set; }
        public string? RiskLevel { get; set; }
        public Dictionary<string, AuditResultItem>? Results { get; set; }
        public TextAuditVO? TextResult { get; set; }
        public List<ImageAuditVO>? ImageResults { get; set; }
        public VideoAuditVO? VideoResult { get; set; }
        public AudioAuditVO? AudioResult { get; set; }
        public string? Suggestion { get; set; }
    }
}
