using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SharePosterVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? PosterUrl { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public string? FileSize { get; set; }
    }
}
