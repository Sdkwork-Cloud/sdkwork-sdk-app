using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RankInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Rank { get; set; }
        public string? UserId { get; set; }
        public string? Username { get; set; }
        public int? Score { get; set; }
        public string? Avatar { get; set; }
        public bool? IsCurrentUser { get; set; }
    }
}
