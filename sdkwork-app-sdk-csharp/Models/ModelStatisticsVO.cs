using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ModelStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalModels { get; set; }
        public int? ActiveModels { get; set; }
        public int? ChatModels { get; set; }
        public int? ImageModels { get; set; }
        public int? AudioModels { get; set; }
    }
}
