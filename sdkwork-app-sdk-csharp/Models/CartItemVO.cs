using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CartItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ItemId { get; set; }
        public string? Uuid { get; set; }
        public string? CartId { get; set; }
        public string? CartGroupUuid { get; set; }
        public string? ProductId { get; set; }
        public string? SkuId { get; set; }
        public string? SkuName { get; set; }
        public string? SkuCode { get; set; }
        public string? SkuImage { get; set; }
        public double? SkuPrice { get; set; }
        public int? Quantity { get; set; }
        public double? Price { get; set; }
        public double? TotalPrice { get; set; }
        public bool? Selected { get; set; }
    }
}
