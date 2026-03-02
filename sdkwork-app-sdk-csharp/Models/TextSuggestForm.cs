using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TextSuggestForm
    {
        public string? Text { get; set; }
        public string? SuggestType { get; set; }
        public string? Scene { get; set; }
    }
}
