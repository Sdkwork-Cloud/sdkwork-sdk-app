using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class HistoryBatchDeleteForm
    {
        public List<string>? HistoryIds { get; set; }
        public string? Type { get; set; }
    }
}
