using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageItem
    {
        public string? Id { get; set; }
        public string? Url { get; set; }
        public string? ContentType { get; set; }
    }
}
