using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class LotteryPrizeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RecordId { get; set; }
        public string? LotteryId { get; set; }
        public string? LotteryTitle { get; set; }
        public string? PrizeId { get; set; }
        public string? PrizeName { get; set; }
        public string? PrizeImage { get; set; }
        public string? PrizeType { get; set; }
        public bool? IsGrandPrize { get; set; }
        public string? WinTime { get; set; }
        public string? ClaimStatus { get; set; }
        public string? ClaimTime { get; set; }
        public string? ExpireTime { get; set; }
        public bool? CanClaim { get; set; }
    }
}
