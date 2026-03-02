using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DeviceDistributionVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? DeviceType { get; set; }
        public string? DeviceModel { get; set; }
        public string? OsType { get; set; }
        public string? OsVersion { get; set; }
        public int? UserCount { get; set; }
        public double? Percentage { get; set; }
        public int? ActiveCount { get; set; }
    }
}
