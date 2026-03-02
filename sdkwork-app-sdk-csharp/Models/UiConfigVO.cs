using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UiConfigVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ConfigKey { get; set; }
        public string? ConfigName { get; set; }
        public Dictionary<string, object>? UiConfig { get; set; }
        public string? Version { get; set; }
    }
}
