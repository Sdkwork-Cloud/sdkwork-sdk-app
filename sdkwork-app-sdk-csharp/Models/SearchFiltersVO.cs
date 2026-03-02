using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SearchFiltersVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public Dictionary<string, string>? TypeFilters { get; set; }
        public Dictionary<string, string>? DateFilters { get; set; }
        public Dictionary<string, object>? OtherFilters { get; set; }
    }
}
