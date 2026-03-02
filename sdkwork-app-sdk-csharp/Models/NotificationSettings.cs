using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NotificationSettings
    {
        public bool? System { get; set; }
        public bool? Message { get; set; }
        public bool? Activity { get; set; }
        public bool? Promotion { get; set; }
        public bool? Sound { get; set; }
        public bool? Vibration { get; set; }
    }
}
