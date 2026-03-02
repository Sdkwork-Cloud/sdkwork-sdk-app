using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PrivacySettingsVO
    {
        public bool? PublicProfile { get; set; }
        public bool? AllowSearch { get; set; }
        public bool? AllowFriendRequest { get; set; }
    }
}
