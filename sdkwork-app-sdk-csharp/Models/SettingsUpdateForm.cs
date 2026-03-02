using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SettingsUpdateForm
    {
        public Dictionary<string, object>? Settings { get; set; }
        public string? Module { get; set; }
        public bool? Overwrite { get; set; }
    }
}
