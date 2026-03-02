using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicStylesQueryForm
    {
        public string? Category { get; set; }
        public string? Genre { get; set; }
        public string? Style { get; set; }
        public string? Mood { get; set; }
        public string? Instrument { get; set; }
    }
}
