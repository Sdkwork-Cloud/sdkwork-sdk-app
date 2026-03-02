using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FileSystemFolderCreateForm
    {
        public string? Name { get; set; }
        public string? ParentId { get; set; }
        public string? DiskId { get; set; }
        public string? Description { get; set; }
        public List<string>? Tags { get; set; }
    }
}
