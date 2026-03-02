using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PresignedUrlVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Url { get; set; }
        public string? PreviewUrl { get; set; }
        public string? ObjectKey { get; set; }
    }
}
