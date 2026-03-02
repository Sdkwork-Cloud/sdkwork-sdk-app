using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicRemixForm
    {
        public string? MusicUrl { get; set; }
        public string? Style { get; set; }
        public string? Model { get; set; }
    }
}
