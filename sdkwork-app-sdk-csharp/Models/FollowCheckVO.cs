using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FollowCheckVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? IsFollowing { get; set; }
        public string? FollowTime { get; set; }
        public bool? IsFollowedBy { get; set; }
    }
}
