using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DownloadSettings
    {
        public string? DownloadPath { get; set; }
        public bool? WifiOnly { get; set; }
        public bool? AutoDownload { get; set; }
        public int? MaxConcurrent { get; set; }
    }
}
