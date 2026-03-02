using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FeedbackFollowUpVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? FeedbackId { get; set; }
        public string? Content { get; set; }
        public string? AttachmentUrl { get; set; }
        public string? FollowUpTime { get; set; }
        public string? Follower { get; set; }
    }
}
