using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SensitiveWordListVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ListId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public int? WordCount { get; set; }
        public List<string>? Categories { get; set; }
        public string? Version { get; set; }
        public bool? Enabled { get; set; }
    }
}
