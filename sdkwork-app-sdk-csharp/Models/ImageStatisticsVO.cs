using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalImages { get; set; }
        public int? CompletedImages { get; set; }
        public int? ProcessingImages { get; set; }
    }
}
