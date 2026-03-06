using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FeedCreateForm
    {
        public string? Content { get; set; }
        public string? Title { get; set; }
        public int? CategoryId { get; set; }
        public List<string>? Images { get; set; }
        public string? Source { get; set; }
        public string? SourceUrl { get; set; }
    }
}
