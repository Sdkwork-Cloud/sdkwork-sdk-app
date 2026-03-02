using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ConversionPathVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? PathId { get; set; }
        public List<string>? Steps { get; set; }
        public int? ConversionCount { get; set; }
        public double? ConversionRate { get; set; }
        public double? AverageTime { get; set; }
        public string? StartPage { get; set; }
        public string? EndPage { get; set; }
    }
}
