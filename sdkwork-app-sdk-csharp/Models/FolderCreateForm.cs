using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FolderCreateForm
    {
        public string? Name { get; set; }
        public string? ParentId { get; set; }
    }
}
