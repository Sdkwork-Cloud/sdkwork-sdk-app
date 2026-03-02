using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CartStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? CartId { get; set; }
        public int? ItemCount { get; set; }
        public int? TotalQuantity { get; set; }
        public double? TotalPrice { get; set; }
        public int? SelectedItemCount { get; set; }
        public int? SelectedQuantity { get; set; }
        public double? SelectedPrice { get; set; }
    }
}
