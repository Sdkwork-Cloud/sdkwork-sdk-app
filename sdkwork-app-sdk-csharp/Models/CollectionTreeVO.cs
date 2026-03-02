using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CollectionTreeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? CollectionId { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public int? ItemCount { get; set; }
        public int? ParentId { get; set; }
    }
}
