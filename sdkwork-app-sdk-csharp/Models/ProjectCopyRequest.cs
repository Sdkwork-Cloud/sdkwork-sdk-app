using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectCopyRequest
    {
        public string? TargetWorkspaceId { get; set; }
        public string? NewName { get; set; }
    }
}
