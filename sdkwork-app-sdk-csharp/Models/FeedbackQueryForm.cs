using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FeedbackQueryForm
    {
        public string? Type { get; set; }
        public string? Status { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
    }
}
