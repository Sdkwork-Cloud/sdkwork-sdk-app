using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RecommendationVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Type { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? Image { get; set; }
        public string? Url { get; set; }
        public double? Rating { get; set; }
        public int? HotScore { get; set; }
        public string? Reason { get; set; }
        public List<string>? Scenarios { get; set; }
        public List<string>? Tags { get; set; }
        public bool? IsFree { get; set; }
        public string? Price { get; set; }
        public int? Priority { get; set; }
    }
}
