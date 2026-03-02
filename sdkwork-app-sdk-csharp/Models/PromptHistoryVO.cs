using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PromptHistoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public int? PromptId { get; set; }
        public string? PromptTitle { get; set; }
        public string? PromptContent { get; set; }
        public string? UsedContent { get; set; }
        public string? ResponseContent { get; set; }
        public string? Model { get; set; }
        public int? Duration { get; set; }
        public int? InputTokens { get; set; }
        public int? OutputTokens { get; set; }
        public bool? Success { get; set; }
        public string? ErrorMessage { get; set; }
    }
}
