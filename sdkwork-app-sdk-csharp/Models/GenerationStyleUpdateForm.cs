using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class GenerationStyleUpdateForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public Dictionary<string, object>? ConfigParams { get; set; }
    }
}
