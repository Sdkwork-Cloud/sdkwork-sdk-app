using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TagCreateForm
    {
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Color { get; set; }
        public string? Description { get; set; }
        public int? Status { get; set; }
    }
}
