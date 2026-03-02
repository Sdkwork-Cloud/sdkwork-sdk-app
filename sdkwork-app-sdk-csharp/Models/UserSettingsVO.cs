using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserSettingsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Theme { get; set; }
        public string? Language { get; set; }
        public NotificationSettingsVO? NotificationSettings { get; set; }
        public PrivacySettingsVO? PrivacySettings { get; set; }
    }
}
