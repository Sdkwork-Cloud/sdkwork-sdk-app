using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DriveCopyForm
    {
        public string? TargetFolderId { get; set; }
        public string? NewName { get; set; }
    }
}
