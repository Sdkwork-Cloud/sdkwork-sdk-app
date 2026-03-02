using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DataExportForm
    {
        public string? Format { get; set; }
        public string? DataType { get; set; }
        public bool? IncludeMedia { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public string? Email { get; set; }
    }
}
