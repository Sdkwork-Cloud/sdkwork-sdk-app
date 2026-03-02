using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class StyleStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalStyles { get; set; }
        public int? ActiveStyles { get; set; }
        public int? ImageStyles { get; set; }
        public int? VideoStyles { get; set; }
        public int? MusicStyles { get; set; }
    }
}
