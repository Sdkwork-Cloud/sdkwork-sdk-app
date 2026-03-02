using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NotificationButtonVO
    {
        public string? Text { get; set; }
        public string? Type { get; set; }
        public string? Url { get; set; }
        public string? Action { get; set; }
        public bool? CloseOnClick { get; set; }
    }
}
