using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceListQueryForm
    {
        public string? Language { get; set; }
        public string? Gender { get; set; }
        public string? Style { get; set; }
        public string? AgeRange { get; set; }
    }
}
