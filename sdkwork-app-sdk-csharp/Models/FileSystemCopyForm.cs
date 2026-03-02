using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FileSystemCopyForm
    {
        public string? TargetParentId { get; set; }
        public string? TargetDiskId { get; set; }
        public string? Name { get; set; }
        public bool? CopyContent { get; set; }
    }
}
