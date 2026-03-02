using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipInviteRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public int? InviteeId { get; set; }
        public string? InviteeNickname { get; set; }
        public string? InviteeAvatar { get; set; }
        public string? Status { get; set; }
        public int? RewardPoints { get; set; }
        public string? InvitedAt { get; set; }
        public string? CompletedAt { get; set; }
    }
}
