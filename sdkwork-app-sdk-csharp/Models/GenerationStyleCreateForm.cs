using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class GenerationStyleCreateForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public Dictionary<string, object>? ConfigParams { get; set; }
        public bool? IsPublic { get; set; }
    }
}
