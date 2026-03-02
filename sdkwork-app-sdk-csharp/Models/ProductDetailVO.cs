using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProductDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Title { get; set; }
        public string? Type { get; set; }
        public string? Description { get; set; }
        public string? Summary { get; set; }
        public string? CategoryId { get; set; }
        public string? CategoryName { get; set; }
        public string? BrandId { get; set; }
        public string? BrandName { get; set; }
        public List<string>? TagIds { get; set; }
        public List<string>? Tags { get; set; }
        public string? MainImage { get; set; }
        public List<string>? Images { get; set; }
        public string? VideoUrl { get; set; }
        public double? Price { get; set; }
        public double? OriginalPrice { get; set; }
        public int? Stock { get; set; }
        public int? Sales { get; set; }
        public string? Status { get; set; }
        public bool? Recommended { get; set; }
        public bool? Hot { get; set; }
        public int? Sort { get; set; }
        public string? ShelfTime { get; set; }
        public string? OffShelfTime { get; set; }
        public List<ProductAttributeVO>? Attributes { get; set; }
        public List<SkuVO>? Skus { get; set; }
        public Dictionary<string, object>? ReviewStatistics { get; set; }
    }
}
