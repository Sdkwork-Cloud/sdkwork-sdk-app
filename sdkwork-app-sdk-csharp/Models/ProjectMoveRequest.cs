using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectMoveRequest
    {
        public string? TargetWorkspaceId { get; set; }
    }
}
