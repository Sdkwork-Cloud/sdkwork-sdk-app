using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DriveItemListForm
    {
        public string? Keyword { get; set; }
        public string? AssetType { get; set; }
        public string? FolderId { get; set; }
        public string? DiskId { get; set; }
        public string? SortField { get; set; }
        public string? SortDirection { get; set; }
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
    }
}
