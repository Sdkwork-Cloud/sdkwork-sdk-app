using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteFolderCreateForm
    {
        public string? FolderName { get; set; }
        public string? Name { get; set; }
        public string? ParentFolderId { get; set; }
        public string? FolderDescription { get; set; }
    }
}
