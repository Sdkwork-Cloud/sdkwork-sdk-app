using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SearchSuggestionVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Keyword { get; set; }
        public string? Type { get; set; }
        public int? Count { get; set; }
    }
}
