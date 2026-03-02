using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShopQueryForm
    {
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? Keyword { get; set; }
        public string? Status { get; set; }
    }
}
