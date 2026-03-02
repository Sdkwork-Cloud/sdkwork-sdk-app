using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OperationHistoryQueryForm
    {
        public string? Action { get; set; }
        public string? Result { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? SortField { get; set; }
        public string? SortOrder { get; set; }
    }
}
