using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PopupNotificationVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Type { get; set; }
        public string? Icon { get; set; }
        public string? Image { get; set; }
        public string? Url { get; set; }
        public List<NotificationButtonVO>? Buttons { get; set; }
        public bool? NeedConfirm { get; set; }
        public bool? Closable { get; set; }
        public int? Duration { get; set; }
        public int? Priority { get; set; }
    }
}
