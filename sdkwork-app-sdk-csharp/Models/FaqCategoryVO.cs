using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FaqCategoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Icon { get; set; }
        public int? SortOrder { get; set; }
        public int? FaqCount { get; set; }
    }
}
