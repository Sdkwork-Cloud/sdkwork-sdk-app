using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ReportSubmitForm
    {
        public string? Type { get; set; }
        public string? TargetId { get; set; }
        public string? Content { get; set; }
        public string? AttachmentUrl { get; set; }
        public string? ScreenshotUrl { get; set; }
    }
}
