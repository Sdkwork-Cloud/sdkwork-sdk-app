using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FollowVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public bool? IsFollowing { get; set; }
        public string? UserId { get; set; }
    }
}
