using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChangelogVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Version { get; set; }
        public string? ReleaseDate { get; set; }
        public string? Title { get; set; }
        public List<string>? Features { get; set; }
        public List<string>? BugFixes { get; set; }
        public List<string>? Improvements { get; set; }
        public string? Status { get; set; }
        public string? DownloadUrl { get; set; }
    }
}
