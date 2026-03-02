using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SkuStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ProductId { get; set; }
        public string? ProductName { get; set; }
        public int? TotalSkuCount { get; set; }
        public int? EnabledSkuCount { get; set; }
        public int? DisabledSkuCount { get; set; }
        public int? TotalStock { get; set; }
        public int? TotalSales { get; set; }
        public double? AveragePrice { get; set; }
        public int? WarningStockCount { get; set; }
        public Dictionary<string, int>? StockTrend { get; set; }
        public Dictionary<string, int>? SalesTrend { get; set; }
    }
}
