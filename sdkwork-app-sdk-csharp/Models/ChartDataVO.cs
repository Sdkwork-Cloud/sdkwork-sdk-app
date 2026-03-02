using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChartDataVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Type { get; set; }
        public string? Title { get; set; }
        public List<string>? Labels { get; set; }
        public List<DatasetVO>? Datasets { get; set; }
        public ChartConfigVO? Config { get; set; }
    }
}
