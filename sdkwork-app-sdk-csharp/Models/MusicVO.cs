using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? MusicId { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ContentUrl { get; set; }
        public string? Format { get; set; }
        public int? Duration { get; set; }
        public string? Artist { get; set; }
        public string? Genre { get; set; }
        public string? ThumbnailUrl { get; set; }
        public string? Status { get; set; }
        public bool? IsPublic { get; set; }
        public bool? IsFavorite { get; set; }
        public int? PlayCount { get; set; }
        public int? LikeCount { get; set; }
    }
}
