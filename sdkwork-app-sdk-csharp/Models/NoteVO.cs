using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public int? UserId { get; set; }
        public string? FolderId { get; set; }
        public string? FolderPath { get; set; }
        public List<string>? Tags { get; set; }
        public string? AccessScope { get; set; }
        public bool? HasPassword { get; set; }
        public string? CoverImageUrl { get; set; }
        public string? Status { get; set; }
        public string? Summary { get; set; }
        public bool? Favorited { get; set; }
        public int? WordCount { get; set; }
    }
}
