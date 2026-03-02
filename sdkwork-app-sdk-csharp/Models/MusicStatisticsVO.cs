using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalMusic { get; set; }
        public int? CompletedMusic { get; set; }
        public int? ProcessingMusic { get; set; }
    }
}
