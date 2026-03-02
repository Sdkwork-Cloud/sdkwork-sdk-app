using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AppConfigVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Version { get; set; }
        public string? BuildNumber { get; set; }
        public string? ApiVersion { get; set; }
        public int? ServerTime { get; set; }
        public Dictionary<string, bool>? Features { get; set; }
        public Dictionary<string, object>? SystemConfig { get; set; }
        public bool? MaintenanceMode { get; set; }
        public string? MaintenanceMessage { get; set; }
    }
}
