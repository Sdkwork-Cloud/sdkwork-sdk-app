using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BatchCancelShareForm
    {
        public List<string>? ShareIds { get; set; }
        public string? Reason { get; set; }
    }
}
