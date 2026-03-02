using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShortcutVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Icon { get; set; }
        public string? Url { get; set; }
        public string? Type { get; set; }
        public int? Sort { get; set; }
        public string? Group { get; set; }
        public string? Description { get; set; }
        public bool? IsDefault { get; set; }
        public bool? Enabled { get; set; }
        public int? UsageCount { get; set; }
        public string? LastUsedAt { get; set; }
    }
}
