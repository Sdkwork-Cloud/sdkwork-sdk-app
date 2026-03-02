using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoteStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalVotes { get; set; }
        public int? Likes { get; set; }
        public int? Dislikes { get; set; }
        public int? Neutrals { get; set; }
        public string? LikeRatio { get; set; }
    }
}
