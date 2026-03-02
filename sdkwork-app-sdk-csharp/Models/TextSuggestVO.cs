using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TextSuggestVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? OriginalText { get; set; }
        public string? SuggestedText { get; set; }
        public int? ReplacementCount { get; set; }
        public List<ReplacementPosition>? Positions { get; set; }
        public List<string>? AlternativeSuggestions { get; set; }
    }
}
