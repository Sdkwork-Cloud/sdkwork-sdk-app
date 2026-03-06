using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SkillMarketQueryForm
    {
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
        public string? SortField { get; set; }
        public string? SortDirection { get; set; }
        public int? CategoryId { get; set; }
        public int? PackageId { get; set; }
        public string? Keyword { get; set; }
        public string? SortBy { get; set; }
        public int? Size { get; set; }
        public int? Page { get; set; }
    }
}
