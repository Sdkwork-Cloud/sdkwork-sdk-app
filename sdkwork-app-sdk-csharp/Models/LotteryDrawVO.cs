using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class LotteryDrawVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? IsWin { get; set; }
        public string? PrizeId { get; set; }
        public string? PrizeName { get; set; }
        public string? PrizeImage { get; set; }
        public string? PrizeType { get; set; }
        public bool? IsGrandPrize { get; set; }
        public string? WinTime { get; set; }
        public string? RecordId { get; set; }
        public int? RemainingFreeCount { get; set; }
        public int? PointsCost { get; set; }
        public string? Message { get; set; }
    }
}
