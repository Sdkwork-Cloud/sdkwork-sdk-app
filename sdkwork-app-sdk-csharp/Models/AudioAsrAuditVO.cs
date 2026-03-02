using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AudioAsrAuditVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? FullText { get; set; }
        public List<TimestampedSegment>? Segments { get; set; }
        public TextAuditVO? TextAuditResult { get; set; }
        public string? OverallResult { get; set; }
        public string? Language { get; set; }
    }
}
