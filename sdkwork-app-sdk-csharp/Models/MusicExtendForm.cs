using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicExtendForm
    {
        public string? MusicUrl { get; set; }
        public int? ExtendDuration { get; set; }
        public string? Model { get; set; }
        public string? Style { get; set; }
    }
}
