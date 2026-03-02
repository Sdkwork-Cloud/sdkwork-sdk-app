using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ErrorTrackForm
    {
        public string? ErrorType { get; set; }
        public string? ErrorMessage { get; set; }
        public string? StackTrace { get; set; }
        public string? DeviceId { get; set; }
        public string? UserId { get; set; }
        public string? AppVersion { get; set; }
        public string? DeviceModel { get; set; }
        public string? OsVersion { get; set; }
        public string? Context { get; set; }
        public string? ErrorTime { get; set; }
    }
}
