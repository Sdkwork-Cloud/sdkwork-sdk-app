using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ModelInfoDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ModelId { get; set; }
        public string? Model { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Channel { get; set; }
        public string? Vendor { get; set; }
        public string? ModelType { get; set; }
        public string? Family { get; set; }
        public string? Version { get; set; }
        public bool? OpenSource { get; set; }
        public string? ApiEndpoint { get; set; }
        public string? OwnedBy { get; set; }
        public SceneContent? Scenes { get; set; }
        public TagsContent? Tags { get; set; }
        public ModelLimitInfo? LimitInfo { get; set; }
        public ModelPrice? PriceInfo { get; set; }
        public ModelMetadata? Metadata { get; set; }
        public double? DefaultTemperature { get; set; }
        public double? DefaultTopP { get; set; }
        public double? DefaultFrequencyPenalty { get; set; }
        public double? DefaultPresencePenalty { get; set; }
        public string? Status { get; set; }
        public int? UsageCount { get; set; }
        public int? TotalTokens { get; set; }
        public int? AvgResponseTime { get; set; }
    }
}
