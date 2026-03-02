using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AttachmentVO
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public int? Size { get; set; }
        public string? Url { get; set; }
        public string? ThumbnailUrl { get; set; }
    }
}
