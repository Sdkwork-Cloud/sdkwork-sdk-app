using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class GenerationStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TodayCount { get; set; }
        public int? WeekCount { get; set; }
        public int? MonthCount { get; set; }
        public int? TotalCount { get; set; }
        public int? AvgGenerationTime { get; set; }
        public int? MaxGenerationTime { get; set; }
        public int? MinGenerationTime { get; set; }
        public double? SuccessRate { get; set; }
        public string? MostUsedModel { get; set; }
        public GenerationTypeDistributionVO? TypeDistribution { get; set; }
    }
}
