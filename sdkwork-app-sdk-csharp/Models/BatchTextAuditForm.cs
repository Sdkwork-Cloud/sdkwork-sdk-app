using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BatchTextAuditForm
    {
        public List<TextItem>? Items { get; set; }
        public List<string>? CheckTypes { get; set; }
        public string? Scene { get; set; }
    }
}
