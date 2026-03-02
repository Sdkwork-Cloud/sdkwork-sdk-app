using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WorkspaceSettings
    {
        public bool? IsPublic { get; set; }
        public bool? AllowInvite { get; set; }
        public bool? AllowCreateProject { get; set; }
        public bool? AllowFileUpload { get; set; }
    }
}
