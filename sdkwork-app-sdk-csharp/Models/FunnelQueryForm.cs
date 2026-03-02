using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FunnelQueryForm
    {
        public string? FunnelName { get; set; }
        public List<string>? Events { get; set; }
        public string? StartDate { get; set; }
        public string? EndDate { get; set; }
        public string? DeviceType { get; set; }
        public string? OsType { get; set; }
    }
}
