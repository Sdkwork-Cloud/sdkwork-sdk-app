using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BlockedUserVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? UserId { get; set; }
        public string? Username { get; set; }
        public string? Nickname { get; set; }
        public string? Avatar { get; set; }
        public string? BlockTime { get; set; }
        public string? BlockReason { get; set; }
    }
}
