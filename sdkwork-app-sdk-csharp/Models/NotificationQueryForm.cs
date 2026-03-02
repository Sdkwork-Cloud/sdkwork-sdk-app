using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NotificationQueryForm
    {
        public string? Type { get; set; }
        public bool? Read { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? SortBy { get; set; }
        public string? SortDirection { get; set; }
    }
}
