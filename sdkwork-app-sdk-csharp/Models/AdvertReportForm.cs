using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AdvertReportForm
    {
        public string? AdvertId { get; set; }
        public string? ReportType { get; set; }
        public string? Reason { get; set; }
        public string? ScreenshotUrl { get; set; }
        public string? DeviceId { get; set; }
        public string? IpAddress { get; set; }
    }
}
