using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class LotteryDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Rules { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? FreeDrawCount { get; set; }
        public int? RemainingFreeCount { get; set; }
        public int? PointsCost { get; set; }
        public int? MyPoints { get; set; }
        public List<LotteryPrize>? Prizes { get; set; }
        public List<RecentWinner>? RecentWinners { get; set; }
    }
}
