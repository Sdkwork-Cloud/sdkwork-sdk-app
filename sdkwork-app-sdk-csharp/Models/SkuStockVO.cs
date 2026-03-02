using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SkuStockVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? SkuId { get; set; }
        public string? ProductId { get; set; }
        public string? SkuCode { get; set; }
        public string? SkuName { get; set; }
        public int? Quantity { get; set; }
        public int? WarningStock { get; set; }
        public int? LockedStock { get; set; }
        public int? AvailableStock { get; set; }
        public string? Status { get; set; }
    }
}
