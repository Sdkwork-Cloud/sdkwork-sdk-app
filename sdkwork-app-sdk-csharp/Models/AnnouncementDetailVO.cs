using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AnnouncementDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AnnouncementId { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? Author { get; set; }
        public string? PublishTime { get; set; }
        public string? ExpireTime { get; set; }
        public int? ViewCount { get; set; }
        public bool? IsTop { get; set; }
        public string? CoverImage { get; set; }
    }
}
