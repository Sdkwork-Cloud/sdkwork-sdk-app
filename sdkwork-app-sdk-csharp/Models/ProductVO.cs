using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProductVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Title { get; set; }
        public string? Type { get; set; }
        public string? Summary { get; set; }
        public string? MainImage { get; set; }
        public double? Price { get; set; }
        public double? OriginalPrice { get; set; }
        public int? Sales { get; set; }
        public string? Status { get; set; }
        public bool? Recommended { get; set; }
        public bool? Hot { get; set; }
        public string? CategoryName { get; set; }
        public string? BrandName { get; set; }
        public List<string>? Tags { get; set; }
    }
}
