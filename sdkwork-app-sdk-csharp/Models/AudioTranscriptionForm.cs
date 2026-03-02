using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AudioTranscriptionForm
    {
        public string? AudioUrl { get; set; }
        public string? Model { get; set; }
        public string? Language { get; set; }
        public string? Format { get; set; }
    }
}
