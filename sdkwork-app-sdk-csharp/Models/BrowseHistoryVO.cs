using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BrowseHistoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Type { get; set; }
        public string? TargetId { get; set; }
        public string? TargetName { get; set; }
        public string? TargetDescription { get; set; }
        public string? TargetIcon { get; set; }
        public string? BrowseTime { get; set; }
        public int? Duration { get; set; }
        public string? Source { get; set; }
    }
}
