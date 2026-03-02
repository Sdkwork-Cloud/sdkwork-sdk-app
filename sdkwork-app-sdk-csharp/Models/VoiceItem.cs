using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceItem
    {
        public string? VoiceId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Language { get; set; }
        public string? Gender { get; set; }
        public string? Style { get; set; }
        public string? PreviewAudioUrl { get; set; }
    }
}
