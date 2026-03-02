using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FeedbackSubmitForm
    {
        public string? Type { get; set; }
        public string? Content { get; set; }
        public string? Contact { get; set; }
        public string? AttachmentUrl { get; set; }
        public string? ScreenshotUrl { get; set; }
    }
}
