using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SensitiveWordsForm
    {
        public string? Text { get; set; }
        public string? WordListType { get; set; }
        public string? Mode { get; set; }
        public string? Replacement { get; set; }
        public List<string>? Categories { get; set; }
    }
}
