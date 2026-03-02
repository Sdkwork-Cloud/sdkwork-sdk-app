using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceCloneForm
    {
        public string? SampleAudioUrl { get; set; }
        public string? Text { get; set; }
        public string? Model { get; set; }
        public string? Format { get; set; }
    }
}
