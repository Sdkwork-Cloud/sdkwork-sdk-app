using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProductAttributeCreateRequest
    {
        public string? Name { get; set; }
        public List<string>? Values { get; set; }
        public bool? Searchable { get; set; }
        public bool? Filterable { get; set; }
        public int? Sort { get; set; }
    }
}
