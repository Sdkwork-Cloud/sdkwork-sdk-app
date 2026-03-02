using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class StatsExportForm
    {
        public string? ReportType { get; set; }
        public string? StartDate { get; set; }
        public string? EndDate { get; set; }
        public string? Format { get; set; }
        public string? Email { get; set; }
        public string? DeviceType { get; set; }
        public string? OsType { get; set; }
    }
}
