using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InviteLinkForm
    {
        public string? InviteType { get; set; }
        public int? ExpireSeconds { get; set; }
        public string? InviteCode { get; set; }
        public string? Channel { get; set; }
    }
}
