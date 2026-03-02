using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PointsGoodsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Image { get; set; }
        public string? Category { get; set; }
        public int? Points { get; set; }
        public int? OriginalPoints { get; set; }
        public int? Stock { get; set; }
        public bool? Exchangeable { get; set; }
        public int? LimitPerUser { get; set; }
        public int? ExchangedCount { get; set; }
        public List<string>? Tags { get; set; }
        public int? SortWeight { get; set; }
    }
}
