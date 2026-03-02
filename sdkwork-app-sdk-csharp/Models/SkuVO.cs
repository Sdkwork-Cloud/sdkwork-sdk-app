using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SkuVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? ProductId { get; set; }
        public string? SkuCode { get; set; }
        public string? SkuName { get; set; }
        public Dictionary<string, string>? Attributes { get; set; }
        public double? Price { get; set; }
        public double? OriginalPrice { get; set; }
        public int? Stock { get; set; }
        public int? Sales { get; set; }
        public string? Image { get; set; }
        public string? Status { get; set; }
        public int? Sort { get; set; }
    }
}
