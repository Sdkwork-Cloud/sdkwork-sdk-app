using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteListQueryRequest
    {
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
        public string? SortField { get; set; }
        public string? SortOrder { get; set; }
        public string? FolderId { get; set; }
        public string? DiskId { get; set; }
        public string? Keyword { get; set; }
        public bool? IncludeArchived { get; set; }
        public bool? IncludeDeleted { get; set; }
        public bool? FavoriteOnly { get; set; }
    }
}
