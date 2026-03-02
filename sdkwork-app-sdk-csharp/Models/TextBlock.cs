using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TextBlock
    {
        public string? Text { get; set; }
        public Region? Region { get; set; }
        public double? Confidence { get; set; }
    }
}
