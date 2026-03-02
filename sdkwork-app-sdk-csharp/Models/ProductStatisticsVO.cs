using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProductStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ProductId { get; set; }
        public int? TotalSales { get; set; }
        public int? TotalStock { get; set; }
        public int? ReviewCount { get; set; }
        public double? AverageRating { get; set; }
        public int? ViewCount { get; set; }
        public int? FavoriteCount { get; set; }
        public int? ShareCount { get; set; }
        public Dictionary<string, int>? SalesTrend { get; set; }
        public Dictionary<string, int>? StockTrend { get; set; }
    }
}
