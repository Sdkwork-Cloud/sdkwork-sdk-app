using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class GenerationStyleVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? StyleId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public bool? IsPublic { get; set; }
        public string? Status { get; set; }
        public int? UsageCount { get; set; }
        public string? CoverImageUrl { get; set; }
    }
}
