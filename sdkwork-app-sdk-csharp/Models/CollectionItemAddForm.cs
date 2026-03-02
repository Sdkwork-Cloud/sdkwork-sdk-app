using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CollectionItemAddForm
    {
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public int? Position { get; set; }
    }
}
