using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectQueryForm
    {
        public string? WorkspaceId { get; set; }
        public string? Keyword { get; set; }
        public string? ProjectName { get; set; }
        public string? Type { get; set; }
        public List<string>? ProjectTags { get; set; }
        public string? Status { get; set; }
        public string? CreatorId { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public string? SortField { get; set; }
        public string? SortDirection { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
    }
}
