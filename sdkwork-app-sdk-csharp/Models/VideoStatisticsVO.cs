using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VideoStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalVideos { get; set; }
        public int? CompletedVideos { get; set; }
        public int? ProcessingVideos { get; set; }
    }
}
