using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CommentDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? CommentId { get; set; }
        public string? Content { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public int? UserId { get; set; }
        public string? Status { get; set; }
        public int? Likes { get; set; }
        public int? ReplyCount { get; set; }
        public bool? IsTop { get; set; }
        public int? ParentId { get; set; }
        public string? IpAddress { get; set; }
        public string? DeviceInfo { get; set; }
        public List<CommentVO>? Replies { get; set; }
    }
}
