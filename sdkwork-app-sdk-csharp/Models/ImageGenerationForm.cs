using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageGenerationForm
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
        public int? Width { get; set; }
        public int? Height { get; set; }
        public string? Size { get; set; }
        public string? Quality { get; set; }
        public string? Style { get; set; }
        public string? Format { get; set; }
        public double? CfgScale { get; set; }
        public int? Steps { get; set; }
        public string? Sampler { get; set; }
        public double? Strength { get; set; }
        public List<AssetMediaResource>? MaskAssets { get; set; }
        public bool? SafetyChecker { get; set; }
        public string? AspectRatio { get; set; }
        public string? Type { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
