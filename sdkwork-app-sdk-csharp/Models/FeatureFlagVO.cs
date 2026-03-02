using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FeatureFlagVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? FeatureKey { get; set; }
        public string? FeatureName { get; set; }
        public bool? Enabled { get; set; }
        public object? Value { get; set; }
        public string? Description { get; set; }
    }
}
