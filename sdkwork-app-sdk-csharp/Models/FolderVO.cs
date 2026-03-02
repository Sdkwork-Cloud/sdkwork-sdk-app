using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FolderVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? FolderId { get; set; }
        public string? FolderName { get; set; }
        public string? ParentId { get; set; }
        public int? ChildCount { get; set; }
        public int? FileCount { get; set; }
    }
}
