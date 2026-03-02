using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PlusApiResultPromptEnhanceResponse
    {
        public int? Code { get; set; }
        public string? Msg { get; set; }
        public PromptEnhanceResponse? Data { get; set; }
        public string? Timestamp { get; set; }
        public string? TraceId { get; set; }
    }
}
