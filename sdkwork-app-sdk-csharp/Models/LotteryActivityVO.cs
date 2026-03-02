using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class LotteryActivityVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Title { get; set; }
        public string? CoverImage { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? FreeDrawCount { get; set; }
        public int? PointsCost { get; set; }
        public List<PrizePreview>? PrizePreview { get; set; }
        public bool? CanDraw { get; set; }
    }
}
