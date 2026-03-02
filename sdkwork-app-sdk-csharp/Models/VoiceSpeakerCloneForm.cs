using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceSpeakerCloneForm
    {
        public string? SampleAudioUrl { get; set; }
        public string? SpeakerName { get; set; }
        public string? Language { get; set; }
        public string? Model { get; set; }
    }
}
