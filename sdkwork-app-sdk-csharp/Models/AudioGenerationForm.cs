using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AudioGenerationForm
    {
        public string? Title { get; set; }
        public string? Prompt { get; set; }
        public string? NegativePrompt { get; set; }
        public string? Model { get; set; }
        public string? Channel { get; set; }
        public List<AssetMediaResource>? ReferenceAssets { get; set; }
        public int? N { get; set; }
        public int? Seed { get; set; }
        public bool? Async { get; set; }
        public string? CallbackUrl { get; set; }
        public Dictionary<string, object>? ExtraParams { get; set; }
        public string? BizScene { get; set; }
        public int? BizId { get; set; }
        public int? ConversationId { get; set; }
        public int? MessageId { get; set; }
        public string? Text { get; set; }
        public string? Voice { get; set; }
        public string? Language { get; set; }
        public double? Speed { get; set; }
        public double? Pitch { get; set; }
        public int? Volume { get; set; }
        public string? Format { get; set; }
        public string? Emotion { get; set; }
        public string? Type { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
