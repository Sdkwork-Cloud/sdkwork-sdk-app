using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserSkillVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? UserSkillId { get; set; }
        public int? SkillId { get; set; }
        public bool? Enabled { get; set; }
        public Dictionary<string, object>? Config { get; set; }
        public string? InstalledAt { get; set; }
        public string? LastEnabledAt { get; set; }
        public string? LastUsedAt { get; set; }
        public int? UsedCount { get; set; }
        public SkillVO? Skill { get; set; }
    }
}
