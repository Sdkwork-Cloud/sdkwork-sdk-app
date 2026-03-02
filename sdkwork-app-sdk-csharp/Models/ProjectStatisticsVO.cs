using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ProjectId { get; set; }
        public int? TotalFiles { get; set; }
        public int? TotalMembers { get; set; }
        public int? TotalConversations { get; set; }
        public int? DocumentCount { get; set; }
        public int? TagCount { get; set; }
        public string? LastActivityTime { get; set; }
        public Dictionary<string, int>? ActivityStats { get; set; }
        public Dictionary<string, int>? DocumentTypeStats { get; set; }
    }
}
