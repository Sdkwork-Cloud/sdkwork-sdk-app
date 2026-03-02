using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AssetVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AssetId { get; set; }
        public string? AssetName { get; set; }
        public string? AssetType { get; set; }
        public string? FileType { get; set; }
        public string? MimeType { get; set; }
        public int? Size { get; set; }
        public string? Description { get; set; }
        public List<string>? Tags { get; set; }
        public string? FolderId { get; set; }
        public string? Status { get; set; }
        public ImageMediaResource? CoverImage { get; set; }
        public List<AssetMediaResource>? Assets { get; set; }
        public string? PrimaryUrl { get; set; }
        public string? ThumbnailUrl { get; set; }
    }
}
