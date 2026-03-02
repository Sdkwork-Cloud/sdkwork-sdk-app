using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExperimentEventForm
    {
        public string? ExperimentKey { get; set; }
        public string? EventType { get; set; }
        public object? EventData { get; set; }
    }
}
