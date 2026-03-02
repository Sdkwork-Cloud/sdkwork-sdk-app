using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PromptEnhanceRequest
    {
        public string? Prompt { get; set; }
        public string? Scene { get; set; }
        public string? Style { get; set; }
        public string? Language { get; set; }
        public int? MaxWords { get; set; }
    }
}
