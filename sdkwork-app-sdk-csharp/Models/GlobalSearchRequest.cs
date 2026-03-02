using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class GlobalSearchRequest
    {
        public string? Keyword { get; set; }
        public string? Type { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
    }
}
