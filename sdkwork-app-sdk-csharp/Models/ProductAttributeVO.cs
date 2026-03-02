using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProductAttributeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public List<string>? Values { get; set; }
        public bool? Searchable { get; set; }
        public bool? Filterable { get; set; }
        public int? Sort { get; set; }
    }
}
