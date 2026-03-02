using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NotificationVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? NotificationId { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? Source { get; set; }
        public string? Link { get; set; }
        public bool? IsRead { get; set; }
        public string? ReadAt { get; set; }
    }
}
