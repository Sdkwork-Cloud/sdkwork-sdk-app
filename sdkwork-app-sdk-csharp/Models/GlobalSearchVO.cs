using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class GlobalSearchVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public List<ProjectSearchResult>? Projects { get; set; }
        public List<AssetSearchResult>? Assets { get; set; }
        public List<NoteSearchResult>? Notes { get; set; }
        public List<UserSearchResult>? Users { get; set; }
    }
}
