using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PromptQueryForm
    {
        public string? Keyword { get; set; }
        public string? Type { get; set; }
        public string? BizType { get; set; }
        public bool? Enabled { get; set; }
        public string? Model { get; set; }
        public bool? IsPublic { get; set; }
        public bool? IsFavorite { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? SortBy { get; set; }
        public string? SortDirection { get; set; }
    }
}
