using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NotificationTypeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Type { get; set; }
        public string? Name { get; set; }
        public bool? Enabled { get; set; }
        public string? PushMethod { get; set; }
        public bool? NeedReminder { get; set; }
        public string? Description { get; set; }
    }
}
