using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FeedItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Summary { get; set; }
        public string? CoverImage { get; set; }
        public string? ContentType { get; set; }
        public List<string>? Tags { get; set; }
        public AuthorInfo? Author { get; set; }
        public int? ViewCount { get; set; }
        public int? LikeCount { get; set; }
        public int? CommentCount { get; set; }
        public int? ShareCount { get; set; }
        public bool? IsLiked { get; set; }
        public bool? IsCollected { get; set; }
    }
}
