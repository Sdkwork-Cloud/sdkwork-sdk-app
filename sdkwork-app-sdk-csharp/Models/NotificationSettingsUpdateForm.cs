using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NotificationSettingsUpdateForm
    {
        public bool? EnablePush { get; set; }
        public bool? EnableEmail { get; set; }
        public bool? EnableSms { get; set; }
        public bool? EnableInApp { get; set; }
        public string? QuietHoursStart { get; set; }
        public string? QuietHoursEnd { get; set; }
        public string? NotificationSound { get; set; }
        public bool? VibrationEnabled { get; set; }
    }
}
