using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AiUsageStatsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? StatsId { get; set; }
        public string? ModelName { get; set; }
        public int? PromptTokens { get; set; }
        public int? CompletionTokens { get; set; }
        public int? TotalTokens { get; set; }
        public int? RequestCount { get; set; }
        public int? ErrorCount { get; set; }
        public string? Date { get; set; }
        public string? UserId { get; set; }
    }
}
