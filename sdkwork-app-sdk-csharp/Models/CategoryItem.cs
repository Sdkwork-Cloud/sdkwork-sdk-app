using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CategoryItem
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? ParentId { get; set; }
        public List<CategoryItem>? Subcategories { get; set; }
        public List<string>? Tags { get; set; }
    }
}
