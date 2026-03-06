using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProductCategoryCreateRequest
    {
        public string? Name { get; set; }
        public string? ParentId { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public int? Sort { get; set; }
        public bool? Enabled { get; set; }
    }
}
