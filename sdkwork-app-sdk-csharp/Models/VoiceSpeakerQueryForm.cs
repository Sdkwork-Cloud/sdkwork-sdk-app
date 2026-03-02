using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceSpeakerQueryForm
    {
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? Keyword { get; set; }
        public string? Gender { get; set; }
        public string? AgeType { get; set; }
        public string? Type { get; set; }
        public string? Channel { get; set; }
        public string? Status { get; set; }
    }
}
