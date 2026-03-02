using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FaqQueryForm
    {
        public string? CategoryId { get; set; }
        public string? Keyword { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
    }
}
