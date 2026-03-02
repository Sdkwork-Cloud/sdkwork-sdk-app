using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SkuDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? ProductId { get; set; }
        public string? ProductName { get; set; }
        public string? SkuCode { get; set; }
        public string? SkuName { get; set; }
        public Dictionary<string, string>? Attributes { get; set; }
        public double? Price { get; set; }
        public double? OriginalPrice { get; set; }
        public int? Stock { get; set; }
        public int? WarningStock { get; set; }
        public int? Sales { get; set; }
        public string? MainImage { get; set; }
        public List<string>? Images { get; set; }
        public double? Weight { get; set; }
        public double? Volume { get; set; }
        public string? Status { get; set; }
        public int? Sort { get; set; }
    }
}
