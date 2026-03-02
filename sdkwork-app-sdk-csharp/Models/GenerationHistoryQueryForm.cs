using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class GenerationHistoryQueryForm
    {
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
        public string? SortField { get; set; }
        public string? SortDirection { get; set; }
        public string? GenerationType { get; set; }
        public string? Status { get; set; }
        public string? Keyword { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? Size { get; set; }
        public int? Page { get; set; }
    }
}
