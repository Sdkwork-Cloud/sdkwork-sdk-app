using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageCreateForm
    {
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Url { get; set; }
        public string? Format { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
    }
}
