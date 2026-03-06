using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AppStorePublishReadinessVO
    {
        public string? Platform { get; set; }
        public bool? Ready { get; set; }
        public List<string>? MissingFields { get; set; }
    }
}
