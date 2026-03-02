using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AchievementVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? Level { get; set; }
        public string? Status { get; set; }
        public string? UnlockedAt { get; set; }
        public int? Progress { get; set; }
        public int? Target { get; set; }
        public string? Type { get; set; }
        public int? Points { get; set; }
        public int? Sort { get; set; }
    }
}
