using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PromptVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Type { get; set; }
        public string? BizType { get; set; }
        public string? Description { get; set; }
        public int? CateId { get; set; }
        public bool? Enabled { get; set; }
        public int? Sort { get; set; }
        public Dictionary<string, object>? Parameters { get; set; }
        public string? Creator { get; set; }
        public string? Model { get; set; }
        public TagsContent? Tags { get; set; }
        public int? UsageCount { get; set; }
        public int? AvgResponseTime { get; set; }
        public string? Version { get; set; }
        public bool? IsPublic { get; set; }
        public bool? IsFavorite { get; set; }
        public int? FavoriteCount { get; set; }
        public string? LastUsedAt { get; set; }
    }
}
