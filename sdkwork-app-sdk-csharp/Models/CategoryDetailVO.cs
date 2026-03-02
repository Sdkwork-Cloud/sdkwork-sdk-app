using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CategoryDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Icon { get; set; }
        public string? Description { get; set; }
        public int? ParentId { get; set; }
        public string? ParentName { get; set; }
        public int? Sort { get; set; }
        public int? Status { get; set; }
        public string? Type { get; set; }
        public string? GroupName { get; set; }
        public int? Visible { get; set; }
    }
}
