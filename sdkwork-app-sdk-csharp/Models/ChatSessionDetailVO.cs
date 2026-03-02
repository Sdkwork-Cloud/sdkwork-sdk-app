using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChatSessionDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? UserId { get; set; }
        public string? ModelId { get; set; }
        public string? SystemPrompt { get; set; }
        public double? Temperature { get; set; }
        public int? MaxTokens { get; set; }
        public double? TopP { get; set; }
        public int? MessageCount { get; set; }
        public int? UnreadCount { get; set; }
        public string? LastMessageTime { get; set; }
        public string? LastMessageContent { get; set; }
        public string? ResourceId { get; set; }
        public string? ResourceType { get; set; }
        public string? CreateTime { get; set; }
        public string? UpdateTime { get; set; }
        public Dictionary<string, object>? Extra { get; set; }
        public SessionStatsVO? Stats { get; set; }
    }
}
