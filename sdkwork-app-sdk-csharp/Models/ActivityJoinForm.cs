using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ActivityJoinForm
    {
        public Dictionary<string, object>? ExtraParams { get; set; }
        public string? InviteCode { get; set; }
    }
}
