using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PointsGoodsDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public List<string>? Images { get; set; }
        public string? Category { get; set; }
        public int? Points { get; set; }
        public int? OriginalPoints { get; set; }
        public int? Stock { get; set; }
        public bool? Exchangeable { get; set; }
        public int? LimitPerUser { get; set; }
        public int? MyExchangedCount { get; set; }
        public string? ExchangeNote { get; set; }
        public string? ValidUntil { get; set; }
        public string? UsageInstructions { get; set; }
    }
}
