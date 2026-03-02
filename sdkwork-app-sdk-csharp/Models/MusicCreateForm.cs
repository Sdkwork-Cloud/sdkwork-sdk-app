using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicCreateForm
    {
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ContentUrl { get; set; }
        public string? Format { get; set; }
        public int? Duration { get; set; }
        public string? Artist { get; set; }
        public string? Genre { get; set; }
    }
}
