using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PromptHistoryQueryForm
    {
        public int? PromptId { get; set; }
        public string? Keyword { get; set; }
        public string? Model { get; set; }
        public bool? Success { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? SortBy { get; set; }
        public string? SortDirection { get; set; }
    }
}
