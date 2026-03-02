using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectSettings
    {
        public bool? IsPublic { get; set; }
        public bool? AllowComments { get; set; }
        public bool? AllowFileUpload { get; set; }
        public bool? AllowInviteMembers { get; set; }
    }
}
