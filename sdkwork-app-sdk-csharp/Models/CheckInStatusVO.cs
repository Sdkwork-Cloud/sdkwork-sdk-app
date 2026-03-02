using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CheckInStatusVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? CheckedInToday { get; set; }
        public int? ConsecutiveDays { get; set; }
        public int? MonthlyCheckInCount { get; set; }
        public List<string>? MonthlyCheckInDates { get; set; }
        public List<string>? MissedDates { get; set; }
        public CheckInReward? TodayReward { get; set; }
        public CheckInReward? TomorrowReward { get; set; }
        public int? MakeUpCost { get; set; }
        public int? RemainingMakeUpCount { get; set; }
    }
}
