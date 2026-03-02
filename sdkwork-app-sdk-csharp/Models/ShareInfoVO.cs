using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShareInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ShareId { get; set; }
        public string? ShareType { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ImageUrl { get; set; }
        public string? ShareUrl { get; set; }
        public string? CreateTime { get; set; }
        public string? ExpireTime { get; set; }
        public string? Status { get; set; }
        public int? VisitCount { get; set; }
    }
}
