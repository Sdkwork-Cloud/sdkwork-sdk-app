using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BatchImageAuditForm
    {
        public List<ImageItem>? Images { get; set; }
        public List<string>? CheckTypes { get; set; }
        public string? Scene { get; set; }
    }
}
