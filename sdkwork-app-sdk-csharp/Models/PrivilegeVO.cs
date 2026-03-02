using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PrivilegeVO
    {
        public string? PrivilegeId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
    }
}
