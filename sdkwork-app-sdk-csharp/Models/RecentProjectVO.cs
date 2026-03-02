using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RecentProjectVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? Cover { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? Url { get; set; }
        public string? CreateTime { get; set; }
        public string? UpdateTime { get; set; }
        public int? MemberCount { get; set; }
        public int? FileCount { get; set; }
        public int? Size { get; set; }
        public List<string>? Tags { get; set; }
        public bool? IsPublic { get; set; }
        public bool? IsFavorite { get; set; }
    }
}
