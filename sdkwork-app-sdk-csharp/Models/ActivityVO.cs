using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ActivityVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Title { get; set; }
        public string? Subtitle { get; set; }
        public string? Type { get; set; }
        public string? CoverImage { get; set; }
        public string? Status { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public bool? HasJoined { get; set; }
        public int? MaxJoinCount { get; set; }
        public int? JoinedCount { get; set; }
        public List<string>? Tags { get; set; }
    }
}
