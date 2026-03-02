using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FileSystemNodeListForm
    {
        public string? DiskId { get; set; }
        public string? ParentId { get; set; }
        public string? Keyword { get; set; }
        public string? SortField { get; set; }
        public string? SortOrder { get; set; }
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
    }
}
