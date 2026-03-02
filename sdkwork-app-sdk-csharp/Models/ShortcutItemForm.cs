using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShortcutItemForm
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Icon { get; set; }
        public string? Url { get; set; }
        public int? Sort { get; set; }
        public string? Type { get; set; }
    }
}
