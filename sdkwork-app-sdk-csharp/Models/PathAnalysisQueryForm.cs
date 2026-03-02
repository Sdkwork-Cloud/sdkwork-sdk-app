using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PathAnalysisQueryForm
    {
        public string? StartDate { get; set; }
        public string? EndDate { get; set; }
        public string? StartPage { get; set; }
        public string? EndPage { get; set; }
        public int? MaxSteps { get; set; }
        public string? DeviceType { get; set; }
        public string? OsType { get; set; }
    }
}
