using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AppPublishReadinessVO
    {
        public bool? Ready { get; set; }
        public List<string>? MissingFields { get; set; }
        public List<AppStorePublishReadinessVO>? Stores { get; set; }
    }
}
