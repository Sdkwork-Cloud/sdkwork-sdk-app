using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceSourceVO
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public string? Language { get; set; }
        public int? SampleRate { get; set; }
    }
}
