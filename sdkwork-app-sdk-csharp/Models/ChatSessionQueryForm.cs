using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChatSessionQueryForm
    {
        public int? SessionId { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? SortBy { get; set; }
        public string? SortDirection { get; set; }
        public bool? IncludeMessageCount { get; set; }
    }
}
