using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceSpeakerListQueryForm
    {
        public string? Gender { get; set; }
        public string? Language { get; set; }
        public string? Style { get; set; }
        public string? AgeRange { get; set; }
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
        public bool? OnlyFavorite { get; set; }
    }
}
