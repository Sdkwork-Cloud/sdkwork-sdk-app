using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WorkspaceUpdateForm
    {
        public string? WorkspaceId { get; set; }
        public string? WorkspaceName { get; set; }
        public string? WorkspaceDescription { get; set; }
        public string? WorkspaceIcon { get; set; }
        public string? WorkspaceColor { get; set; }
        public WorkspaceSettings? Settings { get; set; }
    }
}
