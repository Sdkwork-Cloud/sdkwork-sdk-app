using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FeedbackDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Type { get; set; }
        public string? Content { get; set; }
        public string? Contact { get; set; }
        public string? AttachmentUrl { get; set; }
        public string? ScreenshotUrl { get; set; }
        public string? Status { get; set; }
        public string? SubmitTime { get; set; }
        public string? ProcessTime { get; set; }
        public List<FeedbackFollowUpVO>? FollowUps { get; set; }
    }
}
