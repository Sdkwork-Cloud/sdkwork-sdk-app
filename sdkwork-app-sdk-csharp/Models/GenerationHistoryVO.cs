using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class GenerationHistoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Type { get; set; }
        public string? TaskId { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
        public int? Duration { get; set; }
        public string? ResultUrl { get; set; }
        public string? ResultPreview { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public string? ModelName { get; set; }
        public int? TokenUsage { get; set; }
    }
}
