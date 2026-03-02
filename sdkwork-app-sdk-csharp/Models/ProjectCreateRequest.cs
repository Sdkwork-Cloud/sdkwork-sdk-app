using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectCreateRequest
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? WorkspaceId { get; set; }
        public string? Type { get; set; }
        public List<string>? Tags { get; set; }
        public bool? IsPublic { get; set; }
    }
}
