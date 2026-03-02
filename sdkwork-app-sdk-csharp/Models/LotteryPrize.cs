using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class LotteryPrize
    {
        public string? PrizeId { get; set; }
        public string? Name { get; set; }
        public string? Image { get; set; }
        public string? Probability { get; set; }
        public bool? IsGrandPrize { get; set; }
        public int? RemainingCount { get; set; }
    }
}
