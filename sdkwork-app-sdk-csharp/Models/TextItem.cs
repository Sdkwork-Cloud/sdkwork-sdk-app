using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TextItem
    {
        public string? Id { get; set; }
        public string? Content { get; set; }
        public string? ContentType { get; set; }
    }
}
