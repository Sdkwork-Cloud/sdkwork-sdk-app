using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RealtimeAuditVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? StreamId { get; set; }
        public string? TaskId { get; set; }
        public string? Status { get; set; }
        public bool? VideoEnabled { get; set; }
        public bool? AudioEnabled { get; set; }
        public string? PushUrl { get; set; }
        public string? StartTime { get; set; }
        public string? EstimatedEndTime { get; set; }
    }
}
