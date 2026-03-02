using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RecentActivityVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Type { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? Url { get; set; }
        public string? Status { get; set; }
        public string? ResourceId { get; set; }
        public string? ResourceType { get; set; }
        public string? Creator { get; set; }
        public string? CreateTime { get; set; }
        public bool? Read { get; set; }
        public int? Priority { get; set; }
    }
}
