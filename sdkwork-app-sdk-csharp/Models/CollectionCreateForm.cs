using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CollectionCreateForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public int? ParentId { get; set; }
    }
}
