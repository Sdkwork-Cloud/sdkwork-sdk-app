using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ActivityRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? ActivityId { get; set; }
        public string? ActivityTitle { get; set; }
        public string? ActivityType { get; set; }
        public string? ParticipateTime { get; set; }
        public string? Status { get; set; }
        public string? Result { get; set; }
        public Dictionary<string, object>? Rewards { get; set; }
    }
}
