using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TagVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Color { get; set; }
        public string? Description { get; set; }
        public int? Count { get; set; }
        public int? Status { get; set; }
    }
}
