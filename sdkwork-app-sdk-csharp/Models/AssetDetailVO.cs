using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AssetDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AssetId { get; set; }
        public string? AssetName { get; set; }
        public string? AssetType { get; set; }
        public string? FileType { get; set; }
        public string? FileTypeName { get; set; }
        public string? MimeType { get; set; }
        public int? Size { get; set; }
        public string? Description { get; set; }
        public List<string>? Tags { get; set; }
        public string? FolderId { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public ImageMediaResource? CoverImage { get; set; }
        public List<AssetMediaResource>? Assets { get; set; }
        public string? PrimaryUrl { get; set; }
        public string? ThumbnailUrl { get; set; }
        public string? DiskId { get; set; }
        public string? Path { get; set; }
        public string? VersionId { get; set; }
        public int? DownloadCount { get; set; }
        public bool? Favorited { get; set; }
        public string? Author { get; set; }
        public string? Extension { get; set; }
    }
}
