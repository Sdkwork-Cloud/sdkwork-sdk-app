using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteFolderVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public int? ParentId { get; set; }
        public string? ParentName { get; set; }
        public string? Path { get; set; }
        public int? SubFolderCount { get; set; }
        public int? NoteCount { get; set; }
        public List<NoteFolderVO>? Children { get; set; }
    }
}
