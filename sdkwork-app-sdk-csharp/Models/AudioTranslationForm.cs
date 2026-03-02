using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AudioTranslationForm
    {
        public string? AudioUrl { get; set; }
        public string? TargetLanguage { get; set; }
        public string? Model { get; set; }
        public string? SourceLanguage { get; set; }
        public string? Format { get; set; }
    }
}
