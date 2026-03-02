using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InviteRulesVO
    {
        public string? Title { get; set; }
        public string? Description { get; set; }
        public int? InviterReward { get; set; }
        public int? InviteeReward { get; set; }
        public List<string>? Rules { get; set; }
    }
}
