using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShareVisitorQueryForm
    {
        public string? ShareId { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
    }
}
