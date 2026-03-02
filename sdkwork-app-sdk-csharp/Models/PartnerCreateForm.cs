using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PartnerCreateForm
    {
        public string? Name { get; set; }
        public string? ContactName { get; set; }
        public string? ContactPhone { get; set; }
        public string? ContactEmail { get; set; }
        public string? Level { get; set; }
        public int? ParentId { get; set; }
    }
}
