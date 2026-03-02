using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CollectionItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ItemId { get; set; }
        public string? CollectionId { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? CoverImage { get; set; }
        public int? Position { get; set; }
        public bool? IsPinned { get; set; }
        public string? Tags { get; set; }
        public string? AddedAt { get; set; }
    }
}
