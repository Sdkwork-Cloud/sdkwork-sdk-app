using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CharacterVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? CharacterId { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public string? Description { get; set; }
        public ImageMediaResource? Avatar { get; set; }
        public string? Status { get; set; }
        public int? AgentId { get; set; }
        public bool? IsPublic { get; set; }
        public int? UsageCount { get; set; }
        public int? LikeCount { get; set; }
    }
}
