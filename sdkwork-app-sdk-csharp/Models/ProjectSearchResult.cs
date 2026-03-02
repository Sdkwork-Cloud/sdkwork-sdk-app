using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectSearchResult
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? WorkspaceId { get; set; }
        public string? WorkspaceName { get; set; }
        public string? Type { get; set; }
    }
}
