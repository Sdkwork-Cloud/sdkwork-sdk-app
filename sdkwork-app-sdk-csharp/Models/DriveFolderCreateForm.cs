using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DriveFolderCreateForm
    {
        public string? Name { get; set; }
        public string? ParentId { get; set; }
        public string? DiskId { get; set; }
    }
}
