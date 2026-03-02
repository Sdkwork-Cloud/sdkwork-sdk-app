using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AchievementRewardVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public int? Amount { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? Status { get; set; }
        public string? ClaimedAt { get; set; }
    }
}
