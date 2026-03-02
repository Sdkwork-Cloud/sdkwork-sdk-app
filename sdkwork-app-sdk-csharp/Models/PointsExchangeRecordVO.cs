using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PointsExchangeRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RecordId { get; set; }
        public string? GoodsId { get; set; }
        public string? GoodsName { get; set; }
        public string? GoodsImage { get; set; }
        public int? Quantity { get; set; }
        public int? PointsCost { get; set; }
        public string? ExchangeTime { get; set; }
        public string? Status { get; set; }
        public string? DeliverTime { get; set; }
        public string? LogisticsInfo { get; set; }
        public string? Remark { get; set; }
    }
}
