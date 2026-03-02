using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChannelAnalysisVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ChannelId { get; set; }
        public string? ChannelName { get; set; }
        public string? ChannelType { get; set; }
        public int? ClickCount { get; set; }
        public int? InstallCount { get; set; }
        public int? ActiveCount { get; set; }
        public double? ConversionRate { get; set; }
        public double? CostPerInstall { get; set; }
        public double? Roi { get; set; }
    }
}
