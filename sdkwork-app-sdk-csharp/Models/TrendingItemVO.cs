using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TrendingItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? Cover { get; set; }
        public string? Type { get; set; }
        public string? Url { get; set; }
        public int? HotScore { get; set; }
        public double? Rating { get; set; }
        public int? Downloads { get; set; }
        public int? Favorites { get; set; }
        public int? Comments { get; set; }
        public string? Author { get; set; }
        public List<string>? Tags { get; set; }
        public string? Price { get; set; }
        public bool? IsFree { get; set; }
        public string? UpdateTime { get; set; }
    }
}
