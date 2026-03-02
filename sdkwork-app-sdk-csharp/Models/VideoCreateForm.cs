using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VideoCreateForm
    {
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ContentUrl { get; set; }
        public string? Format { get; set; }
        public int? Duration { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public int? CategoryId { get; set; }
    }
}
