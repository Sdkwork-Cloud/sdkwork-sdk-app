using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SupportMessageQueryForm
    {
        public string? SessionId { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
    }
}
