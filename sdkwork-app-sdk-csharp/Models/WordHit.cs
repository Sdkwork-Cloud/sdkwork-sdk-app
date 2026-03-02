using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WordHit
    {
        public string? Word { get; set; }
        public int? StartIndex { get; set; }
        public int? EndIndex { get; set; }
        public string? Category { get; set; }
        public string? Severity { get; set; }
    }
}
