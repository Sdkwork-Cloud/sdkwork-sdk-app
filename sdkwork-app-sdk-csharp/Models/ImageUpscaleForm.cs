using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageUpscaleForm
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
        public int? Scale { get; set; }
        public int? TargetWidth { get; set; }
        public int? TargetHeight { get; set; }
        public string? Format { get; set; }
        public string? Type { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
