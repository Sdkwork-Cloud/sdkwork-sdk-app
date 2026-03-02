using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteAddForm
    {
        public string? FavoriteType { get; set; }
        public string? Type { get; set; }
        public string? TargetId { get; set; }
        public string? FavoriteName { get; set; }
        public string? FavoriteDescription { get; set; }
        public string? FolderId { get; set; }
        public string? Tags { get; set; }
    }
}
