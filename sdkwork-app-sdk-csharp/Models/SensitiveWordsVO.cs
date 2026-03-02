using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SensitiveWordsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? HasSensitiveWords { get; set; }
        public int? Count { get; set; }
        public List<WordHit>? Words { get; set; }
        public string? ProcessedText { get; set; }
        public string? RiskLevel { get; set; }
    }
}
