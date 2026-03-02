using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PrivacySettings
    {
        public bool? PublicProfile { get; set; }
        public bool? AllowSearch { get; set; }
        public bool? AllowFriendRequest { get; set; }
        public bool? AllowStrangerMessage { get; set; }
        public bool? LocationShare { get; set; }
    }
}
