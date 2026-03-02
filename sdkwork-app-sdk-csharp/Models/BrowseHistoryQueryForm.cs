using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BrowseHistoryQueryForm
    {
        public string? Type { get; set; }
        public string? TargetId { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? SortField { get; set; }
        public string? SortOrder { get; set; }
    }
}
