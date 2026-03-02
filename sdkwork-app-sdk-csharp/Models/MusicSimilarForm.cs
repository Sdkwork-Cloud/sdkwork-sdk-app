using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicSimilarForm
    {
        public string? ReferenceUrl { get; set; }
        public int? Duration { get; set; }
        public string? Model { get; set; }
    }
}
