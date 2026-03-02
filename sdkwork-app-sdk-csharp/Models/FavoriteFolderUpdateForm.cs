using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteFolderUpdateForm
    {
        public string? FolderId { get; set; }
        public string? FolderName { get; set; }
        public string? ParentFolderId { get; set; }
        public string? FolderDescription { get; set; }
    }
}
