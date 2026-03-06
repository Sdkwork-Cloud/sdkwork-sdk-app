using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ModelInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ModelId { get; set; }
        public string? ModelKey { get; set; }
        public string? Model { get; set; }
        public string? VendorModel { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Channel { get; set; }
        public string? ModelType { get; set; }
        public string? Family { get; set; }
        public string? Version { get; set; }
        public bool? OpenSource { get; set; }
        public string? Status { get; set; }
        public int? UsageCount { get; set; }
    }
}
