using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UpdateCheckVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? HasUpdate { get; set; }
        public string? LatestVersion { get; set; }
        public string? CurrentVersion { get; set; }
        public string? DownloadUrl { get; set; }
        public string? UpdateType { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public int? FileSize { get; set; }
        public bool? ForceUpdate { get; set; }
    }
}
