using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserSettingsUpdateForm
    {
        public NotificationSettings? NotificationSettings { get; set; }
        public PrivacySettings? PrivacySettings { get; set; }
        public string? Language { get; set; }
        public string? Theme { get; set; }
        public bool? AutoPlay { get; set; }
        public bool? HighQuality { get; set; }
        public bool? DataSaver { get; set; }
        public DownloadSettings? DownloadSettings { get; set; }
    }
}
