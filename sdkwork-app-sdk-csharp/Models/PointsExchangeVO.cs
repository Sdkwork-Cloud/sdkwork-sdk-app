using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PointsExchangeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RecordId { get; set; }
        public bool? Success { get; set; }
        public string? GoodsName { get; set; }
        public int? PointsCost { get; set; }
        public int? RemainingPoints { get; set; }
        public int? Quantity { get; set; }
        public string? ExchangeTime { get; set; }
        public string? Status { get; set; }
        public string? RewardContent { get; set; }
        public string? Message { get; set; }
    }
}
