using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PromptEnhanceResponse
    {
        public string? Prompt { get; set; }
        public int? TokensEstimated { get; set; }
    }
}
