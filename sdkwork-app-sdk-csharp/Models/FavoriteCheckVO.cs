using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteCheckVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TargetId { get; set; }
        public bool? IsFavorite { get; set; }
        public string? FavoriteId { get; set; }
        public string? FavoriteTime { get; set; }
    }
}
