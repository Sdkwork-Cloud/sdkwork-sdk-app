using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InviteRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? InviteeId { get; set; }
        public string? InviteeNickname { get; set; }
        public string? InviteTime { get; set; }
        public string? Status { get; set; }
        public string? RewardAmount { get; set; }
    }
}
