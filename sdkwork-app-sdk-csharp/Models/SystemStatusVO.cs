using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SystemStatusVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Status { get; set; }
        public string? Message { get; set; }
        public string? Timestamp { get; set; }
        public string? Version { get; set; }
        public ServiceStatus? Services { get; set; }
    }
}
