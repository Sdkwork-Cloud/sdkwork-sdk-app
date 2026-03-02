using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NotificationTypeSettingsForm
    {
        public string? Type { get; set; }
        public bool? Enabled { get; set; }
        public string? PushMethod { get; set; }
        public bool? NeedReminder { get; set; }
    }
}
