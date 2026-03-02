using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteSearchResult
    {
        public int? Id { get; set; }
        public string? Title { get; set; }
        public string? Summary { get; set; }
        public string? FolderId { get; set; }
        public string? FolderName { get; set; }
    }
}
