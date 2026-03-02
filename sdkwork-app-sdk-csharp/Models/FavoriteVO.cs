using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteVO
    {
        public string? FavoriteId { get; set; }
        public string? FavoriteType { get; set; }
        public string? TargetId { get; set; }
        public string? FavoriteName { get; set; }
        public string? FolderId { get; set; }
        public string? FavoriteTime { get; set; }
        public string? UpdateTime { get; set; }
    }
}
