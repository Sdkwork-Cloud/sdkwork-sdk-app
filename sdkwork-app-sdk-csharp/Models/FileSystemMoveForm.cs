using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FileSystemMoveForm
    {
        public string? TargetParentId { get; set; }
        public string? TargetDiskId { get; set; }
    }
}
