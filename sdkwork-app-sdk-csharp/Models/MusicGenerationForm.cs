using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicGenerationForm
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
        public string? Lyrics { get; set; }
        public int? Duration { get; set; }
        public string? Genre { get; set; }
        public string? Style { get; set; }
        public int? Tempo { get; set; }
        public string? Key { get; set; }
        public string? Mood { get; set; }
        public string? Instruments { get; set; }
        public string? Format { get; set; }
        public string? Type { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
