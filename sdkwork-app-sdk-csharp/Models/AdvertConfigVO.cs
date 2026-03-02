using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AdvertConfigVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ConfigId { get; set; }
        public bool? Enabled { get; set; }
        public int? MaxAdsPerHour { get; set; }
        public int? MinInterval { get; set; }
        public string? AdNetwork { get; set; }
        public string? ApiKey { get; set; }
        public string? Status { get; set; }
    }
}
