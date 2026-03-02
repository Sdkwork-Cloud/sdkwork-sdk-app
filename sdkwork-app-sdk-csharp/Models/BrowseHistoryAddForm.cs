using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BrowseHistoryAddForm
    {
        public string? Type { get; set; }
        public string? TargetId { get; set; }
        public string? TargetName { get; set; }
        public string? TargetDescription { get; set; }
        public string? TargetIcon { get; set; }
        public int? Duration { get; set; }
        public string? Source { get; set; }
    }
}
