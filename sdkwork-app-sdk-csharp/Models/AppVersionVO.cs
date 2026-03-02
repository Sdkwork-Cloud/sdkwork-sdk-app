using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AppVersionVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? CurrentVersion { get; set; }
        public string? LatestVersion { get; set; }
        public bool? UpdateRequired { get; set; }
        public bool? ForceUpdate { get; set; }
        public string? UpdateDescription { get; set; }
        public string? UpdateUrl { get; set; }
        public string? UpdateSize { get; set; }
        public int? ReleaseDate { get; set; }
    }
}
