using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AppCreateForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? AppType { get; set; }
        public int? ProjectId { get; set; }
    }
}
