using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DriveItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ItemId { get; set; }
        public string? ItemUuid { get; set; }
        public string? ItemName { get; set; }
        public string? FileType { get; set; }
        public bool? Directory { get; set; }
        public string? AssetType { get; set; }
        public string? MimeType { get; set; }
        public string? Extension { get; set; }
        public int? Size { get; set; }
        public string? ParentId { get; set; }
        public string? Path { get; set; }
        public string? ObjectKey { get; set; }
        public string? Status { get; set; }
        public FileMediaResource? Resource { get; set; }
        public ImageMediaResource? CoverImage { get; set; }
    }
}
