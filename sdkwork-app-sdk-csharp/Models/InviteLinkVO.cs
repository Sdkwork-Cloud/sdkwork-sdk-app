using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InviteLinkVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? InviteLink { get; set; }
        public string? InviteCode { get; set; }
        public string? ExpireTime { get; set; }
        public string? QrCode { get; set; }
    }
}
